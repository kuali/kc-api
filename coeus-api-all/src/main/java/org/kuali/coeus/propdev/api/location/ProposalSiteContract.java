/*-
 * #%L
 * %%
 * Copyright (C) 2014 - 2020 Kuali, Inc. - All Rights Reserved
 * %%
 * You may use and modify this code under the terms of the Kuali, Inc.
 * Pre-Release License Agreement. You may not distribute it.
 * 
 * You should have received a copy of the Kuali, Inc. Pre-Release License
 * Agreement with this file. If not, please write to license@kuali.co.
 * #L%
 */

package org.kuali.coeus.propdev.api.location;

import org.kuali.coeus.common.api.address.Addressable;
import org.kuali.coeus.common.api.org.OrganizationContract;
import org.kuali.coeus.common.api.rolodex.RolodexContract;
import org.kuali.coeus.propdev.api.core.NumberedProposal;

import java.util.List;

public interface ProposalSiteContract extends NumberedProposal, Addressable {

    Integer getSiteNumber();

    String getLocationName();

    Integer getLocationTypeCode();

    OrganizationContract getOrganization();

    RolodexContract getRolodex();

    List<? extends CongressionalDistrictContract> getCongressionalDistricts();

    String getFirstCongressionalDistrictName();

}
