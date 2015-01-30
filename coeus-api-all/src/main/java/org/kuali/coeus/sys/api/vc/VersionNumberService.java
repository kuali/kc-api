/*
 * Kuali Coeus, a comprehensive research administration system for higher education.
 * 
 * Copyright 2005-2015 The Kuali, Inc.
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
package org.kuali.coeus.sys.api.vc;

public interface VersionNumberService {

    /**
     * Retrieves the version number of the Kuali Coeus Application.  This method should return a
     * String that represents a semantically versioned number and in accordance to the maven artifact
     * versioning rules.
     *
     * @return a version number.  Will not return null or a blank string.
     * @throws java.lang.IllegalStateException if the version number is blank.  This represents a system
     * misconfiguration
     */
    String getVersion();

    /**
     * Checks if the version is less than the version returned from {@link #getVersion()}.
     * @param version the version to check.  cannot be blank.
     * @throws java.lang.IllegalArgumentException if the version is blank
     */
    boolean lessThan(String version);

    /**
     * Checks if the version is greater than the version returned from {@link #getVersion()}.
     * @param version the version to check.  cannot be blank.
     * @throws java.lang.IllegalArgumentException if the version is blank
     */
    boolean greaterThan(String version);

    /**
     * Checks if the version is equal to the version returned from {@link #getVersion()}.
     * @param version the version to check.  cannot be blank.
     * @throws java.lang.IllegalArgumentException if the version is blank
     */
    boolean equalTo(String version);
}
