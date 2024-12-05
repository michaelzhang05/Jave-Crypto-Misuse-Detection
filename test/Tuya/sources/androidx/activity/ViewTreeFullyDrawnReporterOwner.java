package androidx.activity;

import android.view.View;
import f6.AbstractC2683j;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes.dex */
public final class ViewTreeFullyDrawnReporterOwner {
    public static final FullyDrawnReporterOwner get(View view) {
        AbstractC3159y.i(view, "<this>");
        return (FullyDrawnReporterOwner) AbstractC2683j.s(AbstractC2683j.z(AbstractC2683j.h(view, ViewTreeFullyDrawnReporterOwner$findViewTreeFullyDrawnReporterOwner$1.INSTANCE), ViewTreeFullyDrawnReporterOwner$findViewTreeFullyDrawnReporterOwner$2.INSTANCE));
    }

    public static final void set(View view, FullyDrawnReporterOwner fullyDrawnReporterOwner) {
        AbstractC3159y.i(view, "<this>");
        AbstractC3159y.i(fullyDrawnReporterOwner, "fullyDrawnReporterOwner");
        view.setTag(R.id.report_drawn, fullyDrawnReporterOwner);
    }
}
