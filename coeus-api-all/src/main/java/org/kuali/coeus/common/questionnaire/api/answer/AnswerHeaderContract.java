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

import org.kuali.coeus.common.questionnaire.api.answer.AnswerContract;
import org.kuali.coeus.sys.api.model.IdentifiableNumeric;
import org.kuali.coeus.sys.api.model.Inactivatable;

import java.util.List;

public interface AnswerHeaderContract extends IdentifiableNumeric, Inactivatable {

    String getModuleItemCode();

    String getModuleItemKey();

    String getModuleSubItemCode();

    String getModuleSubItemKey();

    Long getQuestionnaireId();

    boolean isCompleted();

    List<? extends AnswerContract> getAnswers();
}
