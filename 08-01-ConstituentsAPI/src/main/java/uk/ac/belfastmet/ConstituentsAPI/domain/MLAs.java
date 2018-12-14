package uk.ac.belfastmet.ConstituentsAPI.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MLAs {
	
	@JsonProperty("PersonId")
	private String personId;
	@JsonProperty("AffiliationId")
	private String affiliationId;
	@JsonProperty("MemberName")
	private String memberName;
	@JsonProperty("MemberFirstName")
	private String memberFirstName;
	@JsonProperty("MemberFullDisplayName")
	private String memberDisplayName;
	@JsonProperty("MemberSortName")
	private String memberSortName;
	@JsonProperty("MemberTitle")
	private String memberTitle;
	@JsonProperty("PartyName")
	private String partyName;
	@JsonProperty("PartyOrganisationId")
	private String partyOrganisationId;
	@JsonProperty("ConstituencyName")
	private String constituencyName;
	@JsonProperty("ConstituencyId")
	private String constituencyId;

}
