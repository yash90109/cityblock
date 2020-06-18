package com.mindtree.cityblock.service.serviceimplementation;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import com.mindtree.cityblock.entity.Block;
import com.mindtree.cityblock.service.BlockService;

public class BlockServiceImplementation implements BlockService {

	@Override
	public Set<Block> addBlock(int blockid, String blockname) {
		Set<Block> newblock=new TreeSet<Block>();
		Block block=new Block(blockid, blockname);
		newblock.add(block);
		
		return newblock;
	}

	

}
