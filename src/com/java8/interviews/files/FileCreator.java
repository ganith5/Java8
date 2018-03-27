package com.java8.interviews.files;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class FileCreator {
	
	private static final long FILE_SIZE = 536870912L; //0.5GB
	private static final long CHUNK_SIZE = 104857600L;//100MB
	private static final String CONTENTS = "101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010";

	public static void main(String[] args) {
		String location = "C:\\fileCreator.txt";
		int size = 100;
		createAFile(location, size);
		writeInMemory(location);
		//synchronousWrite(location);

	}

	private static void writeInMemory(String location) {
		
		int numberOfChunks = (int)(FILE_SIZE/CHUNK_SIZE);
		Path filePath = FileSystems.getDefault().getPath(location);
		for(int i=0; i<numberOfChunks; i++) {
			System.out.println("file size = " + filePath.toFile().length());
			StringBuilder builder = new StringBuilder();
			while(builder.length() <= CHUNK_SIZE) {
				builder.append(CONTENTS);
			}
			try(BufferedWriter writer = Files.newBufferedWriter(filePath, StandardOpenOption.APPEND)){
				System.out.println(filePath.toFile().length() + " ready to write chunk " + i);
				writer.write(builder.toString());
				writer.flush();
				
			}catch(IOException ioe) {
				ioe.printStackTrace();
			}
		}
		
		
	}

	private static void synchronousWrite(String location) {
		Path newFile = FileSystems.getDefault().getPath(location);
		
		try(BufferedWriter writer = Files.newBufferedWriter(newFile)){
			while(newFile.toFile().length() < FILE_SIZE) {
				writer.write(CONTENTS);
				writer.flush();
			}
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}
		
	}

	private static void createAFile(String location, int size) {
		Path path = FileSystems.getDefault().getPath(location);
		try {
			Files.deleteIfExists(path);
			Files.createFile(path);
			
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
	}

}
