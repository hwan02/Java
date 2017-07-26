package io;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputStreamTest {

	public static void main(String[] args) throws IOException {
		OutputStreamWriter osw = new OutputStreamWriter(System.out); //모니터 쪽이다라고 생각하면 됨
		BufferedWriter bw = new BufferedWriter(osw);
		
		String str = "재미있는 Java IO를 공부하는 중.....";
		bw.write(str); //System.out.println(); 과 동일한 기능 
		bw.flush(); // 버퍼 영역을 비워주는 역할
		
		bw.close();
		osw.close();
	}
}
