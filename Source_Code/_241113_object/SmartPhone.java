package _241113_object;

import java.util.Objects;

public class SmartPhone {
	private String manufacturer;
	private String model;
	private int price;
	private String carrier;
	
	public SmartPhone(String manufacturer, String model, int price, String carrier) {
		super();
		this.manufacturer = manufacturer;
		this.model = model;
		this.price = price;
		this.carrier = carrier;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public String getModel() {
		return model;
	}

	public int getPrice() {
		return price;
	}

	public String getCarrier() {
		return carrier;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}

	@Override
	public String toString() {
		return "SmartPhone [manufacturer=" + manufacturer + ", model=" + model + ", price=" + price + ", carrier="
				+ carrier + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(manufacturer, model);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof SmartPhone))
			return false;
		SmartPhone other = (SmartPhone) obj;
		return Objects.equals(manufacturer, other.manufacturer) && Objects.equals(model, other.model);
	}
	
	

}
