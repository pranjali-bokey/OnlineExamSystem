package ControllerCollege;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import serviceCollege.College_Service;
import com.entityCollege.College;
public class Controller_College {
	@Autowired
College_Service cs;
	@GetMapping("/getAll")
	public List<College> getData1()
	{
		List<College> clg=cs.getData();
		return clg;
	}
}
