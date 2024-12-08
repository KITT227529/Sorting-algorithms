class HeapSort{

    public static void main(String[] args){

        int[] Nums = {22, 13, 17, 11, 10, 14, 12};
        HeapSort hs = new HeapSort();
        hs.sort(Nums);
        hs.printNums(Nums);
    }

    void sort(int[] Nums){

        int length = Nums.length;

        for(int i = length/2-1; i >= 0; i--){
            heapify(Nums, length, i);
        }

        for(int i = length - 1;i >= 0; i--){
            int temp = Nums[0];
            Nums[0] = Nums[i];
            Nums[i] = temp;

            heapify(Nums, i, 0);
        }
    }

    void heapify(int[] Nums, int n, int i){

        int largest = i;
        int li = 2*i+1;
        int ri = 2*i+2;

        if(li < n && Nums[li] > Nums[largest]){
            largest = li;
        }

        if(ri < n && Nums[ri] > Nums[largest]){
            largest = ri;
        }

        if(largest != i){
            int temp = Nums[i];
            Nums[i] = Nums[largest];
            Nums[largest] = temp;
            heapify(Nums, n, largest);
        }
    }

    void printNums(int[] Nums){

        for(int i = 0; i < Nums.length; i++){
            System.out.print(Nums[i] + " ");
        }
    }
}