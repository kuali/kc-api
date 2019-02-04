
package org.kuali.coeus.common.questionnaire.api.core;

import org.kuali.coeus.common.questionnaire.api.question.QuestionContract;
import org.kuali.coeus.sys.api.model.IdentifiableNumeric;

public interface QuestionnaireQuestionContract extends IdentifiableNumeric {

    Long getQuestionnaireId();

    Long getQuestionId();

    Integer getQuestionNumber();

    Integer getParentQuestionNumber();

    boolean getConditionFlag();

    String getCondition();

    String getConditionValue();

    Integer getQuestionSeqNumber();

    String getRuleId();

    QuestionContract getQuestion();
}
