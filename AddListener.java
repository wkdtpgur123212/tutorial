import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JLabel;

public class AddListener implements ItemListener {
	JLabel subTitle;
	String title[];
	
	AddListener(JLabel subTitle) {
		this.subTitle = subTitle;
	}
	AddListener(String title[]) {
		this.title = title;
	}
	
	
	@Override
	public void itemStateChanged(ItemEvent arg0) {
		String str = (String)arg0.getItem();
		if(str.equals("한국어")) {
			subTitle.setText("파일 탐색기");
			ATable.title[0] = "이름";
			ATable.title[1] = "크기";
			ATable.title[2] = "수정한 날짜";
			
		}
		if(str.equals("ENGLISH")) {
			subTitle.setText("FILE READER");
			ATable.title[0] = "NAME";
			ATable.title[1] = "SIZE";
			ATable.title[2] = "MODIFY DATE";
		}
	}
	

}
