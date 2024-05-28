package hajji.mohammed.backend.exceptions;

public class RoomAlreadyReservedException extends RuntimeException {

    public RoomAlreadyReservedException() {
        super("room already reserved");
    }
}
