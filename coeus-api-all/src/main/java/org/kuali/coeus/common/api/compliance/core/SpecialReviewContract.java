/* Copyright © 2005-2018 Kuali, Inc. - All Rights Reserved
 * You may use and modify this code under the terms of the Kuali, Inc.
 * Pre-Release License Agreement. You may not distribute it.
 *
 * You should have received a copy of the Kuali, Inc. Pre-Release License
 * Agreement with this file. If not, please write to license@kuali.co.
 */
package org.kuali.coeus.common.api.compliance.core;


import java.sql.Date;

public interface SpecialReviewContract {

    Integer getSpecialReviewNumber();

    String getProtocolNumber();

    Date getApplicationDate();

    Date getApprovalDate();

    Date getExpirationDate();

    String getComments();

    String getProtocolStatus();

    SpecialReviewTypeContract getSpecialReviewType();

    SpecialReviewApprovalTypeContract getApprovalType();
}
