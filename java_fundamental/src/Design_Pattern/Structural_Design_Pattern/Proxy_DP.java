package Design_Pattern.Structural_Design_Pattern;

// In Proxy pattern, a class represents functionality of another class

// create interface
interface Image {
	void display();
}

// create real image class then create proxy image class
class RealImage implements Image {
	private String fileName;

	public RealImage(String fileName) {
		this.fileName = fileName;
		loadFromDisk(fileName);
	}

	public void display() {
		System.out.println("Displaying " + fileName);
	}

	private void loadFromDisk(String fileName) {
		System.out.println("Loading " + fileName);
	}
}

// now create proxy class for ProxyImage
class ProxyImage implements Image {
	private RealImage realImage;
	private String fileName;

	public ProxyImage(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public void display() {
		if (realImage == null) {
			realImage = new RealImage(fileName);
		}
		realImage.display();
	}
}

public class Proxy_DP {

	public static void main(String[] args) {
		Image image = new ProxyImage("test_10mb.jpg");

		// image will be loaded from disk
		image.display();
		System.out.println();

		// image will not be loaded from disk
		image.display();
	}

}
