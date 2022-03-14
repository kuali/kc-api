/*-
 * #%L
 * %%
 * Copyright (C) 2014 - 2022 Kuali, Inc. - All Rights Reserved
 * %%
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
 * #L%
 */

package org.kuali.coeus.common.budget.api.personnel;

import org.kuali.coeus.common.budget.api.core.IdentifiableBudget;
import org.kuali.coeus.sys.api.model.ScaleTwoDecimal;
import org.kuali.coeus.sys.api.model.Sequenceable;

import java.util.Date;
import java.util.List;

public interface BudgetPersonnelDetailsContract extends IdentifiableBudget, Sequenceable {

    Long getBudgetPersonnelLineItemId();

    Long getBudgetLineItemId();
    
    Integer getLineItemNumber();
    
    Integer getBudgetPeriod();
    
    Boolean getOnOffCampusFlag();
    
    Date getEndDate();
    
    Date getStartDate();
    
    String getBudgetJustification();
    
    ScaleTwoDecimal getCostSharingAmount();
    
    String getLineItemDescription();
    
    Boolean getApplyInRateFlag();
    
    Integer getPersonNumber();
    
    ScaleTwoDecimal getCostSharingPercent();
    
    String getJobCode();
    
    ScaleTwoDecimal getPercentCharged();
    
    ScaleTwoDecimal getPercentEffort();
    
    String getPeriodTypeCode();
    
    String getPersonId();
    
    ScaleTwoDecimal getSalaryRequested();

    Integer getPersonSequenceNumber();
    
    ScaleTwoDecimal getUnderrecoveryAmount();
    
    Boolean getSubmitCostSharingFlag();

    BudgetPersonContract getBudgetPerson();

    List<? extends BudgetPersonnelCalculatedAmountContract> getBudgetPersonnelCalculatedAmounts();
}
