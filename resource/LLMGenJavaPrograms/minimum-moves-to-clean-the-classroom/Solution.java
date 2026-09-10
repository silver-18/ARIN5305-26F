import java.util.*;

class Solution {
    public int minMoves(String[] classroom, int energy) {
        int rows = classroom.length;
        int cols = classroom[0].length();

        int startX = -1, startY = -1;
        int litterCount = 0;

        // First pass: find start and count litter
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                char c = classroom[i].charAt(j);
                if (c == 'S') {
                    startX = i;
                    startY = j;
                } else if (c == 'L') {
                    litterCount++;
                }
            }
        }

        // Map each litter to a bit index
        int[][] litterIndex = new int[rows][cols];
        for (int[] row : litterIndex) Arrays.fill(row, -1);
        int idx = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (classroom[i].charAt(j) == 'L') {
                    litterIndex[i][j] = idx++;
                }
            }
        }

        int fullMask = (1 << litterCount) - 1;

        if (litterCount == 0) return 0;

        // best[x][y][mask] = max energy seen at this state
        int[][][] best = new int[rows][cols][1 << litterCount];
        for (int[][] a : best) for (int[] b : a) Arrays.fill(b, -1);

        // BFS queue: {x, y, energy, mask}
        Queue<int[]> queue = new LinkedList<>();
        int startMask = 0;
        // Check if start is on litter (unlikely but possible)
        queue.offer(new int[]{startX, startY, energy, startMask});
        best[startX][startY][startMask] = energy;

        int steps = 0;
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int s = 0; s < size; s++) {
                int[] cur = queue.poll();
                int x = cur[0], y = cur[1], en = cur[2], mask = cur[3];

                if (mask == fullMask) return steps;

                for (int d = 0; d < 4; d++) {
                    int nx = x + dx[d];
                    int ny = y + dy[d];

                    if (nx < 0 || nx >= rows || ny < 0 || ny >= cols) continue;
                    if (classroom[nx].charAt(ny) == 'X') continue;
                    if (en <= 0) continue;

                    int newEnergy = en - 1;
                    int newMask = mask;

                    char nc = classroom[nx].charAt(ny);

                    // Refill station: restore energy to max
                    if (nc == 'R') {
                        newEnergy = energy;
                    }

                    // Collect litter
                    if (nc == 'L') {
                        int bit = litterIndex[nx][ny];
                        newMask = mask | (1 << bit);
                    }

                    // Pruning: if we've been here with >= energy and same mask, skip
                    if (best[nx][ny][newMask] >= newEnergy) continue;

                    best[nx][ny][newMask] = newEnergy;
                    queue.offer(new int[]{nx, ny, newEnergy, newMask});
                }
            }
            steps++;
        }

        return -1;
    }
}
