let person={
    name:'samanata',
    age:30
};

let student={
    ... person,
    percentage: 55.55
};
console.log(student);

 let{name,age,...restValues}= student;
 
 console.log(restValues);
 


// let mumbaiCRS=['akash','aishwariya'];
// let noidaCRS=['kartik','manali'];
// let bangloreCRS=['yasmin','shahid'];
// let bhuvneshwarCRS=['kaushik', 'nisha'];
// let CRS=[
//     ...mumbaiCRS,
//     ...noidaCRS,
//     ...bangloreCRS,
//     ...bhuvneshwarCRS
// ];
// console.log(CRS);

// let[name1,nme2,name3,...restValues]=CRS;
// console.log(name1);
// console.log(name2);
// console.log(name3);
// console.log(restValues);
