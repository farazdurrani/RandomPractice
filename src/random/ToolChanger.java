package random;

import java.util.Arrays;
import java.util.List;

public class ToolChanger {
    public static void main(String[] args) {
	List<String> tools = Arrays.asList("ballendmill", "keywaycutter", "slotdrill", "facemill");
	int k = 0;
	String q = "facemill";
	int result = toolchanger(tools, k, q);
	System.out.println("Result is: " + result);
    }

    public static int toolchanger(List<String> tools, int k, String q) {

	int forward = -1;
	int backward = -1;

	int i = k + 1;
	int j = 0;
	while (j < tools.size()) {
	    j++;
	    if (i >= tools.size()) {
		i = 0;
	    }
	    if (tools.get(i).equals(q)) {
		forward = j;
		break;
	    }
	    i++;
	}

	i = k - 1;
	j = 0;
	while (j < tools.size()) {
	    j++;
	    if (i < 0) {
		i = tools.size() - 1;
	    }
	    if (tools.get(i).equals(q)) {
		backward = j;
		break;
	    }
	    i--;
	}

	return forward < backward ? forward : backward;

    }
}
