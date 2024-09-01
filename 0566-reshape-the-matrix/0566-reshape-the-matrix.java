class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m=mat.length, n=mat[0].length, k=0, l=0;
        if(m*n!=r*c) return mat;
        int[][] newMat = new int[r][c];
        for(int i=0; i<r; i++) {
            for(int j=0; j<c; j++) {
               newMat[i][j] = mat[k][l];
                if(l==n-1) k++;
                l=(l+1)%n;
            }
        }
        return newMat;
    }
}


// 0 0 - 0 0
// 0 1 - 0 1
// 0 2 - 1 0
// 0 3 - 1 1