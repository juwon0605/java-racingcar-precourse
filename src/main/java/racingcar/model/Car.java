package racingcar.model;

import camp.nextstep.edu.missionutils.Randoms;
import racingcar.constant.Rule;

public class Car {
	private final Name name;
	private int position = 0;

	public Car(Name name) {
		this.name = name;
	}

	public Name getName() {
		return name;
	}

	public int getPosition() {
		return position;
	}

	public void goOrStay() {
		int randomNumber = Randoms.pickNumberInRange(Rule.START_NUMBER_OF_RANGE, Rule.END_NUMBER_OF_RANGE);

		if (randomNumber >= Rule.START_NUMBER_OF_GO) {
			position++;
		}

	}

}
