import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { AdminRoutingModule } from './admin-routing.module';
import { AdminComponent } from './admin.component';
import { AdminProductListComponent } from './admin-product-list/admin-product-list.component';
import { AdminProductDetailComponent } from './admin-product-detail/admin-product-detail.component';
import { AdminProductCreateComponent } from './admin-product-create/admin-product-create.component';


@NgModule({
  declarations: [AdminComponent, AdminProductListComponent, AdminProductDetailComponent, AdminProductCreateComponent],
  imports: [
    CommonModule,
    AdminRoutingModule
  ]
})
export class AdminModule { }
