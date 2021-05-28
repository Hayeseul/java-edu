package test.com;


public class RoomVO {
	
	private int room_num;
	
	private String room_roomName;
	
	private String room_price; 
	
	private String room_minPerson;
	
	private String room_maxPerson;

	public int getRoom_num() {
		return room_num;
	}

	public void setRoom_num(int room_num) {
		this.room_num = room_num;
	}

	public String getRoom_roomName() {
		return room_roomName;
	}

	public void setRoom_roomName(String room_roomName) {
		this.room_roomName = room_roomName;
	}


	public String getRoom_price() {
		return room_price;
	}

	public void setRoom_price(String room_price) {
		this.room_price = room_price;
	}

	public String getRoom_minPerson() {
		return room_minPerson;
	}

	public void setRoom_minPerson(String room_minPerson) {
		this.room_minPerson = room_minPerson;
	}

	public String getRoom_maxPerson() {
		return room_maxPerson;
	}

	public void setRoom_maxPerson(String room_maxPerson) {
		this.room_maxPerson = room_maxPerson;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((room_maxPerson == null) ? 0 : room_maxPerson.hashCode());
		result = prime * result + ((room_minPerson == null) ? 0 : room_minPerson.hashCode());
		result = prime * result + room_num;
		result = prime * result + ((room_price == null) ? 0 : room_price.hashCode());
		result = prime * result + ((room_roomName == null) ? 0 : room_roomName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RoomVO other = (RoomVO) obj;
		if (room_maxPerson == null) {
			if (other.room_maxPerson != null)
				return false;
		} else if (!room_maxPerson.equals(other.room_maxPerson))
			return false;
		if (room_minPerson == null) {
			if (other.room_minPerson != null)
				return false;
		} else if (!room_minPerson.equals(other.room_minPerson))
			return false;
		if (room_num != other.room_num)
			return false;
		if (room_price == null) {
			if (other.room_price != null)
				return false;
		} else if (!room_price.equals(other.room_price))
			return false;
		if (room_roomName == null) {
			if (other.room_roomName != null)
				return false;
		} else if (!room_roomName.equals(other.room_roomName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "RoomVO [room_num=" + room_num + ", room_roomName=" + room_roomName + ", room_price=" + room_price + ", room_minPerson=" + room_minPerson + ", room_maxPerson="
				+ room_maxPerson + "]";
	}
	
	

	
	
	
	
}
