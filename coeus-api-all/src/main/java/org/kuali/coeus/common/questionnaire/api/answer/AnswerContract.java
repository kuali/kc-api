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

package org.kuali.coeus.common.questionnaire.api.answer;

import org.kuali.coeus.sys.api.model.IdentifiableNumeric;

import java.util.List;

public interface AnswerContract extends IdentifiableNumeric {

    Integer getQuestionNumber();

    Integer getAnswerNumber();

    String getAnswer();

    Long getAnswerHeaderId();

    Long getQuestionId();

    Integer getQuestionSeqId();

    Long getQuestionnaireQuestionsId();

    List<? extends AnswerContract> getParentAnswers();
}
