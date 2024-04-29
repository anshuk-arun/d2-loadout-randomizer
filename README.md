# d2-loadout-randomizer

Create an application like the website: https://www.ultimate-bravery.net/
Ultimate Bravery but for Destiny 2
aka, Destiny 2 Loadout Randomizer

# This application accesses the current Destiny 2 API, and pulls class, subclass, elements, weapons, armor, exotic information.
It will randomly choose different options and put them together as a loadout that the Guardian will have to equip in their chosen activity.
Some options are weighted, such as exotics weapons towards primary and secondary more than heavy
some options only have a chance of showing up, such as the chance of exotic armor

This will not move the itemss automatically in your inventory, it will only give you the loadout information.
The application is intended for use with friends as lowstakes fun. Use this in competitve at your own risk. 

Intended options of randomization:
/*
* Class: Hunter, Warlock, Titan 
* Subclass: Arc, Solar, Void, Stasis, Strand
* SC_Super: Left, Middle, Right
* SC_ClassAbility: One, Two, [Three]
* SC_Movement: Balanced, Speed, Direction
* SC_Melee: One, Two
* SC_Grenade: [amt] of subclass element
* SC_Aspects: chooses 2 of [amt] of subclass element
* SC_Fragments: based on aspects, gets fragments cost. picks amt of fragments prioritizing one high cost fragment

Weapons
* Primary/Kinetic
* Secondary/Energy
* Heavy
* pull from appropriate pools. maybe type/frame in mind? or just list it.
* 25% chance to select an exotic.
* - 10% to choose primary
* - 10% to choose secondary
* - 5% to choose heavy

Armor
* WILL select an exotic armor
* 25% for each of head, gauntlets, chest, legs
* maybe tags for if its more pvp centric/pve centric?
* depending on the activity selected, then will choose 75% favor towards that activity tag

Ability to focus on?
* grenade, melee, classability, aspects, fragments, etc?

/* LoL Ultimate Bravery
  and how it relates to D2 Ultimate Bravery
* 
* Maps: SummonersRift, ARAM, Arena
* is the gametype we choose.
* Strikes, Crucible, Gambit
* 
* Lvl 10
* i think this would be light level?
* either way, we mostly ignore this one
* 
* Roles: Top, Mid, Jungle, Bot, Support
* This basically chooses the pool of champions you can choose from, to an extent
* but moreso, it helps define how you're going to play.
* you can have a AP focused mid nami, or a tankier support nami
* MAYBE this could be the Subclass element? because you can be a void titan, or a solar titan.
* plus 5 on 5 matches well
* 
* Champions: there are tons of champions to choose from, and each will define the abilities available to 4
* in this case, this might be a switchup from how its expected
* there's only 3 classes. and each has soo many options underneath it.
* maybe classes should be the roles replacement
* and elements the champions replacement
* but i think this makes more sense
* 
* You can filter out ones you do/don't want of champions.
* in this case, could be you only wanna play hunter, or okay with all of them
* maybe you need to filter out strannd or stasis
* 
* Champion Caitlyn / Class Hunter
* Role Bottom / Subclass Stasis
* Main Tree, Secondary Tree / Super + Aspects for sure
* Extra helps / classAbility, grenade, melee, movement
* 
* Build of 5 items
* Boots, + 4 items
* Exotic Armor +
*      if exotic weapon, then + other 2 weapons
*      if not, the 3 weapons
* 
* Max Out Ability / build your build around ONE playstyle of build
* Starter Item they can sell for later? / Up to 1 change to anything given, except Subclass Element and Exotic Armor
* Summoner Spells Smite and Ghost / can choose any mods to help with the build
*/

/*
* Option to do it randomized with every item/gear
  option to do it with specifically your items/gear
      - requires bungie profile auth
      
*/
