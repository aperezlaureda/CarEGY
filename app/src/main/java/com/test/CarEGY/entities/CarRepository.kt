package com.test.CarEGY.entities

//  Lista provisoria de autos para probar el recyclerview

class CarRepository {


    private var carList : MutableList<Car> = mutableListOf()

    init{
        carList.add(Car("A1","Description",""))
        carList.add(Car("A2","Description",""))
        carList.add(Car("A3","Description",""))
        carList.add(Car("A4","Description",""))
        carList.add(Car("A15","Description",""))
        carList.add(Car("A11","Description",""))
        carList.add(Car("A12","Description",""))
        carList.add(Car("A13","Description",""))
        carList.add(Car("A14","Description",""))
        carList.add(Car("A25","Description",""))
        carList.add(Car("A21","Description",""))
        carList.add(Car("A22","Description",""))
        carList.add(Car("A23","Description",""))
        carList.add(Car("A24","Description",""))
        carList.add(Car("A35","Description",""))
        carList.add(Car("A1","Description",""))
        carList.add(Car("A2","Description",""))
        carList.add(Car("A3","Description",""))
        carList.add(Car("A4","Description",""))
        carList.add(Car("A15","Description",""))
        carList.add(Car("A11","Description",""))
        carList.add(Car("A12","Description",""))
        carList.add(Car("A13","Description",""))
        carList.add(Car("A14","Description",""))
        carList.add(Car("A25","Description",""))
        carList.add(Car("A21","Description",""))
        carList.add(Car("A22","Description",""))
        carList.add(Car("A23","Description",""))
        carList.add(Car("A24","Description",""))
        carList.add(Car("A35","Description",""))

    }

    fun getCars () : MutableList<Car>{
        return carList
    }



}
