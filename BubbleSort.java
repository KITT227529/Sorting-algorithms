class BubbleSort{

    public static void main(String[] args){

        int[] Nums = {36, 19, 29, 12, 5};

        int a;
        for(int i = 0; i < Nums.length; i++){

            for(int j = 0; j < Nums.length-1; j++){

                if(Nums[j] > Nums[j + 1]){
                    a = Nums[j];
                    Nums[j] = Nums[j+1];
                    Nums[j+1] = a;
                }
            }
        }

        for(int i = 0; i < Nums.length; i++){
            System.out.print(Nums[i] + " ");
        }

    }
}