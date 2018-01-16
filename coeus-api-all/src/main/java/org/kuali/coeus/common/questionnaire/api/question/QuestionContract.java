/* Copyright © 2005-2018 Kuali, Inc. - All Rights Reserved
 * You may use and modify this code under the terms of the Kuali, Inc.
 * Pre-Release License Agreement. You may not distribute it.
 *
 * You should have received a copy of the Kuali, Inc. Pre-Release License
 * Agreement with this file. If not, please write to license@kuali.co.
 */
package org.kuali.coeus.common.questionnaire.api.question;

import org.kuali.coeus.common.questionnaire.api.core.QuestionTypeContract;
import org.kuali.coeus.sys.api.model.IdentifiableNumeric;

import java.util.List;

public interface QuestionContract extends IdentifiableNumeric {

    String getDocumentNumber();
    Integer getQuestionSeqId();
    Integer getSequenceNumber();
    String getSequenceStatus();
    String getQuestion();
    String getStatus();
    String getLookupClass();
    String getLookupReturn();
    Integer getDisplayedAnswers();
    Integer getMaxAnswers();
    Integer getAnswerMaxLength();

    QuestionCategoryContract getQuestionCategory();

    QuestionTypeContract getQuestionType();

    List<? extends QuestionExplanationContract> getQuestionExplanations();
}
