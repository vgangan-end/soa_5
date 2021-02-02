package com.endava.soa_5.generic;

import java.util.ArrayList;
import java.util.List;

public class Library<T extends Media> {
    T media;
    List<Library<T>> mediaList = new ArrayList<>();

    public void createNewMedia(T media) {
        this.media = media;
    }

    public T getObject() {
        return media;
    }

    public List<Library<T>> addMediaToTheLibraryList(Library<T> object) {
        mediaList.add(object);
        return mediaList;
    }

    public List<Library<T>> selectMediaByName(String anyValueOfObject) {
        List<Library<T>> newSortedList = new ArrayList<>();
        for (Library<T> obj : mediaList) {
            if (obj.media.getTitle().equals(anyValueOfObject)) {
                newSortedList.add(obj);
            }
        }
        return newSortedList;
    }

    @Override
    public String toString() {
        return media.toString();
    }
}
