package _241115_string;

public class KoreanID {
	private final String ID;
	
	public KoreanID(String id) {
		this.ID = id;
	}
	public String getId() {
		return ID;
	}
	
	private boolean isCorrectLength() {
		return ID.length() == 14;
	}
	
	private boolean containsBar() {
		return ID.indexOf('-') == 6;
	}
	
	private String getBirth() {
		return ID.substring(0, 6);
	}
	
	private String getGender() {
		char gender = ID.charAt(8);
		
		switch (gender) {
		case '1':
		case '3': {
			return "남성";
		}
		case '2':
		case '4':{
			return "여성";
		} 
		default: {
			return "성별을 알수 없음";
		}
		}
	}
	
	public void idCheck() {
		if (isCorrectLength() && containsBar()) {
		}
		
	}
}
