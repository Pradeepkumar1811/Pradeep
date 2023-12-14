package com.comparatorDemo;
import java.util.*;
public class RollNoSorting implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.getRollNo()-o2.getRollNo();
	}

}
