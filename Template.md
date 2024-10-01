**TEMPLATE**

> Template Method is a behavioral design pattern that defines
the skeleton of an algorithm in the superclass but lets
subclasses override specific steps of the algorithm without
changing its structure i.e sequence of operations/functions not changed


**EXAMPLE**

> World me koi bhi Ordering kre, there is a Fixed way of Ordering.. **Select Product -> MakePayment -> Delievery method selection** <br>
This is the common Skeleton for Ordering. Also in this, the sequence of functions can also be not changed. This is **TEMPLATE**

> TEMPLATE ==> Same Skeleton with fixed sequence of functions/processes.


**APPLICABILITY**

> Use the Template Method pattern when you want to let clients
extend only particular steps of an algorithm, but not the whole
algorithm or its structure.

> Reducing Duplicate codes, Variation in Step, Inversion of Control (subclass function call from base class)

> Refactoring to Generalize

