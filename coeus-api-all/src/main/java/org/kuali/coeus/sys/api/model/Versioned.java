/*
 * Kuali Coeus, a comprehensive research administration system for higher education.
 * 
 * Copyright 2005-2015 Kuali, Inc.
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.kuali.coeus.sys.api.model;

/**
 * This interface can be used to identify a object which has a version number
 * that is used for the purposes of optimistic locking.
 */
public interface Versioned {

	
	/**
     * Returns the version number for this object.  In general, this value should only
	 * be null if the object has not yet been stored to a persistent data store.
	 * This version number is generally used for the purposes of optimistic locking.
	 * 
	 * @return the version number, or null if one has not been assigned yet
	 */
	Long getVersionNumber();
	
}
