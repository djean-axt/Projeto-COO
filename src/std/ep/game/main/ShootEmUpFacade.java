package std.ep.game.main;

import java.util.ArrayList;

import std.ep.game.elements.background.Background;
import std.ep.game.elements.enemy.Enemy;
import std.ep.game.elements.player.Player;
import std.ep.game.elements.projectile.Projectile;

public class ShootEmUpFacade {

	ArrayList<Enemy> enemy1;
	ArrayList<Enemy> enemy2;
	ArrayList<Enemy> enemy3;
	
	Background primary;
	Background secondary;
	
	Projectile projectile_e1;
	Projectile projectile_e2;
	Projectile projectile_e3;
	
	Player p;
	
	void execute(){

		long delta;
		long currentTime = System.currentTimeMillis();
		
		//inicializacao
		enemy1 = new ArrayList<>(10);
		for(int i = 0; i<enemy1.size(); i++) enemy1.add(new Enemy(0, 9.0, currentTime+7000));
		
	}
	
}
