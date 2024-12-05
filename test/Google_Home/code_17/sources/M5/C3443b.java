package m5;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: m5.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3443b extends ImageView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3443b(Context context) {
        super(context);
        AbstractC3255y.i(context, "context");
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i8, int i9) {
        if (getDrawable() != null) {
            setMeasuredDimension((int) Math.ceil((r3 * getDrawable().getIntrinsicWidth()) / getDrawable().getIntrinsicHeight()), View.MeasureSpec.getSize(i9));
        } else {
            super.onMeasure(i8, i9);
        }
    }
}
