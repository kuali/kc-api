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
