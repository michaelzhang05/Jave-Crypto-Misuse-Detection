package androidx.activity;

import android.view.View;
import i6.AbstractC3001j;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes.dex */
public final class ViewTreeFullyDrawnReporterOwner {
    public static final FullyDrawnReporterOwner get(View view) {
        AbstractC3255y.i(view, "<this>");
        return (FullyDrawnReporterOwner) AbstractC3001j.s(AbstractC3001j.z(AbstractC3001j.h(view, ViewTreeFullyDrawnReporterOwner$findViewTreeFullyDrawnReporterOwner$1.INSTANCE), ViewTreeFullyDrawnReporterOwner$findViewTreeFullyDrawnReporterOwner$2.INSTANCE));
    }

    public static final void set(View view, FullyDrawnReporterOwner fullyDrawnReporterOwner) {
        AbstractC3255y.i(view, "<this>");
        AbstractC3255y.i(fullyDrawnReporterOwner, "fullyDrawnReporterOwner");
        view.setTag(R.id.report_drawn, fullyDrawnReporterOwner);
    }
}
