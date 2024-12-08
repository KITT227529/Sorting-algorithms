class SelectionSort{

    public static void main(String[] args){

        int[] Nums = {38, 52, 9, 18, 6, 62, 13};
        int min, temp = 0;

        for(int i = 0; i < Nums.length; i++){

            min = i;
            for(int j = i+1; j < Nums.length; j++){

                if(Nums[j] < Nums[min]){
                    min = j;
                }
            }

            temp = Nums[i];
            Nums[i] = Nums[min];
            Nums[min] = temp;
        }

        for(int i = 0; i < Nums.length; i++){
            System.out.print(Nums[i] + " ");
        }
    }
}