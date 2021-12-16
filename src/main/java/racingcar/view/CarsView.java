package racingcar.view;

import racingcar.model.Car;
import racingcar.model.Cars;

public class CarsView {

	public void print(Cars cars) {
		CarView carView = new CarView();

		for (Car car : cars.getCars()) {
			carView.print(car);
		}

		System.out.println();
	}
}
