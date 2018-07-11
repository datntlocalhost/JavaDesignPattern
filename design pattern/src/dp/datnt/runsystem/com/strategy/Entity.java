package dp.datnt.runsystem.com.strategy;

public class Entity {
	
	private IMoveStrategy moveStrategy;
	
	public Entity(IMoveStrategy moveStrategy) {
		this.moveStrategy = moveStrategy;
	}
	
	public void move() {
		moveStrategy.move();
	}
}


