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

package org.kuali.coeus.propdev.api.s2s;


import java.util.List;

public interface S2sFormConfigurationService {

    /**
     * Finds an s2s form configuration by form name.  The form name cannot be null or blank.
     * @param formName the form name.  cannot be null or blank.
     * @return an s2s form configuration or null if not found.
     * @throws java.lang.IllegalArgumentException if the form Name is blank
     */
    S2sFormConfigurationContract findS2sFormConfigurationByFormName(String formName);

    /**
     * Finds all s2s form configurations.
     * @return an s2s form configuration or an empty list if non is found.
     */
    List<? extends S2sFormConfigurationContract> findAllS2sFormConfigurations();
}
