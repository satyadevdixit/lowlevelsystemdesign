package parkinglotsystemdesign.parkingvehicle

import parkinglotsystemdesign.parkingmonitor.ParkingMonitorInterface
import kotlin.properties.Delegates

class Bike(var vehicleId:Int, var parkingMonitorInterface:ParkingMonitorInterface) :ParkingVehicleInterface {

    public var parkingSlotId by Delegates.notNull<Int>()
     var vehicleParked:Boolean = false

    override fun parkVehicle(): Int {
      return  parkingMonitorInterface.searchParkingSlot(vehicleId)
    }

    override fun exitFromParking() {
        if (vehicleParked)
            parkingMonitorInterface.vehicleExitFromParkingSlot(parkingSlotId)
    }

    override fun getParkingBill(): Int {
        TODO("Not yet implemented")
    }
}