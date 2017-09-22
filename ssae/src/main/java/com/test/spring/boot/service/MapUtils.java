package com.test.spring.boot.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapUtils {
	public static String retrieveStringValue(Map<String, Object> mapObject, String key) {
		Object obj = retrieveObject(mapObject, key);

		if (obj instanceof String) {
			return (String) obj;
		}

		return null;
	}

	public static Boolean retrieveBooleanValue(Map<String, Object> mapObject, String key) {
		Object obj = retrieveObject(mapObject, key);

		if (obj instanceof Boolean) {
			return (Boolean) obj;
		}

		return null;
	}

	public static Double retrieveDoubleValue(Map<String, Object> mapObject, String key) {
		Object obj = retrieveObject(mapObject, key);

		if (obj instanceof Double) {
			return (Double) obj;
		}

		if (obj instanceof String) {
			try {
				return Double.valueOf((String) obj);
			} catch (Exception e) {
			}
		}

		return null;
	}

	public static Integer retrieveIntValue(Map<String, Object> mapObject, String key) {
		Object obj = retrieveObject(mapObject, key);

		if (obj instanceof Integer) {
			return (Integer) obj;
		}

		if (obj instanceof Long) {
			return ((Long) obj).intValue();
		}
		try {
			return Integer.valueOf(obj.toString());
		} catch (Exception ee) {
			
		}
		return null;
	}

	public static Long retrieveLongValue(Map<String, Object> mapObject, String key) {
		Object obj = retrieveObject(mapObject, key);

		if (obj instanceof Long) {
			return (Long) obj;
		}

		if (obj instanceof Integer) {
			return ((Integer) obj).longValue();
		}

		return null;
	}

	public static Date retrieveDateValue(Map<String, Object> mapObject, String key) {
		Object obj = retrieveObject(mapObject, key);

		if (obj instanceof Date) {
			return (Date) obj;
		}

		return null;
	}

	public static String retrieveStringValue(Map<String, Object> mapObject, String key, String defaultValue) {
		String value = retrieveStringValue(mapObject, key);
		return (value != null) ? value : defaultValue;
	}

	public static Integer retrieveIntValue(Map<String, Object> mapObject, String key, Integer defaultValue) {
		Integer value = retrieveIntValue(mapObject, key);
		return (value != null) ? value : defaultValue;
	}

	public static Double retrieveDoubleValue(Map<String, Object> mapObject, String key, Double defaultValue) {
		Double value = retrieveDoubleValue(mapObject, key);
		return (value != null) ? value : defaultValue;
	}

	public static Boolean retrieveBooleanValue(Map<String, Object> mapObject, String key, Boolean defaultValue) {
		Boolean value = retrieveBooleanValue(mapObject, key);
		return (value != null) ? value : defaultValue;
	}

	private static Object retrieveObject(Map<String, Object> mapObject, String key) {
		if ((mapObject == null) || (key == null)) {
			return null;
		}

		return mapObject.get(key);
	}

	/**
	 * 支付宝使用 除去数组中的空值和签名参数
	 * 
	 * @param sArray
	 *            签名参数组
	 * @return 去掉空值与签名参数后的新签名参数组
	 */
	public static Map<String, String> paraFilter(Map<String, String> sArray) {
		Map<String, String> result = new HashMap<String, String>();
		if (sArray == null || sArray.size() <= 0) {
			return result;
		}
		for (String key : sArray.keySet()) {
			String value = sArray.get(key);
			if (value == null || value.equals("") || key.equalsIgnoreCase("sign")
					|| key.equalsIgnoreCase("sign_type")) {
				continue;
			}
			result.put(key, value);
		}
		return result;
	}

	/**
	 * 把数组所有元素排序，并按照“参数=参数值”的模式用“&”字符拼接成字符串
	 * 
	 * @param params
	 *            需要排序并参与字符拼接的参数组
	 * @return 拼接后字符串
	 */
	public static String createLinkString(Map<String, String> params) {
		List<String> keys = new ArrayList<String>(params.keySet());
		Collections.sort(keys);
		String prestr = "";
		for (int i = 0; i < keys.size(); i++) {
			String key = keys.get(i);
			String value = params.get(key);
			if (i == keys.size() - 1) {// 拼接时，不包括最后一个&字符
				prestr = prestr + key + "=" + value;
			} else {
				prestr = prestr + key + "=" + value + "&";
			}
		}
		return prestr;
	}
}
