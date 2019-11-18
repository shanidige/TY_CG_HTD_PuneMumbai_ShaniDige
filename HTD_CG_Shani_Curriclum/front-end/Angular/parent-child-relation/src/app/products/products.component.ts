import { Component, OnInit } from '@angular/core';
import { Product } from '../product';


@Component({
  selector: 'app-products',
  templateUrl: './products.component.html',
  styleUrls: ['./products.component.css']
})
export class ProductsComponent implements OnInit {
products: Product [] = [{
  name: 'apple',
  imgURL: 'https://cdn.pixabay.com/photo/2017/04/03/15/52/mobile-phone-2198770_960_720.png',
  price: 60000,
  details: 'it is apple phone'
},
{
  name: 'mi',
  imgURL: 'https://cdn.pixabay.com/photo/2017/04/03/15/52/mobile-phone-2198770_960_720.png',
  price: 6000,
  details: 'it is mi phone'
},
{
  name: 'sony',
  imgURL: 'https://cdn.pixabay.com/photo/2017/04/03/15/52/mobile-phone-2198770_960_720.png',
  price: 20000,
  details: 'it is sony phone'
},
{
  name: 'htc',
  imgURL: 'https://cdn.pixabay.com/photo/2017/04/03/15/52/mobile-phone-2198770_960_720.png',
  price: 30000,
  details: 'it is htc phone'
},
{
  name: 'lg',
  imgURL: 'https://cdn.pixabay.com/photo/2017/04/03/15/52/mobile-phone-2198770_960_720.png',
  price: 60000,
  details: 'it is lg phone'
},

];
  constructor() { }

  ngOnInit() {
  }

}
