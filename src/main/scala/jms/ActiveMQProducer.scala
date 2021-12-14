import javax.jms._
import org.apache.activemq.ActiveMQConnectionFactory

object ActiveMQProducer {
  val activeMqUrl: String = "tcp://localhost:61616"

  def main(args: Array[String]) {
    val connectionFactory = new ActiveMQConnectionFactory()
    val connection = connectionFactory.createConnection()
    val session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE)
    val destination = session.createQueue("messageQueue")
    val producer = session.createProducer(destination)
    val message = session.createTextMessage("Simples Assim")
    producer.send(message)
    connection.close()
  }
}
