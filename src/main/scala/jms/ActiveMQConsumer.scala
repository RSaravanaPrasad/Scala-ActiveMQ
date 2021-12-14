import javax.jms._
import org.apache.activemq.ActiveMQConnectionFactory

object ActiveMQConsumer {
  val activeMqUrl: String = "tcp://localhost:61616"

  def main(args: Array[String]) {
    val connectionFactory = new ActiveMQConnectionFactory()
    val connection = connectionFactory.createConnection()
    val session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE)
    val destination = session.createQueue("messageQueue")
    val consumer = session.createConsumer(destination)
    connection.start()
    while (true) {
      val message = consumer.receive()
      println(message)
    }
    connection.close()
  }
}
