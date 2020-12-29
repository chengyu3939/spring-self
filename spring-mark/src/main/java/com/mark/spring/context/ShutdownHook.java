package com.mark.spring.context;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.Buffer;

public class ShutdownHook {
	public static void main(String[] args) {
		System.out.println("start" + System.currentTimeMillis());
		Runtime.getRuntime().addShutdownHook(new Thread(() -> System.out.println("shuntdown hook" + System.currentTimeMillis())));
		try {
			Process ll = Runtime.getRuntime().exec("ls");
			BufferedInputStream bi=new BufferedInputStream(ll.getInputStream());

			byte[] bytes=new byte[2048];
			int read = ll.getInputStream().read(bytes);
			System.out.println(new String(bytes  ));
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("end" + System.currentTimeMillis());

	}
}
