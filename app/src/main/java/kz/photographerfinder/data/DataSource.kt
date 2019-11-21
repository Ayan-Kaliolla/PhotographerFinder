package kz.photographerfinder.data

interface DataSource {
    fun getTop(): List<Photographer>
}