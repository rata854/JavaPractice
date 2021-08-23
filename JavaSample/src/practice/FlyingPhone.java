package practice;

import extend.phone.Phone;

public class FlyingPhone implements Phone, Flying {
	private int i;
	
	public FlyingPhone(int i) {
		this.i = i;
	}
	
    public void call(String number) {
        System.out.println(number + " に電話します。通話できるのは飛んでいる間だけです。");
    }
	
	public void fly() {
		System.out.println(i + "分間、飛びます。");
	}
	
    public void powerOff() {
        Flying.super.powerOff();
    }
}
