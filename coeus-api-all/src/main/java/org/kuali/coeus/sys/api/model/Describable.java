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

package org.kuali.coeus.sys.api.model;

/**
 * Represents an object which has a description.
 */
public interface Describable {

    /**
     * The description for this object.  In general a description can be any characters as well as null or blank.
     *
     * @return the description for this object.
     */
    String getDescription();
}
