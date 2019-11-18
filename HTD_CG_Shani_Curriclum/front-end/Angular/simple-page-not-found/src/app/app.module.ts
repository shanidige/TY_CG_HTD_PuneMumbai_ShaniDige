import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';

import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { HomeComponent } from './home/home.component';
import { ContactUsComponent } from './contact-us/contact-us.component';
import { LoginComponent } from './login/login.component';
import { AboutComponent } from './about/about.component';
import { RegisterComponent } from './register/register.component';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';
import { CarsComponent } from './cars/cars.component';
import { BikesComponent } from './bikes/bikes.component';
import { PlanesComponent } from './planes/planes.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    HomeComponent,
    ContactUsComponent,
    LoginComponent,
    AboutComponent,
    RegisterComponent,
    PageNotFoundComponent,
    CarsComponent,
    BikesComponent,
    PlanesComponent
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot([
      { path: '', component: HomeComponent },
      { path: 'contact-us', component: ContactUsComponent },
      { path: 'login', component:LoginComponent },
      { path: 'about', component:AboutComponent  ,children:[
                    { path: 'cars',component: CarsComponent },
                    { path: 'bikes',component: BikesComponent },
                    { path: 'planes',component: PlanesComponent }]},
      { path: 'register', component: RegisterComponent },
      {path: '**', component: PageNotFoundComponent},
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
