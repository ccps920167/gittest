
public abstract class Hero {
	// 省略 getter/setter...
	
	private String name;
	private int level;
	private double exp;
        private double hp;
        private String Skill1;
	
	public Hero() {
		this("David", 1, 0);
	}
	
	public Hero(String name, int level, double exp) {
		this.name = name;
		this.level = level;
		this.exp = exp;
	}
	
<<<<<<< HEAD
	public abstract void attack(8);
	public abstract void attack(5);
>>>>>>> cat
	
	public abstract void move();
	
	public abstract void defend();
}
