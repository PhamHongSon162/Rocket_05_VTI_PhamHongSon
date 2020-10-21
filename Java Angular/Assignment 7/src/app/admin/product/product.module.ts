import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { ProductRoutingModule } from './product-routing.module';
import { ProductComponent } from './product.component';
import { AdminProductAddComponent } from './admin-product-add/admin-product-add.component';
import { AdminProductListComponent } from './admin-product-list/admin-product-list.component';
import { AdminProductDetailComponent } from './admin-product-detail/admin-product-detail.component';
import { ProductService } from './product.service';


@NgModule({
  declarations: [ProductComponent, AdminProductAddComponent, AdminProductListComponent, AdminProductDetailComponent],
  imports: [
    CommonModule,
    ProductRoutingModule
  ],
  providers: [
    ProductService
  ]
})
export class ProductModule { }
