import test.json.api.Book
import test.json.api.Author
import test.json.api.Comment

class BootStrap {

    def init = { servletContext ->


        def book1 = new Book(text: "the text 1", title: "the title 1", releaseDate: new Date(), isbn: "isbn 1")
        def book2 = new Book(text: "the text 2", title: "the title 2", releaseDate: new Date(), isbn: "isbn 2")
        def book3 = new Book(text: "the text 3", title: "the title 3", releaseDate: new Date(), isbn: "isbn 3")
        def book4 = new Book(text: "the text 4", title: "the title 4", releaseDate: new Date(), isbn: "isbn 4")


        [new Comment(name: "name", text: "text").save(),
                new Comment(name: "name3", text: "text3").save(),
                new Comment(name: "name4", text: "text4").save(),
                new Comment(name: "name5", text: "text5").save(),
                new Comment(name: "name6", text: "text6").save(),
                new Comment(name: "name1", text: "text1").save(),
                new Comment(name: "name2", text: "text2").save()].each {

            book1.addToComments(it)
            book2.addToComments(it)
            book3.addToComments(it)
            book4.addToComments(it)

        }

        def author1 = new Author(firstName: "firstname 1", lastName: "lastname 1").addToBooks(book1).addToBooks(book2).save()
        def author2 = new Author(firstName: "firstname 2", lastName: "lastname 2").addToBooks(book3).save()
        def author3 = new Author(firstName: "firstname 3", lastName: "lastname 3").addToBooks(book4).save()
        def author4 = new Author(firstName: "firstname 4", lastName: "lastname 4").addToBooks(book4).save()

    }

    def destroy = {
    }
}
