import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-root',
  // template: `
  //   Title: {{ title }}
  //   tesst template
  //   <router-outlet></router-outlet>
  // `,
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {

  constructor(private router: Router) {}

  title = 'https://linkimage.png';


  itemDetail;

  isAdmin = false;

  items = [
    {
      id: 1,
      name: "dat",
      age: 18
    },
    {
      id: 2,
      name: "tung",
      age: 18
    },
    {
      id: 3,
      name: "son",
      age: 18
    }
  ];

  testButton(event?) {
    console.log("test button click, event info: ", event);
  }

  save(index) {
    console.log("sửa  tại vị trí: ", index);
  }

  delete(index) {
    console.log("xóa tại vị trí: ", index);
  }

  detail(obj) {
    console.log("item detail: ", obj);
    this.itemDetail = obj;

    // this.router.navigate(['/detail/' + obj.id]);
  }

}
