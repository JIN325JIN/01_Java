package edu.kh.test;

public class IPInfo {

	private String ip;
	private String user;
	
	
	public IPInfo() {}


	public IPInfo(String ip, String user) {
		super();
		this.ip = ip;
		this.user = user;
	}


	@Override
	public String toString() {
		return "IPInfo [ip=" + ip + ", user=" + user + "]";
	}
	
	
	
}
