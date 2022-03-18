import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title: String= 'My first app in angular';
  fname: String="Sai";
  lname: String="Ram";
  url: String="http://www.google.com";
  image: String="./assets/image/rose.webp"
  h:number=100;
  w:number=150;
  message="you clicked on this button";
  flag=false;
  showme(){
    this.flag=!this.flag;
  }
  products=[
    {name:"Pencil",price:10.45,available:"09-03-2022",rating:4.5},
    {name:"Eraser",price:5.3,available:"03-03-2022",rating:4.0},
    {name:"Pen",price:15.00,available:"01-02-2022",rating:4.7},
    {name:"Scale",price:25,available:"01-03-2022",rating:3.5}
  ]
}
