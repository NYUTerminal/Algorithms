package leetcode;
import java.util.*;

public class CourseSchedule2 {

	public static void main(String[] args) {
		CourseSchedule2 cs = new CourseSchedule2();
		int[][] prerequisites = { { 0, 1 } };
		cs.findOrder(2, prerequisites);
	}

	enum Status {
        NEW,
        VISITING,
        VISITED
    }
    List<List<Integer>> adj;
    int[] res;
    Status[] visited;
    int rc;
    boolean cycle = false;

    public int[] findOrder(int numCourses, int[][] prerequisites) {
        res = new int[numCourses];
        rc = 0;
        if (numCourses == 0) return res;
        visited = new Status[numCourses];
        buildAdjacencyList(numCourses, prerequisites);
        for (int i = 0; i < numCourses; i++) topoSort(i);
        return cycle ? new int[0] : res;
    }

    void topoSort(int cur) {
        if (visited[cur] == Status.VISITED || cycle) return;
        if (visited[cur] == Status.VISITING) {
            cycle = true;
            return;
        }
        visited[cur] = Status.VISITING;
        for (int i = 0; i < adj.get(cur).size(); i++) {
            if (cycle) return;
            topoSort(adj.get(cur).get(i));
        }
        res[rc++] = cur;
        visited[cur] = Status.VISITED;
    }

    void buildAdjacencyList(int numCourses, int[][] prerequisites) {
        adj = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }
        for (int i = 0; i < prerequisites.length; i++) {
            adj.get(prerequisites[i][0]).add(prerequisites[i][1]);
        }
    }
}
