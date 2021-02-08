/*-
 * #%L
 * %%
 * Copyright (C) 2014 - 2021 Kuali, Inc. - All Rights Reserved
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
 * Represents an object which has a name.
 */
public interface Named {
    /**
     * The name for this object.  In general a name can be alpha numeric characters and is generally not null or blank.
     *
     * @return the name for this object.
     */
    String getName();
}
