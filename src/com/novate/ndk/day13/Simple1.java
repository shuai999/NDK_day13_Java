package com.novate.ndk.day13;

import java.util.UUID;

public class Simple1 {
	public static void main(String[] args) {
		
		// 通过 ndk 调用 getUUID()方法
		// callStaticMethod() ;
		
		// 创建方法：从c层获取Point对象
		Point point = createPoint() ;
		System.out.println("point: x = "+point.getX()+", y = "+point.getY());
	}
	
	
	
	private native static Point createPoint() ;



	// 写一个静态的获取 uuid的方法，然后在 c中调用这个方法来获取uuid
	// 因为如果在c中直接写获取 uuid方法，会写很多代码，所以可以先在java中写好，然后在 c中调用即可
	public static String getUUID() {
		return UUID.randomUUID().toString();
	}
	
	public native static void callStaticMethod() ;
	
	static {
		// 加载 用VS生成的 dll动态库
		System.load("E:/code/ndk/NDK_day13/x64/Debug/NDK_day13.dll");
	}
}
