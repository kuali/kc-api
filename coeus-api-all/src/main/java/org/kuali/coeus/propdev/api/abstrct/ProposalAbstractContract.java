
package org.kuali.coeus.propdev.api.abstrct;

import org.kuali.coeus.propdev.api.core.NumberedProposal;

import java.util.Date;

public interface ProposalAbstractContract extends NumberedProposal {

    String getAbstractDetails();

    AbstractTypeContract getAbstractType();

    Date getTimestampDisplay();

    String getUploadUserDisplay();
}
