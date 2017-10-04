# Virtual Pets AMOK!

Oh noes! Your virtual pet shelter has become a mess!

Food and water and playtime aren't enough anymore. The virtual cats are chasing the virtual dogs. The virtual organic animals are letting nature take its course in every corner, while the virtual robotic pets are getting rusty. Let's just say things are piling up.

Thanks to the generosity of donors, leashes aren't an issue, so you can walk all of your virtual dogs at once. This is great, since they are less like to soil their cages if walked regularly. Did I mention dogs are in cages now? Yeah, it keeps the cats from chasing them. Better keep those cages clean.

Cats hang out in a communal area and use a common litter box. Don't even bother trying to walk them. What happens if that litter box overflows? Does it reduce pets' health?

We're introducing a health attribute for pets. Organic pets have their health decreased by unclean circumstances, and by thirst or hunger growing too high. Robotic pets only lose health if they're not oiled regularly. All pets lose health if their happiness drops too low.

## Setup

You can copy your code from the previous project to use as a starter, or start from scratch.

- [ ] Create a Java project in Eclipse named `virtual-pets-amok`.
- [ ] Create a README.md file in your project folder to describe what you've done with your project. No fancy formatting is necessary. Just separate paragraphs with an empty line. (If you'd like to learn more about Markdown formatting, check out the [Github Markdown Guide](https://guides.github.com/features/mastering-markdown/).)
- [ ] Create a GitHub repository also named `virtual-pets-amok` and set it up so that you can push your code there from your Eclipse project. Do this *now*. It's the least fun part, so just get it out of the way.

## Required Tasks

### General

- introduce ways to track:
	- [ ] cage cleanliness for organic dogs
	- [ ] shelter litter box cleanliness for organic cats
	- [ ] oil/maintenance level for robot animals

### All classes

- [ ] Encapsulate all instance variables.
- [ ] Assign appropriate visibility modifiers to methods only used internally by a class or within a class hierarchy.

### VirtualPet class and related subclasses/interfaces

In addition to the last project's requirements:

- [ ] create a model that allows for dogs and cats, either of which may be robotic
- [ ] introduce an attribute (instance variable) representing overall health that is updated as a result of other attributes moving in a negative or positive direction, influencing happiness
- introduce methods that allow for:
	- [ ] oiling robotic pets
	- [ ] walking dogs, decreasing the likelihood that organic dogs will soil their cages, while increasing happiness in all dogs
- do not allow:
	- [ ] feeding/watering robotic pets
	- [ ] oiling organic pets
- [ ] modify the `tick` method to return a value indicating the amount of waste a pet creates, which should contribute to either:
	- [ ] amount of waste in the litter box
	- [ ] amount of waste in an individual dog cage

### VirtualPetShelter class

In addition to the last project's requirements:

- introduce methods that allow for:
	- [ ] oiling/maintaining all robotic pets
	- [ ] cleaning dog cages
	- [ ] emptying the litterbox

- [ ] modify existing methods to only feed/water pets that are *not* robotic

### VirtualPetShelterApp class

In addition to the last project's requirements:

- add options to:
	- [ ] walk all dogs
	- [ ] clean dog cages
	- [ ] clean the shelter litterbox
	- [ ] oil all robotic pets

## Tips

- Remember: don't get caught up in the user interface at first. Focus on shelter/pet behavior. Try to get one thing working at a time.
- Try creating tests to verify pet behavior, limiting your immediate goal to something small.

## Stretch Tasks

- Allow for other types of pets. Are they caged? What maintenance do they require?
- Allow an option for giving treats to pets. What sorts of treats do different pets like?
- introduce a `Cage` class for each dog, where cleanliness is tracked, keying these on the dog to which each is assigned (to use a `VirtualPet` as a key in a `HashMap`, you should implement `hashCode` and `equals`)
- Herd your cats.

(*Note: the author is aware that it would not be a wise decision to allow all cats in a shelter to share a litterbox. They're virtual pets, so virtually disease-free.*)