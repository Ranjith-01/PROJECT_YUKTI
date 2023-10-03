package com.skcet.project.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skcet.project.model.Users;
import com.skcet.project.repository.Userrepo;

@Service
public class Userservice {
	@Autowired
	public Userrepo urepo;
	//post data
	public String save(Users u)
	{
		urepo.save(u);
		return "Data is saved successfully";
	}
	//get data
	public List<Users> show()
	{
		return urepo.findAll();
	}
	 // update the data
    public Users Edit(Users mm)
    {
    	return urepo.saveAndFlush(mm);
    }
    //delete the data
    public void Cancel(int humans) {
    	urepo.deleteById(humans);
    }

}
