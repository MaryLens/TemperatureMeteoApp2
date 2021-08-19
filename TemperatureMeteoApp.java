import java.util.Random;

public class TemperatureMeteoApp {

	public static void main(String[] args) {
		System.out.println("Temperature:" + PrivateMeteoProvider.getCurrentTemperature(567) + "c\nHumidity:"
				+ PrivateMeteoProvider.getCurrentHumidity(567) + "%\n");
		System.out.println("Temperature:" + PrivateMeteoProvider.getCurrentTemperature(392) + "c\nHumidity:"
				+ PrivateMeteoProvider.getCurrentHumidity(392) + "%\n");
		System.out.println("Temperature:" + PrivateMeteoProvider.getCurrentTemperature(124) + "c\nHumidity:"
				+ PrivateMeteoProvider.getCurrentHumidity(124) + "%\n");
		System.out.println("Temperature:" + PrivateMeteoProvider.getCurrentTemperature(250) + "c\nHumidity:"
				+ PrivateMeteoProvider.getCurrentHumidity(250) + "%\n");
		System.out.println("Temperature:" + PrivateMeteoProvider.getCurrentTemperature(348) + "c\nHumidity:"
				+ PrivateMeteoProvider.getCurrentHumidity(348) + "%\n");
		System.out.println("Temperature:" + PrivateMeteoProvider.getCurrentTemperature(380) + "c\nHumidity:"
				+ PrivateMeteoProvider.getCurrentHumidity(380) + "%");

	}

}

class OpenMeteoProvider {
	static Random random = new Random();

	static double getCurrentTemperature(int countryCode) {
		double currentTemperature = 0;
		switch (countryCode) {
		case 392:
			currentTemperature = randTemp();
			break;
		case 124:
			currentTemperature = randTemp();
			break;
		case 250:
			currentTemperature = randTemp();
			break;
		case 348:
			currentTemperature = randTemp();
			break;
		case 380:
			currentTemperature = randTemp();
			break;
		default:
			errorCase();
		}
		return currentTemperature;
	}

	static void errorCase() {
		System.err.println("Can't provide data for this country!");
	}

	static double randTemp() {
		double randomTemperature = random.nextDouble() * ((50.0 - (-50.0)) +(-50));
		return randomTemperature;
	}
}

class PrivateMeteoProvider extends OpenMeteoProvider {
	static Random random = new Random();

	static byte getCurrentHumidity(int countryCode) {
		byte currentHumidity = 0;
		switch (countryCode) {
		case 392:
			currentHumidity = randHum();
			break;
		case 124:
			currentHumidity = randHum();
			break;
		case 250:
			currentHumidity = randHum();
			break;
		case 348:
			currentHumidity = randHum();
			break;
		case 380:
			currentHumidity = randHum();
			break;
		default:
			errorCase();
		}
		return currentHumidity;
	}

	static byte randHum() {
		byte randomHumidity = (byte) random.nextInt(100);
		return randomHumidity;
	}

}
