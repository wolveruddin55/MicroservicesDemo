# MicroservicesDemo
Repo showcasing microservice architecture with OpenFeign integration for seamless communication between services

OpenFeign follows a declarative approach :
      When we say OpenFeign follows a declarative approach, it means that instead of you having to write step-by-step instructions on how to make HTTP requests, you simply declare what you want to achieve. Imagine you're ordering food at a restaurant. Instead of telling the waiter exactly how to cook your meal, you just tell them what you want to eat, like "I'd like a burger with fries." In a similar way, with OpenFeign, you declare what API endpoints you want to call and what data you need, and OpenFeign takes care of the nitty-gritty details of making the HTTP requests and handling the responses. It's like ordering your API calls in a straightforward and clear manner, without worrying about the technical implementation.

It has asynchoronous support :
OpenFeign primarily supports synchronous communication, you can achieve asynchronous behavior in your applications 

Client-Side Load Balancing:
OpenFeign can be used in conjunction with client-side load balancers like Ribbon, which is another component of Netflix OSS. Ribbon integrates seamlessly with OpenFeign, providing features such as load balancing, fault tolerance, and latency-based routing. By configuring Ribbon as the client-side load balancer for OpenFeign, you can achieve dynamic load balancing across service instances. While this doesn't directly make the communication asynchronous, it ensures that requests are distributed evenly among available service instances.

Service Discovery:
OpenFeign can integrate with service discovery solutions like Eureka, Consul, or ZooKeeper through plugins or custom configurations. These plugins allow OpenFeign clients to dynamically discover service instances registered with the service discovery system. While this doesn't inherently make the communication asynchronous, it does enable the client to discover and communicate with available service instances without having to hardcode their locations.
