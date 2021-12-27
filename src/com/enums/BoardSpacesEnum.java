package com.enums;

public enum BoardSpacesEnum {
    EMPTY_CELL("   "),
    HAS_SHIP_INSIDE(" N "),
    HITTED_SHIP(" * "),
    HITTED_WATER(" - ");

    private String insideText;

    BoardSpacesEnum(String insideText) {
        this.insideText = insideText;
    }

    public String getInsideText() {
        return insideText;
    }
}
