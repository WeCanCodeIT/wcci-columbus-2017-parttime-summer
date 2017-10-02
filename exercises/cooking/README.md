# Now we're cooking!

## Project Setup

1. Create a Java Project in Eclipse. (I'm using `cooking` as its name in my examples.)
1. Add the JUnit library to your project.
1. Create a new folder called `test`.
  - Right click on your project name (`cooking` in my case), then New->Folder.
  - Specify `test` for `Folder name:`.
  - Click `Finish`.
1. Add this folder as a source folder.
  - Open your project's properties. (Right click on the project name, then choose `Properties`.)
  - Select `Java Build Path` in the left pane.
  - Click on the `Source` tab.
  - Click on the `Add Folder…` button.
  - Check the box to select `test`.
  - Click the `OK` button.
  - Click the `Apply and Close` button.
1. Create a `cooking` package in your test folder.
  - Right click on the test folder.
  - Select `New->Package`.
  - Specify `cooking` for `Name:`.
  - Click `OK`.

## Adding Tests

You will find the tests [here](./test/cooking). I'm using strange names for classes and tests here to express the order in which you should complete them. Also, the tests will seem a bit odd. Some of them are more simple than you'd expect; others may use unfamiliar code. Just work out how to make them pass!
