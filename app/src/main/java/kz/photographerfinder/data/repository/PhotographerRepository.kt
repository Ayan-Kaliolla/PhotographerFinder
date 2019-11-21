package kz.photographerfinder.data.repository

import kz.photographerfinder.data.DataSource

class PhotographerRepository(private val dataSource: DataSource) {

    fun getTop() = dataSource.getTop()
}