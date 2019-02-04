
package org.kuali.coeus.propdev.api.s2s.override;

import org.kuali.coeus.sys.api.model.Identifiable;
import org.kuali.coeus.sys.api.model.KcFile;
import org.kuali.coeus.sys.api.model.Sha1Hashable;

import java.util.List;

public interface S2sOverrideApplicationDataContract  extends Identifiable, KcFile, Sha1Hashable {
    String getApplication();
    List<? extends S2sOverrideAttachmentContract> getAttachments();
}
