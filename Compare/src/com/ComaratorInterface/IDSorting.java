package com.ComaratorInterface;

import java.util.Comparator;

public class IDSorting implements Comparator<Emp>{

	@Override
	public int compare(Emp o1, Emp o2) {
		
		return o1.getId()-o2.getId();
	}

}
