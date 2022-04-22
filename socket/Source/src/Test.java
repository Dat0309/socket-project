import tags.Decode;
import tags.Tags;

public class Test {

	@org.junit.Test
	public void test() {

		String s = Decode.getMessage(Tags.CHAT_MSG_OPEN_TAG + "msg" + Tags.CHAT_MSG_CLOSE_TAG);
		System.out.println(s);
	}

}
