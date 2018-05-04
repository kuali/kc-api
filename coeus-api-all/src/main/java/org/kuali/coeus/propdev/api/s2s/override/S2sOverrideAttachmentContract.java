/* Copyright © 2005-2018 Kuali, Inc. - All Rights Reserved
 * You may use and modify this code under the terms of the Kuali, Inc.
 * Pre-Release License Agreement. You may not distribute it.
 *
 * You should have received a copy of the Kuali, Inc. Pre-Release License
 * Agreement with this file. If not, please write to license@kuali.co.
 */
package org.kuali.coeus.propdev.api.s2s.override;

import org.kuali.coeus.sys.api.model.KcFile;
import org.kuali.coeus.sys.api.model.Sha1Hashable;

public interface S2sOverrideAttachmentContract extends Sha1Hashable, KcFile {

    String getAttachmentId();
    String getContentId();
}