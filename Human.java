/*
 * Author: Alvin
 * desc: 
 * created: 4/11/19
 */
public class Human { 
	public int age;
	public int food;
	public double wealth;
	public double hunger;
	public boolean hasVehicle; 
	public String name;
	
	public Human() {
		this.age = 0;
		this.name = "";
		this.wealth = 0.0;
		this.hasVehicle = false;
		this.hunger = 5.0;
		this.food = 5;
	}
	
	public void eat() {
		if(food>=4.5) {
			hunger -= 1.0;
			food -= 1.5;
			System.out.println("Yummy, I ate all");
		}
		else {
			System.out.println("Not enough food, please by food");
		}
	}
	public void grow() {
		age++;
	}
	public void work() {
		if(hunger<5) {
			wealth += 10.5;
			hunger += 0.5;
			System.out.println("Whoah, I worker a lot");
		}
		else
			System.out.println("Too hungry to work");
	}
	public void buyFood() {
		if(wealth>5) {
			wealth -= 4.5;
			food++;
		}
		else {
			System.out.println("Not enough money, please work");
		}
	}
}
	