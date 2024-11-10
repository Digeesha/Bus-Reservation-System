import { Component } from '@angular/core';
import { reservation } from '../reservation';

import { ReservationService } from '../reservation.service';
import { Router } from '@angular/router';
import { FormsModule, NgForm } from '@angular/forms';

@Component({
  selector: 'app-add-reservation',
  templateUrl: './add-reservation.component.html'
  ,
  styleUrls: ['./add-reservation.component.css']
})
export class AddReservationComponent //implements OnInit//
{

  constructor(
    private reservationService: ReservationService,
    private router: Router,

  ) {

  }



  submitform!: NgForm;
  private baseURL = "http://localhost:8080/api/v1/Reservation";
  reservation: reservation = new reservation();





  savereservation() {
    this.reservationService.addReservation(this.reservation).subscribe(data => {
      console.log(data);
      this.goToreservationList();
    },
      error => console.log(error));
  }

  goToreservationList() {
    this.router.navigate(['/show-all-reservations']);
  }

  ngOnInit(): void { }
  onSubmit() {
    console.log(this.reservation);


    this.savereservation();
  }


}









