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

  title = 'Hello world';

  caseExp;

  itemImageUrl = "https://linkimage.png";

}
