package com.example.demo;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class sample {
	@GetMapping(value="/gethello")
	public String get() {
		return "Hello Wold";
		
		
	}
	@GetMapping(value="/gethe/{name}") 
	public String get1(@PathVariable String name) {
		char[] a=name.toCharArray();
		String b="";
		for(int i=a.length-1;i>=0;i--) {
	
       b=b+String.valueOf(a[i]);
		
		
	}
		return b;
		}
	@GetMapping(value="getprime/{num}")
	public String getprime(@PathVariable int num) {
		String ans="";

		for(int i=2;i<=num;i++) {
		if(i==2||i==3) {
			ans= ans+i+",";
		} else if(i%2!=0&&i%3!=0) {
           ans= ans+i+",";
		}
		
			
		}
		return ans;
		
	} 
	@GetMapping(value="/geteach/{name}")
	public int geteach(@PathVariable String name) {
		char[] a=name.toCharArray();
		int count=0;
		for(int i=0;i<a.length;i++) {
			count++;
		}
		return count;
		
	}
	@GetMapping(value="/getsqur/{num}")
	public String getsqur(@PathVariable int num) {
		String ans="";
		for (int i=2;i<num;i++) {
			if(Math.sqrt(i)%1==0) {
				ans=ans+" "+i;
			}
		}
		return ans;
	}
	@GetMapping(value="/gettop/{name}")
	public String gettop(@PathVariable String name) {
		String val="";
				
				
		char[] ans=name.toCharArray();
		HashMap<Character,Integer>a=new HashMap<>();
		for(int i=0;i<ans.length;i++) {
			if(a.containsKey(ans[i])) {
				a.put(ans[i],a.get(ans[i])+1);
			}
			else {
				a.put(ans[i], 1);
			}
			
		}
		val=String.valueOf(a);
		return val;
	}

	
	

}
