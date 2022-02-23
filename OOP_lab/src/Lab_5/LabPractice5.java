package Lab_5;

interface IPrintable {
	void Print();
}

class Console implements IPrintable {
	@Override
	public void Print() {
		System.out.println("Print on Console");
	}
}

class Printer implements IPrintable {
	@Override
	public void Print() {
		System.out.println("Print on Printer");
	}
}

class IPAddress {
	public String address;
}

interface INetwork extends IPrintable {
	void sendMessage();

	void recieveMessage();
}

class Network extends IPAddress implements INetwork {

	@Override
	public void Print() {
		System.out.println("Print on Network");
	}

	@Override
	public void sendMessage() {
		System.out.println("Sending Message to the reciever");
	}

	@Override
	public void recieveMessage() {
		System.out.println("Recieving Message at the reciever");
	}

}

public class LabPractice5 {
	public static void main(String[] args) {
		IPrintable console = new Console();
		IPrintable printer = new Printer();

		IPrintable[] outputDevice = new IPrintable[] { new Console(), new Printer() };

		console.Print();
		printer.Print();

		for (int i = 0; i < outputDevice.length; i++) {
			outputDevice[i].Print();
		}

		Network network = new Network();
		network.address = "192.168.0.1";
		network.Print();
		System.out.println(network.address);

		network.sendMessage();
		network.recieveMessage();
	}

}
