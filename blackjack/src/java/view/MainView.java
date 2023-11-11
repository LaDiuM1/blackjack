package java.view;

import java.controller.RoomController;

public class MainView {
	
	private static MainView mainView = new MainView();
	public static MainView getInstance() { return mainView;}
	private MainView() {}
	
	public void mainView() {
		RoomController.getInstance().cardSuffleLosic(1);
	}
}
