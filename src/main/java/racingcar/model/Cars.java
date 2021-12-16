package racingcar.model;

import java.util.ArrayList;
import java.util.Collections;
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

	public Cars(List<Car> cars) {
		this.cars = cars;
	}

	public List<Car> getCars() {
		return cars;
	}

	public int getMaxPosition() {
		return Collections.max(getPositionList());
	}

	private List<Integer> getPositionList() {
		List<Integer> positionList = new ArrayList<>();

		for (Car car : cars) {
			positionList.add(car.getPosition());
		}

		return positionList;
	}

	public Names getNames() {
		List<Name> names = new ArrayList<>();

		for (Car car : cars) {
			names.add(car.getName());
		}

		return new Names(names);
	}
}
