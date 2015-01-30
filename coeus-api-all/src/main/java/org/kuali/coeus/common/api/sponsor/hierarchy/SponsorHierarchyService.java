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
package org.kuali.coeus.common.api.sponsor.hierarchy;
        
        
public interface SponsorHierarchyService {
    
    public static final String SPONSOR_HIERARCHY_NIH_MULT_PI = "NIH Multiple PI";
    public static final String SPONSOR_HIERARCHY_NIH_OSC = "NIH Other Significant Contributor";
    
    /**
      * Checks if a given sponsor is in the hierarchy for a specific level.
      * @param sponsorCode the sponsor code.  Cannot be blank.
      * @param hierarchyName the hierarchy name.  Cannot be blank.
      * @param level the hierarchy level.  Must be between 1 and 10 inclusive.
      * @param levelName the level name.  Cannot be blank.
      * @return returns true if the sponsor is in the hierarchy
      * @throws IllegalArgumentException if the sponsorCode, hierarchyName, or levelName is blank
      * or if level is not between 1 and 10 inclusive
      */
    public boolean isSponsorInHierarchy(String sponsorCode, String hierarchyName, int level, String levelName);
    
    /**
      * Checks if a given sponsor is in the hierarchy for any level.
      * @param sponsorCode the sponsor code.  Cannot be blank.
      * @param hierarchyName the hierarchy name.  Cannot be blank.
      * @return returns true if the sponsor is in the hierarchy
      * @throws IllegalArgumentException if the sponsorCode, hierarchyName is blank
      */
    public boolean isSponsorInHierarchy(String sponsorCode, String hierarchyName);

    /**
      * Checks if a given sponsor is in the NIH Multiple PI hierarchy for any level.
      * @param sponsorCode the sponsor code.  Cannot be blank.
      * @return returns true if the sponsor code is a "NIH Multiple PI" type
      * @throws IllegalArgumentException if the sponsorCode is blank
      */
    public boolean isSponsorNihMultiplePi(String sponsorCode);
    
    /**
      * Checks if the sponsor code is a "NIH Other Significant Contributor" type.
      * @param sponsorCode the sponsor code.  Cannot be blank.
      * @return returns true if the sponsor code is a "NIH Other Significant Contributor" type
      * @throws IllegalArgumentException if the sponsorCode is blank
      */
    public boolean isSponsorNihOsc(String sponsorCode);
}
