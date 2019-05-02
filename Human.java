public class Human { 
	private int age;
	private int food;
	private double wealth;
	private double hunger;
	private boolean hasVehicle; 
	private String name;
	private Vehicle[] vehicles;
	
	public Human() {
		this.age = 0;
		this.name = "";
		this.wealth = 0.0;
		this.hasVehicle = false;
		this.hunger = 5.0;
		this.food = 5;
		this.vehicles = new Vehicle[100];
	}
	public Human(String name, int age) {
		this.age = age;
		this.name = name;
		this.wealth = 0.0;
		this.hasVehicle = false;
		this.hunger = 5.0;
		this.food = 5;
		this.vehicles = new Vehicle[100];
	}
	
	public int getAge() {
		return this.age;
	}
	public String getName() {
		return this.name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
		}
	@Override
	public String toString() {
		return "Human:[ name: "+getName() +", age:"+getAge()+", wealth:"+this.wealth+"$]";
	}
	public int numberOfVehicles() {
		int total = 0;
		for (int i=0; i<vehicles.length; i++) {
			if(vehicles[i]!=null)
				total++;
			else
				break;
		}
		return total;
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
	public void eat(double food) {
		hunger -= food/4.5;
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
	