package org.kuali.coeus.common.api.sponsor;


public interface Sponsorable {
	
	String getSponsorCode();

    void setSponsorCode(String sponsorCode);
    
    String getPrimeSponsorCode();

    void setPrimeSponsorCode(String primeSponsorCode);
}
