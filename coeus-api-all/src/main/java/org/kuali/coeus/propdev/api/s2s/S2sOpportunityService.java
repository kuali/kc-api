/*-
 * #%L
 * %%
 * Copyright (C) 2014 - 2019 Kuali, Inc. - All Rights Reserved
 * %%
 * You may use and modify this code under the terms of the Kuali, Inc.
 * Pre-Release License Agreement. You may not distribute it.
 * 
 * You should have received a copy of the Kuali, Inc. Pre-Release License
 * Agreement with this file. If not, please write to license@kuali.co.
 * #L%
 */

package org.kuali.coeus.propdev.api.s2s;


public interface S2sOpportunityService {

    /**
     * This method retrieves and S2S Opportunity by proposal number. The proposal number cannot be blank.
     * Will return null if non is found.
     *
     * @param proposalNumber the proposal number.  Cannot be blank.
     * @return the S2sOpportunity or null.
     * @throws java.lang.IllegalArgumentException if proposal number is blank
     */
    S2sOpportunityContract findS2SOpportunityByProposalNumber(String proposalNumber);
}
