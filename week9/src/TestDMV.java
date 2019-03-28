import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestDMV {

	@Test
	void test() {
		System.out.println("Testing for calculateExpirationDate");
		assert((DMV.calculateExpirationDate(2014)!=2024)):"Test has not Passed";
		assert((DMV.calculateExpirationDate(2014)!=2023)):"Test has not Passed";
	}

}
