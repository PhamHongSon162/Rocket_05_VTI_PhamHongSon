package backend;

import entity.Car;
import entity.Car.Engine;

public class Question2ex3 {
	public void question2() {

		Car car = new Car("Mazda", "8WD");
		

		Engine engine = car.new Engine();
		engine.setEngineType("Crysler");
		
		car.setEngine(engine);
        
		car.inThongTin();
}
}
