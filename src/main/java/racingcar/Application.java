package racingcar;

import racingcar.controller.RacingCarGameController;
import racingcar.model.RacingCarGame;

public class Application {
	public static void main(String[] args) {

		RacingCarGame racingCarGame = new RacingCarGame();
		RacingCarGameController racingCarGameController = new RacingCarGameController(racingCarGame);
		racingCarGameController.operate();
	}
}
