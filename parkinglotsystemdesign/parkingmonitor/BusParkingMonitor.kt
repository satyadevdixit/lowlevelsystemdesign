package parkinglotsystemdesign.parkingmonitor

import parkinglotsystemdesign.parkingslot.ParkingSlotInterface
import java.sql.Timestamp

class BusParkingMonitor:ParkingMonitorInterface {

    private val busParkingSlotList:MutableList<ParkingSlotInterface> = mutableListOf()

    override fun addNewSlot(parkingSlotInterface: ParkingSlotInterface) {
        busParkingSlotList.add(parkingSlotInterface )
    }

    override fun deleteSlot(parkingSlotId: Int) {
        busParkingSlotList.remove(Utility.searchVehicleFromListBasedOnSlotId(parkingSlotId,busParkingSlotList))
    }

    override fun createParkingBill(parkingEntryTime: Timestamp, parkingExitTime: Timestamp): Int {
        TODO("Not yet implemented")
    }

    override fun searchParkingSlot(vehicleId:Int): Int {
        return Utility.searchVehicleFromListBasedOnAvailability(busParkingSlotList).changeStatusForEntry()
    }

    override fun vehicleExitFromParkingSlot(parkingSlotId: Int) {
        Utility.searchVehicleFromListBasedOnSlotId(parkingSlotId, busParkingSlotList).changeStatusForExit()
    }

}