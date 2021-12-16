package racingcar.view;

import java.util.ArrayList;
import java.util.List;

import racingcar.constant.Message;
import racingcar.model.Winner;

public class WinnerView {

	public void print(Winner winner) {
		List<String> winnerNotice = new ArrayList<>();
		winnerNotice.add(Message.WINNER);
		winnerNotice.add(winner.getNames().toString());
		System.out.println(String.join(Message.COLON, winnerNotice));
	}

}
