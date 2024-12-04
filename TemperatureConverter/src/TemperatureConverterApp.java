import java.util.Scanner;

public class TemperatureConverterApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the temperature in degree farhenheit:");
		
		double farhenheit = scan.nextDouble();
		
		TemperatureConverter temperatureconverter = new TemperatureConverter();
		double temperatureincelsius = temperatureconverter.convertFarhenheitToCelsius(farhenheit);
		
		System.out.println(temperatureincelsius);
				

	}

}
