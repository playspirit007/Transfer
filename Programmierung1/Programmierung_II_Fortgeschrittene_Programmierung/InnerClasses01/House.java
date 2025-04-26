package InnerClasses01;

import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class House {
	private final ArrayList<Room> rooms;
	
	public House() {
		rooms = new ArrayList<>();
	}
	
	public void addRoom(Room room) {
		rooms.add(room);
	}
}
