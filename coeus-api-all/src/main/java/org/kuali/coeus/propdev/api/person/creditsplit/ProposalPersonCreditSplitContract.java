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

package org.kuali.coeus.propdev.api.person.creditsplit;

import org.kuali.coeus.common.api.type.InvestigatorCreditTypeContract;
import org.kuali.coeus.propdev.api.person.ProposalPersonLink;
import org.kuali.coeus.sys.api.model.ScaleTwoDecimal;

public interface ProposalPersonCreditSplitContract extends ProposalPersonLink {

    ScaleTwoDecimal getCredit();

    InvestigatorCreditTypeContract getInvestigatorCreditType();
}
