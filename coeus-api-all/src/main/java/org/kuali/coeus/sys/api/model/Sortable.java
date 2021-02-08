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
 * Represents an object which is sortable by sortId.
 */
public interface Sortable {

    /**
     * The sort id for this object.  In general a sort id is optional but if set is
     * usually either one or two numbers or letters.
     *
     * @return the sort id for this object.
     */
    Integer getSortId();
}
