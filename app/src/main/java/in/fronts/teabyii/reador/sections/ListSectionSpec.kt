package `in`.fronts.teabyii.reador.sections

import `in`.fronts.teabyii.reador.components.ListItem
import android.graphics.Color
import com.facebook.litho.sections.Children
import com.facebook.litho.sections.SectionContext
import com.facebook.litho.sections.annotations.GroupSectionSpec
import com.facebook.litho.sections.annotations.OnCreateChildren
import com.facebook.litho.sections.common.SingleComponentSection

/**
 * Created by boom.lee on 01/12/2017.
 */

@GroupSectionSpec
object ListSectionSpec {

    @OnCreateChildren
    fun onCreateChildren(ctx: SectionContext): Children {
        val builder = Children.create()
        var i = 0

        do {
            builder.child(
                SingleComponentSection.create(ctx)
                    .key(i.toString())
                    .component(ListItem
                        .create(ctx)
                        .color(if (i % 2 == 0 ) Color.WHITE else Color.LTGRAY)
                        .title("$i . Hello world!")
                        .subtitle("Litho tutorial")
                        .build()
                    )
            )
        } while (i++ < 8)

        return builder.build()
    }

}
