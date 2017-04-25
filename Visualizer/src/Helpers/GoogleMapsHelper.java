package Helpers;

import Model.Settings;
import Model.topology.LatLng;
import Model.topology.LatLngBounds;
import com.lynden.gmapsfx.javascript.object.LatLong;

/**
 * Created by lajtman on 23-03-2017.
 */
public class GoogleMapsHelper {
    public static LatLng getDefaultLocation() {
        double lat = Settings.Instance().getDefaultMapLocationLatitude();
        double lng = Settings.Instance().getDefaultMapLocationLongitude();
        return new LatLng(lat, lng);
    }

    public static double distanceBetween(LatLng p1, LatLng p2) {
        LatLong first = new LatLong(p1.lat, p1.lng);
        LatLong sec = new LatLong(p2.lat, p2.lng);
        return first.distanceFrom(sec);
    }

    public static Pair<Double, Double> calculateGridSizeInMeters(LatLngBounds bounds) {
        LatLng sw = bounds.getSouthWest();
        LatLng ne = bounds.getNorthEast();
        LatLng nw = new LatLng(ne.lat, sw.lng);

        double widthOnAllCells = GoogleMapsHelper.distanceBetween(nw, ne);
        double heightOnAllCells = GoogleMapsHelper.distanceBetween(nw, sw);
        return new Pair<Double, Double>(widthOnAllCells, heightOnAllCells);
    }
}
