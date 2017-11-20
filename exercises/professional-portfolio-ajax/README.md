# Professional Portfolio, now with AJAX!

This project builds on top of the [professional portfolio](../professional-portfolio) project.

We're going to add dynamic content to our portfolios using the GitHub API.

## Approach

You may use vanilla (core) JavaScript, jQuery, or a combination thereof. It is suggested that you use vanilla JavaScript for creating DOM elements and jQuery for AJAX initially, moving towards using vanilla js for AJAX as time and understanding allow.

## Tasks

### Required

Create a section/page on your site that lists your GitHub repositories that is populated by accessing the GitHub API via jQuery and AJAX. Establish the structure/layout of your site by building the other sections before doing this part. This section/page should:
    
- Send a GET request to retrieve your basic information (the url will look like `https://api.github.com/users/*your_username*`)
- Use the "repos_url" attribute from this response to send another GET request that retrieves information about your repositories.
- Populate a `<div>` (or another element type of your choice) with information for each repository from the response. For each repository display, at minimum:
    - its name, linking to the repository page ("name" attribute and "html_url" attribute from response)
    - its last update time ("updated_at" attribute from response)  

### Stretch

Create sections/pages with other things from your profile if you like. These can give people insight into your personality/interests. Suggestions:

|atttribute|description|
|----------|-----------|
|subscriptions_url|repositories to which you have subscribed|
|starred_url|repositories you have starred (favorited)|
|gists_url|public gists|
|following_url|users/organizations you follow|

### References

- [GitHub API v3 | GitHub Developer Guide](https://developer.github.com/v3/)