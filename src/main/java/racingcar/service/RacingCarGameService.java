package racingcar.service;

import racingcar.model.RacingCarGame;
import racingcar.view.CarsView;

public class RacingCarGameService {

	public RacingCarGame playAsTheNumberOf(RacingCarGame racingCarGame) {
		CarsView carsView = new CarsView();

		while (!racingCarGame.theNumberOfIsZero()) {
			racingCarGame.play();
			racingCarGame.minusTheNumberOf();
			carsView.print(racingCarGame.getCars());
		}

		return racingCarGame;
	}
}
