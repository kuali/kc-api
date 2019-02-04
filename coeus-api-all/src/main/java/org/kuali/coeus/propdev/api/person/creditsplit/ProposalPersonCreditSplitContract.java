
package org.kuali.coeus.propdev.api.person.creditsplit;

import org.kuali.coeus.common.api.type.InvestigatorCreditTypeContract;
import org.kuali.coeus.propdev.api.person.ProposalPersonLink;
import org.kuali.coeus.sys.api.model.ScaleTwoDecimal;

public interface ProposalPersonCreditSplitContract extends ProposalPersonLink {

    ScaleTwoDecimal getCredit();

    InvestigatorCreditTypeContract getInvestigatorCreditType();
}
