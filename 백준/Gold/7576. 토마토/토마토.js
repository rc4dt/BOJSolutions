let fs = require("fs");
let [[m,n],...arr] = fs.readFileSync(0).toString().trim().split("\n").map(x=>x.split(" ").map(Number));

let move = [[1,0],[0,1],[-1,0],[0,-1]];
let queue = [];
let nextQueue = [];
let days = 0;


arr.forEach((row, i)=>
  row.forEach((tomato, j)=>{
    if(tomato == 1){
      queue.push([i,j]);
    }
  })
);

while (queue.length > 0){
  nextQueue = [];
  queue.forEach(([x,y])=>{
    move.forEach(([dx,dy])=>{
      let newX = x+dx;
      let newY = y+dy;
      if(newX>=0 && newX<n && newY>=0 && newY<m && arr[newX][newY] == 0){
        arr[newX][newY] = 1;
        nextQueue.push([newX,newY]);
      }
    });
  });
  queue = nextQueue;
  if(queue.length > 0){
    days++;
  }
  
}

let complete = arr.every((row)=> row.every(x=> x != 0));

if(complete){
  console.log(days);
}else{
  console.log(-1);
}