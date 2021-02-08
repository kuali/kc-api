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

import java.util.Date;

/**
 * This interface can be used to identify a user and timestamp regarding when the object was initially created
 * (usually in regards to object persistence).
 */
public interface RecordedCreate {

    /**
     * The date and time of when the object was last inserted
     * @return the date or null if the object is new
     */
    Date getCreateTimestamp();

    /**
     * The user who last inserted the object
     * @return the user or null if the object is new
     */
    String getCreateUser();

}
