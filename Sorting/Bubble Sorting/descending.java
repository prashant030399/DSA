public class descending {

    public static void main(String[] args) {
        int a[] = {4,2,6,8,1,6,3,1};
        for(int i=0 ;i<a.length ; i++){
            for(int j=0 ; j<a.length -1-i ; j++){
                if(a[j]<a[j+1]){
                    a[j] = a[j] + a[j+1];
                    a[j+1] = a[j] - a[j+1];
a[j] = a[j] - a[j+1];
                }
            }
        }

        for(int i=0 ; i<a.length ; i++){
            System.out.print(a[i]+ " ");
        }

    }
    
}
