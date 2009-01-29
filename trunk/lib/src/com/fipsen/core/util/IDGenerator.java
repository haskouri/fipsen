package com.fipsen.core.util;

import java.util.Random;

public class IDGenerator 
{
	public static String generateOID(String prefix)
	{
		Random random = new Random();
		long rand = (random.nextLong() & 0x7FFFFFFFFFFFFFFFL) | 0x4000000000000000L;
		return prefix + Long.toString(rand, 32) + Long.toString(System.currentTimeMillis() & 0xFFFFFFFFFFFFFL, 32);
	}
}
