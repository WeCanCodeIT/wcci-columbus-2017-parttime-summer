# Virtual Pet

Create a virtual pet. Bonus points if it becomes a fad!

## Setup

- [ ] Create a Java project in Eclipse named `virtual-pet`.
- [ ] Create a README.md file in your project folder to describe what you've done with your project. No fancy formatting is necessary. Just separate paragraphs with an empty line. (If you'd like to learn more about Markdown formatting, check out the [Github Markdown Guide](https://guides.github.com/features/mastering-markdown/).)
- [ ] Create a GitHub repository also named `virtual-pet` and set it up so that you can push your code there from your Eclipse project. Do this *now*. It's the least fun part, so just get it out of the way.

## Classes
- [ ] create a `VirtualPet` class.
- [ ] create a `VirtualPetApp` class with a `main` method.


## Details

Create a virtual pet application. This is your version of a Tamagotchi or DigiPet! This might seem like a daunting task, but we can break it down.

Think of which instance variables and methods you will need. We give suggestions below. Remember that instance variables represent the state of your pet. Methods represent the behavior of your pet, which would include its responses to you feeding or playing with it.

Most games include what is called a *game loop*, a loop which updates everything in the game, representing the passage of time. We exit this loop when something happens that should cause the game to end. Include a `tick()` method (think clocks, not parasites) in your `VirtualPet` class representing the passage of a unit of time. This should do things like update instance variables of `VirtualPet` that are time dependent, such as hunger or thirst. You should call the `tick()` to represent the passage of time after each interaction with the user.

### Ideas

Attributes (instance variables) that a virtual pet might have, along with some ideas for activities (methods) that might address them are:

- hunger (feed it)
- thirst (water it)
- waste (let it out to the bathroom)
- boredom (play with it)
- sickness (take it to the doctor)

Your methods should cause the appropriate instance variables to update - for instance, if you have a `feed()` method, it might make `hunger` go down, but make `thirst` go up.

Attributes that might update when `tick()` is called:
  - boredom increasing
  - hunger increasing
  - sleepiness increasing

If you play with the pet, perhaps that makes it more tired. Have fun with this part! *Tip: You can use your README.md file to keep a list of features you'd like to incorporate.*

Also, remember that more features `!=` better. Pick a focus for your pet. Maybe go with a theme.

Your user interface should live in the `main` method of the `VirtualPetApp` class. Your `VirtualPet` class should not be writing messages to the console or reading user input. These are responsibilities of the `VirtualPetApp` class.

An example user interface is below (yours doesn't need to match this!):

```
Horace the Hippo
Hunger: 27
Thirst: 5
Boredom: 5
Tiredness: 50

What do you want to do?
1. Feed Horace
2. Water Horace
3. Play with Horace
4. Put Horace to sleep
5. Do nothing

> 1

You feed Horace.
```

### Required Tasks

- VirtualPet class
  - [ ] Create a `tick()` method that represents the passage of time.
  - [ ] Create at least three instance variables (aka attributes aka properties aka fields).
  - [ ] Create at least three methods (messages you send to your pet).

- VirtualPetApp class
  - Create a `main` method that…
    - [ ] implements a *game loop*.
    - [ ] asks for user input.
    - [ ] writes output to the console.

### Grading

Here is the [rubric](./rubric.md).

### Stretch Tasks

- [ ] Give the pet the ability to take care of some of its own needs.

  Pets are not robots - they usually have some sort of self-determination! When `tick()` is called, you might want to have your pet take a look at its needs and address one, prioritizing whichever need is highest. You could also make your pet uncooperative - when the user tries to feed the pet, for example, you might make the pet refuse to eat if it is bored. Remember how we created an instance of the `Random` class to create a random number generator? You might want to incorporate that.

- [ ] Create a visual representation of your pet.

  Rather than using numbers to convey your pet's status, you could have some sort of visual representation of the pet. I.e., instead of printing `hunger: 50`, you could use smileys or [ASCII art](https://en.wikipedia.org/wiki/ASCII_art) to show hunger when `hunger >= 50`.
  
  ```
       >=<        
  ,.--'  ''-.
  (  )  ',_.'
  Xx'xX      

  Horace looks like this: :0

  1. Feed Horace
  2. Water Horace
  3. Play with Horace
  4. Put Horace to sleep
  5. Do nothing
  ```
  
- [ ] Assign favorite foods to your pet, and add a parameter specifying the type of food to the method you use to feed your pet. Your pet should react accordingly. You could also decide which foods it does *not* like.

## Hints

Don't try to tackle everything at once! Break this project up into smaller chunks, and you will find that they are all manageable.
