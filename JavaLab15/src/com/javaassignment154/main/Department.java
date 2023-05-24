package com.javaassignment154.main;

class Department {
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
    
}
 
