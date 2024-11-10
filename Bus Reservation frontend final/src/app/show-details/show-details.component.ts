import { Component } from '@angular/core';
import { reservation } from '../reservation';
import { ReservationService } from '../reservation.service';
import { ActivatedRoute } from '@angular/router';



@Component({
  selector: 'app-show-details',
  templateUrl: './show-details.component.html',
  styleUrls: ['./show-details.component.css']
})
export class ShowDetailsComponent {



  id: number
  reservation!: reservation
  constructor(private route: ActivatedRoute, private reservationService: ReservationService) {

    this.id=0
  }

  ngOnInit(): void {
    this.id = this.route.snapshot.params['id'];

    this.reservation = new reservation();
    this.reservationService.getReservationById(this.id).subscribe( data => {
      this.reservation = data;
    });
  }

}
