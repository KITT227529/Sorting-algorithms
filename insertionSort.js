const insertionSort = (Nums) => {

    for(let i = 1; i < Nums.length; i++){
        const temp = Nums[i];
        let j = i;

        while(j > 0 && Nums[j - 1] > temp){
            Nums[j] = Nums[j - 1];
            j--;
        }

        Nums[j] = temp;
    }

    return Nums;
}

console.log(insertionSort([29, 10, 50, 37, 14]));