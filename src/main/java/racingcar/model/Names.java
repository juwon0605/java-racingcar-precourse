package racingcar.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import racingcar.constant.Rule;

public class Names {

	private List<Name> names;

	public Names(String input) {
		checkInput(input);
		List<Name> names = new ArrayList<>();

		for (String name : Arrays.asList(input.split(Rule.DELIMITER_NAME))) {
			names.add(new Name(name));
		}

		this.names = names;
	}

	public void checkInput(String input) {

	}

	public List<Name> getNames() {
		return names;
	}
}
