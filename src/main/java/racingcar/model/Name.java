package racingcar.model;

import racingcar.constant.Rule;
import racingcar.util.StringChecker;

public class Name {

	private String name;

	public Name(String input) {
		checkInput(input);
		name = input;
	}

	private void checkInput(String input) {
		StringChecker stringChecker = new StringChecker();
		stringChecker.isLessMaxLength(input, Rule.NAME_MAX_LENGTH);
	}

	public String toString() {
		return name;
	}
}
