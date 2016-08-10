package org.kryptonmlt.ganderserver.utils;

/**
 *
 * @author Kurt
 */
public class GPSUtils {

    private GPSUtils() {

    }

    public static boolean isPointInCircle(double x, double y, double centerX, double centerY, double radius) {
        return (x - centerX) * (x - centerX) + (y - centerY) * (y - centerY) < radius * radius;
    }
}
