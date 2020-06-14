package com.company;

import static java.lang.Math.*;

/**
 * @description:
 * @author: MSI-NB
 * @date: Created in 2020/6/10 14:43
 * @version: ${VERSION}
 * @modified By:
 */
public class Utils {

	public static int randomChop(int min,int max){

		return (int)(random()*(max-min)+min);
	}
}
