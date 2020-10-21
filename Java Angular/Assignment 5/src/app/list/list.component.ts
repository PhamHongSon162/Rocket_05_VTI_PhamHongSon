import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-list',
  templateUrl: './list.component.html',
  styleUrls: ['./list.component.scss']
})
export class ListComponent implements OnInit {

  item;
  itemDetail;

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

  constructor(private router: Router) { 

  }

  ngOnInit(): void {
  }

  add() {
    this.items.push(this.item);
  }

  save(index) {
    console.log("sửa  tại vị trí: ", index);
    this.items.splice(index, 1, this.item);
  }

  delete(index) {
    console.log("xóa tại vị trí: ", index);
    this.items.splice(index, this.item);
  }

  detail(obj) {
    console.log("item detail: ", obj);
    this.itemDetail = obj;

    // this.router.navigate(['/detail/' + obj.id]);
  }

}
