import { Injectable } from '@angular/core';
import {
    Router,
    CanActivate,
    ActivatedRouteSnapshot, RouterStateSnapshot
} from '@angular/router';

@Injectable({
    providedIn: 'root'
  })
export class RoleGuardService implements CanActivate {

    constructor(public router: Router
    ) { 

    }

    canActivate(route: ActivatedRouteSnapshot, state: RouterStateSnapshot): boolean {
        if("admin" == localStorage.getItem("username")) {
            return true;
        } else {
            this.router.navigate(['login']);
        }
        return false;
    }
}