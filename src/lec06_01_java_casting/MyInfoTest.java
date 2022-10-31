package lec06_01_java_casting;

public class MyInfoTest {
	// you will not use it for coding, just extra information
	// In Constructor, the system can't recognize byte and short type, so we need to do casting for that
	public static void main(String[] args) {
		MyInfo myInfo1 = new MyInfo();
		MyInfo myInfo2 = new MyInfo("Mohammad Sharkar", (byte)127, (short)32445, 376482364, 7658736472686l, 1.679f, 3.67568346, 'M', true);

	}

}
