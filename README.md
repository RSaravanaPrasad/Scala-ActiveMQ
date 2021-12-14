# Scala-ActiveMQ Producer-Consumer
> Scala-ActiveMQ Producer-Consumer

> Producer reads a log file and messages line by line to a topic as a text string and exits

> Consumer reads from the topic by polling continuously

##
### Prerequisites
- JDK 1.8
- sbt
- Scala 2.13.6
- ActiveMQ 

##
### Environment
- Java 1.8
- Message Queue name: messageQueue
- Start ActiveMQ

##
### Project modules info
1. ActiveMQ Scala Producer Application

2. ActiveMQ Scala Consumer Application

##
### Build on both Producer and Consumer
```
sbt clean 

sbt run
```

##
### TEST using Terminal

---

#### run ActveMQ server
```
Terminal 1: Start ActiveMQ
- .\bin\activemq start
```
---

### Application 

#### Consumer: ActiveMQ Scala Consumer with one "sbt run" command
```
Terminal 2: sbt run 
options 1/ 2 for ActiveMQConsumer/ ActiveMQProducer 
Choose option 1 . Consumer keeps polling the queue for any message  
```

#### Producer: ActiveMQ Scala Producer
```
Terminal 3: sbt run 
options 1/ 2 for ActiveMQConsumer/ ActiveMQProducer 
Choose option 2. This sends a message to the queue.
Received message in Consumer Terminal 2 is printed in console
---
