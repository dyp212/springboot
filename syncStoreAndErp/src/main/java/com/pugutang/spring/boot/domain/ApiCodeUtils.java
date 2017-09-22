package com.pugutang.spring.boot.domain;

import java.io.ByteArrayInputStream;
import java.io.UnsupportedEncodingException;





public class ApiCodeUtils {

  public static ApiCode success(){
	return success("获取或更新数据操作成功");
  }
  public static ApiCode success(String desc){
		ApiCode apiCode = new ApiCode();
		apiCode.setCode(0);
		apiCode.setMsg(desc);
		return apiCode;
	  }

  public static ApiCode cloneApiCode(Integer code) {
 
    ApiCode clonedApiCode = new ApiCode();
    clonedApiCode.setCode(code);
    clonedApiCode.setMsg(ApiCode.GeneralErrorString);
    return clonedApiCode;
  }
  public static ApiCode cloneApiCode(Integer code,String appendContent) {
	   
	    ApiCode clonedApiCode = new ApiCode();
	    clonedApiCode.setCode(code);
	    clonedApiCode.setMsg(appendContent);
	    return clonedApiCode;
  }
  
 

  public static void appendApiCodeDesc(ApiCode apiCode, String appendContent) {
    if(appendContent!=null && appendContent.startsWith(":")){
      appendContent = appendContent.substring(1).trim();
    }
    apiCode.setMsg(appendContent);
  }

  public static void appendApiCodeDescUser(ApiCode apiCode, String appendContent) {
    apiCode.setMsg(apiCode.getMsg() + appendContent);
  }

  
}
