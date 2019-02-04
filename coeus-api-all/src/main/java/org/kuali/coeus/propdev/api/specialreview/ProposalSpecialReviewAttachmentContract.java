

package org.kuali.coeus.propdev.api.specialreview;

import org.kuali.coeus.sys.api.model.IdentifiableNumeric;
import org.kuali.coeus.sys.api.model.KcFile;

import java.util.Map;

public interface ProposalSpecialReviewAttachmentContract extends KcFile, IdentifiableNumeric {

    String getStudyTitle();

    Boolean getClinicalTrial();

    Boolean isAttachmentDelayedOnset();

    Map<String, Object> getSpecialReviewAttachmentXmlFileData();

}
