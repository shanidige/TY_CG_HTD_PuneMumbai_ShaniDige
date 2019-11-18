var student = /** @class */ (function () {
    function student(name, age, marks, degree, id) {
        this.name = name;
        this.age = age;
        this.marks = marks;
        this.degree = degree;
        this.id = id;
    }
    return student;
}());
// create an object with new keyword
var student1 = new student('ram', 33, 11);
console.log(student1);
//student1.printdetails();
//create an object using literals
var student2 = {
    name: 'shani',
    age: 21,
    marks: 75.78
};
console.log(student2);
var students = [
    new student('ram', 34, 45),
    {
        name: 'shani',
        age: 21,
        marks: 75.78
    },
    student2,
    student1
];
for (var _i = 0, students_1 = students; _i < students_1.length; _i++) {
    var student_1 = students_1[_i];
    console.log(student_1);
}
