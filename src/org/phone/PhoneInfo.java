package org.phone;

public class PhoneInfo {
	private void phoneName() {
		System.out.println("phone name is prakash");
	}
	private void phoneImeinum() {
		System.out.println("phone imei is 8661452527387");
	}
	private void phoneCamera() {
		System.out.println("phone camera is 16 megapixel");
	}
	private void phoneStorage() {
		System.out.println("phone storage is 64gb");
	}
	private void phoneOsname() {
		System.out.println("phone osname is realme os");
	}
	public static void main(String[] args) {
		PhoneInfo phone=new PhoneInfo();
		phone.phoneName();
		phone.phoneImeinum() ;
		phone.phoneCamera();
		phone.phoneStorage();
		phone.phoneOsname() ;
	}
}
