package test.json.api

class Book {

    String title
    Date releaseDate
    String isbn
    String text

    static hasMany = [comments: Comment]

    // essai
    static apiConfig = [
            excludes: ["text"],
            config1: ["comments"]
    ]

}