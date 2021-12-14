import javax.jms._
import org.apache.activemq.ActiveMQConnectionFactory
import util.Random
import java.time.LocalDateTime;
 
object ActiveMQProducer {
  val activeMqUrl: String = "tcp://localhost:61616"

  def main(args: Array[String]) {
    val connFactory = new ActiveMQConnectionFactory()
    val conn = connFactory.createConnection()
    val sess = conn.createSession(false, Session.AUTO_ACKNOWLEDGE)
    val dest = sess.createQueue("messageQueue")
    val prod = sess.createProducer(dest)
    val msg = sess.createTextMessage("Simples Assim")
    prod.send(msg)
    conn.close()
  }
}