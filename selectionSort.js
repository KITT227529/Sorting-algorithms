const selectionSort = (Nums) => {

    for(let i = 0; i < Nums.length; i++){

        let minIndex = i;

        for(let j = i+1; j < Nums.length; j++){

            if(Nums[j] < Nums[minIndex]){
                minIndex = j;
            }
        }

        if(minIndex != i){
            [Nums[i], Nums[minIndex]] = [Nums[minIndex], Nums[i]];
        }
    }

    return Nums;
}

console.log(selectionSort([29, 10, 50, 37, 14]));