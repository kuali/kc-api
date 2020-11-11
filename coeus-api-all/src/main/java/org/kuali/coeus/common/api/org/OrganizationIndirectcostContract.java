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

package org.kuali.coeus.common.api.org;

import org.kuali.coeus.sys.api.model.ScaleTwoDecimal;

import java.util.Date;

public interface OrganizationIndirectcostContract {

    Integer getIdcNumber();

    String getOrganizationId();

    ScaleTwoDecimal getApplicableIndirectcostRate();

    Date getEndDate();

    String getIdcComment();

    Integer getIdcRateTypeCode();

    Date getRequestedDate();

    Date getStartDate();

    String getFederalApprovingAgency();

    String getFederalApprovingAgencyName();

    String getRestrictedRatePolicy();

    String getTrainingRatePolicy();

}
