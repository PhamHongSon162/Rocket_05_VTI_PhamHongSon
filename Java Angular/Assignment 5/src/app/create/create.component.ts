import { Component, Input, OnInit } from '@angular/core';
import { FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-create',
  templateUrl: './create.component.html',
  styleUrls: ['./create.component.scss']
})
export class CreateComponent implements OnInit {

  @Input() item;

  favoriteColorControl = new FormControl("");
  favoriteColor: string = "test tmp";

  // profileForm = new FormGroup({ 
  //   firstName: new FormControl(""), 
  //   lastName: new FormControl(""),
  // }); 

  profileForm = new FormGroup({ 
    firstName: new FormControl("", [Validators.required, Validators.minLength(4)]), 
    lastName: new FormControl(""),
    address: new FormGroup({ 
      city: new FormControl(""), 
      street: new FormControl("")
    })
  }); 

  // get firstName() { return this.profileForm.get('firstName'); }

  // Test validate
  userInfo = {
    userName: '',
    password: ''
  };
  usernamePattern = /^[a-z]{6,32}$/i;

  constructor(private fb: FormBuilder) { }

  ngOnInit(): void {
    this.setValue();

    // this.profileForm = this.fb.group({
    //   firstName: [
    //     "",
    //     [
    //       Validators.required,
    //       Validators.minLength(4),
    //       Validators.pattern(this.usernamePattern)
    //     ]
    //   ]
    // });
  }

  setValue() {
    this.favoriteColorControl.setValue("test reactive form");
  }

  updateFormValue() {
    this.favoriteColorControl.setValue("update value reactive form");
  }

  onSubmitForm() {
    console.log(this.profileForm.value); 
  }

  testBtn() {
    console.log("test btn");
  }


}
