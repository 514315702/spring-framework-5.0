package org.study.bean;

//部门类
public class Dept {
	private String id;
    private String dname;
    public void setDname(String dname) {
        this.dname = dname;
    }

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Dept{" +
				"id='" + id + '\'' +
				", dname='" + dname + '\'' +
				'}';
	}
}
