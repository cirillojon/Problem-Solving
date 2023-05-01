class Solution {
    public double average(int[] salary) {
        return Arrays.stream(salary)
                .sorted()
                .skip(1)
                .limit(salary.length - 2)
                .average()
                .orElse(Double.NaN);
    }
}