/*
 * Kuali Coeus, a comprehensive research administration system for higher education.
 * 
 * Copyright 2005-2016 Kuali, Inc.
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
package org.kuali.coeus.propdev.api.s2s;

import java.util.List;

public interface S2SConfigurationService {

    /**
     * This method gets a config value for the s2s application from a config name as a String.
     * The name cannot be blank.  This method will return the config value or null
     * if the value cannot be found.
     *
     * @param name the name to retrieve the value for
     * @return the configuration value or null
     * @throws java.lang.IllegalArgumentException if the name is blank
     */
    String getValueAsString(String name);

    /**
     * This method gets a config value for the s2s application from a config name as a Boolean.
     * The name cannot be blank.  This method will return the config value or null
     * if the value cannot be found.
     *
     * <p>
     *   This method will return null if the parameter does not exist or is not a valid truth value.
     * </p>
     *
     * valid true values (case insensitive):
     * <ul>
     *     <li>Y</li>
     *     <li>true</li>
     *     <li>on</li>
     *     <li>1</li>
     *     <li>t</li>
     *     <li>enabled</li>
     * </ul>
     *
     * valid false values (case insensitive):
     * <ul>
     *     <li>N</li>
     *     <li>false</li>
     *     <li>off</li>
     *     <li>0</li>
     *     <li>f</li>
     *     <li>disabled</li>
     * </ul>
     *
     * @param name the name to retrieve the value for
     * @return the configuration value or null
     * @throws java.lang.IllegalArgumentException if the name is blank
     */
    Boolean getValueAsBoolean(String name);
    
    /**
     * This method gets a config values for the s2s application from a config name as a List of Strings.
     * The name cannot be blank.  This method will return the config values or 
     * null if the value cannot be found.
     *
     * @param name the name to retrieve the value for
     * @return the configuration values or null
     * @throws java.lang.IllegalArgumentException if the name is blank
     */
    List<String> getValuesFromCommaSeparatedParam(String name);
}
