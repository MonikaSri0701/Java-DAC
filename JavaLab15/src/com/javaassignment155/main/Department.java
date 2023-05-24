package com.javaassignment155.main;

public class Department implements Cloneable{
	int deptId;
    String deptname;
    public Department(int deptId, String deptname) {
        this.deptId = deptId;
        this.deptname = deptname;
    }
    public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
