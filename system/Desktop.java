package system;


public class Desktop extends Computer{
	public void desktopSize() {
		System.out.println("Desktop size is 15 inches ");
	}
	public static void main(String[] args) {
Desktop obj = new Desktop();
obj.computerModel();
obj.desktopSize();
}
}
