class Solution {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int rem=arr.length/20;
        double sum=0;
        for(int i=rem;i<arr.length-rem;i++){
            sum+=arr[i];
        }
        return sum/(arr.length-2*rem);
    }
}