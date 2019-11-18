import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-binding',
  templateUrl: './binding.component.html',
  styleUrls: ['./binding.component.css']
})
export class BindingComponent implements OnInit {
  inputData;
  flag=false;
name='shani';
imgURL='https://cdn.pixabay.com/photo/2019/09/20/23/50/sand-4492764__340.jpg';
  constructor() {
    setInterval( () =>
      {
        this.flag = !this.flag;
      },1000);
   }

   eventoccured(input){
  console.log(input.value);
}
  ngOnInit() {
  }

}
