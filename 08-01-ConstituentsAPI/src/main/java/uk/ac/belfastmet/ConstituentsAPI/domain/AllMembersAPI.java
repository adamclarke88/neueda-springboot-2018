package uk.ac.belfastmet.ConstituentsAPI.domain;

import java.util.Map;

import lombok.Data;

@Data
public class AllMembersAPI {
	
	//private ArrayList<Member> allMembers;
	
	Map<String, Object> allMembersList;
	
	public String toString() {
		
		String allMembersList = this.allMembersList.toString();  // .this is if its an instance variable.  viarables at top of the class
		
		return allMembersList;
	}

}
