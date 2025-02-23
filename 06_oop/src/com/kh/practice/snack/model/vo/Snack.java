package com.kh.practice.snack.model.vo;

import java.util.Scanner;

public class Snack {
	
	Scanner sc = new Scanner(System.in);
	
	//필드
	private String kind;//종류
	private String name;//이름
	private String flavor;//맛
	private int numOf;//개수
	private int price;//가격
	
	//기본생성자
	public Snack() {}
	//매개변수 있는 생성자
	public Snack(String kind,String name,String flavor,int numOf,int price) {
		
		this.kind= kind;
		this.name = name;
		this.flavor = flavor;
		this.numOf = numOf;
		this.price = price;
	}
	//메서드
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFlavor() {
		return flavor;
	}
	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}
	public int getNumOf() {
		return numOf;
	}
	public void setNumOf(int numOf) {
		this.numOf = numOf;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	//담긴 데이터를 리턴하는 메서드
	public String information() {
		return  kind + "(" + name + "-" + flavor + ") "+ numOf + "개" + price + "원";
	}	
}
