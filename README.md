technology-examples
===================

This public repository is for storing examples and demonstrations of technologies. This will and should not contain any code that is proprietary as it is open to the public.

# switchyard
This demonstration runs through some simple examples how to define and consume services over the SwitchYard service bus framework. 

* simple-service
    * A very simple example on how to declare a service. Nothing consumes it and no bindngs expose the service outside the application. The greatest benefit here is a very simple switchyard.xml definition; great place to start.
* simple-service-consume
    * This adds code to consume the service from the previous example. It still isn't bound or promoted, so the service in consumed within the same war application. Mainly used to deomonstrate the 'reference' element usage withing the switchyard.xml file.
* sca-service-consume
    * Adds an sca binding to promote the service outside the application, yet only available withing the same jvm instance. This comprises of two war files- one that defines and exposes the service, and the second that consumes it.

