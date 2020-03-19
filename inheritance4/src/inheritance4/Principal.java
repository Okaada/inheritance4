package inheritance4;

public class Principal {

	Airplane airplane = new Airplane();
	Bus bus = new Bus();
	Ship ship = new Ship();
	
	public static void main(String[] args) {
		
		Principal principal = new Principal();
		principal.setData();
		principal.getData();
		
	}
	
	public void getData() {
		System.out.println(airplane.getPrice() + " " + airplane.getYear() + " " + airplane.getPrefixe());
		System.out.println(bus.getPrice() + " " + bus.getYear() + " " + bus.getSeats());
		System.out.println(ship.getPrice() + " " + ship.getYear() + " " + ship.getName());
	}

	public void setData() {
		airplane.setPrice(1000000);
		airplane.setYear(2019);
		airplane.setPrefixe("Airplane 1");
		
		bus.setPrice(40000);
		bus.setSeats(42);
		bus.setYear(2015);
		
		ship.setName("Titanic");
		ship.setPrice(500000);
		ship.setYear(1929);
	}

}
