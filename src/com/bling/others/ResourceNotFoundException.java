package com.bling.others;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

//定义一个自定义异常，抛出时返回状态码404,并给出错误信息提示
@ResponseStatus(value = HttpStatus.NOT_FOUND, reason="resource is not found aaa,我是说资源没有找到")
public class ResourceNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public ResourceNotFoundException() {
        super();
    }
	public ResourceNotFoundException(String message) {
        super(message);
    }
	public ResourceNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
	public ResourceNotFoundException(Throwable cause) {
        super(cause);
    }
	
	protected ResourceNotFoundException(String message, Throwable cause,
            boolean enableSuppression,
            boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
}
