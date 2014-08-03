package std.ep.game.main;

import java.util.ArrayList;

import std.ep.game.elements.background.Background;
import std.ep.game.elements.enemy.Enemy;
import std.ep.game.elements.enemy.Enemy1;
import std.ep.game.elements.enemy.Enemy2;
import std.ep.game.elements.player.Player;
import std.ep.game.elements.projectile.Projectile;
import std.ep.game.lib.GameLib;

public class ShootEmUpFacade {

	ArrayList<Enemy> enemy1;
	ArrayList<Enemy> enemy2;
	ArrayList<Enemy> enemy3;
	
	ArrayList<Background> primary;
	ArrayList<Background> secondary;
	
	Projectile projectile_e1;
	Projectile projectile_e2;
	Projectile projectile_e3;
	
	Player p;
	
	void execute(){

		long delta;
		long currentTime = System.currentTimeMillis();
		
		//inicializacao
		enemy1 = initializeEnemy();
		
		enemy2 = new ArrayList<>(10);
		for(int i = 0; i<enemy2.size(); i++) {
			Enemy e = new Enemy2(currentTime);
			e.setStates(0); //inactive
			enemy2.add(e);
		}
		
		primary = new ArrayList<>(20);
		for(int i = 0; i<primary.size(); i++){
			Background b = new Background();
			b.setxCoord(Math.random() * GameLib.WIDTH);
			b.setyCoord(Math.random() * GameLib.HEIGHT);
			primary.add(b);
		}
		
		secondary = new ArrayList<>(50);
		for(int i = 0; i<secondary.size(); i++){
			Background b = new Background();
			b.setxCoord(Math.random() * GameLib.WIDTH);
			b.setyCoord(Math.random() * GameLib.HEIGHT);
			secondary.add(b);
		}
		
	}

	private ArrayList<Enemy> initializeEnemy(ArrayList<Enemy> en) {
		en = new ArrayList<>(10);
		
		for(int i = 0; i<enemy1.size(); i++) {
			Enemy e = new Enemy1(System.currentTimeMillis());
			e.setStates(0); //inactive
			en.add(e);
		}
		
		return en;
	}
	
}
