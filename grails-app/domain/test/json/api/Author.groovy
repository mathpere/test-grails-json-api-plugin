package test.json.api

class Author {

    String firstName
    String lastName

    static hasMany = [books: Book]

    def getSearchBarToken1() {
        "${firstName} ${lastName}"
    }


    def getSearchBarToken2() {
        "${firstName} ${lastName}"
    }


    def getSearchBarToken3() {
        "${firstName} ${lastName}"
    }


    static apiConfig = [
            includes: ["books", "searchBarToken2"]
    ]

}