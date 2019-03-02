package lv.flyfishingteam.app;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import lv.flyfishingteam.app.home.HomeController;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTest {

	@Autowired
	private HomeController controller;

	@Test
	public void contextLoads() {
		assertThat(controller).isNotNull();
	}
}