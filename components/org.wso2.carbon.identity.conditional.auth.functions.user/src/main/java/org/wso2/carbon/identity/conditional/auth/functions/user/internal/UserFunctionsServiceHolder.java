/*
 *  Copyright (c) 2018, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  WSO2 Inc. licenses this file to you under the Apache License,
 *  Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 */

package org.wso2.carbon.identity.conditional.auth.functions.user.internal;

import org.wso2.carbon.identity.application.authentication.framework.JsFunctionRegistry;
import org.wso2.carbon.identity.application.authentication.framework.UserSessionManagementService;
import org.wso2.carbon.identity.claim.metadata.mgt.ClaimMetadataManagementService;
import org.wso2.carbon.idp.mgt.IdentityProviderManagementService;
import org.wso2.carbon.idp.mgt.IdpManager;
import org.wso2.carbon.registry.core.service.RegistryService;
import org.wso2.carbon.user.core.service.RealmService;

public class UserFunctionsServiceHolder {

    private static UserFunctionsServiceHolder instance = new UserFunctionsServiceHolder();

    private RealmService realmService;
    private RegistryService registryService;
    private UserSessionManagementService userSessionManagementService;
    private IdpManager identityProviderManagementService;
    private JsFunctionRegistry jsFunctionRegistry;
    private ClaimMetadataManagementService claimMetadataManagementService;


    private UserFunctionsServiceHolder() {

    }

    public static UserFunctionsServiceHolder getInstance() {

        return instance;
    }

    public RealmService getRealmService() {

        return realmService;
    }

    public void setRealmService(RealmService realmService) {

        this.realmService = realmService;
    }

    public RegistryService getRegistryService() {

        return registryService;
    }

    public void setRegistryService(RegistryService registryService) {

        this.registryService = registryService;
    }

    public UserSessionManagementService getUserSessionManagementService() {

        return userSessionManagementService;

    }

    public void setUserSessionManagementService(UserSessionManagementService userSessionManagementService) {

        this.userSessionManagementService = userSessionManagementService;

    }

    public IdpManager getIdentityProviderManagementService() {

        return identityProviderManagementService;
    }

    public void setIdentityProviderManagementService(IdpManager identityProviderManagementService) {

        this.identityProviderManagementService = identityProviderManagementService;
    }

    public JsFunctionRegistry getJsFunctionRegistry() {

        return jsFunctionRegistry;
    }

    public void setJsFunctionRegistry(JsFunctionRegistry jsFunctionRegistry) {

        this.jsFunctionRegistry = jsFunctionRegistry;
    }

    /**
     * Method to get the Claim Metadata Management Service.
     *
     * @return claimMetadataManagementService.
     */
    public ClaimMetadataManagementService getClaimMetadataManagementService() {

        return claimMetadataManagementService;
    }

    /**
     * Method to set the Claim Metadata Management Service.
     *
     * @param claimMetadataManagementService Claim Metadata Management Service.
     */
    public void setClaimMetadataManagementService(
            ClaimMetadataManagementService claimMetadataManagementService) {

        this.claimMetadataManagementService = claimMetadataManagementService;
    }
}
