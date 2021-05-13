package fileHandling;


import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileDemo {
	
	public static void main(String[] args) {
		File f = new File("C:\\Users\\ashis\\OneDrive\\Desktop\\Capgemini Batch\\6 04 21 JA05 and JA16\\abc.txt");
		File f3 = new File("C:\\Users\\ashis\\OneDrive\\Desktop\\Capgemini Batch\\6 04 21 JA05 and JA16\\workspace\\CoreJavaModule1\\src\\io\\FIleHandlingDemo.java");
		File f2=new File("C:\\Users\\vineesha275\\Documents\\workspace-spring-tool-suite-4-4.10.0.RELEASE\\CoreJavaModule1\\src\\fileHandling\\FileDemo.java");
		FileDemo obj = new FileDemo();
		
		try {
		//	obj.doWriteOnFile(f);
			obj.doReadFromFile(f2);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	
	public void doReadFromFile(File f)throws IOException
	{
		BufferedReader br = new BufferedReader(new FileReader(f));
		String line = "";
		int count = 0;
		int count1=0;
		int res=0;
		int lineNumber = 1;
		while((line = br.readLine())!=null)
		{
			System.out.println(lineNumber+" "+line);
			boolean b = line.contains("file") || line.contains("File");
			
			if(b)
				{
					// spilt based on regexp for File input
					
					Pattern pattern = Pattern.compile("File");
					Matcher matcher = pattern.matcher(line);
			    
					Pattern pattern1 = Pattern.compile("file");
					Matcher matcher1 = pattern1.matcher(line);
					while(matcher.find() || matcher1.find()) {
						res++;
					}
				
				
//					for(String x:line.split("\\s|\\(|\\)")){
//
//						if(x.contains("file") || x.contains("File")){
//							count1++;
//						}
//					};
					count++;
					System.out.println("----->> line Number "+lineNumber+" & count "+count);
				}
			
			
			lineNumber++;
		}
		
		System.out.println("\n\n\nNumber of lines containing the word file : "+count);
//		System.out.println("\n\n\n====>> File count using naive method : "+count1);
		System.out.println("Total count : "+res);
	}
	
	
	public void doWriteOnFile(File f)throws IOException
	{
		PrintWriter pw = new PrintWriter(new FileWriter(f));
		
		pw.append("gbfbfgnbgrfbnrgf");
	
		System.out.println("------------- Done ------------");
		pw.close();
	}

}


