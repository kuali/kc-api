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

package org.kuali.coeus.common.api.state;

public interface KcStateService {

    /**
     * This method retrieves a state by country code and state code.  If the state is not found null is returned.
     * Both the country code and state code cannot be blank.
     *
     * @param countryCode the country code.  cannot be blank.
     * @param code the state code.  cannot be blank.
     * @return the state or null if not found.
     * @throws java.lang.IllegalArgumentException if the countryCode, code is blank
     */
    StateContract getState(String countryCode, String code);
}
