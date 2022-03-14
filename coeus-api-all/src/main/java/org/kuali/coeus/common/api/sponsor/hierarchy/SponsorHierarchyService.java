/*-
 * #%L
 * %%
 * Copyright (C) 2014 - 2022 Kuali, Inc. - All Rights Reserved
 * %%
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
 * #L%
 */

package org.kuali.coeus.common.api.sponsor.hierarchy;
        
public interface SponsorHierarchyService {
    
    String SPONSOR_HIERARCHY_NIH_MULT_PI = "NIH Multiple PI";
    String SPONSOR_HIERARCHY_KCOI_PHS = "KCOI PHS";

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
    boolean isSponsorInHierarchy(String sponsorCode, String hierarchyName, int level, String levelName);
    
    /**
      * Checks if a given sponsor is in the hierarchy for any level.
      * @param sponsorCode the sponsor code.  Cannot be blank.
      * @param hierarchyName the hierarchy name.  Cannot be blank.
      * @return returns true if the sponsor is in the hierarchy
      * @throws IllegalArgumentException if the sponsorCode, hierarchyName is blank
      */
    boolean isSponsorInHierarchy(String sponsorCode, String hierarchyName);

    /**
      * Checks if a given sponsor is in the NIH Multiple PI hierarchy for any level.
      * @param sponsorCode the sponsor code.  Cannot be blank.
      * @return returns true if the sponsor code is a "NIH Multiple PI" type
      * @throws IllegalArgumentException if the sponsorCode is blank
      */
    boolean isSponsorNihMultiplePi(String sponsorCode);
    
    /**
      * Checks if the sponsor code is a "NIH Other Significant Contributor" type.
      * @param sponsorCode the sponsor code.  Cannot be blank.
      * @return returns true if the sponsor code is a "NIH Other Significant Contributor" type
      * @throws IllegalArgumentException if the sponsorCode is blank
      * @deprecated This is probably not used anymore.  To check if a sponsor is NIH call {@link #isSponsorNihMultiplePi(String)}
      */
    @Deprecated
    boolean isSponsorNihOsc(String sponsorCode);

    /**
     * Check if a given sponsor is in the KCOI PHS hierarchy for any level.
     * @param sponsorCode the sponsor code.  Cannot be blank.
     * @return returns true if the sponsor code is a "KCOI PHS" type
     * @throws IllegalArgumentException if the sponsorCode is blank
     */
    boolean isSponsorKcoiPhs(String sponsorCode);
}
