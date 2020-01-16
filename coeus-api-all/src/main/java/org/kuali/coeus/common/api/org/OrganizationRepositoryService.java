/*-
 * #%L
 * %%
 * Copyright (C) 2014 - 2020 Kuali, Inc. - All Rights Reserved
 * %%
 * You may use and modify this code under the terms of the Kuali, Inc.
 * Pre-Release License Agreement. You may not distribute it.
 * 
 * You should have received a copy of the Kuali, Inc. Pre-Release License
 * Agreement with this file. If not, please write to license@kuali.co.
 * #L%
 */

package org.kuali.coeus.common.api.org;

public interface OrganizationRepositoryService {

    /**
     * Gets Cognizant Federal Agency for an organization.  The pass in organization cannot be null.
     * Will return an empty string the Cognizant Federal Agency cannot be determined.
     *
     * @param organization the organization.
     * @return the Cognizant Federal Agency or a blank string
     * @throws java.lang.IllegalArgumentException if the organization is null
     */
    String getCognizantFedAgency(OrganizationContract organization);
}
