package androidx.navigation;

import android.view.View;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes3.dex */
final class Navigation$findViewNavController$1 extends AbstractC3256z implements Function1 {
    public static final Navigation$findViewNavController$1 INSTANCE = new Navigation$findViewNavController$1();

    Navigation$findViewNavController$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final View invoke(View it) {
        AbstractC3255y.i(it, "it");
        Object parent = it.getParent();
        if (parent instanceof View) {
            return (View) parent;
        }
        return null;
    }
}
