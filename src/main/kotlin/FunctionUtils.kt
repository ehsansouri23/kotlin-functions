fun ((Int) -> Double).compose(func: (String) -> Int): (String) -> Double = {
    this(func(it))
}