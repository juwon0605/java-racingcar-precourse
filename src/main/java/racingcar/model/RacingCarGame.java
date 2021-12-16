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

	public boolean theNumberOfIsZero() {
		return theNumberOf.isZero();
	}

	public void setTheNumberOf(TheNumberOf theNumberOf) {
		this.theNumberOf = theNumberOf;
	}

	public void minusTheNumberOf() {
		theNumberOf.minus();
	}

	public void play() {

		for (Car car : cars.getCars()) {
			car.goOrStay();
		}

	}

}
