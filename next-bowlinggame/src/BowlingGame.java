public class BowlingGame {
	int currnetFrame = 1;
	int currentTry = 1;

	BowlingGame() {
		Frame f1 = new Frame(1);
		Frame f2 = new Frame(2);
		Frame f3 = new Frame(3);
		Frame f4 = new Frame(4);
		Frame f5 = new Frame(5);
		Frame f6 = new Frame(6);
		Frame f7 = new Frame(7);
		Frame f8 = new Frame(8);
		Frame f9 = new Frame(9);
		TenFrame f10 = new TenFrame();
	}

	public void getCurrentTry() {
		System.out.printf("%d Frame, %d차 시기 입니다.\n", currnetFrame, currentTry);
	}
}
