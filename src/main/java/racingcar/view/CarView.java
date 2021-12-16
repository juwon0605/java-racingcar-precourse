package racingcar.view;

import java.util.ArrayList;
import java.util.List;

import racingcar.constant.Message;
import racingcar.model.Car;

public class CarView {

	public void print(Car car) {
		List<String> carState = new ArrayList<>();
		carState.add(car.getName().toString());
		carState.add(positionToLine(car.getPosition()));
		System.out.println(String.join(Message.COLON, carState));
	}

	private String positionToLine(int position) {
		StringBuilder stringBuilder = new StringBuilder();

		for (int i = 0; i < position; i++) {
			stringBuilder.append("-");
		}

		return stringBuilder.toString();
	}
}
