package com.example.demo_prof.domain;


public class UserInfoDto {
	
	private int uno;
	private String name;
	private int age;
	private String adress;
	
	public UserInfoDto(){}
	
	public int getUno() {
		return uno;
	}
	public void setUno(int uno) {
		this.uno = uno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	@Override
	public String toString() {
		return "UserInfoDto [uno=" + uno + ", name=" + name + ", age=" + age + ", adress=" + adress + "]";
	}
	public UserInfoDto(int uno, String name, int age, String adress) {
		super();
		this.uno = uno;
		this.name = name;
		this.age = age;
		this.adress = adress;
	}

}
