public class OperationOn2DArr {
    int[][] arr = null;

    //constructor
     public OperationOn2DArr(int row, int col){
        this.arr = new int[row][col];
        for(int i=0;i< arr.length;i++){
            for(int j=0;j< arr[i].length;j++){
            arr[i][j] = Integer.MIN_VALUE;
            }
        }
    }

    public  void traverseArray(){
         try {
             for(int i=0;i< arr.length;i++){
                 for(int j=0;j< arr[i].length;j++){
                     System.out.println(arr[i][j]+" ");

                 }
                 System.out.println();
             }
             System.out.println("\n");
         }catch (Exception e){
             System.out.println("array doesnt exist");
         }
    }
    public  void insertIntoArray(int row, int col, int value){
        try {
            if(arr[row][col] == Integer.MIN_VALUE){
                arr[row][col] = value;
            }
            else{
                System.out.println("Place is occupied");
            }

        }catch (Exception e){

        }
    }
    public  void accessingSingleCell(int row, int col){
        try {
            System.out.println("cell value is " +arr[row][col]);


        }catch (Exception e){
            System.out.println("invalid cell value");
        }
    }
    public  void searchingSingleValue(int value){

            for(int i=0;i< arr.length;i++){
                for(int j=0;j< arr[i].length;j++){
                   if(arr[i][j] == value){
                       System.out.println("value foud at "+arr[i][j]);
                       return;
                   }
                }

            }
        System.out.println("value not exist");

    }
    public  void deleteValueFromCell(int row, int col){
        try {
            System.out.println("delete from cell value " +arr[row][col]);
            arr[row][col] = Integer.MIN_VALUE;

        }catch (Exception e){
            System.out.println("invalid cell value");
        }
    }
    public  void deleteEntireArr(){
        arr = null;
        System.out.println("Deleted entire array");
    }

}
