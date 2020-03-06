package com.apps.bean.extend;

import java.util.List;

import com.apps.bean.Dorm;
import com.apps.bean.Student;

public class DormExtend extends Dorm{
	private List<Student> students;

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}
	
}
