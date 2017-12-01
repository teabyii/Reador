package `in`.fronts.teabyii.reador

import android.app.Application
import com.facebook.drawee.backends.pipeline.Fresco
import com.facebook.soloader.SoLoader

/**
 * Created by boom.lee on 01/12/2017.
 */
class ReadorApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        Fresco.initialize(this)
        SoLoader.init(this, false)
    }
}
