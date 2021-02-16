import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class firstTest {

	@Test
	void test() {
		first time = new first();
		time.setHours(20);
		time.setMinutes(30);
		assert time.getMinutes() == 30;
		assert time.getHours() == 20;
		
		
	}

}
