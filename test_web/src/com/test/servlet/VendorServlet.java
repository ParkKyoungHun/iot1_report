package com.test.servlet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.test.dto.Vendor;
import com.test.service.ServiceFactory;
import com.test.service.VendorService;

public class VendorServlet extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
	private Gson g = new Gson();	
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{	
		
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
	    String command = request.getParameter("command");
	    String jsonStr = "";
	    VendorService vs = ServiceFactory.getVendorService();
	    if(command.equals("list")){
	    	String viName = request.getParameter("viName");
	    	List<Vendor> vendorList = vs.selectVendorsList(viName);
	    	jsonStr = g.toJson(vendorList);
	    	System.out.println(jsonStr);
	    }else if(command.equals("view")){
	    }else if(command.equals("delete")){
	    }else if(command.equals("insert")){
	    }else if(command.equals("xml")){
	    }
	    doProcess(response, jsonStr);
	}
	
	public void doProcess(HttpServletResponse response, String writeStr) throws IOException {
		response.setContentType("text/html; charset = UTF-8");
		PrintWriter out = response.getWriter();
		out.print(writeStr);
		out.close();
	}
}
