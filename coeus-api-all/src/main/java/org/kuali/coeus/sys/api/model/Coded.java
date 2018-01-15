/* Copyright © 2005-2018 Kuali, Inc. - All Rights Reserved
 * You may use and modify this code under the terms of the Kuali, Inc.
 * Pre-Release License Agreement. You may not distribute it.
 *
 * You should have received a copy of the Kuali, Inc. Pre-Release License
 * Agreement with this file. If not, please write to license@kuali.co.
 */
package org.kuali.coeus.sys.api.model;

/**
 * Represents an object which has a code value.
 */
public interface Coded {

    /**
     * The code value for this object.  In general a code value cannot be null or a blank string.
     *
     * @return the code value for this object.
     */
    String getCode();

}
