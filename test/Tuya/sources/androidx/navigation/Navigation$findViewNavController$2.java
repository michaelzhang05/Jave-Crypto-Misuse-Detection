package androidx.navigation;

import android.view.View;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class Navigation$findViewNavController$2 extends AbstractC3160z implements Function1 {
    public static final Navigation$findViewNavController$2 INSTANCE = new Navigation$findViewNavController$2();

    Navigation$findViewNavController$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final NavController invoke(View it) {
        NavController viewNavController;
        AbstractC3159y.i(it, "it");
        viewNavController = Navigation.INSTANCE.getViewNavController(it);
        return viewNavController;
    }
}
