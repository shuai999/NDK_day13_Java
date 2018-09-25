package com.novate.ndk.day13;

import java.util.UUID;

public class Simple1 {
	public static void main(String[] args) {
		
		// ͨ�� ndk ���� getUUID()����
		// callStaticMethod() ;
		
		// ������������c���ȡPoint����
		Point point = createPoint() ;
		System.out.println("point: x = "+point.getX()+", y = "+point.getY());
	}
	
	
	
	private native static Point createPoint() ;



	// дһ����̬�Ļ�ȡ uuid�ķ�����Ȼ���� c�е��������������ȡuuid
	// ��Ϊ�����c��ֱ��д��ȡ uuid��������д�ܶ���룬���Կ�������java��д�ã�Ȼ���� c�е��ü���
	public static String getUUID() {
		return UUID.randomUUID().toString();
	}
	
	public native static void callStaticMethod() ;
	
	static {
		// ���� ��VS���ɵ� dll��̬��
		System.load("E:/code/ndk/NDK_day13/x64/Debug/NDK_day13.dll");
	}
}
