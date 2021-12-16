package racingcar.service;

import racingcar.model.RacingCarGame;
import racingcar.model.Winner;
import racingcar.view.CarsView;
import racingcar.view.WinnerView;

public class RacingCarGameService {

	public RacingCarGame playAsTheNumberOf(RacingCarGame racingCarGame) {
		CarsView carsView = new CarsView();

		while (racingCarGame.getTheNumberOf() > 0) {
			racingCarGame.play();
			racingCarGame.minusTheNumberOf();
			carsView.print(racingCarGame.getCars());
		}

		Winner winner = new Winner(racingCarGame.getCars());
		WinnerView winnerView = new WinnerView();
		winnerView.print(winner);

		return racingCarGame;
	}
}
