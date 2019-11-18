import { Component, OnInit, OnDestroy } from '@angular/core';
import { FormGroup, Validators, FormControl } from '@angular/forms';
import { CustomValidator } from './custom.validator';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit, OnDestroy {
 get email() {
   return this.registerForm.get('email');
 }
 get password() {
  return this.registerForm.get('password');
}

  constructor() {
    console.log('runnuing');
  }

registerForm = new FormGroup({
  email: new FormControl('', [Validators.required, Validators.email, Validators.minLength(8),
    CustomValidator.noSpace]),
  password: new FormControl('', [ Validators.required, Validators.minLength(6)])
});


printForm(registerForm) {
  console.log(registerForm);
  console.log(registerForm.value);
}
  ngOnInit() {
    console.log('ngOnInit');
  }

  ngOnDestroy() {
    console.log('ngOnDestroy');
  }

}
