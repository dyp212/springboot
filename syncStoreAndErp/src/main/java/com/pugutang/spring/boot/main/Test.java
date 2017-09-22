package com.pugutang.spring.boot.main;

import org.apache.commons.lang3.StringUtils;

public class Test {

	public static void main(String[] args) {
		String s = StringUtils.substringAfterLast("/KlxImg/Plat/ImageAd/201704261559589992720.png", "/");
				//StringUtils.substringBeforeLast("dskeabcee", "e");
		System.out.println(s);

	}

}
