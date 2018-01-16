/* Copyright © 2005-2018 Kuali, Inc. - All Rights Reserved
 * You may use and modify this code under the terms of the Kuali, Inc.
 * Pre-Release License Agreement. You may not distribute it.
 *
 * You should have received a copy of the Kuali, Inc. Pre-Release License
 * Agreement with this file. If not, please write to license@kuali.co.
 */
package org.kuali.coeus.sys.api.model;

/**
 * This interface can be used to identify a object which has a globally unique identifier.
 * This globally unique identifier is referred as the "objectId" of the object.  The means by
 * which it is generated or general format of this value is not specified, however it is
 * intended that some sort of GUID algorithm is used to generate this value, such as the one
 * provided by {@link java.util.UUID}.
 */
public interface GloballyUnique {

	/**
     * Return the globally unique object id of this object.  In general, this value should only
	 * be null if the object has not yet been stored to a persistent data store.
	 * 
	 * @return the objectId of this object, or null if it has not been set yet
	 */
	String getObjectId();
	
}
