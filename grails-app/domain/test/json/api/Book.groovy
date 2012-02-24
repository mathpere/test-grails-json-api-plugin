package test.json.api

class Book {

    String title
    Date releaseDate
    String isbn
    String text
    Type type

    static enum Type {
        EDUCATION, FICTION
    }

    static hasMany = [comments: Comment]

    // essai
    static apiConfig = [
            excludes: ["text"],
            config1: ["comments"]
    ]

}