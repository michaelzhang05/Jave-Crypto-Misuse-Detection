package androidx.window.layout;

import androidx.window.sidecar.SidecarDisplayFeature;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes3.dex */
final class SidecarAdapter$translate$checkedFeature$1 extends AbstractC3256z implements Function1 {
    public static final SidecarAdapter$translate$checkedFeature$1 INSTANCE = new SidecarAdapter$translate$checkedFeature$1();

    SidecarAdapter$translate$checkedFeature$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(SidecarDisplayFeature require) {
        AbstractC3255y.i(require, "$this$require");
        boolean z8 = true;
        if (require.getType() != 1 && require.getType() != 2) {
            z8 = false;
        }
        return Boolean.valueOf(z8);
    }
}
