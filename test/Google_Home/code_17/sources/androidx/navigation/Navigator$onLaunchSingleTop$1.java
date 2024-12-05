package androidx.navigation;

import O5.I;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes3.dex */
final class Navigator$onLaunchSingleTop$1 extends AbstractC3256z implements Function1 {
    public static final Navigator$onLaunchSingleTop$1 INSTANCE = new Navigator$onLaunchSingleTop$1();

    Navigator$onLaunchSingleTop$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((NavOptionsBuilder) obj);
        return I.f8278a;
    }

    public final void invoke(NavOptionsBuilder navOptions) {
        AbstractC3255y.i(navOptions, "$this$navOptions");
        navOptions.setLaunchSingleTop(true);
    }
}
