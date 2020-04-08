package container;

import javax.swing.JFrame;

public class JFrameTest2 {
	public static void main(String[] args) {
		//컨테이너 생성하기
		JFrame jframe = new JFrame("두번째 프로그램");
		
		//x를 누르면 프로그램 종료
		//	아래의 코드를 통해 메모리에서 종료
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//컨테이너의 크기 지정하기
		jframe.setSize(300, 300);
		//컨테이너 보여주기
		jframe.setVisible(true);
		
	}
}
