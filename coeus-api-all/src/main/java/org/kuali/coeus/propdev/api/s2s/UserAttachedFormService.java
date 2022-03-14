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

package org.kuali.coeus.propdev.api.s2s;

import java.util.List;

public interface UserAttachedFormService {

    /**
     * This method find a S2S User Attached Form by a proposal number and namespace.  There is supposed to be only one
     * form with the same proposal number and namespace combination.  If more that one is found the first one is
     * returned.  If no matching forms are found null is returned.
     *
     * @param proposalNumber  the proposal number.  Cannot be blank
     * @param namespace the namespace.  Cannot be blank.
     * @return a S2S User Attached Form or null.
     * @throws java.lang.IllegalArgumentException if either proposalNumber or namespace is blank.
     */
    S2sUserAttachedFormContract findFormByProposalNumberAndNamespace(String proposalNumber, String namespace);

    /**
     * This method find a S2S User Attached Form name by a proposal number and namespace.  There is supposed to be only one
     * form with the same proposal number and namespace combination.  If more that one is found the first name is
     * returned.  If no matching forms are found null is returned.
     *
     * @param proposalNumber  the proposal number.  Cannot be blank
     * @param namespace the namespace.  Cannot be blank.
     * @return a S2S User Attached Form name or null.
     * @throws java.lang.IllegalArgumentException if either proposalNumber or namespace is blank.
     */
    String findFormNameByProposalNumberAndNamespace(String proposalNumber, String namespace);

    /**
     * This method find all the user attached form namespaces for a given proposal number.  This list should not contain
     * duplicates but in theory could.  This method will return an empty collection if no namespaces are found.
     *
     * @param proposalNumber  the proposal number.  Cannot be blank
     * @return a list of namespaces or an empty list.
     * @throws java.lang.IllegalArgumentException if either proposalNumber.
     */
    List<String> findFormNamespaces(String proposalNumber);

    /**
     * This method finds a user attached form file from a user attached form.  The selectedForm cannot be null.
     *
     * @param selectedForm the user attached form or null
     * @return the user attached form file or null
     * @throws java.lang.IllegalArgumentException if the selectedForm is null
     */
    S2sUserAttachedFormFileContract findUserAttachedFormFile(S2sUserAttachedFormContract selectedForm);

    /**
     * This method finds a user attached attachment form file from a user attached form attachment.
     * The selectedFormAtt cannot be null.
     *
     * @param selectedFormAtt the user attached form attachment or null
     * @return the user attached form attachment file or null
     * @throws java.lang.IllegalArgumentException if the selectedFormAtt is null
     */
    S2sUserAttachedFormAttFileContract findUserAttachedFormAttFile(S2sUserAttachedFormAttContract selectedFormAtt);
}
