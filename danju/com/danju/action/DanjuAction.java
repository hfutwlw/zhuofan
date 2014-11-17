package com.danju.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.json.annotations.JSON;
import org.springframework.beans.factory.annotation.Autowired;

import com.danju.service.inter.DanjuManage;
import com.opensymphony.xwork2.ActionSupport;
@ParentPackage("json-default")
public class DanjuAction extends ActionSupport{

	private static final long serialVersionUID = 88394041588346546L;
	@Autowired
	private DanjuManage danjuManage;
	private Map<String,Object> responseJson;
	@JSON
    public Map<String,Object> getResponseJson() {  
        return responseJson;  
    }  
    public void setResponseJson(Map<String,Object> responseJson) {  
        this.responseJson = responseJson;  
    }  
      
    private void getList(){  
        Map<String, Object> map = new HashMap<String, Object>();  
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();  
        for(int i=0;i<3;i++){  
            Map<String, Object> m = new HashMap<String, Object>();  
            m.put("id", i);  
            m.put("name", "Mic"+i);  
            list.add(m);  
        }  
        map.put("rows", list);  
        map.put("totalCont", 3);  
        this.setResponseJson(map);
        
    }
	@Override
	@Action(value="/danju", results = { @Result(name = "success", type = "json") })
	public String execute() throws Exception {
		this.getList();
		System.out.println(danjuManage.getClass().getSimpleName());
		return SUCCESS;
	}
	

}
