package racingcar.model;

public class TheNumberOf {

	private int theNumberOf;

	public TheNumberOf(String input) {
		checkInput(input);
		theNumberOf = Integer.valueOf(input);
	}

	private void checkInput(String input) {

	}

	public boolean isZero() {

		if (theNumberOf == 0) {
			return true;
		}

		return false;
	}

	public void minus() {

		if (theNumberOf > 0) {
			theNumberOf--;
		}

	}

}
