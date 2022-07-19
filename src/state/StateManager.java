package state;

public class StateManager {
	
	private State currentState;
	
	CircleState circleState;
	RectangleState rectangleState;
	TriangleState triangleState;
	
	
	
	
	
	
	
	public void setCircleState(CircleState circleState) {
		this.circleState = circleState;
	}
	public void setRectangleState(RectangleState rectangleState) {
		this.rectangleState = rectangleState;
	}
	public void setTriangleState(TriangleState triangleState) {
		this.triangleState = triangleState;
	}
	public State getCurrentState() {
		return currentState;
	}
	
	
	
	

}
