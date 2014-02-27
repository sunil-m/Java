package HackerRank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ServiceLane {
    public static void main(String[] args) {
        BufferedReader br = null;
        try {
        	String line;
        	int i = 0;
        	int length = 0;
        	int num_cases = 0;
        	ArrayList<Integer> width = new ArrayList<>();
        	String[] testcases = null;
        	br = new BufferedReader(new FileReader("H:\\GitHub\\HackerRank\\src\\servicelane.txt"));
        	//br = new BufferedReader(new InputStreamReader(System.in));
        	while((line = br.readLine()) != null) {
        		if (i == 0) {
        		    length = Integer.parseInt(line.split(" ")[0]);
        		    num_cases = Integer.parseInt(line.split(" ")[1]);
        		    testcases = new String[num_cases];
        		} else if (i == 1) {
        			for(String item : line.split(" ")) {
        				width.add(Integer.parseInt(item));
        			}
        		} else {
        			testcases[i-2] = line;
        		}
        		i++;
        	}
        	for(String case1 : testcases) {
        	    int entry = Integer.parseInt(case1.split(" ")[0]);
        	    int exit  = Integer.parseInt(case1.split(" ")[1]);
        	    if(exit > length) {
        	    	System.out.println(-1);
        	    } else {
        	    	int min = width.get(entry);
            	    for(int start = entry; start <= exit ; start++) {
        	    	    if (width.get(start) < min) {
        	    	    	min = width.get(start);
        	    	    }
            	    }
            	    System.out.println(min);
        	    }
        	}
        } catch (IOException e) {
        	e.printStackTrace();
        }
    }
}
