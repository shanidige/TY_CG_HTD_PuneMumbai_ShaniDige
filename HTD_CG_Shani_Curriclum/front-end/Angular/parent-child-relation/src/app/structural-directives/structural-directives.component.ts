import { Component, OnInit } from '@angular/core';

import { Student } from '../student';
@Component({
  selector: 'app-structural-directives',
  templateUrl: './structural-directives.component.html',
  styleUrls: ['./structural-directives.component.css']
})
export class StructuralDirectivesComponent implements OnInit {
  person='sam';
  flag=false;
students: Student [] =[
  {
    id:1,
    name:'sam',
    age: 21,
    degree:'BE'
  },
  {
    id:2,
    name:'ram',
    age: 22,
    degree:'BTECH'
  },
  {
    id:3,
    name:'jam',
    age: 23,
    degree:'BSC'
  },
  {
    id:4,
    name:'om',
    age: 24,
    degree:'B.pharm'
  },
  {
    id:5,
    name:'raju',
    age: 25,
    degree:'BE-etrx'
  },
  {
    id:6,
    name:'ranu',
    age: 22,
    degree:'BE-etrx'
  }
]

  constructor() { 
   setTimeout(()=>{
  this.flag=true;
   },2000);}


   deleteStudent(student :Student){
     const index=this.students.indexOf(student);
     this.students.splice(index,1);
   }

  ngOnInit() {
  }

}
