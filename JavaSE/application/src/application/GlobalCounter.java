package application;

import java.util.concurrent.atomic.*;

public class GlobalCounter {
	public static int value;
	public static AtomicInteger aValue = new AtomicInteger(0);
}
