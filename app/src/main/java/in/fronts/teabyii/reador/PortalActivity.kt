package `in`.fronts.teabyii.reador

import `in`.fronts.teabyii.reador.sections.ListSection
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.facebook.litho.ComponentContext
import com.facebook.litho.LithoView
import com.facebook.litho.sections.SectionContext
import com.facebook.litho.sections.widget.RecyclerCollectionComponent

class PortalActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val context = ComponentContext(this)
        // val component = ListItem.create(context).build()
        val component = RecyclerCollectionComponent.create(context)
            .disablePTR(true)
            .section(ListSection.create(SectionContext(context)).build())
            .build()

        setContentView(LithoView.create(context, component))
    }
}



