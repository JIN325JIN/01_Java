package edu.kh.oop.practice.model.vo;

public class Hero {
	
	//필드=속성=멤버변수
	private String nickname;//닉네임
	private String job;//직업
	private int hp;//체력
	private int mp;//마력
	private int level;//레벨
	private double exp;//경험치
	
	//기본 생성자
	public Hero() {}
	
	//매개변수생성자
	public Hero(String nickname,String job,int hp,int mp,int level,double exp) {
		this.nickname=nickname;
		this.job=job;
		this.hp=hp;
		this.mp=mp;
		this.level=level;
		this.exp=exp;
		
		System.out.println("======캐릭터 생성 ======");
		System.out.printf("%s 직업으로 '%s' 님이 생성 되었습니다.\n",job,nickname);
		System.out.println("- 현재 레벨 : "+level);
		System.out.println("- 현재 hp : "+hp);
		System.out.println("- 현재 mp : "+mp);
		System.out.println("- 현재 exp : "+exp);

	} 
	//메서드
	public void attack(double exp) {
		//전달받은 경험치를 현재 경험치에 누적하고 공격했다는 메세지 출력.
		//단 현재 경험치가 300이상이면 현재레벨+1, 레벨 올랐다는 메세지 출력.
		
		this.exp =this.exp+exp;

		System.out.printf("'%s'은/는 공격을 했다 !!! 현재 경험치 :%.1f\n",nickname,this.exp);
		
		if(this.exp>=300) {
			level++;//level =level+1;
			System.out.printf("레벨이 올랐습니다! 현재 레벨 : %d\n",level);
		}			
	}
	public void dash() {
		//대시 할때 마다 현재 mp에서 -10감소 대시했다는 메세지 출력.
		//단 현재 mp가 0이하라면 마력이 부족하여 대시할수 없다는 메세지 출력
		
		this.mp = mp -10;
		
		if(this.mp<0) {
			System.out.println("[마력 부족] 더이상 대시할수 없어요~!");
		}
		else {
			System.out.printf("'%s'의 엄청 빠른 대시 !! 남은 마력 %d \n",nickname,this.mp);
		}
	}

	@Override
	public String toString() {
		//호출시 해당 메서드를 호출한 객체의 현재 정보를 출력

		return "======='" +nickname + "'님의 정보======\n" + "- 현재 레벨 : "+level+"\n-현재 hp :"+hp
				+ "\n- 현재 mp :"+mp +"\n-현재 exp :"+exp;
		
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
