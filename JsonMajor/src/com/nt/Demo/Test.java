package com.nt.Demo;

import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;

public class Test
{
	public static void main(String[] args) 
	{
		Demo d=new Demo();
		d.setEmpId(23);
		d.setEmpName("UtkarshSingh");
		d.setEmpSal(5230);
		List<Demo> li=new ArrayList<>();
		li.add(d);
		try
		{
			ObjectMapper om=new ObjectMapper();
			String json=om.writeValueAsString(li);
			System.out.println(json);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		// TODO Auto-generated method stub

	}

}
