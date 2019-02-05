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
