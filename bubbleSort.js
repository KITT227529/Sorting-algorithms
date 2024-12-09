const bubbleSort = (Nums) => {

    for(let i = 0; i <= Nums.length; i++){

        for(let j = 0; j <= Nums.length-i-1;j++){

            if(Nums[j] > Nums[j + 1]){
                [Nums[j], Nums[j + 1]] = [Nums[j + 1], Nums[j]];
            }
        }
    }

    return Nums;
};

console.log(bubbleSort([29, 10, 50, 37, 14]));