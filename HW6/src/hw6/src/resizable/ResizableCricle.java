package hw6.src.resizable;

public class ResizableCricle extends Circle implements Resizable {
	
	public ResizableCricle(double radius) {
		super(radius);
	}

	@Override
	public void resize(int percent) {
		super.radius *= percent / 100.0;
	}

	@Override
	public String toString() {
		return "Resizable[" + super.toString() + "]";
	}
}
