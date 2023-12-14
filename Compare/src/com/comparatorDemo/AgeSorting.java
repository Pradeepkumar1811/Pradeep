package com.comparatorDemo;
import java.util.*;
public class AgeSorting implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
			return o1.getAge()-o2.getAge();
	}

}
