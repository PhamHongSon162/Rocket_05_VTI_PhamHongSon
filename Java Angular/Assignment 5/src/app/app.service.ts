import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { rejects } from 'assert';
import { resolve } from 'dns';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class AppService {
  baseUrl;

  constructor(private http: HttpClient) { 
    this.baseUrl = environment.API
  }
  get () {
    return new Promise((resolve, reject) => {
      this.http.get(this.baseUrl).subscribe(Response => {
        resolve(Response);

      }, err => {
        rejects(err);
      })
    });
  }
  save(obj){
    return new Promise((resolve, reject) => {
      this.http.post(this.baseUrl,obj).subscribe(Response => {
        resolve(Response);

      }, err => {
        rejects(err);
      })
    });
  
}
update(obj){
  return new Promise((resolve, reject) => {
    this.http.put(this.baseUrl,obj).subscribe(Response => {
      resolve(Response);

    }, err => {
      rejects(err);
    })
  });

}
delete(obj) {
  return new Promise((resolve, reject) => {
    this.http.delete(this.baseUrl,obj).subscribe(Response => {
      resolve(Response);

    }, err => {
      rejects(err);
    })
  });

}
}