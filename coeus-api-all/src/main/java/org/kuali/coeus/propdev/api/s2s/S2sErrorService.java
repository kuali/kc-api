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

package org.kuali.coeus.propdev.api.s2s;

public interface S2sErrorService {

    /**
     * Finds an s2s error by key.  The key cannot be blank.
     * @param key the key.  cannot be null.
     * @return an s2s error or null if not found.
     * @throws java.lang.IllegalArgumentException if the key is blank
     */
    S2sErrorContract findS2sErrorByKey(String key);
}
