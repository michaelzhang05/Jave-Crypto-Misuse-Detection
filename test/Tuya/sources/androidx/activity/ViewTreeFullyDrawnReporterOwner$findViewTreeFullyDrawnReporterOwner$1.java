package androidx.activity;

import android.view.View;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class ViewTreeFullyDrawnReporterOwner$findViewTreeFullyDrawnReporterOwner$1 extends AbstractC3160z implements Function1 {
    public static final ViewTreeFullyDrawnReporterOwner$findViewTreeFullyDrawnReporterOwner$1 INSTANCE = new ViewTreeFullyDrawnReporterOwner$findViewTreeFullyDrawnReporterOwner$1();

    ViewTreeFullyDrawnReporterOwner$findViewTreeFullyDrawnReporterOwner$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final View invoke(View it) {
        AbstractC3159y.i(it, "it");
        Object parent = it.getParent();
        if (parent instanceof View) {
            return (View) parent;
        }
        return null;
    }
}
