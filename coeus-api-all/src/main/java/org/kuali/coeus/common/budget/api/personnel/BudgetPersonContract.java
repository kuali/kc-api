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

package org.kuali.coeus.common.budget.api.personnel;

import org.kuali.coeus.common.budget.api.core.IdentifiableBudget;
import org.kuali.coeus.propdev.api.hierarchy.HierarchicalProposal;
import org.kuali.coeus.sys.api.model.ScaleTwoDecimal;

import java.util.Date;

public interface BudgetPersonContract extends IdentifiableBudget, HierarchicalProposal {

    Date getEffectiveDate();

    Boolean getNonEmployeeFlag();

    String getPersonId();

    Integer getRolodexId();

    String getTbnId();

    ScaleTwoDecimal getCalculationBase();

    String getPersonName();

    Integer getPersonSequenceNumber();

    Date getSalaryAnniversaryDate();

    AppointmentTypeContract getAppointmentType();

    JobCodeContract getJobCodeRef();
}
