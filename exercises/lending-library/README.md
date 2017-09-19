# Lending Library

We're going to create an app that simulates a lending library (like the public library with which you're familiar). We will create an interface that allows adding books. We will categorize books by ISBN and by category, allowing a user to look up books either by ISBN or category. Also, we will allow members to check out books.

## Classes

At minimum, we will create the classes `LibraryApp`, `Library`, `Book`, and `Member`.

### LibraryApp

This class should handle all of the user input and output, displaying a menu to allow for:
	- adding a `Book`
	- adding a `Member`
	- looking up a `Book` by ISBN
	- looking up a `Book` by category
	- allow a `Member` to check out a book (or don't if the book is already checked out)

### Library

This class should manage `Book`s and `Member`s. It will contain the methods called by `LibraryApp` to carry out user actions.

### Book

At minimum, `Book` should contain instance variables that represent the following:

- title
- author
- ISBN

### Member

At minimum, `Member` should contain instance variables that represent the following:

- name
- address
- library card number

# Stretch Goals

- Allow for multiple authors of a book.
- Allow a book to be placed in multiple categories.
- Account for multiple copies of the same title (same ISBN).
- Allow the user to search for books by author, title, or synopsis. (You'll need to add the latter.) *Hint: use methods on `String` to search for matches.*
- Store the date when a book is checked out.
	- *Stretchier*: ask the user for check in date and figure out whether a fee should be applied.