package com.crudappgenahm23.bean;

// POJO  --> Pure Encapsulation ---[Dm-s Private + Mf's public]
// - Data Transporter
public class StudentBean 
{
	private Integer rno     ;//null
	private String name ;//null
	private Integer std     ;//null
	private Integer marks	;//null
	
	public StudentBean() {
	}
	public StudentBean(int rno, String name, int std, int marks) {
		this.rno = rno;
		this.name = name;
		this.std = std;
		this.marks = marks;
	}

	
	
	public Integer getRno() {
		return rno;
	}
	public void setRno(Integer rno) {
		this.rno = rno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getStd() {
		return std;
	}
	public void setStd(Integer std) {
		this.std = std;
	}
	public Integer getMarks() {
		return marks;
	}
	public void setMarks(Integer marks) {
		this.marks = marks;
	}
	@Override
	public String toString() 
	{
		return rno +" " + name+" " + std+" " + marks;
	}
}
