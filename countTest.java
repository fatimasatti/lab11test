import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class countTest {

	@Test
	void test() {
		JUnitTesting obj=new JUnitTesting();
		int output=obj.countA("ssssAAAaaa");
		assertEquals(6, output);
	}
	}


