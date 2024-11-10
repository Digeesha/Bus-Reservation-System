import { Component } from '@angular/core';
import { reservation } from '../reservation';
import { Router } from '@angular/router';
import { ReservationService } from '../reservation.service';
import { ActivatedRoute } from '@angular/router';


@Component({
  selector: 'app-update-reservation',
  templateUrl: './update-reservation.component.html',
  styleUrls: ['./update-reservation.component.css']
})
export class UpdateReservationComponent {

    id: number;
  reservation: reservation = new reservation();


  constructor(private ReservationService: ReservationService,
    private route: ActivatedRoute,
    private router: Router) {
      this.id=0
    }
    //loading the data into form
  ngOnInit(): void {
    this.id = this.route.snapshot.params['id'];

    this.ReservationService.getReservationById(this.id).subscribe(data => {
      this.reservation = data;
    }, error => console.log(error));


  }

  onSubmit(){
    this.ReservationService.updateReservation(this.id, this.reservation).subscribe( data =>{
      this.goToReservationList();
    }
    , error => console.log(error));
  }

  goToReservationList(){
    this.router.navigate(['/show-all-Reservations']);
  }
}
