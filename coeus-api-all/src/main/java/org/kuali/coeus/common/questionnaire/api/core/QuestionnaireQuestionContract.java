/*-
 * #%L
 * %%
 * Copyright (C) 2014 - 2020 Kuali, Inc. - All Rights Reserved
 * %%
 * You may use and modify this code under the terms of the Kuali, Inc.
 * Pre-Release License Agreement. You may not distribute it.
 * 
 * You should have received a copy of the Kuali, Inc. Pre-Release License
 * Agreement with this file. If not, please write to license@kuali.co.
 * #L%
 */

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
