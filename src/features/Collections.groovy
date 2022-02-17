package features

class RangeCollection {

    static void main(String[] args) {
        Range n = 1..10
        println n.step(1)
        println n.from
        println n.to

        Range n2 = 1..<10

        assert (n).containsAll(1..10)
        assert n2.containsAll(1..10) == false

        Date today = new Date()
        Date oneWeekAway = today + 7

        println today
        println oneWeekAway

        Range days = today..oneWeekAway
        println days.step(1)

        Range letters = 'a'..'z'
        println letters.step(1)

    }

}

class ListCollection {

    static void main(String[] args) {
        List nums = [1,2,3,4,5,6] as LinkedList<Integer>
        println nums

        nums.push(99)
        nums.putAt(0,7) // replace 99 by 7 at 0 position

        println nums
        println nums + [9,9,9]
        println nums << 88
    }
}