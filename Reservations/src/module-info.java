module Reservations {
    uses zoo.tours.api.Tour;
    requires ToursAPI;
    exports zoo.tours.reservations;
}