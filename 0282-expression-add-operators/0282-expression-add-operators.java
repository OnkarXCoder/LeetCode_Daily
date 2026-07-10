class Solution {
    List<String> ans = new ArrayList<>();

    public List<String> addOperators(String num, int target) {
        dfs(num, target, 0, 0L, 0L, new StringBuilder());
        return ans;
    }

    private void dfs(String nums, int target, int idx,
                     long value, long prev, StringBuilder expr) {

        if (idx == nums.length()) {
            if (value == target) {
                ans.add(expr.toString());
            }
            return;
        }

        int len = expr.length();

        for (int i = idx; i < nums.length(); i++) {

            if (i > idx && nums.charAt(idx) == '0') {
                break;
            }

            String curStr = nums.substring(idx, i + 1);
            long curr = Long.parseLong(curStr);

            if (idx == 0) {
                expr.append(curStr);
                dfs(nums, target, i + 1, curr, curr, expr);
                expr.setLength(len);
            } else {

                expr.append("+").append(curStr);
                dfs(nums, target, i + 1, value + curr, curr, expr);
                expr.setLength(len);

                expr.append("-").append(curStr);
                dfs(nums, target, i + 1, value - curr, -curr, expr);
                expr.setLength(len);


                expr.append("*").append(curStr);
                dfs(nums, target, i + 1,
                    value - prev + prev * curr,
                    prev * curr,
                    expr);
                expr.setLength(len);
            }
        }
    }
}