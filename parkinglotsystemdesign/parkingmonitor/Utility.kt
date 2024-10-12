package parkinglotsystemdesign.parkingmonitor

import parkinglotsystemdesign.parkingslot.BikeParkingSlot
import parkinglotsystemdesign.parkingslot.ParkingSlotInterface

class Utility {

    companion object{
         fun searchVehicleFromListBasedOnSlotId(targetParkingSlotId: Int, parkingSlotList:MutableList<ParkingSlotInterface>): ParkingSlotInterface
        {
            return parkingSlotList.filter { it -> targetParkingSlotId== it.parkingSlotId}.first()
        }

         fun searchVehicleFromListBasedOnAvailability(parkingSlotList:MutableList<ParkingSlotInterface>): ParkingSlotInterface
        {
            return parkingSlotList.filter { it -> !it.parkingStatus}.first()
        }
    }


}