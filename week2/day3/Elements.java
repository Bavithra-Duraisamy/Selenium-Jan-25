package week2.day3;

public class Elements extends Button {

	public static void main(String[] args) {
		Elements el = new Elements();
		el.setText("Bavithra");
		el.click();
		el.submit();
		CheckboxButton chkBton = new CheckboxButton();
		chkBton.checkButton();
		RadioButton radBton = new RadioButton();
		radBton.selectRadioButton();
	}

}
