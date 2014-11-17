package com.string.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtil {
	
	/**
	 * 如果字符串对象等于null转换非空""，否则不变
	 * @param str
	 * @return
	 */
	public static String swapNull(String str){
		return str == null?"":str;
	}
	/**
	 * 将制定字符串的_字母转换成大写字母
	 * @param str 字符串
	 * @return
	 */
	public static String changeLineToLarge(String str){
		System.out.println(str);
		//匹配_加小写字母
		Pattern pattern = Pattern.compile("_[a-z]");
		Matcher matcher = pattern.matcher(str);
		while(matcher.find()){
			String suitStr = matcher.group();
			str = str.replace(suitStr, suitStr.toUpperCase());
		}
		str = str.replace("_", "");
		return str;
	}
	
	/**
	 * 将传入参数首字母变成大写,并加上get返回
	 * @param parameterName 属性名
	 * @return
	 */
	public static String getSetMethodName(String parameterName){
		return "set"+parameterName.substring(0, 1).toUpperCase()+parameterName.substring(1, parameterName.length());
	}
	
	/**
	 * 将传入参数首字母变成大写,并加上set返回
	 * @param parameterName 属性名
	 * @return
	 */
	public static String getGetMethodName(String parameterName){
		return "get"+firstCharToUpper(parameterName);
	}
	
	public static String firstCharToUpper(String str){
		return str.substring(0, 1).toUpperCase()+str.substring(1, str.length());
	}
}
