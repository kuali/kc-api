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

package org.kuali.coeus.propdev.api.person;

import org.kuali.coeus.propdev.api.person.creditsplit.ProposalUnitCreditSplitContract;

import java.util.List;

public interface ProposalPersonUnitContract extends ProposalPersonLink {

    String getUnitNumber();

    boolean isLeadUnit();

    List<? extends ProposalUnitCreditSplitContract> getCreditSplits();
}
