package androidx.navigation;

import O5.I;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class NavOptionsBuilder$popUpTo$1 extends AbstractC3256z implements Function1 {
    public static final NavOptionsBuilder$popUpTo$1 INSTANCE = new NavOptionsBuilder$popUpTo$1();

    NavOptionsBuilder$popUpTo$1() {
        super(1);
    }

    public final void invoke(PopUpToBuilder popUpToBuilder) {
        AbstractC3255y.i(popUpToBuilder, "$this$null");
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((PopUpToBuilder) obj);
        return I.f8278a;
    }
}
