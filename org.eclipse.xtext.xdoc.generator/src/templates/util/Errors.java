package templates.util;

public class Errors {
	public static void throwUnsupportedOperation(String message, Object thisParam) {
		throw new UnsupportedOperationException(message+" not supported for object "+thisParam);
	}
}
