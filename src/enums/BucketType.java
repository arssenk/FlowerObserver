package enums;

/**
 * Created by arsen on 21.11.16.
 */
public enum  BucketType {
    BIRTHDAYBUCKET, FUNERALBUCKET, WEDDINGBUCKET;
    public String toString() {
        switch (this){
            case BIRTHDAYBUCKET:
                return "Birthday Bucket";
            case FUNERALBUCKET:
                return "Funeral Bucket";
            case WEDDINGBUCKET:
                return "Wedding Bucket";
            default:
                return "No wedding bucket";
        }
    }
}
