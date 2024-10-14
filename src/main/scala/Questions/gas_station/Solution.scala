package Questions.gas_station

object Solution {

  def canCompleteCircuit(gas: Array[Int], cost: Array[Int]): Int = {
    val cg = Array.fill(gas.length)(0)
    for(i <- Range(0,gas.length,1)){
      cg(i) = gas(i) - cost(i)
    }

    val ss = Array.fill(gas.length)(0)
    var current_sum = 0
    var max_highCost = 0
    for(i <- Range(gas.length-1,-1,-1)){
      current_sum += cg(i)
      ss(i) = current_sum
    }

    val ans = if(ss(0) < 0){
      -1
    } else {
      var max_highCost = ss(gas.length-1)
      var max_costIndex = gas.length-1
      for(i <- Range(gas.length-1,-1,-1)){
        if(ss(i) > max_highCost){
          max_highCost = ss(i)
          max_costIndex = i
        }
      }
      max_costIndex
    }
    ans


    // g = [1 , 2, 3, 4, 5] .... [...]
    // c = [3 , 4, 5, 1, 2] .... [...]

    // cc= [-2,-2,-2, 3, 3]
    // ss= [ 0,-2,-4, 6, 3]

    // fs= [-2,-6,-10,3,3]

    // i = 3
    // gs = 4

    // i=4
    // gs = 4-1 + 5


    // i = 0
    // gs = 4-1 + 5-2

    // i = 1
    // gs = 4-1 + 5-2 + 1-3 + 2

    // i = 2
    // gs = 4-1 + 5-2 + 1-3 + 2-4 + 3

    // to reach i = 3 pay 5
    // gas -= cost

  }

  def main(args:Array[String]):Unit = {

  }
}
