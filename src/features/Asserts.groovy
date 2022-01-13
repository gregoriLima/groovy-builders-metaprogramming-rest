package features

    // complex debug output
    assert 1 == (3 * 30) / 15 + 100 * 3
    /*
    assert 1 == (3 * 30) / 15 + 100 * 3
             |     |     |    |     |
             false 90    6    306   300
     */

    def x = [1,2,3,4,5]
    assert (x << 6) == [1,2,3,4,5,6,7]
    /*
    assert (x << 6) == [1,2,3,4,5,6,7]
        | |     |
        | |     false
        | [1, 2, 3, 4, 5, 6]
        [1, 2, 3, 4, 5, 6]
     */


