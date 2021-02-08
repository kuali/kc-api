/*-
 * #%L
 * %%
 * Copyright (C) 2014 - 2021 Kuali, Inc. - All Rights Reserved
 * %%
 * You may use and modify this code under the terms of the Kuali, Inc.
 * Pre-Release License Agreement. You may not distribute it.
 * 
 * You should have received a copy of the Kuali, Inc. Pre-Release License
 * Agreement with this file. If not, please write to license@kuali.co.
 * #L%
 */

package org.kuali.coeus.propdev.api.budget.subaward;

import org.kuali.coeus.propdev.api.hierarchy.HierarchicalProposal;

import java.util.Date;
import java.util.List;

public interface BudgetSubAwardsContract extends IdentifiableSubAwardBudget, HierarchicalProposal {
    Integer getBudgetVersionNumber();
    String getComments();
    String getOrganizationName();
    String getOrganizationId();
    Integer getSubAwardStatusCode();
    String getTranslationComments();

    String getSubAwardXfdFileName();
    byte[] getSubAwardXfdFileData();
    Date getXfdUpdateTimestamp();
    String getXfdUpdateUser();

    String getSubAwardXmlFileData();
    Date getXmlUpdateTimestamp();
    String getXmlUpdateUser();

    String getNamespace();
    String getFormName();

    List<? extends BudgetSubAwardAttachmentContract> getBudgetSubAwardAttachments();
    List<? extends BudgetSubAwardFilesContract> getBudgetSubAwardFiles();
    List<? extends BudgetSubAwardPeriodDetailContract> getBudgetSubAwardPeriodDetails();
}
