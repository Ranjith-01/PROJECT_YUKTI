package com.skcet.project.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.skcet.project.model.Users;
import com.skcet.project.service.Userservice;

@RestController
@CrossOrigin("*")
public class Usercontrol {
	@Autowired
	public Userservice userv;
	//posting data
	@PostMapping("/post")
	public String post(@RequestBody Users u)
	{
		userv.save(u);
		return "Your data is saved successfully";
	}
	//getting data
	@GetMapping("/get")
	public List<Users> get()
	{
		return userv.show();
	}
	//edit data
	//put mapping
	@PutMapping("/update")
	public Users update(@RequestBody Users mrs)
	{
			return userv.Edit(mrs);
	}
	//delete mapping using path variable
	@DeleteMapping("/delete/{id}")
	public String remove (@PathVariable("id") int id)
	{
		userv.Cancel(id);
		return "Matrix with id "+id+" is deleted";
	}

}
