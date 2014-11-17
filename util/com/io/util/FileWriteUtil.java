package com.io.util;

import java.io.File;
import java.io.FileWriter;

/**
 * 文件写操作工具类
 * @createDate 2014年9月11日
 * @author linpeng123l
 */
public class FileWriteUtil {

	/**
	 * 向目标路径写文件
	 * @param text 文件内容
	 * @param filePathName 目标路径
	 * @return 是否成功
	 */
	public static boolean writeTextToFile(String text,String filePathName){
		try{
			File file = new File(filePathName);
			if(!file.getParentFile().exists()){
				file.getParentFile().mkdirs();
			}
			file.createNewFile();
			FileWriter fileWriter = new FileWriter(file);
			fileWriter.write(text);
			fileWriter.close();
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public static boolean writeTextToFile(String text,String filePath,String fileName){
		return writeTextToFile(text, filePath+fileName);
	}

}
