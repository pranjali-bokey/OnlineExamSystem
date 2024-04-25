package serviceCollege;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import RepositoryCollege.CollegeRepository;
import  com.entityCollege.College;
public class College_Service {
	@Autowired
CollegeRepository cr;
	public List<College> getData()
	{
		return cr.findAll();
		}
}
