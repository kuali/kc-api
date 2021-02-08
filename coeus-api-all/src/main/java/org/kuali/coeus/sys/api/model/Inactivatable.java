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
 * This interface can be used to identify an object which has an active
 * indicator.
 */
public interface Inactivatable {

    /**
     * The active indicator for an object.
     *
     * @return true if active false if not.
     */
    boolean isActive();
}
