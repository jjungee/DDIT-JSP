package com.jsp.exception;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.fileupload.servlet.ServletFileUpload;

public class NotMultipartFormDataException extends Exception{
	public NotMultipartFormDataException() {
		super("multipart 형식이 아닙니다.");
	}
	
	public static ServletFileUpload build(HttpServletRequest request, int MEMORY_THRESHOLD, int MAX_FILE_SIZE, int MAX_REQUEST_SIZE) throws NotMultipartFormDataException{
		
		//request 파일 첨부 여부 확인
		if(!ServletFileUpload.isMultipartContent(request)) {
			throw new NotMultipartFormDataException();
		}
		
		return build(request, MEMORY_THRESHOLD, MAX_FILE_SIZE, MAX_REQUEST_SIZE);
	}
}
