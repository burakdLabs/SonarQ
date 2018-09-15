package com.findbugs.examples;

import java.math.BigDecimal;

public class BigValues {
	double d = 1.1;

	BigDecimal bd1 = BigDecimal.valueOf(d);
	BigDecimal bd2 = BigDecimal.valueOf(1.1);
	
	BigDecimal bd3 = BigDecimal.valueOf(d);
	BigDecimal bd4 = BigDecimal.valueOf(1.1);

}
