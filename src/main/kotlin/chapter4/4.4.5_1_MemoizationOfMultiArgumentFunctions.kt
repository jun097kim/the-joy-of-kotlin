package chapter4.memoization_of_multi_argument_functions

import chapter4.memoizer.Memoizer

val h = { (x, y): Pair<Int, Int> ->
    x + y
}

val hc = { x: Int ->
    { y: Int ->
        x + y
    }
}

val mhc = Memoizer.momoize { x: Int ->
    Memoizer.momoize { y: Int ->
        x + y
    }
}

val f3 = { x: Int ->
    { y: Int ->
        { z: Int ->
            x + y - z
        }
    }
}

val f3m = Memoizer.momoize { x: Int ->
    Memoizer.momoize { y: Int ->
        Memoizer.momoize { z: Int ->
            x + y - z
        }
    }
}