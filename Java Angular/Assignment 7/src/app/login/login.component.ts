import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent implements OnInit {

  //ngModel
  login = {
    username: '',
    password: ''
  };

  // Form
  loginForm = new FormGroup({ 
    username: new FormControl("", [Validators.required]), 
    password: new FormControl("", [Validators.required])
  });

  // loginForm;

  constructor(private fb: FormBuilder,
    private router: Router) { }

  ngOnInit(): void {

    // this.loginForm = this.fb.group({
    //   username: [
    //       "",
    //       [
    //         Validators.required
    //       ]
    //     ],
    //     password: [
    //       "",
    //       [
    //         Validators.required
    //       ]
    //     ]
    //   });
  }

  onSubmitForm() {

    console.log("this.loginForm.value: ", this.loginForm.value);
    console.log("this.login: ", this.login);


    if("admin" == this.login?.username && "admin" == this.login?.password) {
      console.log("login thành công");
      localStorage.setItem("username", this.login.username);
      // router to admin site
      this.router.navigate(['admin']);
    } else {
      console.log("Sai username or password");
    }

    // if("admin" == this.loginForm.value?.username && "admin" == this.loginForm.value?.password) {
    //   console.log("login thành công");
    //   localStorage.setItem("user", this.login.username);
    // } else {
    //   console.log("Sai username or password");
    // }
  }

}
