package oop.practice.model.vo;

public class Hero {

	private String nickname;
	private String job;
	private int hp;
	private int mp;
	private int level;
	private double exp;
	
	public Hero() {}
	
	public Hero(String nickname, String job, int hp, int mp, int level, double exp) {
		super();
		this.nickname = nickname;
		this.job = job;
		this.hp = hp;
		this.mp = mp;
		this.level = level;
		this.exp = exp;
		
		System.out.println("===========캐릭터 생성=============");
		System.out.println(job+"직업으로' "+nickname+"'님이 생성 되었습니다.");
		System.out.println("현재 레벨 : "+ level);
		System.out.println("현재 hp : "+ hp);
		System.out.println("현재 mp : "+ mp);
		System.out.println("현재 경험치 : "+ exp);
	}
	public void attack(double exp) {
		this.exp= this.exp +exp;
		System.out.printf("'%s' 은/는 공격을 했다 !!! 현재 경험치 : %.1f \n",nickname,this.exp);
		
		if(this.exp>=300) {
			this.level= level+1;
			System.out.printf("레벨이 올랐습니다. 현재 레벨 : %d\n",level);
		}
	}
	public void dash() {
		if(mp>0) {
			this.mp =this.mp-10;
			System.out.printf("'%s'의 엄청 빠른 대시 !!! 남은 마력 : %d \n",nickname,this.mp);
		}
		else {
			System.out.println("[마력부족] 더이상 대시 할수 없어요~!!");
		}
	}
	@Override
	public String toString() {
		return "===='"+ nickname + "'님의 정보 ====\n" + "- 현재 레벨 :"+ level +"\n-현재 hp=" + hp + "\n현재 mp :" + mp +
				 "\n-현재 exp : " + exp;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getMp() {
		return mp;
	}
	public void setMp(int mp) {
		this.mp = mp;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public double getExp() {
		return exp;
	}
	public void setExp(double exp) {
		this.exp = exp;
	}
}
