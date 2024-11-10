import { Component } from '@angular/core';
import { reservation } from '../reservation';
import { ReservationService } from '../reservation.service';


import { Router } from '@angular/router';
@Component({
  selector: 'app-reservation-list',
  templateUrl: './reservation-list.component.html',
  styleUrls: ['./reservation-list.component.css']
})
export class ReservationListComponent {

  reservation: reservation[];
  EnteredID!:number;

  constructor(private ReservationService: ReservationService,  private router: Router) {
    this.reservation=[];

   }

  ngOnInit(): void {

    // this.Reservations = [
    //   { "id":1,fname: 'John', lname: 'Doe', email: 'john@example.com', salary: 50000, department: 'IT', designation: 'Developer' },

    // ];

    this.getReservations();
  }


  goToReservation(){


    console.log(this.EnteredID);
    this.router.navigate(['details-of-Reservation',this.EnteredID]);
  }

  getReservations(){
    this.ReservationService.getReservationsList().subscribe(data => {this.reservation = data;});


  }

  updateReservation(id: number){
    this.router.navigate(['updating-by-id', id]);
  }




  deleteReservation(id: number){

    if(confirm("Are you sure to delete Reservation ID: "+id)){
    this.ReservationService.deleteReservation(id).subscribe( data => {
      console.log(data);
      this.getReservations();
    })}
  }


  detailsOfReservation(id: number){
    this.router.navigate(['details-of-Reservation', id]);
  }


}
