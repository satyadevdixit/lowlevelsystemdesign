package parkinglotsystemdesign.parkingmonitor

import parkinglotsystemdesign.parkingslot.ParkingSlotInterface
import java.sql.Timestamp

class CarParkingMonitor :ParkingMonitorInterface {

    private val bikeParkingSlotList:MutableList<ParkingSlotInterface> = mutableListOf()

    override fun addNewSlot(parkingSlotInterface: ParkingSlotInterface) {
        bikeParkingSlotList.add(parkingSlotInterface )
    }

    override fun deleteSlot(parkingSlotId: Int) {
        bikeParkingSlotList.remove(Utility.searchVehicleFromListBasedOnSlotId(parkingSlotId,bikeParkingSlotList))
    }

    override fun createParkingBill(parkingEntryTime: Timestamp, parkingExitTime: Timestamp): Int {
        TODO("Not yet implemented")
    }

    override fun searchParkingSlot(vehicleId:Int): Int {
        return Utility.searchVehicleFromListBasedOnAvailability(bikeParkingSlotList).changeStatusForEntry()
    }

    override fun vehicleExitFromParkingSlot(parkingSlotId: Int) {
        Utility.searchVehicleFromListBasedOnSlotId(parkingSlotId, bikeParkingSlotList).changeStatusForExit()
    }

}