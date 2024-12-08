class InsertionSort{

    public static void main(String[] args){

        int[] Nums = {5, 1, 6, 2, 4, 3};
        int temp, j;

        for(int i = 1; i < Nums.length; i++){

            temp = Nums[i];
            j = i;

            while(j > 0 && Nums[j-1] > temp){
                Nums[j] = Nums[j-1];
                j = j-1;
            }

            Nums[j] = temp;
        }

        for(int i = 0; i < Nums.length; i++){
            System.out.print(Nums[i] + " ");
        }

    }
}