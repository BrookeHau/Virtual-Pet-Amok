package VirtualPetShelter;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class RoboticTest {

	private Robot robo = new RobotDog("Name", "description", 3, 4, 5);
	private RobotCat roboCat = new RobotCat("Name", "description", 5, 7);

	@Test
	public void oilChanges() {
		robo.oil();
		int check = robo.checkOil();
		assertThat(check, is(6));
	}

	@Test
	public void chargeBattery() {
		Robot robo = new RobotDog("Name", "description", 3, 4, 5);
		robo.charge();
		int check = robo.checkBattery();
		assertThat(check, is(6));

	}

	@Test
	public void walkLevel() {
		RobotDog robo = new RobotDog("Name", "description", 3, 4, 5);
		robo.walkdog();
		int check = robo.getWalkLevel();
		assertThat(check, is(7));

	}

	@Test
	public void RoboDogTick() {
		robo.tick();
		int check = robo.checkOil();
		int check2 = robo.checkBattery();
		assertThat(check, is(5));
		assertThat(check2, is(7));
	}
	
	@Test
	public void getHealth() {
		String check = robo.getHealth();
		assertThat(check, is("Low levels, need oil"));
		
	}

	@Test
	public void getRoboCatData() {
		int check = roboCat.checkBattery();
		int check2 = roboCat.checkOil();
		assertThat(check, is(7));
		assertThat(check2, is(5));
	}

	@Test
	public void chargeAndOil() {
		roboCat.oil();
		roboCat.charge();
		int check = roboCat.checkBattery();
		int check2 = roboCat.checkOil();
		assertThat(check, is(9));
		assertThat(check2, is(8));

	}
	@Test
	public void catTick() {
		roboCat.tick();
		int check = roboCat.checkBattery();
		int check2 = roboCat.checkOil();
		assertThat(check, is(10));
		assertThat(check2, is(7));
		
	}
}
