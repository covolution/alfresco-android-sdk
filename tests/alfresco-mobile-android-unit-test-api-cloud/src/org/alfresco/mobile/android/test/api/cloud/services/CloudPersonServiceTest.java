package org.alfresco.mobile.android.test.api.cloud.services;

import junit.framework.Assert;

import org.alfresco.mobile.android.api.exceptions.AlfrescoServiceException;
import org.alfresco.mobile.android.api.exceptions.ErrorCodeRegistry;
import org.alfresco.mobile.android.api.services.impl.AbstractPersonService;
import org.alfresco.mobile.android.api.session.RepositorySession;
import org.alfresco.mobile.android.test.AlfrescoSDKCloudTestCase;
import org.alfresco.mobile.android.test.api.services.PersonServiceTest;

public class CloudPersonServiceTest extends PersonServiceTest
{

    protected void initSession()
    {
        if (alfsession == null || alfsession instanceof RepositorySession)
        {
            alfsession = AlfrescoSDKCloudTestCase.createCloudSession();
        }   
        // Check Services
        Assert.assertNotNull(alfsession.getServiceRegistry());
        personService = alfsession.getServiceRegistry().getPersonService();
        Assert.assertNotNull(personService);
    }

    /**
     * Failure Tests for getAvatarStream Method.
     */
    public void testGetAvatarStreamFailure()
    {
        try
        {
            ((AbstractPersonService) personService).getAvatarStream(null);
            Assert.fail("null personIdentifier return an object");
        }
        catch (AlfrescoServiceException e)
        {
            Assert.assertEquals(ErrorCodeRegistry.GENERAL_INVALID_ARG, e.getErrorCode());
        }

        try
        {
            ((AbstractPersonService) personService).getAvatarStream("FAKE");
            Assert.fail("Fake personIdentifier return an object");
        }
        catch (AlfrescoServiceException e)
        {
            Assert.assertEquals(ErrorCodeRegistry.PERSON_NOT_FOUND, e.getErrorCode());
        }
    }
}
