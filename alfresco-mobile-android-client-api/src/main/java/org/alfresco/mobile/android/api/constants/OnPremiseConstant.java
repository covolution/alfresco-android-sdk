/*******************************************************************************
 * Copyright (C) 2005-2012 Alfresco Software Limited.
 * 
 * This file is part of the Alfresco Mobile SDK.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *  
 *  http://www.apache.org/licenses/LICENSE-2.0
 * 
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 ******************************************************************************/
package org.alfresco.mobile.android.api.constants;

/**
 * Provides all constants necessary for an OnPremise Alfresco server. <br/>
 * Generally it's used for parsing data (json, atompub xml).
 * 
 * @author Jean Marie Pascal
 */
public interface OnPremiseConstant
{
    // TICKET LOGIN
    String LOGIN_USERNAME_VALUE = "username";

    String LOGIN_PASSWORD_VALUE = "password";

    String LOGIN_DATA_VALUE = "data";

    String LOGIN_TICKET_VALUE = "ticket";

    // EDITION
    String ALFRESCO_VENDOR = "Alfresco";

    String ALFRESCO_EDITION_COMMUNITY = "Community";

    String ALFRESCO_EDITION_ENTERPRISE = "Enterprise";

    String ALFRESCO_EDITION_UNKNOWN = "unknown";

    String THIRD_CMIS_EDITION = "thirdcmis";

    // VERSION NUMBER
    int ALFRESCO_VERSION_4 = 4;

    int ALFRESCO_VERSION_3 = 3;

    // SITES
    String URL_VALUE = "url";

    String TITLE_VALUE = "title";

    String DESCRIPTION_VALUE = "description";

    String SITEPRESET_VALUE = "sitePreset";

    String SHORTNAME_VALUE = "shortName";

    String NODE_VALUE = "node";

    String TAGSCOPE_VALUE = "tagScope";

    String IS_VALUE = "is";

    String VISIBILITY_VALUE = "visibility";

    String MANAGERS_VALUE = "siteManagers";

    // COMMENTS
    String NODEREF_VALUE = "nodeRef";

    String NAME_VALUE = "name";

    String CONTENT_VALUE = "content";

    String CREATEDON_VALUE = "createdOn";

    String MODIFIEDON_VALUE = "modifiedOn";

    String ISUPDATED_VALUE = "isUpdated";

    String TOTAL_VALUE = "total";

    String ITEMS_VALUE = "items";

    String ITEMCOUNT_VALUE = "itemCount";

    String ITEM_VALUE = "item";

    // PEOPLE
    String USERNAME_VALUE = "userName";

    String USERNAME_L_VALUE = "username";

    String LASTNAME_VALUE = "lastName";

    String FIRSTNAME_VALUE = "firstName";

    String AUTHOR_VALUE = "author";

    String AVATAR_REF_VALUE = "avatarRef";

    String AVATAR_VALUE = "avatar";

    // ACTIVITY EVENT
    String ID_VALUE = "id";

    String SITENETWORK_VALUE = "siteNetwork";

    String FEEDUSERID_VALUE = "feedUserId";

    String POSTUSERID_VALUE = "postUserId";

    String POSTDATE_VALUE = "postDate";

    String SUMMARY_VALUE = "activitySummary";

    String PAGE_VALUE = "page";

    String ACTIVITYTYPE_VALUE = "activityType";

    String FORMAT_VALUE = "activitySummaryFormat";

    String MEMBERLASTNAME_VALUE = "memberLastName";

    String ROLE_VALUE = "role";

    String STATUS_VALUE = "status";

    String MEMEBERUSERNAME_VALUE = "memberUserName";

    String MEMEBERFIRSTNAME_VALUE = "memberFirstName";
    
    String FOLLOWERUSERNAME_VALUE = "followerUserName";
    
    String SUBSCRIBERFIRSTNAME_VALUE = "subscriberFirstName";
    
    String SUBSCRIBERLASTNAME_VALUE = "subscriberLastName";

    String USERFIRSTNAME_VALUE = "userFirstName";
    
    String USERUSERNAME_VALUE = "userUserName";

    String USERLASTNAME_VALUE = "userLastName";


    // CONTAINERS
    String CONTAINER_VALUE = "containers";

    // TAG
    String TYPE_VALUE = "type";

    String ISCONTAINER_VALUE = "isContainer";

    String MODIFIED_VALUE = "modified";

    String MODIFIER_VALUE = "modifier";

    String DISPLAYPATH_VALUE = "displayPath";

    String SELECTABLE_VALUE = "selectable";

    // PERMISSION
    String PERMISSION_VALUE = "permissions";

    String EDIT_VALUE = "edit";

    String DELETE_VALUE = "delete";

    // RATINGS
    String DATA_VALUE = "data";

    String RATINGS_VALUE = "ratings";

    String RATINGSCHEME_VALUE = "ratingScheme";

    String LIKERATINGSSCHEME_VALUE = "likesRatingScheme";

    String RATING_VALUE = "rating";

    String APPLIEDAT_VALUE = "appliedAt";

    String APPLIEDBY_VALUE = "appliedBy";

    String NODESTATISTICS_VALUE = "nodeStatistics";

    String AVERAGERATING_VALUE = "averageRating";

    String RATINGSTOTAL_VALUE = "ratingsTotal";

    String RATINGSCOUNT_VALUE = "ratingsCount";

    // ACTIONS
    String ACTIONEDUPONNODE_VALUE = "actionedUponNode";

    String ACTIONDEFINITIONNAME_VALUE = "actionDefinitionName";

    String ACTION_EXTRACTMETADATA_VALUE = "extract-metadata";

    String ACTION_EXECUTE_SCRIPT = "script";

    String ACTIONSCRIPTREF_VALUE = "script-ref";

    String ACTIONPARAMETER_VALUE = "parameterValues";

    // THUMBNAILS
    String THUMBNAILNAME_VALUE = "thumbnailName";

    // Parameters
    String PARAM_ASYNC = "async";

    String PARAM_AS = "as";

    String PARAM_SIZE = "size";

    String PARAM_POSITION = "pos";

    String PARAM_STARTINDEX = "startIndex";

    String PARAM_PAGESIZE = "pageSize";

    String PARAM_REVERSE = "reverse";
    
    // ERROR
    String CODE_VALUE = "code";
    String MESSAGE_VALUE = "message";
    String EXCEPTION_VALUE = "exception";
    String CALLSTACK_VALUE = "callstack";








}
