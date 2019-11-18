var student={
    name:'shani',
    age:21,
    degree:'BE',
    contactNumber: 2345671239
};


console.log(student.name);
console.log(student.age);
console.log(student);

student.contactNumber=3567899;
console.log(student.contactNumber);

student.selectedcompany='capgemini';






///using object constructor  we create an object
var laptop =new Object();
laptop.brand='hp';
laptop.ram='8GB';
laptop.processer='intel';
laptop.price= 50000;

console.log(laptop);

//length of object

console.log(Object.keys(laptop).length);
console.log(Object.values(laptop).length);
