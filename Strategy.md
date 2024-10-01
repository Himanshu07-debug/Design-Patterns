**STRATEGY**

> Strategy is a behavioral design pattern that lets you define a
family of algorithms, put each of them into a separate class,
and make their objects interchangeable.


**EXAMPLE**

> A buisnessman came to You with its Problem. He told that the customer come to its shop only at Sat & Sunday. So he told me to build an system where he will be giving FLAT DISCOUNT on Monday and Tuesday. After You make the App, Everything goes fine. He came again asking to add some more feature i.e Coupon Discount on Wednesday and Cashback on Friday from Bank. 

> **OBSERVE** that this all tasks are different from each other.. Aap common logic nhi likh sakte kisi ke liye bhi. So How to make CODE modular and also extendible for future use - **STRATEGY**

> Hum ek common Interface me saare Task ko implement kar denge and then Interface datatype me task ko declare krke unme switch krnge.. (CODE ki photo)

> **NOTE** -> New Strategies can be added easily


**APPLICABILTY**

> Solving only a single Problem where each task or feature will be solved in completely different way from others, we use Strategy Pattern..<br>
Inorder to solve a single Problem, there are Multiple strategies to solve it.
<br> **PAYMENT STRATEGIES** -> Cash, Card, UPI, crypto
<br> **SORT STRATEGY ->** Merge sort, Bubble sort, Quick sort, etc


> When you have to switch to the diff. algorithm during RunTime

> Use the pattern when your class has a massive conditional
operator that switches between different variants of the same
algorithm.

> Use the pattern to isolate the business logic of a class from
the implementation details of algorithms that may not be as
important in the context of that logic.

