package Sorting;

class MissingPositive {


    public static void main(String[] args) {
    int[] arr = {3,0,1};
    int result = missingNumber(arr);
        System.out.println(result);

    }




    public static int missingNumber(int[] arr) {

        int i=0;
        while(i<arr.length){
            int correct = arr[i];
            
            if(arr[i]<arr.length && arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }

        }


            for(int j=0;j<arr.length;j++){
                if(arr[j]!=arr[j]) return arr[j];
            }
            return arr.length;
        
    }

    public static void swap(int[] arr,int i,int correct){
        int temp = arr[i];
        arr[i]=arr[correct];
        arr[correct] = temp;
    }
}


