class QuickSort{

    public static void main(String[] args){

        int[] Nums = {15, 9, 7, 13, 12, 16, 4, 18, 11};
        int length = Nums.length;
        QuickSort qs = new QuickSort();
        qs.quickSortRecursion(Nums, 0, length-1);
        qs.printNums(Nums);
    }

    int partition(int[] Nums, int low, int high){

        int pivot = Nums[(low + high) / 2];
        while(low <= high){

            while(Nums[low] < pivot){
                low++;
            }

            while(Nums[high] > pivot){
                high--;
            }

            if(low <= high){

                int temp = Nums[low];
                Nums[low] = Nums[high];
                Nums[high] = temp;
                low++;
                high--;
            }
        }

        return low;
    }

    void quickSortRecursion(int[] Nums, int low, int high){

        int pi = partition(Nums, low, high);
        if(low < pi-1){
            quickSortRecursion(Nums, low, pi-1);
        }

        if(pi < high){
            quickSortRecursion(Nums, pi, high);
        }
    }

    void printNums(int[] Nums){

        for(int i:Nums){
            System.out.print(i + " ");
        }
    }
}