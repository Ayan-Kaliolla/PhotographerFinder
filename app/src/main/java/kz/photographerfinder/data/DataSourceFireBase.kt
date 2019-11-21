package kz.photographerfinder.data

class DataSourceFireBase : DataSource {

    override fun getTop(): List<Photographer> = mutableListOf(
        Photographer(
            1,
            "https://www.fullframeinsurance.com/images/features/photo/photographer-gear.jpg",
            "Brein Tartar",
            "Brein",
            "Tarttar",
            arrayListOf(""),
            120,
            15
        ),
        Photographer(
            2,
            "http://edwinarobertson.com/wp-content/uploads/2014/08/eddy_photographer.jpg",
            "Barbara Liskov",
            "Barbara",
            "Liskov",
            arrayListOf(""),
            1056,
            15
        )
    )

}