public class dublicatearr {
    public static void main(String[] args) {
        int arr[]={23,34,54,23,2,4,2,5,32,23,45,34,52};
        int count=0;
    for(int i=0;i<arr.length;i++){
    
        for(int j=i+1;j<arr.length;j++){
            if(arr[i]==arr[j])
            count=count+1;
            System.out.println("The number "+arr[i]+" is repeating at index "+j);
        }
    }
     System.out.println("The number repeating at "+count+" times");
    
        
            

        }
    }