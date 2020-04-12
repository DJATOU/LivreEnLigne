import { Component } from '@angular/core';
import { Book } from './common/book';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  books : Book[] = [ {
         
    sku: "rrr",
    name: "rrr",
    description: "rrr",
    unitPrice: 14,
    imageUrl: "rrr",
    active: true,
    unitsInStock: 100,
    createdOn: null,
    updatedOn: null,

  } ]
}
