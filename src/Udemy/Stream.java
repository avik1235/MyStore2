package Udemy;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Stream {
	public static void main(String[] args){

       List<String> a1=Arrays.asList("avik","souvik","pakhi","shrabanti");
       a1.stream().filter(s->s.startsWith("a")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.print(s));
       
      
       
           
	}

}
