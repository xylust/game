package miniproject.generator;

import java.awt.Graphics2D;
import java.util.ArrayList;

import miniproject.system.Vector2F;

public class TileManager {
	
	public ArrayList<Block> blocks = new ArrayList<Block>();

	public TileManager() {
		
	}
	
	public void tick(double deltaTime) {
		for(Block block : blocks) {
			block.tick(deltaTime);
		}
	}
	
	public void render(Graphics2D g) {
		for(Block block : blocks) {
			block.render(g);
		}
	}

}
