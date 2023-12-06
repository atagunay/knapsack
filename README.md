# The Knapsack Problem

The Knapsack problem is an optimization problem that deals with filling up a knapsack with a bunch of items such 
that the value of the Knapsack is maximized. Formally, the problem statement states that, given a set of items, 
each with a weight and a value, determine the items we pack in the knapsack with a constrained maximum weight that 
the knapsack can hold, such the the total value of the knapsack is maximum.

# Steps

![flowchart](https://user-images.githubusercontent.com/4745789/156874170-608cd9a4-6241-4882-b123-658d14a64c89.png)

## 1. Picking Individuals
For our knapsack problem, this representation is pretty simple and straightforward; every individual is an n-bit string 
where each bit correspond to an item from the n items we have.

![individuals](https://user-images.githubusercontent.com/4745789/156770627-e6cc63e9-72b7-4afa-a968-60e994963a26.png)

## 2. Fitness Coefficient
Now that we have our initial population randomly chosen, we define a fitness coefficient 
that would tell us how fit an individual from the population is.

It might be two values:

* **0 (zero)** : if the total weight of the item picked is greater than the weight that the knapsack can hold.
* **Total Value** : if the total weight of the item picked is less than the weight that the knapsack can hold.

![fitness](https://user-images.githubusercontent.com/4745789/156890925-13e0f1bf-ec4a-40fe-8d48-60d867cdacae.png)

## 3. Selection
One good selection criteria is Tournament Selection, which randomly picks two individuals and runs a virtual tournament. 
The one having the higher fitness coefficient wins.

![selection](https://user-images.githubusercontent.com/4745789/156891433-13a356c7-d219-4a33-b7b3-423cdf10b910.png)

## 4. Crossover
Crossover is an evolutionary operation between two individuals, and it generates children having some parts from each parent.

![crossover](https://user-images.githubusercontent.com/4745789/156891548-bfafdc41-0158-4146-b6c6-b9d14d2c536a.png)

## 5. Mutation 
The mutation is an evolutionary operation that randomly mutates an individual.

![image](https://user-images.githubusercontent.com/4745789/156822218-716ea60d-4d6b-434e-9112-26cba6c93b2c.png)

## 6. Reproduction
Reproduction is a process of passing an individual as-is from one generation to another without any mutation or crossover.

https://user-images.githubusercontent.com/4745789/156825824-8cac7164-f526-47fd-958b-d24eba11c08a.png

## 7. Termination Condition
We can continue to generate generations upon generations in search of the optimal solution, but we cannot go indefinitely, 
which is where we need a termination condition. A good termination condition is deterministic and capped. For example, we will at max go up to 500 or 1000 generations or until we get the same Average Fitness Coefficient for the last 50 values.

# References

* https://arpitbhayani.me/blogs/genetic-knapsack/