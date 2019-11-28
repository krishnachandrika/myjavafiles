package stockanalysis;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import SE.Main_SE;

public class Stock {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File file = new File("C:\\Users\\Chandu\\git\\myjavafiles\\DataStructures\\input000.txt "); 
	    Scanner sc = new Scanner(file); 
	    try {
	    while (sc.hasNextLine()) {
	    	String num=sc.nextLine();   
	    	System.out.println(num);
	       int nu=Integer.parseInt(num); 
	        int i=0;
	        while(i!=nu) {
	        
	        String[] word=sc.nextLine().split(",");
	        String last=word[word.length-1];
	        System.out.print(word[0]+"  ");
	        System.out.println(word[1]);
	        i++;
	        }
	        
	    }
	  

	}catch (Exception e) {
		e.printStackTrace();
	}
	    HashMap<String,Double> hs=new HashMap<String,Double>();
		HashMap<String,Double> hm=new HashMap<String,Double>();
		HashMap<String,Double> min=new HashMap<String,Double>();
		HashMap<String,Double> max=new HashMap<String,Double>();
		HashMap<String,Double> hmx=new HashMap<String,Double>();
	    int x=6;
	    int i=0;
	    String num=sc.nextLine(); 
	    int nu=Integer.parseInt(num); 
	    int mul=x*nu;
	    while(i!=mul) {
	    	int j=0;
	    	int a=1;
	    	while(j!=nu) {
	    		j++;
	    		String[] stockinfo=num.split(",");
	    		if(stockinfo[1]!=null) {
	    			double d=Double.parseDouble(stockinfo[1]);
	    			if(hs.containsKey(stockinfo[0])||!(hs.containsKey(stockinfo[0]))) {
	    				hmx.put(stockinfo[0]+a,d);
	    			}
	    			if(hs.containsKey(stockinfo[0])&&j<nu) {
	    				hmx.put(stockinfo[0],d);
	    				num=sc.nextLine();
	    				i++;
	    				
	    			}else {
	    				hs.put(stockinfo[0],d); 
	    				num=sc.nextLine();
	    				hm.putAll(hs);
	    				LinkedHashMap<String, Double> reverseSortedMap = new LinkedHashMap<>();
						hm.entrySet()
						.stream()
						.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())) 
						.forEachOrdered(c -> reverseSortedMap.put(c.getKey(), c.getValue()));
						int m1=0;
						int m2=5;
						int minn=0;
						int maxx=0;
						for (Map.Entry<String, Double> en : reverseSortedMap.entrySet()) { 
							if(maxx==0) {
								max.put(en.getKey(),en.getValue());
								maxx=1;
								      
							}
							if(m1!=m2) {
								System.out.println("Key = " + en.getKey() +", Value = " + en.getValue()); 
			
								m1++;
							}else {
								break;
								}
							}
						System.out.println();
						LinkedHashMap<String, Double> sortedMap = new LinkedHashMap<>(); 
						hm.entrySet()
						.stream()
						.sorted(Map.Entry.comparingByValue())
						.forEachOrdered(c -> sortedMap.put(c.getKey(), c.getValue()));
						int n=0;
						int m=5;
						for (Map.Entry<String, Double> en : sortedMap.entrySet()) { 
							if(minn==0) {
								min.put(en.getKey(),en.getValue());
								minn=1;
							}
							if(n!=m) {
								System.out.println("Key = " + en.getKey() +", Value = " + en.getValue()); 
								n++;
							}
							else {
								break;
							}
						}
						System.out.println();
						j++;
						i++;
						hs.clear();
						a++;
						
						
						
						

	    			}
	    			
	    		}
	    		                  
	    		
	    	}
	    }

	
		Main_SE MAIN=new Main_SE();
	    while(num!=null) {
	    	num=sc.nextLine();
			String[] Student_info = num.split(",");
			if(Student_info[0].equals("intersection")) {
				MAIN.intersection(hmx);
			}
			if(Student_info[2]!=null) {
				if(Student_info[1].equals("minST")) {
					MAIN.minST(hmx, Student_info[2]);
				}
				else if(Student_info[1].equals("maxST")) {
					MAIN.maxST(hmx, Student_info[2]);
				}
			}

		}
	

		
	    
}



public Double minST(HashMap <String, Double> hm,String s) {
	Double val=0.0;
	System.out.println();
	TreeMap<String, Double> sorted = new TreeMap<>(); 
	TreeMap<String, Double> min = new TreeMap<>(); 
	sorted.putAll(hm); 
	for (Map.Entry<String, Double> entry : sorted.entrySet())  {
		for(int j=1;j<7;j++) {
			String s1=s;
			s1=s+j;
			if(s1.equals(entry.getKey())) {
				min.put(entry.getKey(),entry.getValue());
			} 
		}
	}
	LinkedHashMap<String, Double> sortedMap = new LinkedHashMap<>(); 
	min.entrySet()
	.stream()
	.sorted(Map.Entry.comparingByValue())
	.forEachOrdered(x -> sortedMap.put(x.getKey(), x.getValue()));
	int j=0;
	int m=1;
	for (Map.Entry<String, Double> en : sortedMap.entrySet()) { 
		if(j!=m) {
			System.out.println("Minimum   "+"Key = " + en.getKey() +", Value = " + en.getValue()); 
			val=en.getValue();
			j++;
		}
		else {
			break;
		}
	}
	return val;
}


public Double maxST(HashMap <String, Double> hm,String s) {
	Double val=0.0;
	System.out.println();
	TreeMap<String, Double> sorted = new TreeMap<>(); 
	TreeMap<String, Double> max = new TreeMap<>(); 
	sorted.putAll(hm); 
	for (Map.Entry<String, Double> entry : sorted.entrySet())  {
		for(int j=1;j<7;j++) {
			String s1=s;
			s1=s+j;
			if(s1.equals(entry.getKey())) {
				max.put(entry.getKey(),entry.getValue());
			} 
		}
	}
	LinkedHashMap<String, Double> reverseSortedMap = new LinkedHashMap<>();
	max.entrySet()
	.stream()
	.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())) 
	.forEachOrdered(x -> reverseSortedMap.put(x.getKey(), x.getValue()));
	int j1=0;
	int m1=1;
	for (Map.Entry<String, Double> en : reverseSortedMap.entrySet()) { 
		if(j1!=m1) {
			System.out.println("Maximum   "+"Key = " + en.getKey() +", Value = " + en.getValue()); 
			val=en.getValue();
			j1++;
		}
		else {
			break;
		}
	}
	return val;
}


public void intersection(HashMap<String, Double> hm) {
	TreeMap<String, Double> sorted = new TreeMap<>(); 
	TreeMap<String, Double> min = new TreeMap<>(); 
	sorted.putAll(hm); 
	for (Map.Entry<String, Double> entry : sorted.entrySet())  {
		String s=entry.getKey();
		int l=s.length();
		String sub=s.substring(0,l-1);
		min.put(sub,entry.getValue());
	} 
	
	LinkedHashMap<String, Double> sortedMap = new LinkedHashMap<>(); 
	min.entrySet()
	.stream()
	.sorted(Map.Entry.comparingByValue())
	.forEachOrdered(x -> sortedMap.put(x.getKey(), x.getValue()));
	System.out.println();

	TreeMap<String, Double> sorted1 = new TreeMap<>(); 
	TreeMap<String, Double> max = new TreeMap<>(); 
	sorted1.putAll(hm); 
	for (Map.Entry<String, Double> entry : sorted1.entrySet())  {
		String s=entry.getKey();
		int l=s.length();
		String sub=s.substring(0,l-1);
		max.put(sub,entry.getValue());
	}
	
	LinkedHashMap<String, Double> reverseSortedMap = new LinkedHashMap<>();
	max.entrySet()
	.stream()
	.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())) 
	.forEachOrdered(x -> reverseSortedMap.put(x.getKey(), x.getValue()));
	int cou=0;
	int m=10;
	for (Map.Entry<String, Double> me : min.entrySet()) { 
		
		if(cou!=m) {
			if(max.containsValue(me.getValue()))
				{
				System.out.println("Found Duplicate -> " + me.getKey());
				cou++;
			}
		}
	}
}

public static HashMap<String, Double> Max(HashMap<String, Double> hm) {
	List<Map.Entry<String, Double> > list = new LinkedList<Map.Entry<String, Double> >(hm.entrySet()); 
	HashMap<String, Double> temp = new LinkedHashMap<String, Double>(); 
	for (Map.Entry<String, Double> aa : list) { 
		temp.put(aa.getKey(), aa.getValue()); 
	} 
	return temp; 
}
}

