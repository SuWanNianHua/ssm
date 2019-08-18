package com.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.bean.User2;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.service.AddressService;
import com.service.User2Service;

import commont.Prjcommon;

@Controller
public class User2Controller {
	
	//调用Address服务层的方法  对其进行属性注入
	@Resource(name="addressServiceImpl")
	AddressService addressService;
	
	@Resource(name="user2ServiceImpl")
	User2Service user2Service;
	
	//增加页面地址栏动态显示
	@RequestMapping(value = "/addview")
	public String addview(HttpServletRequest req) {
		String addressStr = addressService.getAll();

		req.setAttribute("addressStr", addressStr);
		return "add";
	}
	
	//前台页面获取user对象  增加到数据库
	@RequestMapping(value="addUser")
	public String addUser(HttpServletRequest req,User2 user2,MultipartFile upl) {
		String fileName=upl.getOriginalFilename();//获取文件名
		File file=new File(Prjcommon.getUploadpath()+fileName);//获取文件将要上传到服务器的路径
		try {
			upl.transferTo(file);//上传文件到服务器
		} catch (Exception e) {
			e.printStackTrace();
		} 
		user2.setUploadpath(fileName);
		user2Service.insert(user2);
		return "forward:index.jsp";
	}
	
	//显示用户信息
	@RequestMapping(value="updateview")
	public String update(HttpServletRequest req,int id) {
		User2 user2= user2Service.selectUserById(id);
		String addressStr=addressService.getAll(user2.getAddress());
		req.setAttribute("user", user2);
		req.setAttribute("addressStr", addressStr);
		return "update";
	}
	
	/**
	 * 修改功能
	 * @param request
	 * @param user2
	 * @param upl
	 * @return
	 */
	@RequestMapping(value="updateuser")
	public String updateUser(HttpServletRequest request,User2 user2,MultipartFile upl) {
		if (!upl.isEmpty()) {
			String fileName=upl.getOriginalFilename();//获取文件名
			File file=new File(Prjcommon.getUploadpath()+fileName);//获取文件将要上传到服务器的路径
				try {
					upl.transferTo(file);
				} catch (Exception e) {
					e.printStackTrace();
				} //上传文件到服务器
			user2.setUploadpath(fileName);
		}
		user2Service.updateUser(user2);
		
		return "redirect:selectview"+"?pageNum=1";
	}
	/**
	 * 按条件查询用户信息     当用户信息为空时  查询所有用户信息
	 * @param req
	 * @param pageNum
	 * @return
	 */
	@RequestMapping(value="selectview")
	public String selectAllUser(HttpServletRequest req,int pageNum,User2 user2) {
		PageHelper.startPage(pageNum, Prjcommon.getPageSize());//对数据进行分页  当前页数前台获取，每页条数配置文件中定义
		List<User2> user2list =user2Service.selectAllUser(user2);
		PageInfo pageInfo=new PageInfo(user2list);
		req.setAttribute("pageInfo", pageInfo);//将分页信息转发到页面中用于页面分页
		req.setAttribute("user2list", user2list);
		return "selview";
	}
	
	
	/**
	 * 删除用户
	 */
	@RequestMapping(value="deleteuser")
	public String deleteUser(HttpServletRequest request, int id) {
		int result= user2Service.deleteUser(id);
	/*	String message="";
		if (result!=-1) {
			message+="删除成功";
		}
		request.setAttribute("message", message);*/
		return "redirect:selectview"+"?pageNum=1";
	}
	
	
	
}
