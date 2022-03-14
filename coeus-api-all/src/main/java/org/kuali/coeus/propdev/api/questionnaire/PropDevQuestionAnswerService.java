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

package org.kuali.coeus.propdev.api.questionnaire;


import org.kuali.coeus.common.questionnaire.api.answer.AnswerContract;
import org.kuali.coeus.common.questionnaire.api.answer.AnswerHeaderContract;

import java.util.List;

public interface PropDevQuestionAnswerService {

    /**
     * Gets a list of Answers from a proposal number, namespace, and form name. If none are found then an empty list is
     * returned.  The proposal number, namespace, and form name cannot be blank.
     *
     * @param proposalNumber the proposal number.  cannot be blank.
     * @param namespace the namespace.  cannot be blank.
     * @param formName the form name.  cannot be blank.
     * @return a list of answers or an empty list
     * @throws java.lang.IllegalArgumentException proposal number, namespace, or form name is blank
     */
    List<? extends AnswerContract> getQuestionnaireAnswers(String proposalNumber, String namespace, String formName);

    /**
     * Gets a list of Answer Headers from a proposal number, namespace, and form name. If none are found then an empty list is
     * returned.  The proposal number, namespace, and form name cannot be blank.
     *
     * @param proposalNumber the proposal number.  cannot be blank.
     * @param namespace the namespace.  cannot be blank.
     * @param formName the form name.  cannot be blank.
     * @return a list of answer headers or an empty list
     * @throws java.lang.IllegalArgumentException proposal number, namespace, or form name is blank
     */
    List<? extends AnswerHeaderContract> getQuestionnaireAnswerHeaders(String proposalNumber, String namespace, String formName);

    /**
     * Gets a list of Answer Headers from a proposal number. If none are found then an empty list is
     * returned.  The proposal number cannot be blank.
     *
     * @param proposalNumber the proposal number.  cannot be blank.
     * @return a list of answer headers or an empty list
     * @throws java.lang.IllegalArgumentException proposal number is blank
     */
    List<? extends AnswerHeaderContract> getQuestionnaireAnswerHeaders(String proposalNumber);
}
