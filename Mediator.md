**MEDIATOR**

> Mediator is a behavioral design pattern that lets you reduce chaotic dependencies between objects. <br> The pattern restricts direct communications between the objects and forces them to collaborate only via a mediator object.

**EXAMPLE**

> In Online Auction System, the bidders get the notification of the current bid by the Speaker person, not directly by the Other bidder who put the current bid and now its there wish, Either to Place a higher bid or not

> Aircraft pilots don’t talk to each other directly when deciding who gets to
land their plane next. All communication goes through the control tower.


**APPLICABILTY**

>  Use Mediator when a **set of objects interact in complex ways**, and direct communication between them leads to a messy structure.

> When you need a **centralized control** point to manage communication and coordination between multiple objects.

> Event Handling

> promotes reusability by encapsulating communication logic in a central component