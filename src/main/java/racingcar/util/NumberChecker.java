package racingcar.util;

import racingcar.constant.Message;

public class NumberChecker {

	public void isPositiveInteger(String input) {
		isPositiveNumberOrZero(input);
		isIntegerRange(input);
		isNotZero(input);
	}

	private void isPositiveNumberOrZero(String input) {

		for (int i = 0; i < input.length(); i++) {

			if (!(input.charAt(i) >= '0' && input.charAt(i) <= '9')) {
				throw new IllegalArgumentException(Message.ERROR_POSITIVE_INTEGER);
			}

		}
	}

	private void isIntegerRange(String input) {
		try {
			int test = Integer.valueOf(input);
		} catch (Exception e) {
			throw new IllegalArgumentException(Message.ERROR_EXCEED_INTEGER);
		}
	}

	private void isNotZero(String input) {

		if (Integer.valueOf(input) == 0) {
			throw new IllegalArgumentException(Message.ERROR_POSITIVE_INTEGER);
		}

	}
}
