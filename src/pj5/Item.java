package pj5;

import java.util.ArrayList;
import java.util.List;

public class Item {
	private char name;
	private int weight;
	private char stored;
	private List<Character> allowed;
	private List<Character> forbidden;
	private List<Item> friends;
	private List<Item> enemies;
	private List<Item> mutualFriends;
	private List<Character> mutualA;
	private List<Character> mutualB;
	public Item(char name, int weight){
		this.name = name;
		this.weight = weight;
		this.stored = 'N';
		this.allowed = new ArrayList<>();
		this.forbidden = new ArrayList<>();
		this.friends = new ArrayList<>();
		this.enemies = new ArrayList<>();
		this.mutualFriends = new ArrayList<>();
		this.mutualA = new ArrayList<>();
		this.mutualB = new ArrayList<>();
	}
	
	public void addAllowed(char c){
		this.allowed.add(c);
	}
	
	public void addForbidden(char c){
		this.forbidden.add(c);
	}
	public void addFriends(Item i){
		this.friends.add(i);
	}
	public void addEnemies(Item i){
		this.enemies.add(i);
	}
	public void addMutualFriends(Item i){
		this.mutualFriends.add(i);
	}
	public void addMutualA(char c){
		this.mutualA.add(c);
	}
	public void addMutualB(char c){
		this.mutualB.add(c);
	}
	
	public char getName(){return name;}
	public int getWeight(){return weight;}
	public char getStored(){return stored;}
	public List<Character> getAllowed(){return allowed;}
	public List<Character> getForbidden(){return forbidden;}
	public List<Item> getFriends(){return friends;}
	public List<Item> getEnemies(){return enemies;}
	public List<Item> getMutualFriends(){return mutualFriends;}
	public List<Character> getMutualA(){return mutualA;}
	public List<Character> getMutualB(){return mutualB;}
	
}
