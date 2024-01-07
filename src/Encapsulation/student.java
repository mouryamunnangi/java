package Encapsulation;

public class student {
int rollnum;
String name;
boolean isattended;
//creating constructor
//constructor does not have class after public 
//constructor should have main name as class
public  student(int num) {
	this.rollnum= rollnum;
}
public int getRollnum() {
	return rollnum;
}
public void setRollnum(int rollnum) {
	this.rollnum = rollnum;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public boolean isIsattended() {
	return isattended;
}
public void setIsattended(boolean status) {
	this.isattended = isattended;
	System.out.println("hello this code got pushed fron git hub");
}
public boolean getstudentattendence() {
	return isattended;
}
}


