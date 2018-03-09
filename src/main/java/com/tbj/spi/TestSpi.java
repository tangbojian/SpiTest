package com.tbj.spi;

import java.util.ServiceLoader;

public class TestSpi {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		ServiceLoader<Search> load = ServiceLoader.load(Search.class);
		
		for(Search s : load){
			s.serch();
		}
		
	}
	
}
