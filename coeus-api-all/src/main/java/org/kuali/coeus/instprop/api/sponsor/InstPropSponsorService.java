/*-
 * #%L
 * %%
 * Copyright (C) 2014 - 2020 Kuali, Inc. - All Rights Reserved
 * %%
 * You may use and modify this code under the terms of the Kuali, Inc.
 * Pre-Release License Agreement. You may not distribute it.
 * 
 * You should have received a copy of the Kuali, Inc. Pre-Release License
 * Agreement with this file. If not, please write to license@kuali.co.
 * #L%
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
