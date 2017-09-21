# Virtual Pet Shelter

So, you have some experience under your belt in the care and feeding of a virtual pet. It's time to share that with the community! Time to volunteer!

## Setup

- [ ] Create a Java project in Eclipse named `virtual-pet-shelter`.
- [ ] Create a README.md file in your project folder to describe what you've done with your project. No fancy formatting is necessary. Just separate paragraphs with an empty line. (If you'd like to learn more about Markdown formatting, check out the [Github Markdown Guide](https://guides.github.com/features/mastering-markdown/).)
- [ ] Create a GitHub repository also named `virtual-pet-shelter` and set it up so that you can push your code there from your Eclipse project. Do this *now*. It's the least fun part, so just get it out of the way.
- Create the following classes:
	- [ ] `VirtualPet`: You can start with your class from last week's assignment or create another.
	- [ ] `VirtualPetShelter`: Homeless virtual pets need a place to stay.
	- [ ] `VirtualPetShelterApp`: This class will house your `main` method, and be responsible for reading user input and writing output to the console.

## Details

We're going to create an application that simulates you taking care of the pets in a shelter.

Include a game loop in this project, too. It should query the user, then call the appropriate method(s) on `VirtualPetShelter` and/or `VirtualPet`.

### Example Interactions

```bash
Thank you for volunteering at Big Al's Virtual Pet Shelter and Delicatessen!

This is the status of your pets:

Name	|Hunger	|Thirst	|Boredom
--------|-------|-------|-------
Joey	|83     |34     |23
Johnny	|69     |49     |2
Dee Dee	|39     |18     |88
Tommy	|59     |19     |37

What would you like to do next?

1. Feed the pets
2. Water the pets
3. Play with a pet
4. Adopt a pet
5. Admit a pet
6. Quit
```

#### Example Pet Selection Interaction

```bash
Ok, so you'd like to play with a pet. Please choose one:

[Joey] looks like he's seen better days.
[Johnny] is a bit nervous.
[Dee Dee] probably didn't start with that many legs.
[Tommy] smells like a Stargazer lily fresh with morning dew.

Which pet would you like to play with?
Tommy

Ok, you play with Tommy.
```

## Required Tasks

### VirtualPetShelterApp class

- Create a `main` method that…
	- [ ] implements a *game loop*.
	- [ ] asks for user input.
	- [ ] writes output to the console.
	- [ ] calls `VirtualPetShelter`'s `tick` method after each interaction

- Available user interface actions should include (at minimum)…
	- [ ] feeding all the pets
	- [ ] watering all the pets
	- [ ] playing with an individual pet, which should display a list of pet names and descriptions, allowing a user to select one
	- [ ] allow adoption of a pet, which should display a list of pet names and descriptions, allowing a user to select one
	- [ ] allow intake of a pet, prompting the user for the pet's information, requiring the user to (at minimum) specify name and description

	(*Hint: you can use tab characters ("\t") to align console output in columns.*)

### VirtualPetShelter class

- [ ] include appropriate instance variable(s) to store the pets who reside at the shelter
- [ ] include methods that:
	- [ ] return a `Collection` of all of the pets in the shelter
	- [ ] return a specific `VirtualPet` given its name
	- [ ] allow intake of a homeless pet
	- [ ] allow adoption of a homeless pet
	- [ ] feed all of the pets in the shelter
	- [ ] water all of the pets in the shelter
	- [ ] plays (or performs some other interaction(s)) with an individual pet in the shelter
- [ ] include a `tick` method that calls the `tick` method for each of the pets in the shelter, updating their needs

### VirtualPet class
	
In addition to the requirements from [last week's project](../virtual-pet):
- include instance variables representing:
	- [ ] name
	- [ ] description
- include a constructor that accepts a name and description
- include a constructor that, in addition to name and description, accepts default values for the pet's attributes (hunger, boredom, etc)

Do **not** include a default (zero arguments) constructor.

## Stretch Tasks

- [ ] Consider any stretch tasks from last week's project that you did not attempt.
- [ ] Keep track of the cleanliness of individual pets' cages and offer an option in the user interface to clean pet cages
- [ ] DNA! In order to give your pets individual character, include as part of each pet's state one or more multipliers for needs so that one pet may become hungrier/thirstier/more bored slower/faster than another pet. (*Tip: you could create a class to encapsulate this.*)
