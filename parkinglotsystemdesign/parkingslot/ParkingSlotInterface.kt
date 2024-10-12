package parkinglotsystemdesign.parkingslot

interface ParkingSlotInterface {

    var parkingStatus:Boolean
    var parkingSlotId:Int

    fun changeStatusForEntry():Int
    fun changeStatusForExit()
}