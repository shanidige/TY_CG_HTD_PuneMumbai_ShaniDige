let myName: string='shani';
//myName=1234; error - we cannot change the datatypeExplicitly


//any
let company;// implicitly  it will be considerd as any
 company=123;
 company='nhk';
 company=true;


 //union type
 let age: String | number;
 age=12;
 age='twelve';
 //age=true;  error - only String or number can be stored


 //tuple type
 let details:[string, number,number]=['shani',234,567];


 //array generic
 let mobiles:string[]=['iphone','samsung','234','true'];

 //function
 function add(a:number,b:number):number{
     return a+b;
 }
