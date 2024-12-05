package androidx.navigation;

import L5.I;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes3.dex */
final class NavController$popBackStackInternal$1 extends AbstractC3160z implements Function1 {
    public static final NavController$popBackStackInternal$1 INSTANCE = new NavController$popBackStackInternal$1();

    NavController$popBackStackInternal$1() {
        super(1);
    }

    public final void invoke(NavBackStackEntry it) {
        AbstractC3159y.i(it, "it");
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((NavBackStackEntry) obj);
        return I.f6487a;
    }
}
