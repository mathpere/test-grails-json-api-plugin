package test.json.api

class Author {

    String firstName
    String lastName

    static hasMany = [books: Book]

    static apiConfig = [
            nestedFields: ["books"],
            customFields: [
                    searchBarToken: { "${it.firstName} ${it.lastName}"},
                    searchBarToken2: { "${it.firstName} ${it.lastName} (2)"}
            ]
    ]

}