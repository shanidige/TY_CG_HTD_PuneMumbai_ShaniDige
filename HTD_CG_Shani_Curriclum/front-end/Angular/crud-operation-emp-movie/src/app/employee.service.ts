import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Employee } from './employee';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

api = 'https://fir-api-e5c9a.firebaseio.com/';

employees: Employee [] = [];

  constructor(private http: HttpClient) { }

  postData(data) {
    return this.http.post(`${this.api}employees.json`, data);
  }
getData() {
  this.http.get(`${this.api}employees.json`).subscribe(data => {
    console.log(data);
    const employeeArray = [];
    for (const key in data) {
      if (data.hasOwnProperty(key)) {
        employeeArray.push({...data[key], pk: key});
      }
    }
    this.employees = employeeArray;
    console.log(this.employees);
  });
}
deleteData(data) {
  return this.http.delete(`${this.api}employees/${data.pk}.json`);
}
putData(data) {
  return this.http.put(`${this.api}employees/${data.pk}.json`, data);

}
}
