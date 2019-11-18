import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { TechElevateComponent } from './tech-elevate/tech-elevate.component';
import { HomeComponent } from './home/home.component';
import { AboutComponent } from './about/about.component';
import { ContactUsComponent } from './contact-us/contact-us.component';
import { RegisterComponent } from './register/register.component';
import { LoginComponent } from './login/login.component';


const routes: Routes = [
  {path:'',component:TechElevateComponent},
  {path:'',component:HomeComponent},
  {path:'about', component:AboutComponent},
  {path:'contact-us',component:ContactUsComponent},
  {path:'register',component:RegisterComponent},
  {path:'login',component:LoginComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
