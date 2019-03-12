package com.withoutLambda;

import java.util.Comparator;

public class NumberOwnSorting implements Comparator<Integer> {
	@Override
	public int compare(Integer I1, Integer I2) {
		return I1 > I2 ? -1 : I1 < I2 ? +1 : 0;
	}
}
