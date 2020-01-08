package com.logesh;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String fileContent = Files.readString(Paths.get("D:\\My works\\files\\sample.csv"));
		System.out.println(fileContent);
		
		//Files.write(Paths.get("D:\\My works\\files\\sample.csv"), data.getBytes());
	}

}
