import javax.jms._
import org.apache.activemq.ActiveMQConnectionFactory
 
object ActiveMQConsumer {
  val activeMqUrl: String = "tcp://localhost:61616"
  def main(args: Array[String]) {
    val connFactory = new ActiveMQConnectionFactory()
    val conn = connFactory.createConnection()
    val sess = conn.createSession(false, Session.AUTO_ACKNOWLEDGE)
    val dest = sess.createQueue("messageQueue")
    val cons = sess.createConsumer(dest)
    conn.start()
    while (true) {
      val msg = cons.receive()
      println(msg)
    }
    conn.close()
  }
}