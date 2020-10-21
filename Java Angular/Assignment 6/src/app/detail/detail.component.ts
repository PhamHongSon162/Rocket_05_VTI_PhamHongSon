import { Component, Input, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-detail',
  templateUrl: './detail.component.html',
  styleUrls: ['./detail.component.scss']
})
export class DetailComponent implements OnInit {

  @Input() item;

  constructor(
    private router: Router,
    private route: ActivatedRoute
  ) { }

  ngOnInit(): void {

    // Get query params
    this.route.queryParams.subscribe(params => { 
      console.log("queryParams: ", params);
    });

    // Get param
    this.route.params.subscribe(params => {
      console.log("params: ", params);
      if(params['id']) {
        this.getItemByID(params['id']);
      } else {
        this.item = {
          // TODO
        }
      }
    });
  }

  getItemByID(id = 1) {
    // call server get data
    this.item = {
      id: 1,
      name: "dat",
      age: 20
    }
  }

}
