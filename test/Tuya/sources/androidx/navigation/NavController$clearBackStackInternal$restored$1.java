package androidx.navigation;

import L5.I;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes3.dex */
final class NavController$clearBackStackInternal$restored$1 extends AbstractC3160z implements Function1 {
    public static final NavController$clearBackStackInternal$restored$1 INSTANCE = new NavController$clearBackStackInternal$restored$1();

    NavController$clearBackStackInternal$restored$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((NavOptionsBuilder) obj);
        return I.f6487a;
    }

    public final void invoke(NavOptionsBuilder navOptions) {
        AbstractC3159y.i(navOptions, "$this$navOptions");
        navOptions.setRestoreState(true);
    }
}
