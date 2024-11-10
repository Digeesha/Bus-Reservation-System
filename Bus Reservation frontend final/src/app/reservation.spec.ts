import { reservation } from './reservation';
import {ReservationService} from "./reservation.service";

describe('Reservation', () => {
  it('should create an instance', () => {
    expect(new reservation()).toBeTruthy();
  });
});
