package com.endava.soa_5.generic;

import static com.endava.soa_5.generic.GenericArray.printList;

public class Main {
    public static void main(String[] args) {
        String[] strArray = {"Apple", "Orange", "Kiwi", "Potato", "Tomatoes"};
        Character[] charArray = {'c', 39, 47, 'D'};
        Integer[] intArray = {1, 2, 3, 4, 5, 666, 66, 23, 2};

        printList(strArray);
        printList(charArray);
        printList(intArray);


        Library<Music> music = new Library<>();
        music.createNewMedia(new Music("Muzon", 1, 2.36));
        System.out.println(music.getObject());
        System.out.println("#############################################");

        Library<Book> book = new Library<>();
        book.createNewMedia(new Book("Abcedar", 343, 0.23));
        System.out.println(book.getObject());
        System.out.println("#############################################");


        Library<Book> books = new Library<>();
        books.createNewMedia(new Book("Java 8", 999, 0.9993));
        System.out.println(book.getObject());
        System.out.println("#############################################");


        Library<NewsPaper> newsPaper = new Library<>();
        newsPaper.createNewMedia(new NewsPaper("Abc", 999, 0.9993, true));
        System.out.println(book.getObject());

        Library library = new Library();
        library.addMediaToTheLibraryList(book);
        library.addMediaToTheLibraryList(music);
        library.addMediaToTheLibraryList(books);
        library.addMediaToTheLibraryList(newsPaper);
        System.out.println("Selected media by name is " + library.selectMediaByName("Abc"));
    }

}
