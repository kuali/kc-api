
package org.kuali.coeus.propdev.api.s2s.override;

import org.kuali.coeus.common.api.person.KcPersonContract;
import org.kuali.coeus.sys.api.model.Describable;
import org.kuali.coeus.sys.api.model.Identifiable;
import org.kuali.coeus.sys.api.model.Inactivatable;

import java.sql.Date;

public interface S2sOverrideContract extends Identifiable, Inactivatable, Describable {

    String getSignedBy();
    KcPersonContract getSignedByPerson();
    Date getSubmittedDate();

    S2sOverrideApplicationDataContract getApplication();
    S2sOverrideApplicationDataContract getApplicationOverride();
}
