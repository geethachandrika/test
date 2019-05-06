package com.Practice.JavaExamples;

import java.util.HashSet;

class  Employee{    
    private String name;
    private int salary;
    private int id;
 
    public Employee(int id, String name, int salary){
    	this.id = id;
        this.name = name;
        this.salary = salary;
    }
 
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String toString(){
        return "Id: "+this.id+", Name: "+this.name+", Salary: "+this.salary;
    }
 
	@Override
	public int hashCode() {
	    System.out.println("In hashcode");
	    return this.getId();
	}
 
	@Override
	public boolean equals(Object obj) {
		Employee e = null;
	    if(obj instanceof Employee){
	        e = (Employee) obj;
	    }
	    System.out.println("In equals");
	    if(this.getId() == e.getId()){
	        return true;
	    } else {
	        return false;
	    }  
	}
}
 
public class Test {
  public static void main(String args[]){
	HashSet<Employee> hashSet = new HashSet<Employee>();
	hashSet.add(new Employee(1,"Jai",50000));
	hashSet.add(new Employee(2,"Mahesh",80000));
	hashSet.add(new Employee(3,"Vishal",60000));
	hashSet.add(new Employee(4,"Hemant",64000));
	for(Employee e:hashSet){
            System.out.println(e);
        }
	System.out.println("Add duplicate record:");
	hashSet.add(new Employee(5,"Vishal",60000));
	for(Employee e:hashSet){
            System.out.println(e);
        }
  }
}