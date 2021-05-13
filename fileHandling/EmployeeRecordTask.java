package fileHandling;

import java.io.*;
import java.util.*;

public class EmployeeRecordTask {
	public static void main(String[] args) {
		EmployeeRecordTask task=new EmployeeRecordTask();
		Map<String,List<Employee>> map=new HashMap<>();
		List<Employee> list=new ArrayList<>();
		File f=new File("C:\\Users\\vineesha275\\Desktop\\Capgemini\\File handling practice\\EmployeeRecord.txt");
		try {
			task.doReadFromFile(f,(HashMap<String, List<Employee>>) map);
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("\n                        ----------------RESULTANT MAP OF EMPLOYEES WITH RESPECT TO DEPARTMENTS------------------\n");
		Iterator<String> itr=map.keySet().iterator();
		while(itr.hasNext()) {
			String k=itr.next();
			System.out.println(k+"  " +map.get(k));
			System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------");
		}
		
	}
	
	public void doReadFromFile(File f,HashMap<String,List<Employee>> map) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(f));
		String line="";
		while((line = br.readLine())!=null) {
			String arr[]=line.split(",");
			employeeMapFormation(arr,map);	
		}
		
	}
	
	public void employeeMapFormation(String [] arr,HashMap<String,List<Employee>> map) {
		Employee e=new Employee(Integer.parseInt(arr[0]),arr[1],arr[2],Integer.parseInt(arr[3]));
//		System.out.println(map.containsKey(arr[2]));
		if(map.containsKey(arr[2])) {
			List<Employee> list1=map.get(arr[2]);
			list1.add(e);
		}else {
			
			List<Employee> list = new ArrayList<>();
			list.add(e);
			map.put(arr[2], list);
			
			
//			map.put(arr[2], new ArrayList<Employee>());	
//			List<Employee> list1=map.get(arr[2]);
//			list1.add(e);
		}
	}
}
