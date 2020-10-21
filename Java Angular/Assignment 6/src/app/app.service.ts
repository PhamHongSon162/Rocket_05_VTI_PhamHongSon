import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { environment } from 'src/environments/environment';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AppService {

  baseUrl;

  constructor(private http: HttpClient
  ) { 
    this.baseUrl = environment.API;
  }

  // Promise
  get() {
    return new Promise((resolve, reject) => {
      this.http.get(this.baseUrl).subscribe(response => {
          resolve(response);
      }, err => {
        reject(err);
      })
    });
  }

  // Observable
   getProducts(): Observable<any> {
    return this.http.get(this.baseUrl)
      .pipe(
        // TODO
      );
  }

  save(obj) {
    return new Promise((resolve, reject) => {
      this.http.post(this.baseUrl, obj).subscribe((result) => {
        resolve(result)
      }, err => {
        reject(err)
      })
    });
  }

  update(obj){
    let url = this.baseUrl.concat('/', obj.id);
    return new Promise((resolve, reject) => {
      this.http.put(url, obj).subscribe((result) => {
        resolve(result)
      }, err => {
        reject(err)
      })
    });
  }

  delete(id){
    let url = this.baseUrl.concat('/', id);
    return new Promise((resolve, reject) => {
      this.http.delete(url).subscribe((result) => {
        resolve(result)
      }, err => {
        reject(err)
      })
    });
  }

}
