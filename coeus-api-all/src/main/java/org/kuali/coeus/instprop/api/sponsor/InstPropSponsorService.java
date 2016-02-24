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
package org.kuali.coeus.instprop.api.sponsor;

public interface InstPropSponsorService {

    /**
     * This method updates the sponsor proposal number on an institutional proposal only if the institutional proposal
     * does not currently have an sponsor proposal number set. If the institutional proposal is not found then nothing
     * is updated.
     *
     * @param institutionalProposalId the institutional proposal id.  cannot be null.
     * @param sponsorProposalNumber the sponsor proposal number to set.  cannot be blank.
     * @throws java.lang.IllegalArgumentException if the institutionalProposalNumber is null or sponsorProposalNumber is blank
     */
    void updateSponsorProposalNumber(Long institutionalProposalId, String sponsorProposalNumber);
}
