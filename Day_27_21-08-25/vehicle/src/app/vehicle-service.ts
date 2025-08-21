import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { IVehicle } from './ivehicle';

@Injectable({
  providedIn: 'root'
})
export class VehicleService {
  saveVehicle(userEdit: any) {
    throw new Error('Method not implemented.');
  }
  constructor(private http:HttpClient) { }


  getVehicles():Observable<IVehicle[]> {
    return this.http.get<IVehicle[]>('http://localhost:3000/vehicles');
  }

  getVehiclesById(vehicleId:string):Observable<IVehicle> {
    return this.http.get<IVehicle>('http://localhost:3000/vehicles/' + vehicleId);
  }

  updateVehicles(vehicle: IVehicle): Observable<IVehicle> {
    return this.http.put<IVehicle>(`http://localhost:3000/vehicles/${vehicle.id}`, vehicle);
  }

  deleteVehicles(vehicleId: string): Observable<void> {
    return this.http.delete<void>(`http://localhost:3000/vehicles/${vehicleId}`);
  }

  saveVehicles(vehicle: IVehicle): Observable<IVehicle> {
    let vehicleSave:Partial<IVehicle>= {
        make: vehicle.make,
        fuelType: vehicle.fuelType,
        model: vehicle.model,
        price: vehicle.price
    };
    return this.http.post<IVehicle>('http://localhost:3000/vehicles', vehicleSave);
  }
  
}
