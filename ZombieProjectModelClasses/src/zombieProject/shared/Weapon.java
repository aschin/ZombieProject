package zombieProject.shared;

public class Weapon {

	private int damage; //the amount of damage the weapon can inflict
	private int range;  //the range of weapon's effectiveness
	
	/**
	 * Weapon constructor
	 */
	public Weapon(int damage, int range){
	
		this.damage = damage;
		this.range = range;
		
	}

	/**
	 * returns the damage the weapon can inflict
	 * 
	 * @return amount of damage inflictable
	 */
	public int getdamage(){
		
		return damage;
		
	}
	/**
	 * return the range of the weapon
	 * 
	 * @return weapon's range
	 */
	public int getRange(){
		
		return range;
		
	}
	
	
	
}
