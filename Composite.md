**APPLICABILTY**

1. Any Problem that can be represented as a TREE
2. Object inside Object
3. One to many


**PROXY**

Simply Middleware jaise dekho, Main Destiny pe jaane se phle Destiny ka imposter verify krnga data, and if Valid rha, then only sent request to
the Destiny (Authentication)

1. Lazy initialization (virtual proxy). This is when you have a
heavyweight service object that wastes system resources by
being always up, even though you only need it from time
to time. Instead of creating the object when the app launches, you
can delay the object’s initialization to a time when it’s really
needed.
2. Local execution of a remote service (remote proxy). This is
when the service object is located on a remote server.
In this case, the proxy passes the client request over the network, handling all of the nasty details of working with the
network
3. Blocklist 
4. Caching



