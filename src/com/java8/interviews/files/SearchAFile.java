package com.java8.interviews.files;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class SearchAFile {
	
	public static void main(String[] args) {
		createAFile("C:\\numbers.txt");
		synchronousWrite("C:\\numbers.txt");
	}
	
	private static void synchronousWrite(String location) {
		Path newFile = FileSystems.getDefault().getPath(location);
		int count = 0;
		try(BufferedWriter writer = Files.newBufferedWriter(newFile)){
			while(count < 1000) {
				writer.write(""+count++);
				writer.flush();
			}
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}
		
	}

	
	private static void createAFile(String location) {
		Path path = FileSystems.getDefault().getPath(location);
		try {
			Files.deleteIfExists(path);
			Files.createFile(path);
			
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
	}
}
