class SolutionForsumOfSeries {
    long sumOfSeries(long n) {
        if(n==1)
        return 1;
        return n*n*n+sumOfSeries(n-1);
        
    }
}
