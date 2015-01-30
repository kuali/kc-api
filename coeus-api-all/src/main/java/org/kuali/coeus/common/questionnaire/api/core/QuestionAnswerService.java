/*
 * Kuali Coeus, a comprehensive research administration system for higher education.
 * 
 * Copyright 2005-2015 The Kuali, Inc.
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
package org.kuali.coeus.common.questionnaire.api.core;


import org.kuali.coeus.common.questionnaire.api.question.QuestionContract;

public interface QuestionAnswerService {

    /**
     * This service retrieves the description of an answer.  If the answer id is null, this
     * method will throw an {@link java.lang.IllegalArgumentException}.  This method, only
     * supports retrieving descriptions where {@link #isAnswerDescriptionRetrievalSupported(Long)}
     * returns true. Note: that some answer may not have a description configured.  This can result in
     * a null return value.
     *
     * @param answerId the answer id. Cannot be null.
     * @return the description or null
     * @throws java.lang.IllegalArgumentException if the answer id is null
     * @throws java.lang.UnsupportedOperationException if description retrieval is not supported
     */
    String getAnswerDescription(Long answerId);

    /**
     * This method returns true if a answer description retrieval is supported for a specific answer.
     * If the answer id is null, this method will throw an {@link java.lang.IllegalArgumentException}.
     *
     * @param answerId the answer id. Cannot be null
     * @return true if answer description retrieval is supported
     * @throws java.lang.IllegalArgumentException if the answer id is null
     */
    boolean isAnswerDescriptionRetrievalSupported(Long answerId);

    /**
     * This method finds a Questionnaire by id. If no Questionnaire is found, then null is returned
     * If the questionnaire id is null, this method will throw an {@link java.lang.IllegalArgumentException}.
     *
     * @param id the questionnaire id
     * @return Questionnaire or null
     * @throws java.lang.IllegalArgumentException if the Questionnaire id is null
     */
    QuestionnaireContract findQuestionnaireById(Long id);

    /**
     * This method finds a Question by id. If no Question is found, then null is returned
     * If the question id is null, this method will throw an {@link java.lang.IllegalArgumentException}.
     *
     * @param id the questionnaire id
     * @return Questionnaire or null
     * @throws java.lang.IllegalArgumentException if the Questionnaire id is null
     */
    QuestionContract findQuestionById(Long id);
}
