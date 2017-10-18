# Professional Portfolio

## Overview

Create a portfolio site highlighting your work that can be shared with potential employers. Focus first on building a good structure, then later style and lay out with with CSS.

## Tasks

First, set up your *username*.github.io site as per the instructions at https://pages.github.com.

### Build the document structure

- Create a main page (`index.html`) representing a professional portfolio, including the following:

  - an appropriate `<header>` element
  - a `<nav>` element linking to each of the sections
  - an `<h1>` element with your page title (*there can be only one*)
  - a `<section>` element for each of the following, each of which should contain an appropriate heading element:
    - *About Me*, consisting of:
      - brief biographical information
      - photo
      - contact information
      - links to your professional networking site profiles, including at least GitHub and LinkedIn
      - list of skills

        Include whatever other information you consider pertinent.

    - *Projects*, consisting of at least three, each represented as an `<article>`
      - name of project, linked to GitHub repository or the repository/project's GitHub Pages
      - screenshot
      - skills / technologies used

        Don't worry that your available projects are limited now. You'll have time to increase the size of your portfolio.

  - an appropriate `<footer>` element

### Lay out and style your portfolio

- Assign ids/classes to sections/etc, then use css grid to lay out your page. Reference MDN and this tutorial to work out how to use grid: http://cssgridgarden.com/
- To contain the elements of your grid, you will want to create a `<div>`, something like `<div id="container">...</div>`.
- Create CSS rules to style page elements appropriately.

### Using online resources

Any resources (images, etc) you use should be:
  - free for non-commercial use
  - copied to your repository and referenced there rather than via a uri pointing to another site

## Tips

- Section ids can be used to create anchors linking to those sections inside the page.
- See the appropriate Mozilla Developer Network reference pages for guidance regarding tag usage:
  - [&lt;header&gt;](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/header)
  - [&lt;nav&gt;](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/nav)
  - [&lt;section&gt;](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/section)
  - [&lt;article&gt;](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/article)
  - [&lt;footer&gt;](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/footer)
