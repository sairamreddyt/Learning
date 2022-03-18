import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-pipedemo',
  templateUrl: './pipedemo.component.html',
  styleUrls: ['./pipedemo.component.css']
})
export class PipedemoComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }
  name:string="My Name is Sairam";
  pi:number=3.1415927;
  a=0.12345;
  b=9876.5432;
  today=new Date();
  object={name:"Sairam",email:"sairam@gmail.com",address:"A.P"};
  cust:string="welcome to the world of custom pipes"
}