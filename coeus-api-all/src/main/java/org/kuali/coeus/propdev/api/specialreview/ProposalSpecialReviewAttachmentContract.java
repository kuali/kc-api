/* Copyright © 2005-2018 Kuali, Inc. - All Rights Reserved
 * You may use and modify this code under the terms of the Kuali, Inc.
 * Pre-Release License Agreement. You may not distribute it.
 *
 * You should have received a copy of the Kuali, Inc. Pre-Release License
 * Agreement with this file. If not, please write to license@kuali.co.
 */

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
