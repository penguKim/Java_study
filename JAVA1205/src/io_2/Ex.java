package io_2;

import java.io.IOException;
import java.io.OutputStream;

public class Ex {
	
	public static void main(String[] args) {
		/*
		 * 모니터로 데이터를 출력하는 방법
		 * 1. 기본 출력스트림인 OutputStream 사용(byte 단위로 처리)
		 * - write() 메서드를 호출하여 byte 단위 출력
		 * - byte 단위로 처리되므로 문자열 데이터 자체를 처리할 수 없음
		 */
//		char ch = 'A';
//		ch = '김'; // 출력되지 않음
//		
//		try(OutputStream os = System.out) {
//			// write() 메서드를 호출하여 1byte 데이터를 출력
//			os.write(ch); // 1byte 단위로 출력하므로 한글, 한자 등 출력 불가능
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		// =============================================================
		String str = "Hello, 자바!";
		
		try(OutputStream os = System.out) {
			// write(byte[] b) 메서드를 호출하여 출력할 데이터를 배열로 전달
			os.write(str.getBytes()); // 한글, 한자 등의 문자열도 출력 가능
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
}