var x=[1234,'shsmi',true,{name:'srk'}];
console.log(x[0]);


for(var i=0;i< x.length;i++)
{
    console.log(x[i]);
}

var co=['blue','red','yellow','black'];
console.log(co);
    co.pop();
    console.log(co);
    co.push('violet','pink');
    console.log(co);
    co.shift();
    console.log(co);
    co.unshift('purpule','black');
    console.log(co);
    co.splice(2,2);
    console.log(co);
    co.splice(1,'indigo','orange','indigo black');
    console.log(co);

//call back function
    function test(cb){
        console.log('test function started');
        cb();
        console.log('test functin ended');

    }

    test(function( ){
        console.log('callback fuction being executed');
    });




//set time out
    setTimeout(function (){
console.log('10 sec done')
    },10000);



    //for each
    co.forEach(function(value,index, array)
    {
        console.log(value,index,array);
    });


    //indexof
    console.log(co.indexOf('red'));




    // filter array
var  myArray=[1,0,1,1,0,2,1,0,3,1,1,0,1,2,0,3,4,5,4,5,9];
    var X=myArray.filter(function(value){
        return value>110;
    });
    console.log(x);

    //no duplication array element
var filterdArray=myArray.filter(function(value,index,array){
    return array.indexOf(value)===index;
});
console.log(filterdArray);

// = =  =
if(123==='123')
{
    console.log('true');
}
else{
   console.log('false');
}

//for of loop==elements prented separately
for (var x of myArray){
    console.log(x);
}

for (var index in myArray){
    console.log(co[index]);
}



var  movie={
    name:'pk',
    actor:'aamir khan',
actress:'anushka'
};

for(var key in movie){
    console.log(key +": "+movie[key] );
}

   


