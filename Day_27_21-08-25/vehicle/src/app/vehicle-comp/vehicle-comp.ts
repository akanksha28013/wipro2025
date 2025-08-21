import { ChangeDetectorRef, Component } from '@angular/core';
import { VehicleService } from '../vehicle-service';
import { IVehicle } from '../ivehicle';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-vehicle-comp',
  imports: [CommonModule,FormsModule],
  templateUrl: './vehicle-comp.html',
  styleUrl: './vehicle-comp.css'
})
export class VehicleComp {

constructor(private vehicleService:VehicleService, private cdr:ChangeDetectorRef) { }

  vehicles: IVehicle[] = [];
  vehicleEdit: IVehicle = {
    id: '',
    make: '',
    fuelType: '',
    model: '',
    price:''
  };
  vehicleAdd: IVehicle = {
    id: '',
    make: '',
    fuelType: '',
    model: '',
    price:''
  };

  ngOnInit() {
  this.vehicleService.getVehicles().subscribe((data: IVehicle[]) => {
    console.log('Data received:', data); // Check if data is received on refresh
    this.vehicles = data;
    this.cdr.detectChanges();
    console.log('Vehicles fetched successfully:', this.vehicles);
  }, (error) => {
    console.error('Error fetching users:', error);
  });
}

  edit(vehicleId: string) {
    console.log('Edit vehicle with ID:', vehicleId);
    this.vehicleService.getVehiclesById(vehicleId).subscribe((vehicle: IVehicle) => {
      console.log('Vehicle details:', vehicle);
      this.vehicleEdit = vehicle;
      console.log('Vehicle for editing:', this.vehicleEdit);
       this.cdr.detectChanges();
    }, (error) => {
      console.error('Error fetching vehicle by ID:', error);
    });
  }
update() {
  console.log('Updating vehicle:', this.vehicleEdit);
    this.vehicleService.saveVehicles(this.vehicleEdit).subscribe((updatedVehicle: IVehicle) => {
      console.log('User updated successfully:', updatedVehicle);
      const index = this.vehicles.findIndex(vehicle => vehicle.id === updatedVehicle.id);
      if (index !== -1) {
        this.vehicles[index] = updatedVehicle;
      }
      this.vehicleEdit = {
        id: '',
        make: '',
        fuelType: '',
        model: '',
        price:''
      };
      this.cdr.detectChanges();
      this.ngOnInit();
    }, (error: any) => {
      console.error('Error updating user:', error);
    });
}
  vehiclesEdit(vehicleEdit: any) {
    throw new Error('Method not implemented.');
  }

delete(vehicleId: string) {
  this.vehicleService.deleteVehicles(vehicleId).subscribe(() => {
    console.log('Vehicle deleted successfully:', vehicleId);
    this.vehicles = this.vehicles.filter(vehicle => vehicle.id !== vehicleId);
    this.cdr.detectChanges();
    this.ngOnInit();
  }, (error) => {
    console.error('Error deleting vehicle:', error);
  });


}

save(){

  console.log("saving data-"+this.vehicleAdd)
  this.vehicleService.saveVehicles(this.vehicleAdd).subscribe((newVehicle: IVehicle) => {
    console.log('User saved successfully:', newVehicle);
    this.vehicles.push(newVehicle);
    this.vehicleAdd = {
      id: '',
      make: '',
      fuelType: '',
      model: '',
      price:''
    };
    this.cdr.detectChanges();
  }, (error) => {
    console.error('Error saving vehicle:', error);
  });

}
}
