package androidx.navigation;

import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class NavController$executePopOperations$6 extends AbstractC3160z implements Function1 {
    final /* synthetic */ NavController this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavController$executePopOperations$6(NavController navController) {
        super(1);
        this.this$0 = navController;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(NavDestination destination) {
        Map map;
        AbstractC3159y.i(destination, "destination");
        map = this.this$0.backStackMap;
        return Boolean.valueOf(!map.containsKey(Integer.valueOf(destination.getId())));
    }
}
