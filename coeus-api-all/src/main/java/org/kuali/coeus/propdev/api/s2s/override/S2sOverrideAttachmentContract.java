
package org.kuali.coeus.propdev.api.s2s.override;

import org.kuali.coeus.sys.api.model.KcFile;
import org.kuali.coeus.sys.api.model.Sha1Hashable;

public interface S2sOverrideAttachmentContract extends Sha1Hashable, KcFile {

    String getAttachmentId();
    String getContentId();
}
