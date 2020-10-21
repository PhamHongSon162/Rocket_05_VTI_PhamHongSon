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

    this.route.queryParams.subscribe(params => { 
      console.log("params: ", params);
      window.scrollTo(0, 0);
    });

    this.getItemByID();
  }

  getItemByID() {
    let id = 1;
    // call server get data
    this.item = {
      id: 1,
      name: "dat",
      age: 20
    }
  }

}
