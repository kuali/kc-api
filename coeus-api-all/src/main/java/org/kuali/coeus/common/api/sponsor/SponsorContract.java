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

package org.kuali.coeus.common.api.sponsor;

import org.kuali.coeus.sys.api.model.Inactivatable;

public interface SponsorContract extends Inactivatable {

    String getSponsorCode();

    String getAcronym();

    String getAuditReportSentForFy();

    String getCageNumber();

    String getCountryCode();

    String getDodacNumber();

    String getDunAndBradstreetNumber();

    String getDunsPlusFourNumber();

    String getOwnedByUnit();

    String getPostalCode();

    Integer getRolodexId();

    String getSponsorName();

    String getState();

    String getCreateUser();

    SponsorTypeContract getSponsorType();
}
