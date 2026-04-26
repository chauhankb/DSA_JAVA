class Solution {
    public boolean containsCycle(char[][] grid) {
        int[] row = {1, -1, 0, 0};
        int[] col = {0, 0, 1, -1};

        int n = grid.length, m = grid[0].length;
        boolean[][] visited = new boolean[n][m];

        Queue<int[]> q = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (!visited[i][j]) {
                    q.add(new int[]{i, j, -1, -1});
                    visited[i][j] = true;

                    while (!q.isEmpty()) {
                        int[] cur = q.poll();

                        for (int d = 0; d < 4; d++) {
                            int x = cur[0] + row[d];
                            int y = cur[1] + col[d];

                            if (x < 0 || y < 0 || x >= n || y >= m) continue;
                            if (grid[x][y] != grid[cur[0]][cur[1]]) continue;

                            if (x == cur[2] && y == cur[3]) continue;

                            if (visited[x][y]) return true;

                            visited[x][y] = true;
                            q.add(new int[]{x, y, cur[0], cur[1]});
                        }
                    }
                }
            }
        }
        return false;
    }
}