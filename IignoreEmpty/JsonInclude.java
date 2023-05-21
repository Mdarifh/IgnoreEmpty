package IignoreEmpty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonInclude {
	
	
	@Test
	public void TestMethod() throws JsonProcessingException {
		
		//create Payload

		EmployeePOJOClass emp1 = new EmployeePOJOClass();
		//emp1.setFirstname("ARIF");
		emp1.setLastname("HUSSAIN");
		emp1.setGender("MALE");
		//emp1.setAge(24);
		emp1.setSalary(40000);
		emp1.setMarried(false);
		
		//Empty array
		
		String[] hobbies = new String[3];
		emp1.setHobbies(hobbies);
		hobbies[0] = "Watching Web Series";
		hobbies[1] = "Reading";
		hobbies[2] = "Playing";
		//Empty list
		
		List<String> degree = new ArrayList<String>();
		emp1.setDegree(degree);
		degree.add("BE");
		degree.add("BCA");
		degree.add("MCA");
		//Empty map
		
		Map<String, String> familymembers = new HashMap<>();
		emp1.setFamilymember(familymembers);
		familymembers.put("1", "Father");
		familymembers.put("2", "Mother");
		familymembers.put("3", "Brothers");
		familymembers.put("4", "Sister");
		//convert employee class to json payload as string
		
		ObjectMapper mapper = new ObjectMapper();
		String employeeJSON = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(emp1);
		System.out.println("Employee JSON "+employeeJSON);
	}
}
