package com.sdp3.main.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Candidate {
	@Id
	@GeneratedValue
	private int id;
	private String candidatename;
	private String partyid;
	private String partyname;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCandidatename() {
		return candidatename;
	}
	public void setCandidatename(String candidatename) {
		this.candidatename = candidatename;
	}
	public String getPartyid() {
		return partyid;
	}
	public void setPartyid(String partyid) {
		this.partyid = partyid;
	}
	public String getPartyname() {
		return partyname;
	}
	public void setPartyname(String partyname) {
		this.partyname = partyname;
	}
	public Candidate(int id, String candidatename, String partyid, String partyname) {
		super();
		this.id = id;
		this.candidatename = candidatename;
		this.partyid = partyid;
		this.partyname = partyname;
		
	}
	public Candidate() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
