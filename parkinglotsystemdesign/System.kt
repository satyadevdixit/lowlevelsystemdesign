package parkinglotsystemdesign

import parkinglotsystemdesign.parkingmonitor.BikeParkingMonitor
import parkinglotsystemdesign.parkingmonitor.BusParkingMonitor
import parkinglotsystemdesign.parkingmonitor.CarParkingMonitor
import parkinglotsystemdesign.parkingmonitor.ParkingMonitorInterface
import parkinglotsystemdesign.parkingslot.BikeParkingSlot
import parkinglotsystemdesign.parkingslot.BusParkingSlot
import parkinglotsystemdesign.parkingslot.CarParkingSlot
import parkinglotsystemdesign.parkingslot.ParkingSlotInterface
import parkinglotsystemdesign.parkingvehicle.Bike
import parkinglotsystemdesign.parkingvehicle.Bus
import parkinglotsystemdesign.parkingvehicle.Car
import parkinglotsystemdesign.parkingvehicle.ParkingVehicleInterface

fun main()
{
 val bikeparkingMonitorInterface :ParkingMonitorInterface = BikeParkingMonitor()
 val carparkingMonitorInterface :ParkingMonitorInterface = CarParkingMonitor()
 val busparkingMonitorInterface :ParkingMonitorInterface = BusParkingMonitor()

 val bikeParkingSlot :ParkingSlotInterface = BikeParkingSlot(20)
 val busParkingSlot :ParkingSlotInterface = BusParkingSlot(30)
 val carParkingSlot :ParkingSlotInterface = CarParkingSlot(40)

    bikeparkingMonitorInterface.addNewSlot(bikeParkingSlot)
    carparkingMonitorInterface.addNewSlot(carParkingSlot)
    busparkingMonitorInterface.addNewSlot(busParkingSlot)

 val bike :ParkingVehicleInterface = Bike(12345,bikeparkingMonitorInterface)
 val car :ParkingVehicleInterface = Car(12346,carparkingMonitorInterface)
 val bus :ParkingVehicleInterface = Bus(1234,busparkingMonitorInterface)

   println("Bike Parking Slot number = " + bike.parkVehicle())
   println("Car Parking Slot number = " + car.parkVehicle())
   println("Bus Parking Slot number = " + bus.parkVehicle())
}