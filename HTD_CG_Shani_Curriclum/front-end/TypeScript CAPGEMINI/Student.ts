class student{
    constructor(
      public   name:string,
      public age:number,
        public marks: number,
        public degree ?: number,
        public id ?: number){
        }
        // printdetails(){
        //     console.log(`nmae is ${this.name} age is ${this.age}  & marks are ${this.marks}`);

        // }
        
}
// create an object with new keyword
let student1= new student('ram',33,11);
console.log(student1);
//student1.printdetails();


//create an object using literals
let student2: student={
    name:'shani',
    age:21,
    marks:75.78
}
console.log(student2);




let students: student[] =[
    new student('ram',34,45),
    {
        name:'shani',
    age:21,
    marks:75.78
    },
    student2,
    student1
];

for(let student of students){
    console.log(student);
}



