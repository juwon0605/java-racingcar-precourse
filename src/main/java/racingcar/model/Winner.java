package racingcar.model;

import java.util.ArrayList;
import java.util.List;

public class Winner {

	private Cars winner;

	public Winner(Cars cars) {
		List<Car> winner = new ArrayList<>();
		int maxPosition = cars.getMaxPosition();

		for (Car car : cars.getCars()) {

			if (car.isPosition(maxPosition)) {
				winner.add(car);
			}

		}

		this.winner = new Cars(winner);
	}
}
