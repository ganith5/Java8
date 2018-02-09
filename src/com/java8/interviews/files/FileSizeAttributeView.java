package com.java8.interviews.files;

import java.nio.file.attribute.FileAttribute;	

public class FileSizeAttributeView implements FileAttribute<Integer>{

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Size";
	}

	@Override
	public Integer value() {
		// TODO Auto-generated method stub
		return 100;
	}

	
}
