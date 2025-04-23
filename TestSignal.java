package lecture5.strategy;

public class TestSignal {

	public static void main(String[] args) throws InterruptedException {
		SignalWindow window = new SignalWindow();
		Signal s = new Signal(window.getTextArea());
		Thread.sleep(10000);
		s.setSampler(new SinusSampler(0.0, 0.1));
	}

}
