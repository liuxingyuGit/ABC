package com.ssm.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 随机生成 唯一标识
 */
public class UUIDUtil {
	public static synchronized String getUUID() {
		/*
		 * UUID 生成唯一标识 UUID uuid = UUID.randomUUID(); String str =
		 * uuid.toString(); String uuidStr=str.replace("-", "");
		 */

		String d = String.valueOf(System.currentTimeMillis());
		String df = new SimpleDateFormat("yyyy-MM-DD HH:mm:ss").format(new Date()).replace("-", "").replace(":", "")
				.replace(" ", "").substring(8);
		return d + df;
	}
}
