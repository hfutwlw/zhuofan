package com.zhuofan.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


public class Test {
	public static void main(String[] args){
		
	}

	/**
	 * 列出所有的子文件 
	 * @param fil子文件
	 * @return 
	 */
	public static List<File> listAllChildFile(File file){
		System.out.println(file.getName());
		List<File> list = new ArrayList<File>();
		File[] files = file.listFiles();
		for(File tempFile : files){
			if(tempFile.isDirectory()){
				list.addAll(listAllChildFile(tempFile));
			}else{
				list.add(tempFile);
			}
		}
		return list;
	}

	public static void convertFileEncoding(File file,String fromEncoding,String toEncoding){
		if(!file.isFile()){
			System.out.println("你输入的不能使文件路径");
		}else{
			BufferedReader bufferedReader = null;
			FileOutputStream fileOutputStream = null;
			try {
				bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file),fromEncoding ));
				String string = null;
				StringBuffer text = new StringBuffer();
				while((string=bufferedReader.readLine())!=null){
					text.append(string+"\r\n");
				}
				System.out.println(text);
				fileOutputStream = new FileOutputStream(file);

				fileOutputStream.write(text.toString().getBytes("UTF-8"));
				System.out.println(text);
			} catch (Exception e) {
				e.printStackTrace();
			} finally{
				try {
					bufferedReader.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
				try {
					fileOutputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
