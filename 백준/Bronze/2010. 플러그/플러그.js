let fs = require("fs");
let input = fs.readFileSync(0).toString().trim().split("\n").map(Number);

const loop = Number(input.shift());

let sum = 0;

for(let i = 0; i<loop; i++){
    sum += input[i];
}

console.log(sum-(input.length-1));