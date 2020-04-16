import java.util.Stack;
class CraneClawingGame {
    public int solution(int[][] board, int[] moves) {
        Stack<Integer> crane = new Stack<>();
        int answer = 0;
        for(int move : moves) {
            int moving = 0; 
            for(int i = 0; i < board.length; i++) {
                if(board[i][move - 1] != 0) {
                    moving = board[i][move - 1];
                    board[i][move - 1] = 0;
                    break;
                } 
            }

            if(moving != 0) {
                if(!crane.isEmpty() && crane.peek() == moving) {
                    crane.pop();
                    answer += 2;
                }
                else crane.add(moving);
            }
        }
        return answer;
    }
}