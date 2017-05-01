package parsers.GPSLog;

import Model.topology.LatLng;

import java.util.Comparator;
import java.util.List;

/**
 * Created by lajtman on 25-04-2017.
 */
public class GPSLogEntry implements Comparable<GPSLogEntry> {
    public GPSLogEntry(int timestamp, int nodeId, LatLng location, List<Integer> neighbors) {
        this.timestamp = timestamp;
        this.nodeId = nodeId;
        this.location = location;
        this.neighbors = neighbors;
    }

    public int timestamp;
    public int nodeId;
    public LatLng location;
    public List<Integer> neighbors;

    @Override
    public int compareTo(GPSLogEntry other) {
        return Integer.compare(timestamp, other.timestamp);
    }
}
