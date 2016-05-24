package com.ssm.test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * 测试 UUID
 */
public class UUIDTest {

	public static synchronized String getLongId() {
		UUID uuid = UUID.randomUUID();
		String str = uuid.toString();
		String uuidStr = str.replace("-", "");
		return uuidStr;
	}

	public static void main(String[] args) {
		// System.out.println(getLongId()+",长度："+getLongId().length());
		String d = String.valueOf(System.currentTimeMillis());
		String df = new SimpleDateFormat("yyyy-MM-DD HH:mm:ss").format(new Date()).replace("-", "").replace(":", "")
				.replace(" ", "").substring(8);
		System.out.println(String.valueOf(d) + df+","+(String.valueOf(d) + df).length());
		
	}

}
