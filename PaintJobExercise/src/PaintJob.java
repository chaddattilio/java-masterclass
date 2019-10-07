public class PaintJob {

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        double area = 0.0;
        double tempBucketsNeeded = 0.0;

        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }

        area = width * height;
        tempBucketsNeeded = area / areaPerBucket;

        return (int) (Math.ceil(tempBucketsNeeded) - extraBuckets);

    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        }

        return getBucketCount(width, height, areaPerBucket, 0);

    }

    public static int getBucketCount(double area, double areaPerBucket) {
        double tempBucketsNeeded = 0.0;

        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        }

        tempBucketsNeeded = area / areaPerBucket;

        return (int) (Math.ceil(tempBucketsNeeded));
    }
}
