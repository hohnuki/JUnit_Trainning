package junit.tutorial;

import static junit.tutorial.IsDate.*;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;


public class IsDateTest {

	@Test
	public void 日付の比較() throws Exception {
		Date date = new Date();
		assertThat(date, is(dateOf(2022, 8, 25)));
	}

}
