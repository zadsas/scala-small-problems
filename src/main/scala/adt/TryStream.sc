import adt.{Empty, Cons, Stream}

println("The head will be evaluated twice")
val stream1: Stream[Int] = Cons[Int]( ()=>5, ()=>Empty)
stream1.headOption
stream1.headOption
println("The head will be evaluated once")
val stream2: Stream[Int] = Stream(1,2,3)
stream2.headOption
stream2.headOption