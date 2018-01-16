/* Copyright © 2005-2018 Kuali, Inc. - All Rights Reserved
 * You may use and modify this code under the terms of the Kuali, Inc.
 * Pre-Release License Agreement. You may not distribute it.
 *
 * You should have received a copy of the Kuali, Inc. Pre-Release License
 * Agreement with this file. If not, please write to license@kuali.co.
 */
package org.kuali.coeus.sys.api.model;

/**
 * This interface can be used to identify an object which has a unique
 * identifier.
 */
public interface IdentifiableNumeric {

    /**
     * The unique identifier for an object.  This can be null unless the
     * object has not been given an id yet.
     *
     * @return the id
     */
    Long getId();
}
