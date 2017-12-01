package `in`.fronts.teabyii.reador.components

import android.graphics.Color
import android.widget.Toast
import com.facebook.litho.ClickEvent
import com.facebook.litho.Column
import com.facebook.litho.ComponentContext
import com.facebook.litho.annotations.LayoutSpec
import com.facebook.litho.annotations.OnCreateLayout
import com.facebook.litho.annotations.OnEvent
import com.facebook.litho.annotations.Prop
import com.facebook.litho.widget.Text
import com.facebook.yoga.YogaEdge.*

/**
 * Created by boom.lee on 01/12/2017.
 */
@LayoutSpec
object ListItemSpec {

    @OnCreateLayout
    fun onCreateLayout(
        c: ComponentContext,
        @Prop color: Int,
        @Prop title: String,
        @Prop subtitle: String
    ) =
        Column.create(c)
            .paddingDip(ALL, 16F)
            .backgroundColor(color)
            .child(
                Text.create(c)
                    .text(title)
                    .textSizeSp(40F)
            )
            .child(
                Text.create(c)
                    .text(subtitle)
                    .textSizeSp(20F)
            )
            .clickHandler(ListItem.onClick(c))
            .build()

    @OnEvent(ClickEvent::class)
    fun onClick(c: ComponentContext, @Prop title: String) {
        val toast = Toast.makeText(c.applicationContext, title as CharSequence, Toast.LENGTH_SHORT)
        toast.show()
    }
}
