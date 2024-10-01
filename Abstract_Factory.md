**ABSTRACT FACTORY DP**

> Abstract Factory is a creational design pattern that lets you
produce families of related objects without specifying their
concrete classes.

**EXAMPLE**

> Imagine you have a phone store that sells different brands of phones, such as Apple and Samsung. Each brand has its own line of models, like iPhone and Galaxy. The abstract factory pattern helps you create these families of related objects (phones) without directly specifying their concrete classes (specific models).


**APPLICABILTY**

>  When you have to work with various families of related products, but you don’t want it to depend on the concrete classes of those products—they might be unknown beforehand or you simply want to allow for future extensibility

    > Lets breakdown each one of them -->
    
    "various families of related products": 
    This refers to situations where you have different sets of objects with a common theme. For example, think of a furniture store with different brands of furniture (e.g., IKEA, Ashley) and types of furniture (e.g., chairs, tables). Each brand represents a family, and within each family, you have various related products.

    "but you don’t want it to depend on the concrete classes of those products": 
    This is the crucial point. You want your code to be able to work with any family of products without knowing the specific classes of those products. This allows for greater flexibility and extensibility.

    "they might be unknown beforehand": This means that you might not know about all the possible families of products at the time you're writing the code. The abstract factory pattern allows you to easily add new families without modifying your existing code.

    "or you simply want to allow for future extensibility": This means that you want to make it easy to add new families in the future. Even if you know all the families right now, using the abstract factory pattern will make your code more adaptable to future changes.


**USES**

1. Building user interfaces with different themes( dark/white with diff button,text styles )

2. Creating documents in different formats (word / PPT )

3. Working with different databases







