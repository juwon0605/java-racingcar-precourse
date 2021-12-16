package racingcar.model;

public class RacingCarGame {

	private Cars cars;
	private TheNumberOf theNumberOf;

	public Cars getCars() {
		return cars;
	}

	public void setCars(Names names) {
		cars = new Cars(names);
	}

	public int getTheNumberOf() {
		return theNumberOf.get();
	}

	public void setTheNumberOf(TheNumberOf theNumberOf) {
		this.theNumberOf = theNumberOf;
	}

	public void minusTheNumberOf() {
		theNumberOf.minus();
	}

	public void play() {

	}

}
