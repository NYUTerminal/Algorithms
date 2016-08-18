package leetcode;
import java.util.*;

public class CourseSchedule {

	public static void main(String[] args) {
		CourseSchedule cs = new CourseSchedule();
		int[][] prerequisites = { { 0, 1 } };
		cs.findOrder(2, prerequisites);
	}

	public boolean cycle = false;

	public int[] findOrder(int numCourses, int[][] prerequisites) {
		HashMap<Integer, List<Integer>> graph = new HashMap<Integer, List<Integer>>();
		for (int i = 0; i < prerequisites.length; i++) {
			if (graph.get(prerequisites[i][1]) != null) {
				graph.get(prerequisites[i][1]).add(prerequisites[i][0]);
			} else {
				List<Integer> newList = new ArrayList<Integer>();
				newList.add(prerequisites[i][0]);
				graph.put(prerequisites[i][1], newList);
			}
		}
		Set<Integer> visited = new HashSet<Integer>();
		Stack<Integer> stack = new Stack<Integer>();
		for (int i = 0; i < numCourses; i++) {
			if (visited.contains(i)) {
				continue;
			}
			Set<Integer> loop = new HashSet<Integer>();
			topologicalCourse(graph, visited, loop, i, stack);
		}
		if (cycle) {
			return new int[0];
		}
		int[] resultArr = new int[numCourses];
		int index = 0;
		while (!stack.isEmpty()) {
			resultArr[index] = stack.pop();
			index++;
		}
		return resultArr;
	}

	private void topologicalCourse(HashMap<Integer, List<Integer>> graph, Set<Integer> visited, Set<Integer> loop,
			int start, Stack<Integer> stack) {
		loop.add(start);
		if (visited.add(start)) {
			if (graph.get(start) != null) {
				for (Integer i : graph.get(start)) {
					topologicalCourse(graph, visited, loop, i, stack);
				}
			}
			stack.push(start);
		} else if (!loop.contains(start)) {
			cycle = true;
			return;
		}

	}
}
