package com.mindtree.cityblock.controller;

import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import com.mindtree.cityblock.entity.Block;
import com.mindtree.cityblock.entity.City;
import com.mindtree.cityblock.service.BlockService;
import com.mindtree.cityblock.service.CityService;
import com.mindtree.cityblock.service.serviceimplementation.BlockServiceImplementation;
import com.mindtree.cityblock.service.serviceimplementation.CityServiceImplementation;

public class CityBlockApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BlockService blockservice = new BlockServiceImplementation();
		CityService cityservice = new CityServiceImplementation();

		Set<City> uniCity = new TreeSet<City>();
		Set<Block> uniBlock = new TreeSet<Block>();
		boolean flag = true;
		do {

			System.out.println("enter 1 to add ");
			System.out.println("enter 2 to add block");
			System.out.println("enter 3 to display all");
			System.out.println("enter option");
			int option = sc.nextInt();
			switch (option) {
			case 1: {
				System.out.println("enter city id");
				int cityid = sc.nextInt();
				System.out.println("entre city name");
				String cityname = sc.next();
				Set<City> city = cityservice.addCity(cityid, cityname);
				for (City city2 : city) {
					System.out.println(city2.toString());

				}
				for (City city2 : city) {
					uniCity.add(city2);
				}

			}
				break;
			case 2:
			{
				System.out.println("enter blockid ");
				int blockid = sc.nextInt();
				System.out.println("enter block name");
				String blockname = sc.next();

				Set<Block> block = blockservice.addBlock(blockid, blockname);

				for (Block block2 : block) {
					System.out.println(block2.toString());
				}
				for (Block block2 : block) {
					uniBlock.add(block2);
				}
			}
				break;

			case 3:
				Map<City, Set<Block>> cityblock = new TreeMap<City, Set<Block>>();
				System.out.println("enter city id");
				int cityid = sc.nextInt();
				System.out.println("entre city name");
				String cityname = sc.next();
				City city = new City(cityid, cityname);
				System.out.println("enter how many blocks you want to enter");
				int noOFblocks=sc.nextInt();
				Set<Block> blocks=new TreeSet<Block>();
				for(int i=0;i<noOFblocks;i++)
				{
					
					System.out.println("enter blockid ");
					int blockid = sc.nextInt();
					System.out.println("enter block name");
					String blockname = sc.next();
					

					blocks = blockservice.addBlock(blockid, blockname);
				}
				
		      
				cityblock.put(city, blocks);
					
		       cityblock.entrySet().forEach(e -> System.out.println(e.getKey() + "\t" + e.getValue()));
						
				}
				
				

				break;

			
			


}while(flag);

}
}
