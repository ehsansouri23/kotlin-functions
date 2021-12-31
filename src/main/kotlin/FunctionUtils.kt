fun ((Int) -> Double).compose(func: (String) -> Int): (String) -> Double = {
    this(func(it))
}

infix fun <T, U, V> ((U) -> V).o(func: (T) -> U): (T) -> V = {
    this(func(it))
}