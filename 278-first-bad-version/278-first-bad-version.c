// The API isBadVersion is defined for you.
// bool isBadVersion(int version);

int firstBadVersion(int n) {
 
    int lo = 1 , hi = n, mid;
    while(lo < hi){
        mid = lo + ((hi-lo) >>1);
        isBadVersion(mid) ? (hi = mid) : (lo = mid+1);
    }
    
    return hi;
}