import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule, OutletContext } from '@angular/router';

import { AppComponent } from './app.component';
import { TechElevateComponent } from './tech-elevate/tech-elevate.component';
import { HomeComponent } from './home/home.component';
import { AboutComponent } from './about/about.component';
import { ContactUsComponent } from './contact-us/contact-us.component';
import { RegisterComponent } from './register/register.component';
import { LoginComponent } from './login/login.component';
import { CardComponent } from './card/card.component';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';
import { HeaderComponent } from './header/header.component';

@NgModule({
  declarations: [
    AppComponent,
    TechElevateComponent,
    HomeComponent,
    AboutComponent,
    ContactUsComponent,
    RegisterComponent,
    LoginComponent,
    CardComponent,
    PageNotFoundComponent,
    HeaderComponent
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot([
      { path: '', component: TechElevateComponent },
      { path: '', component: HomeComponent },
      { path: 'about', component: AboutComponent, children:[
        {path:'card', component:CardComponent}] },
        { path: 'contact-us', component: ContactUsComponent },
      { path: 'register', component: RegisterComponent },
      { path: 'login', component: LoginComponent },
      {path:'**', component:PageNotFoundComponent}
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }


