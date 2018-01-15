/* Copyright © 2005-2018 Kuali, Inc. - All Rights Reserved
 * You may use and modify this code under the terms of the Kuali, Inc.
 * Pre-Release License Agreement. You may not distribute it.
 *
 * You should have received a copy of the Kuali, Inc. Pre-Release License
 * Agreement with this file. If not, please write to license@kuali.co.
 */
package org.kuali.coeus.sys.api.model;

import java.util.Date;

/**
 * This interface can be used to identify a user and timestamp regarding when the object was last
 * modified (usually in regards to object persistence).
 *
 * If the object has just be persisted, then these fields will record the initial creator of the
 * object otherwise it records information about the last update.
 */
public interface RecordedUpdate {

    /**
     * The date and time of when the object was last inserted or updated
     * @return the date or null if the object is new
     */
    Date getUpdateTimestamp();

    /**
     * The user who last inserted or updated the object
     * @return the user or null if the object is new
     */
    String getUpdateUser();

}
