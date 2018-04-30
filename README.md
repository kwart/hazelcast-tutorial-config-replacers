# Hazelcast IMDG tutorial - Implementing configuration replacer

This project contains source code for a custom `TOSTRING` configuration replacer.

Sample `ConfigReplacer` implementation:
* [ToStringReplacer.java](src/main/java/com/hazelcast/config/replacer/ToStringReplacer.java)

Sample class which provides value in the `toString()` method:
* [GroupNameProvider.java](src/main/java/com/hazelcast/config/replacer/GroupNameProvider.java)

Usage in an XML configuration file:
* [hazelcast.xml](src/main/resources/hazelcast.xml)

## How to run it

Use Apache Maven to run the example:

```bash
mvn install exec:java
```
It compiles the sample and starts Hazelcast IMDG with custom variables used in the XML configuration file.

### Expected output

```
Apr 30, 2018 11:00:05 AM com.hazelcast.config.XmlConfigLocator
INFO: Loading 'hazelcast.xml' from classpath.
Apr 30, 2018 11:00:05 AM com.hazelcast.config.AbstractXmlConfigHelper
WARNING: Name of the hazelcast schema location is incorrect, using default
Apr 30, 2018 11:00:05 AM com.hazelcast.instance.AddressPicker
INFO: [LOCAL] [TestGroup] [3.10] Prefer IPv4 stack is true.
Apr 30, 2018 11:00:05 AM com.hazelcast.instance.AddressPicker
INFO: [LOCAL] [TestGroup] [3.10] Picked [192.168.1.1]:5701, using socket ServerSocket[addr=/0:0:0:0:0:0:0:0,localport=5701], bind any local is true
Apr 30, 2018 11:00:05 AM com.hazelcast.system
INFO: [192.168.1.1]:5701 [TestGroup] [3.10] Hazelcast 3.10 (20180418 - cf73378) starting at [192.168.1.1]:5701
Apr 30, 2018 11:00:05 AM com.hazelcast.system
INFO: [192.168.1.1]:5701 [TestGroup] [3.10] Copyright (c) 2008-2018, Hazelcast, Inc. All Rights Reserved.
Apr 30, 2018 11:00:05 AM com.hazelcast.system
...
```