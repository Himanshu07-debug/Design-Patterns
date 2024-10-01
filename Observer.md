**OBSERVER**

> Observer is a behavioral design pattern that lets you define a
subscription mechanism to notify multiple objects about any
events that happen to the object they’re observing.

**EXAMPLE**

> In Youtube, a Channel is subscribed by many Subscriber's. This Subscriber's check the channel periodically to check either a new video is uploaded on channel or not. To avoid this Regular checking by the Subscribers, all of them should be notified from the channel when the new video is uploaded.
(This helps in avoiding - Subscriber's wastes time checking new video upload or the channel wastes resources notifying the Unsubscribed users. )
<br>
<br>
Channel : subject &nbsp; **AND** &nbsp; Subscribers : Observer 


**APPLICABILTY**

> Use the pattern when some objects in your app must observe
others, but only for a limited time or in specific cases.
(The subscription list is dynamic, so subscribers can join or
leave the list whenever they need to.)

> Use the Observer pattern when changes to the state of one
object may require changing other objects ( Subscribe kiye to Channel Subscriber list Changed )

> One to Many Dependencies

> This pattern allows a subject to notify multiple observers without them being directly aware of each other.( Decoupling and loose coupling between objects )




