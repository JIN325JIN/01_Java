package oarr.jinjin;

public class Member {
	
	private String memberId;
	private String memberPw;
	private String membername;
	private int memberAge;
	private String region;
	
	public Member() {}

	public Member(String memberId, String memberPw, String membername, int memberAge, String region) {
		super();
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.membername = membername;
		this.memberAge = memberAge;
		this.region = region;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getMemberPw() {
		return memberPw;
	}
	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}
	public String getMembername() {
		return membername;
	}
	public void setMembername(String membername) {
		this.membername = membername;
	}
	public int getMemberAge() {
		return memberAge;
	}
	public void setMemberAge(int memberAge) {
		this.memberAge = memberAge;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
}
