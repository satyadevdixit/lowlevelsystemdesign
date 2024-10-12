package parkinglotsystemdesign.parkingslot

import java.sql.Timestamp
import java.time.LocalTime

class BusParkingSlot(override var parkingSlotId:Int) :ParkingSlotInterface {

    override var parkingStatus:Boolean = false
    private lateinit var vehicleEntrytime: LocalTime

    override fun changeStatusForEntry():Int {
        parkingStatus = true
        vehicleEntrytime = LocalTime.now()
        return  parkingSlotId
    }

    override fun changeStatusForExit() {
        parkingStatus = false
    }
}