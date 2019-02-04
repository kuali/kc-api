
package org.kuali.coeus.common.questionnaire.api.question;

import org.kuali.coeus.common.questionnaire.api.core.QuestionTypeContract;
import org.kuali.coeus.sys.api.model.DocumentNumbered;
import org.kuali.coeus.sys.api.model.IdentifiableNumeric;
import org.kuali.coeus.sys.api.model.Sequenceable;

import java.util.List;

public interface QuestionContract extends IdentifiableNumeric, DocumentNumbered, Sequenceable {

    Integer getQuestionSeqId();
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
