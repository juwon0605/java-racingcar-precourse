package racingcar.model;

import java.util.ArrayList;
import java.util.List;

public class Cars {

	List<Car> cars;

	public Cars(Names names) {
		List<Car> cars = new ArrayList<>();

		for (Name name : names.getNames()) {
			cars.add(new Car(name));
		}

		this.cars = cars;
	}
}
