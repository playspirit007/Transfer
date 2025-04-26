package InnerClasses01;

public class main {

	public static void main(String[] args) {
		
		House Haus1 = new House();
		Room one = new Room("Schlafzimmer");
		Room two = new Room("Küche");
		Room three = new Room("Badezimmer");
		Haus1.addRoom(one);
		Haus1.addRoom(two);
		Haus1.addRoom(three);
		
		System.out.println(Haus1.getRooms());
		}
}
