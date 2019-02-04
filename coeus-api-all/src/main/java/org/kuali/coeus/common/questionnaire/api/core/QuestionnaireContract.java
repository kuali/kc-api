
package org.kuali.coeus.common.questionnaire.api.core;

import org.kuali.coeus.sys.api.model.*;

import java.util.List;

public interface QuestionnaireContract extends IdentifiableNumeric, Describable, Inactivatable, Named, DocumentNumbered, Sequenceable {

    String getQuestionnaireSeqId();

    String getFileName();

    byte[] getTemplate();

    List<? extends QuestionnaireQuestionContract> getQuestionnaireQuestions();

    List<? extends QuestionnaireUsageContract> getQuestionnaireUsages();
}
