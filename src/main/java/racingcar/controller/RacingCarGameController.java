package racingcar.controller;

import racingcar.model.RacingCarGame;
import racingcar.service.RacingCarGameService;
import racingcar.view.NamesView;
import racingcar.view.ResultView;
import racingcar.view.TheNumberOfView;

public class RacingCarGameController {

	private RacingCarGame racingCarGame;
	private RacingCarGameService racingCarGameService;

	public RacingCarGameController(RacingCarGame racingCarGame) {
		this.racingCarGame = racingCarGame;
		racingCarGameService = new RacingCarGameService();
	}

	public void operate() {
		NamesView namesView = new NamesView();
		racingCarGame.setCars(namesView.getInput());

		TheNumberOfView theNumberOfView = new TheNumberOfView();
		racingCarGame.setTheNumberOf(theNumberOfView.getInput());

		ResultView resultView = new ResultView();
		resultView.print();

		racingCarGame = racingCarGameService.playAsTheNumberOf(racingCarGame);
	}
}