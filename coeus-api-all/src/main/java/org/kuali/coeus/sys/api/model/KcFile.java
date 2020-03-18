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
 * Simple interface to provide common file methods.
 */
public interface KcFile {

    /**
     * Returns file name of the file.
     *
     * @return name
     */
    String getName();

    /**
     * Returns the mime type of the file.
     *
     * @return type
     */
    String getType();

    /**
     * Returns the data of this file.
     *
     * @return data
     */
    byte[] getData();

    /**
     * @return the file identifier.  Typically this is the id of the file content in the database or the path in an S3 bucket.
     */
    default String getFileDataId() {
        return null;
    }
}
