package com.mindtree.cityblock.entity;

public class Block implements Comparable<Block>{
	private int blockid;
	private String blockname;
	
	
	public Block() {
	}


	public Block(int blockid, String blockname) {
		this.blockid = blockid;
		this.blockname = blockname;
	}


	public int getBlockid() {
		return blockid;
	}


	public void setBlockid(int blockid) {
		this.blockid = blockid;
	}


	public String getBlockname() {
		return blockname;
	}


	public void setBlockname(String blockname) {
		this.blockname = blockname;
	}


	@Override
	public String toString() {
		return "Block [blockid=" + blockid + ", blockname=" + blockname + "]";
	}


//	@Override
//	public int compare(Block o1, Block o2) {
//		int x=o1.getBlockname().compareTo(o2.getBlockname());
//		if(x>1)
//		{
//			return 1;
//		}
//		else if(x<1)
//		{
//			return -1;
//		}
//		return 0;
//	}


	@Override
	public int compareTo(Block o) {
		
		return this.blockname.compareTo(o.getBlockname());
	}

	
	
	

}
