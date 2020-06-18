package com.mindtree.cityblock.entity;

public class City implements Comparable<City> {
	private int cityid;
	private String cityname;

	public City() {
	}

	public int getCityid() {
		return cityid;
	}

	public void setCityid(int cityid) {
		this.cityid = cityid;
	}

	public String getCityname() {
		return cityname;
	}

	public void setCityname(String cityname) {
		this.cityname = cityname;
	}

	public City(int cityid, String cityname) {
		this.cityid = cityid;
		this.cityname = cityname;
	}
	

	@Override
	public String toString() {
		return "City [cityid=" + cityid + ", cityname=" + cityname + "]";
	}

//	@Override
//	public int compare(City o1, City o2) {
//		int x = o1.getCityname().compareToIgnoreCase(o2.getCityname());
//		if (x > 1) {
//			return 1;
//		} else if (x < 1) {
//			return -1;
//		}
//		return 0;
//	}

	@Override
	public int compareTo(City o) {
		return this.cityname.compareTo(o.cityname);
	}

}
