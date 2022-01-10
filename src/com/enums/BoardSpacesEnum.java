package com.enums;

public enum BoardSpacesEnum {
    EMPTY_CELL("   "),
    HAS_SHIP_INSIDE(" N "),
    HITTED_SHIP(" * "),
    HITTED_WATER(" - ");

    private String type;

    BoardSpacesEnum(String type) {
        this.type = type;
    }

    public String setCellType() {
        return type;
    }
}
