import { Component, OnInit } from '@angular/core';
import { Bike } from '../bike';

@Component({
  selector: 'app-bikes',
  templateUrl: './bikes.component.html',
  styleUrls: ['./bikes.component.css']
})
export class BikesComponent implements OnInit {

bikes: Bike[]=[
    {
    brand:'Royal Enfield',
    imgURL:'https://cdn.pixabay.com/photo/2018/07/01/11/42/royal-enfield-3509231__340.jpg',
    model:'classic',
    price: 160000,
    specs:`Lorem ipsum dolor sit amet consectetur adipisicing elit.
     Assumenda consequuntur deleniti doloribus ipsam tempora magnam soluta, eligendi 
     iure amet voluptatem aspernatur officia nesciunt laboriosam? Numquam, voluptas! Consequatur 
     laboriosam consequuntur `
  },
  {
    brand:'jawa Enfield',
    imgURL:'https://cdn.pixabay.com/photo/2016/04/07/06/53/bmw-1313343__340.jpg',
    model:'morden',
    price: 80000,
    specs:`Lorem ipsum dolor sit amet consectetur adipisicing elit.
     Assumenda consequuntur deleniti doloribus ipsam tempora magnam soluta, eligendi 
     iure amet voluptatem aspernatur officia nesciunt laboriosam? Numquam, voluptas! Consequatur 
     laboriosam consequuntur `
  },
  {
    brand:'tvs ',
    imgURL:'https://cdn.pixabay.com/photo/2017/12/29/05/58/sport-3046819__340.jpg',
    model:'morden',
    price: 60000,
    specs:`Lorem ipsum dolor sit amet consectetur adipisicing elit.
     Assumenda consequuntur deleniti doloribus ipsam tempora magnam soluta, eligendi 
     iure amet voluptatem aspernatur officia nesciunt laboriosam? Numquam, voluptas! Consequatur 
     laboriosam consequuntur `
  }
]

selectedBike: Bike= this.bikes[0];


  constructor() {}
    selectBike(bike){
      this.selectedBike= bike;
    }
  

  ngOnInit() {
  }

}
