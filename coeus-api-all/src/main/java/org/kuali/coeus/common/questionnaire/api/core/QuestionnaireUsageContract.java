
package org.kuali.coeus.common.questionnaire.api.core;

import org.kuali.coeus.sys.api.model.IdentifiableNumeric;

public interface QuestionnaireUsageContract extends IdentifiableNumeric{

    String getModuleItemCode();

    String getModuleSubItemCode();

    Long getQuestionnaireId();

    String getRuleId();

    String getQuestionnaireLabel();

    Integer getQuestionnaireSequenceNumber();

    boolean isMandatory();
}
