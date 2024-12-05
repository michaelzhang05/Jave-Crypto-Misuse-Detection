package androidx.compose.foundation;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.Density;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class MagnifierKt$magnifier$1 extends AbstractC3160z implements Function1 {
    public static final MagnifierKt$magnifier$1 INSTANCE = new MagnifierKt$magnifier$1();

    MagnifierKt$magnifier$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return Offset.m2724boximpl(m340invoketuRUvjQ((Density) obj));
    }

    /* renamed from: invoke-tuRUvjQ, reason: not valid java name */
    public final long m340invoketuRUvjQ(Density density) {
        AbstractC3159y.i(density, "$this$null");
        return Offset.Companion.m2750getUnspecifiedF1C5BW0();
    }
}
