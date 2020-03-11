package segment.exception;

import segment.bo.Segment;

public class NotBelongToException extends Exception {
    private Segment segment;
    private int value;

    public NotBelongToException(String message) {
        super(message);
    }

    public NotBelongToException(Segment segment, int value) {
        this.segment = segment;
        this.value = value;
    }

    public Segment getSegment() {
        return segment;
    }

    public void setSegment(Segment segment) {
        this.segment = segment;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String getMessage() {
        return "une erreur est survenu sur le segment "+ segment + " avec la valeur "+ value;
    }
}
