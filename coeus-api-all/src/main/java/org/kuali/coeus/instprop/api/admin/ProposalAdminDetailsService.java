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

package org.kuali.coeus.instprop.api.admin;


import java.util.List;

public interface ProposalAdminDetailsService {

    /**
     * This method retrieves Proposal Admin Details by a Development Proposal's proposal number.
     * If no matching Proposal Admin Details are found an empty list is returned.
     * The proposal number cannot be blank.
     *
     * @param proposalNumber the development proposal's proposal number.  cannot be blank.
     * @return a list of  Proposal Admin Details or an empty list not found.
     * @throws java.lang.IllegalArgumentException if the proposalNumber is blank
     */
    List<? extends ProposalAdminDetailsContract> findProposalAdminDetailsByPropDevNumber(String proposalNumber);
}
