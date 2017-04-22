package be.socrates.coderetreat;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class TodoTest {

	@Test
	public void itSaysHello() {
		Todo todo = new Todo();

		assertThat(todo.sayHello()).isEqualTo("crunchy biscuit");
	}

}
