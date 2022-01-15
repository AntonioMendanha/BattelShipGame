package com.enums;

public enum BoardTypesEnum {
    EMPTY_CELL("   "),
    HAS_SHIP_INSIDE(" N "),
    HITTED_SHIP(" * "),
    HITTED_WATER(" - ");

    private String type;

    BoardTypesEnum(String type) {
        this.type = type;
    }

    public String setCellType() {
        return type;
    }
}
