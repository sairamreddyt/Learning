import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Product } from './Product';

@Injectable({
  providedIn: 'root'
})
export class ProductService {
  
  url:string="http://localhost:8080/JDBCTemplate/list";
  constructor(private http:HttpClient) { }
  getProducts():Observable<Product[]>
  {
    return this.http.get<Product[]>(this.url);
  }
}
