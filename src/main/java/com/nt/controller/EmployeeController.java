package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nt.dao.EmployeeDao;
import com.nt.utility.Employee;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeDao employeeDao;
	
	@RequestMapping("/insert")
	public String empInserData(@ModelAttribute Employee e , Model model) {
		employeeDao.employeeDataInsert(e);
		
		System.out.println("controller data here"+ " "+e.getName());
		
		model.addAttribute("msg","Insert Data");
		return "result";
	}
	
	@RequestMapping("/update")
	public String empUpdateData(@RequestParam int id,@RequestParam int sal,Model model) {
		employeeDao.employeeDataUpdate(id,sal);
		
		System.out.println("controller data here"+ " "+ id +" "+sal);
		
		model.addAttribute("msg","Update Data");
		return "result";
	}
	
	@RequestMapping("/delete")
	public String empDeleteData(@RequestParam int id,Model model) {
		employeeDao.employeeDataDelete(id);
		
		System.out.println("controller data here"+ " "+ id);
		
		model.addAttribute("msg","Delete Data");
		return "result";
	}
	
	@RequestMapping( "/select" )
	public String select( @RequestParam int id, Model model ) {
		Employee e = employeeDao.employeeDataSelect(id);
		model.addAttribute( "emp", e );
		return "Select";
	}
	
	@RequestMapping( "/SelectAll" )
	public String SelectAll(Model model){
		List<Employee> e = employeeDao.employeeDataSelectAll();
		model.addAttribute( "emplist", e );
		return "Select-All";
		
	
		
	}

	
	

}
