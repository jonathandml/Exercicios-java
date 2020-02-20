package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Program {

	public static void main(String[] args) {
		String path = "C:\\Temp\\testes\\map.csv";
		
		try(BufferedReader file = new BufferedReader(new FileReader(path))){
			Map<String, Integer> poll = new HashMap<>();
			String line = file.readLine();
			while(line != null) {
				String []fields = line.split(",");
				String candidate = fields[0];
				Integer votes = Integer.parseInt(fields[1]);
				if(poll.containsKey(candidate)) {
					poll.put(candidate,  votes + poll.get(candidate).intValue());
				}else {
					poll.put(candidate, votes);
				}
				
				line = file.readLine();
			}
			
			for(String candidate : poll.keySet()){
				System.out.println(candidate + ": " + poll.get(candidate));
			}
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
