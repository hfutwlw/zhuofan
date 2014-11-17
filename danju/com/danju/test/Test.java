package com.danju.test;

import java.io.File;
import java.io.Reader;
import java.io.StringReader;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import org.apache.commons.io.FileUtils;

import com.danju.ext.util.ExtCreateDanju;
import com.danju.xml.model.Dj;
import com.danju.xml.model.Dj.Masterinfo.Mcol;
import com.danju.xml.model.Dj.Operations.Operation;
import com.io.util.FileWriteUtil;
import com.string.util.MyStringBuffer;
import com.string.util.StringUtil;


public class Test {
	private static int count = 0;
	public static void main(String[] args) {
		createExtDanju();
	}
	private static void createExtDanju() {
		Dj result = a();
		getExt();
		File outFile = new File("C:\\Users\\linpeng123l\\Desktop\\view");

		ExtCreateDanju createUtil = new ExtCreateDanju(result);	
		String className = StringUtil.firstCharToUpper(result.getName());
		System.out.println(createUtil.getDanjuController());
		System.out.println(createUtil.getDanjuModel());
		System.out.println(createUtil.getExtGetRecordUtil());
		System.out.println(createUtil.getRegionNorth());
		System.out.println(createUtil.getRegionGrid());
		System.out.println(createUtil.getRegionForm());
		FileWriteUtil.writeTextToFile(createUtil.getDanju().toString(),outFile.getAbsolutePath()+"\\"+result.getName()+"\\"+className+".js");
		FileWriteUtil.writeTextToFile(createUtil.getDanjuController().toString(),outFile.getAbsolutePath()+"\\"+result.getName()+"\\"+className+"Controller.js");
		FileWriteUtil.writeTextToFile(createUtil.getDanjuModel().toString(),outFile.getAbsolutePath()+"\\"+result.getName()+"\\"+className+"Model.js");
		FileWriteUtil.writeTextToFile(createUtil.getExtGetRecordUtil().toString(),outFile.getAbsolutePath()+"\\"+result.getName()+"\\util\\"+className+"GetRecordUtil.js");
		FileWriteUtil.writeTextToFile(createUtil.getRegionForm().toString(),outFile.getAbsolutePath()+"\\"+result.getName()+"\\region\\"+className+"Form.js");
		FileWriteUtil.writeTextToFile(createUtil.getRegionGrid().toString(),outFile.getAbsolutePath()+"\\"+result.getName()+"\\region\\"+className+"Grid.js");
		FileWriteUtil.writeTextToFile(createUtil.getRegionNorth().toString(),outFile.getAbsolutePath()+"\\"+result.getName()+"\\region\\"+className+"North.js");
	}
	

	/**
	 * 返回一个ext的java生成函数
	 */
	private static void getExt() {
		String type = "name" ;
		String name = "单据名" ;
		String value = "\"name\"";
		//		String value = "1";
		MyStringBuffer buffer = new MyStringBuffer("/**\r\n");
		buffer.appendLn("* Config对象");
		buffer.appendLn("* @param "+type+" "+ name);
		buffer.appendLn("* @return "+type+" : "+ value +",");
		buffer.appendLn("*/");
		buffer.appendLn("public ExtConfig "+type+"Config(String "+type+"){");
		buffer.appendLn("return config(\""+type+"\", "+type+");").appendLn("}");
		System.out.println(buffer.toString());
	}



	private static Dj a() {
		File file = new File("C:\\Users\\linpeng123l\\Desktop\\单据.xml");
		try{
			String xmlStr = FileUtils.readFileToString(file , "GBK");
			Reader reader = new StringReader(xmlStr);
			Unmarshaller unmarshaller = JAXBContext.newInstance(Dj.class).createUnmarshaller();
			Dj result = (Dj) unmarshaller.unmarshal(reader);
			System.out.println(result.getCname());
			System.out.println(result.getName());
			System.out.println(result.getDjbhq());
			System.out.println(result.getDjbs());
			System.out.println(result.getDjcx());
			System.out.println(result.getDjdymc());
			System.out.println(result.getStyleClass());

			System.out.println("-------------分割线，操作集合----------------");
			List<Operation> operations = result.getOperations().getOperation();
			for(Operation operation : operations){
				System.out.println(operation.getCname());
				System.out.println(operation.getAc());
				System.out.println(operation.getDjlock());
				System.out.println(operation.getDjxg());
				System.out.println(operation.getKey());
				System.out.println(operation.getName());
				System.out.println(operation.getOther());
				System.out.println(operation.getRetval());
				System.out.println(operation.getType());
				System.out.println("--------分割线操作--------");
			}

			System.out.println("-------------分割线，汇总集合----------------");
			List<Mcol> mcols = result.getMasterinfo().getMcol();
			for(Mcol mcol : mcols){
				System.out.println(mcol.getCname());
				System.out.println(mcol.getDefault());
				System.out.println(mcol.getDqname());
				System.out.println(mcol.getFormat());
				System.out.println(mcol.getName());
				System.out.println(mcol.getRetval());
				System.out.println(mcol.getOther());
				System.out.println(mcol.getSingleline());
				System.out.println(mcol.getType());
				System.out.println(mcol.getValue());
				System.out.println(mcol.getXycol());
				System.out.println(mcol.getSize());
				System.out.println("--------分割线汇总--------");
			}
			return result;
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}
}