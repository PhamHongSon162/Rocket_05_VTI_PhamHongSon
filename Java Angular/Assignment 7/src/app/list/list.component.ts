import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AppService } from '../app.service';

@Component({
  selector: 'app-list',
  templateUrl: './list.component.html',
  styleUrls: ['./list.component.scss']
})
export class ListComponent implements OnInit {

  item;
  itemDetail;

  products;

  constructor(private router: Router,
    private appService: AppService
    ) { 

      this.item = {
        "id": "",
        "name": "name 1",
        "price": 28,
        "quantity": 86
      }

  }

  ngOnInit(): void {

    this.getList();

    // this.getProducts();

  }

  // Promise
  getList() {
    this.products = [];
    this.appService.get().then(response => {
      console.log("getList, res: ", response);
      this.products = response;
    })
    .catch(error => {

    })
  }


  // Observable
  getProducts() {
    this.products = [];
    this.appService.getProducts().subscribe( res => {
      console.log("getProducts: ", res);
    });
  }

  add() {
    this.appService.save(this.item).then(res => {
      console.log("add product, result: ", res)
      // Success
      // Thành công sẽ xử lý ở đây
      this.products.push(res);
    })
    .catch(err => {
      // Sẽ xử lý lỗi ở đây
    })
  }

  save(index) {
    const itemUpdate = this.products.find(element => element.id == index);
    console.log("sửa  tại vị trí: ", index);
    this.appService.update(itemUpdate).then( res => {
      // Success
      this.products.splice(index, 1, res);
    })
  }

  delete(index) {
    console.log("xóa tại vị trí: ", index);
    this.appService.delete(index).then( res => {
      // Success
      this.products.splice(index, 1);
    })
  }

  detail(obj) {
    console.log("item detail: ", obj);
    this.itemDetail = obj;

    // this.router.navigate(['/detail/' + obj.id]);
  }

}
