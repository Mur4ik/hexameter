package org.codetome.hexameter.api.exception;

import static junit.framework.Assert.assertEquals;

import org.codetome.hexameter.api.exception.HexagonalGridCreationException;
import org.junit.Test;

public class HexagonalGridCreationExceptionTest {

	private static final String TEST_MESSAGE = "TEST_MESSAGE";

	@Test
	public void shouldReturnProperMessageWhenHexagonGridCreationExceptionIsThrown() {
		try {
			throw new HexagonalGridCreationException(TEST_MESSAGE);
		} catch (final HexagonalGridCreationException e) {
			assertEquals(TEST_MESSAGE, e.getMessage());
		}
	}
}