import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global

Future.successful { 21 + 21 }
Future.failed(new Exception("bummer!"))

val fut = Future { Thread.sleep(10000); 21 / 0  }
fut.isCompleted
fut.value

var count = 0
while(!fut.isCompleted){
  count += 1;
  Thread.sleep(1);
}
println("Count is " + count)
fut.isCompleted
fut.value

