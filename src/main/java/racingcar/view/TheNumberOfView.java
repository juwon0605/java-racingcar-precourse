package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import racingcar.constant.Message;
import racingcar.model.TheNumberOf;

public class TheNumberOfView {

	public TheNumberOf getInput() {
		System.out.println(Message.INPUT_THE_NUMBER_OF);
		try {
			String input = Console.readLine();
			System.out.println();
			return new TheNumberOf(input);
		} catch (IllegalArgumentException e) {
			System.out.println(Message.ERROR + e.getMessage() + "\n");
			return getInput();
		}
	}
}
