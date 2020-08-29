package com.test.pojo;

public class Employee{
	private int id;
	private int age;
	private String name;
	private boolean sex;
	private String isex;
	private String address;
	public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age =age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public String getSex() {
    	if(sex)
    		isex="ÄÐ";
    	else
    		isex="Å®";
		return isex;
    }
    public void setSex(boolean sex) {
        this.sex = sex;
    }
    
    @Override
    public String toString() {
    	if(sex)
    		isex="ÄÐ";
    	else
    		isex="Å®";
        return "User [id=" + id + ", age=" + age +", name=" + name + ", sex=" +isex + ", address=" + address + "]";
    }


}
