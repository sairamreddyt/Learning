import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor() { }
  getUser()
  {
      return {name:"sairam",email:"sairam@gmail.com",address:"A.P"};
  }
}
