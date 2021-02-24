package com.endava.soa_5.page_objects;

public enum CategoryEnum {
    ALL("All"),
    BOOKS("Books"),
    COMPUTERS("Computers"),
    DESKTOPS("Computers >> Desktops"),
    NOTEBOOKS("Computers >> Notebooks"),
    ACCESSORIES("Computers >> Accessories"),
    ELECTRONICS("Electronics"),
    CAMERA_PHOTO("Electronics >> Camera, photo"),
    CELL_PHONES("Electronics >> Cell phones"),
    APPAREL_SHOES("Apparel & Shoes"),
    DIGITAL_DOWNLOADS("Digital downloads"),
    JEWELRY("Jewelry"),
    GIFT_CARDS("Gift Cards");

    String category;

    public String getCategory() {
        return category;
    }

    CategoryEnum(String category) {
        this.category = category;
    }
}
