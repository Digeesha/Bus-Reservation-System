import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

import { Observable } from 'rxjs';
import { reservation } from './reservation';


@Injectable({
  providedIn: 'root'
})
export class ReservationService {



  private baseURL = "http://localhost:8080/api/v1/Reservations";

  constructor(private httpClient: HttpClient) { }

  getReservationsList(): Observable<reservation[]>{
    return this.httpClient.get<reservation[]>(`${this.baseURL}`);
  }

  addReservation(Reservation: reservation): Observable<Object>{
    return this.httpClient.post(`${this.baseURL}`, Reservation);
  }

  getReservationById(id: number): Observable<reservation>{
    return this.httpClient.get<reservation>(`${this.baseURL}/${id}`);
  }


  updateReservation(id: number, Reservation: reservation): Observable<Object>{
    return this.httpClient.put(`${this.baseURL}/${id}`, Reservation);
  }

  deleteReservation(id: number): Observable<Object>{
    return this.httpClient.delete(`${this.baseURL}/${id}`);
  }


}
