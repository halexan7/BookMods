module Agency {
    requires ToursAPI;
    provides zoo.tours.api.Tour with zoo.tours.agency.TourImpl;
}