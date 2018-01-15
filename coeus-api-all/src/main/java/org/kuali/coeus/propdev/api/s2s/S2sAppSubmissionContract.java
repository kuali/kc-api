/* Copyright © 2005-2018 Kuali, Inc. - All Rights Reserved
 * You may use and modify this code under the terms of the Kuali, Inc.
 * Pre-Release License Agreement. You may not distribute it.
 *
 * You should have received a copy of the Kuali, Inc. Pre-Release License
 * Agreement with this file. If not, please write to license@kuali.co.
 */
package org.kuali.coeus.propdev.api.s2s;

import org.kuali.coeus.propdev.api.core.NumberedProposal;

import java.util.Date;

public interface S2sAppSubmissionContract extends NumberedProposal {

    Integer getSubmissionNumber();

    String getAgencyTrackingId();

    String getComments();

    String getGgTrackingId();

    Date getLastModifiedDate();

    Date getLastNotifiedDate();

    Date getReceivedDate();

    String getStatus();

    S2sApplicationContract getS2sApplication();
}
