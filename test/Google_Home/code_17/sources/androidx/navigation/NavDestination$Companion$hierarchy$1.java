package androidx.navigation;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class NavDestination$Companion$hierarchy$1 extends AbstractC3256z implements Function1 {
    public static final NavDestination$Companion$hierarchy$1 INSTANCE = new NavDestination$Companion$hierarchy$1();

    NavDestination$Companion$hierarchy$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final NavDestination invoke(NavDestination it) {
        AbstractC3255y.i(it, "it");
        return it.getParent();
    }
}
