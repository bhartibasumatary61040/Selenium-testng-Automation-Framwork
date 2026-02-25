package java8;
	
	import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Streams {
		
		//Count the number of names starting with alphabet A in list 
		//Test
		
		@Test
		public void regular() {
			
			ArrayList<String> names = new ArrayList<String>();
			
			names.add("Abhijeet");
			names.add("Don");
			names.add("Akash");
			names.add("Adam");
			names.add("Ram");
			
			int count =  0; 
			
			for(int i =0 ; i<names.size(); i++) {
				
				String actual = names.get(i);
				
				if(actual.startsWith("A"))
				{
					count++;
				}
			}
			System.out.println(count);
		}
		
		@Test
		
		public void streamFilter() {
	ArrayList<String> names = new ArrayList<String>();
			
			names.add("Abhijeet");
			names.add("Don");
			names.add("Akash");
			names.add("Adam");
			names.add("Ram");
			
			//there is no life for intermediate operation if there is no terminal op
			//terminal operation will execute only if inter op(filter returns true
			// we can create stream
			//how to use filter in stream API
			
			Long c = names.stream().filter(s-> s.startsWith("A")).count();
			System.out.println(c);
			
		Long d = 	Stream.of("Abhijeet","Don","Akash","Adam","Ram").filter(s-> 
			{
			s.startsWith("A");	
			return false;
			}).count();
		System.out.println(d);
		
		//print all the names of ArrayList
		
		names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));	
		
		names.stream().filter(s-> s.length()>4).limit(1).forEach(s-> System.out.println(s));
		
		}
		
		@Test
		
		public void streamMap() {
	ArrayList<String> names = new ArrayList<String>();
			
			names.add("man");
			names.add("Don");
			names.add("women");
			names.add("jojo");
			names.add("Ramu");
			
			//printing names of wich has last letter as "a" with upperCase
			Stream.of("Abhijeet","Don","Akasha","Adam","Rama").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
			.forEach(s-> System.out.println(s));
			
			//print names which have first letter as a with upperCase and sorted
			
			List<String> names1 = Arrays.asList("Abhijeet","Don","Akasha","Adam","Rama");
			
			names1.stream().filter(s-> s.startsWith("A")).sorted().map(s-> s.toUpperCase()).
			forEach(s-> System.out.println(s));
			
			//Merging 2 different lists
			 Stream<String> newStream = Stream.concat(names.stream(),names1.stream());
			 
			 //newStream.forEach(s-> System.out.println(s));
			 
			boolean flag =  newStream.anyMatch(s->s.equalsIgnoreCase("Adam"));
			System.out.println(flag);
			Assert.assertTrue(flag);
			 
			
		}
		
		@Test
		
		public void streamCollect() {
			
			//list 
			//newList
			
			List<String> ls = Stream.of("Abhijeet","Don","Akasha","Adam","Ram")
			        .filter(s -> s.endsWith("a"))
			        .collect(Collectors.toList());

			System.out.println(ls.get(0));
		}
			
			@Test
			public void streamValues() {
			
			List<Integer> values= Arrays.asList(3,2,2,7,5,1,9,7);
			
			//print unique number from this array
			//sort the array- 3rd index
			
			
			values.stream().distinct().forEach(s-> System.out.println(s));
			
			List<Integer> li = values.stream().distinct().sorted().collect(Collectors.toList());
			System.out.println(li.get(2));
			
			
		}

	}






