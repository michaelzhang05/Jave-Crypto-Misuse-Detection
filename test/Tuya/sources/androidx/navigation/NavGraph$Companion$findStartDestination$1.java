package androidx.navigation;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class NavGraph$Companion$findStartDestination$1 extends AbstractC3160z implements Function1 {
    public static final NavGraph$Companion$findStartDestination$1 INSTANCE = new NavGraph$Companion$findStartDestination$1();

    NavGraph$Companion$findStartDestination$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final NavDestination invoke(NavDestination it) {
        AbstractC3159y.i(it, "it");
        if (!(it instanceof NavGraph)) {
            return null;
        }
        NavGraph navGraph = (NavGraph) it;
        return navGraph.findNode(navGraph.getStartDestinationId());
    }
}
