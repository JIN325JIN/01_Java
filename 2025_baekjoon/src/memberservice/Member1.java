package memberservice;

public class Member1 {

	private String memberId;
	private String memberPw;
	private String membername;
	private int age;
	
	public Member1() {}

	public Member1(String memberId, String memberPw, String membername, int age) {
		super();
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.membername = membername;
		this.age = age;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
