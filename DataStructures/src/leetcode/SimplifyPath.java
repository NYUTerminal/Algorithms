package leetcode;
import java.util.Stack;

public class SimplifyPath {
	public static void main(String[] args) {
		SimplifyPath sp = new SimplifyPath();
		sp.simplifyPath("///");
	}

	public String simplifyPath(String path) {
		if (path.equals("")) {
			return "/";
		}
		String[] split = path.split("/");
		Stack<String> stack = new Stack<String>();
		if (split.length == 0) {
			return path;
		}
		for (int i = 0; i < split.length; i++) {
			if (split[i].equals(".") || split[i].equals("")) {
				continue;
			}
			if (split[i].equals("..")) {
				if (!stack.isEmpty()) {
					stack.pop();
				}
			} else {
				stack.push(split[i]);
			}
		}
		StringBuffer sb = new StringBuffer();
		while (!stack.isEmpty()) {
			sb.append(stack.pop()).append("/");
		}
		return sb.reverse().toString();
	}
}
