/*-
 * #%L
 * %%
 * Copyright (C) 2014 - 2019 Kuali, Inc. - All Rights Reserved
 * %%
 * You may use and modify this code under the terms of the Kuali, Inc.
 * Pre-Release License Agreement. You may not distribute it.
 * 
 * You should have received a copy of the Kuali, Inc. Pre-Release License
 * Agreement with this file. If not, please write to license@kuali.co.
 * #L%
 */

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
