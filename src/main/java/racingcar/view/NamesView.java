package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import racingcar.constant.Message;
import racingcar.model.Names;

public class NamesView {

	public Names getInput() {
		System.out.println(Message.INPUT_NAMES);
		try {
			String input = Console.readLine();
			return new Names(input);
		} catch (IllegalArgumentException e) {
			System.out.println(Message.ERROR + e.getMessage() + "\n");
			return getInput();
		}
	}
}
