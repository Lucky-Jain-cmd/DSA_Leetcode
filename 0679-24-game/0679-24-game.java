class Solution {
    public boolean judgePoint24(int[] cards) {
        // Create a list of doubles from the input ints
        List<Double> list = new ArrayList<>();
        for (int c : cards) {
            list.add((double) c);
        }
        return backtrack(list);
    }

    private boolean backtrack(List<Double> nums) {
        // base case: only one number in the list
        if (nums.size() == 1) {
            // check if that number is close to 24
            return Math.abs(nums.get(0) - 24.0) < 1e-6;
        }

        // try every pair of numbers
        for (int i = 0; i < nums.size(); i++) {
            for (int j = 0; j < nums.size(); j++) {
                if (i == j) continue;
                
                List<Double> next = new ArrayList<>();
                // put the remaining numbers in 'next'
                for (int k = 0; k < nums.size(); k++) {
                    if (k != i && k != j) {
                        next.add(nums.get(k));
                    }
                }

                // a and b are the chosen two numbers
                double a = nums.get(i);
                double b = nums.get(j);

                // addition
                next.add(a + b);
                if (backtrack(next)) return true;
                next.remove(next.size() - 1);

                // subtraction (a - b)
                next.add(a - b);
                if (backtrack(next)) return true;
                next.remove(next.size() - 1);

                // multiplication
                next.add(a * b);
                if (backtrack(next)) return true;
                next.remove(next.size() - 1);

                // division (a / b) if b is not zero
                if (Math.abs(b) > 1e-6) {
                    next.add(a / b);
                    if (backtrack(next)) return true;
                    next.remove(next.size() - 1);
                }
            }
        }
        return false;
    }
}