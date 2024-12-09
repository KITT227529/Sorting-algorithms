const people = [
    {name: "Koni", age: 23},
    {name: "Dave", age: 22},
    {name: "Patrik", age: 21},
    {name: "Zitus", age: 29},
];

const compareFunction = (a, b) => {

    return a.age - b.age;
}

console.log(people.sort(compareFunction));