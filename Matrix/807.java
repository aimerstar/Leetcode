/ * 
  * 找出各行列最大值 減去原本陣列 相差數加總
  * /
class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
		int[] rowMax = new int[grid.length];
		int[] colMax = new int[grid.length];
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				if (grid[i][j] > rowMax[i]) {
					rowMax[i] = grid[i][j];
				}
				if (grid[i][j] > colMax[j]) {
					colMax[j] = grid[i][j];
				}
			}
		}
		int ans = 0;
        for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				if (rowMax[i] <= colMax[j] && rowMax[i] > grid[i][j]) {
					ans += (rowMax[i]-grid[i][j]);
				}
				if (rowMax[i] > colMax[j] && colMax[j] > grid[i][j]) {
					ans += (colMax[j]-grid[i][j]);
				}
			}
        }
        return ans;
    }
}
