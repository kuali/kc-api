/*
 * Kuali Coeus, a comprehensive research administration system for higher education.
 * 
 * Copyright 2005-2016 Kuali, Inc.
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
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
