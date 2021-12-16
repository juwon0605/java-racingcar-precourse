package racingcar.util;

import racingcar.constant.Message;

public class StringChecker {

	public void isEmpty(String input) {

		if (input.equals(Message.EMPTY)) {
			throw new IllegalArgumentException(Message.ERROR_INPUT_IS_EMPTY);
		}

	}

	public void containSpace(String input) {

		if (input.contains(Message.SPACE)) {
			throw new IllegalArgumentException(Message.ERROR_CONTAINS_SPACE);
		}

	}

	public void containTap(String input) {

		if (input.contains(Message.TAP)) {
			throw new IllegalArgumentException(Message.ERROR_CONTAINS_TAP);
		}

	}

	public void isLessMaxLength(String input, int maxLength) {

		if (input.length() > maxLength) {
			throw new IllegalArgumentException(maxLength + Message.ERROR_EXCEED_MAX_LENGTH);
		}

	}
}
