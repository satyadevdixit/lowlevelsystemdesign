package parkinglotsystemdesign.parkingmonitor

import parkinglotsystemdesign.parkingslot.ParkingSlotInterface
import java.sql.Timestamp

interface ParkingMonitorInterface {

    fun  addNewSlot(parkingSlotInterface: ParkingSlotInterface)
    fun  deleteSlot(parkingSlotId: Int)
    fun  createParkingBill(parkingEntryTime:Timestamp, parkingExitTime:Timestamp):Int
    fun  searchParkingSlot(vehicleId:Int):Int
    fun  vehicleExitFromParkingSlot(parkingSlotId: Int)

}