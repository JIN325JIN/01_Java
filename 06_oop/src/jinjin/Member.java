package jinjin;

public class Member {
	
	private String memberId;
	private String memberPw;
	private String name;
	private int memberAge;
	
	public Member() {}
	
	public Member(String memberId, String memberPw, String name, int memberAge) {
		super();
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.name = name;
		this.memberAge = memberAge;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMemberAge() {
		return memberAge;
	}
	public void setMemberAge(int memberAge) {
		this.memberAge = memberAge;
	}
}
