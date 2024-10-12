package parkinglotsystemdesign.parkingvehicle

import org.jetbrains.annotations.NotNull
import parkinglotsystemdesign.parkingmonitor.ParkingMonitorInterface
import kotlin.properties.Delegates

class Car(var vehicleId:Int, var parkingMonitorInterface:ParkingMonitorInterface) :ParkingVehicleInterface {

    private var  parkingSlotId by Delegates.notNull<Int>()
    private var vehicleParked:Boolean = false

    override fun parkVehicle(): Int {
        return parkingMonitorInterface.searchParkingSlot(vehicleId)
    }

    override fun exitFromParking() {
        parkingMonitorInterface.vehicleExitFromParkingSlot(parkingSlotId)
    }

    override fun getParkingBill(): Int {
        TODO("Not yet implemented")
    }
}