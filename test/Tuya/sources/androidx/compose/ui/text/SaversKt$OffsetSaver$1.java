package androidx.compose.ui.text;

import M5.AbstractC1246t;
import X5.n;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.geometry.Offset;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class SaversKt$OffsetSaver$1 extends AbstractC3160z implements n {
    public static final SaversKt$OffsetSaver$1 INSTANCE = new SaversKt$OffsetSaver$1();

    SaversKt$OffsetSaver$1() {
        super(2);
    }

    @Override // X5.n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m4635invokeUv8p0NA((SaverScope) obj, ((Offset) obj2).m2745unboximpl());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: invoke-Uv8p0NA, reason: not valid java name */
    public final Object m4635invokeUv8p0NA(SaverScope saverScope, long j8) {
        if (Offset.m2732equalsimpl0(j8, Offset.Companion.m2750getUnspecifiedF1C5BW0())) {
            return Boolean.FALSE;
        }
        return AbstractC1246t.g(SaversKt.save(Float.valueOf(Offset.m2735getXimpl(j8))), SaversKt.save(Float.valueOf(Offset.m2736getYimpl(j8))));
    }
}
