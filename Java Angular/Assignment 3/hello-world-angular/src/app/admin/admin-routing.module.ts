import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { AdminComponent } from './admin.component';
import { AdminProductListComponent } from './admin-product-list/admin-product-list.component';
import { AdminProductDetailComponent } from './admin-product-detail/admin-product-detail.component';

const routes: Routes = [{ path: '', component: AdminComponent },
  { path: 'list', component: AdminProductListComponent },
  { path: 'detail', component: AdminProductDetailComponent }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class AdminRoutingModule { }
