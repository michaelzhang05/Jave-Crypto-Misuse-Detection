package androidx.navigation;

import L5.I;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes3.dex */
final class NavOptionsBuilder$popUpTo$2 extends AbstractC3160z implements Function1 {
    public static final NavOptionsBuilder$popUpTo$2 INSTANCE = new NavOptionsBuilder$popUpTo$2();

    NavOptionsBuilder$popUpTo$2() {
        super(1);
    }

    public final void invoke(PopUpToBuilder popUpToBuilder) {
        AbstractC3159y.i(popUpToBuilder, "$this$null");
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((PopUpToBuilder) obj);
        return I.f6487a;
    }
}