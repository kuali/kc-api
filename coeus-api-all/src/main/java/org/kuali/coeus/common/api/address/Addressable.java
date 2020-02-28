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
package org.kuali.coeus.common.api.address;

public interface Addressable {

    String getAddressLine1();

    String getAddressLine2();

    String getAddressLine3();

    String getCity();

    String getCounty();

    String getState();

    String getPostalCode();

    String getCountryCode();

}