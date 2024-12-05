package androidx.compose.ui.text;

import P5.AbstractC1378t;
import a6.InterfaceC1668n;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.geometry.Offset;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class SaversKt$OffsetSaver$1 extends AbstractC3256z implements InterfaceC1668n {
    public static final SaversKt$OffsetSaver$1 INSTANCE = new SaversKt$OffsetSaver$1();

    SaversKt$OffsetSaver$1() {
        super(2);
    }

    @Override // a6.InterfaceC1668n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m4640invokeUv8p0NA((SaverScope) obj, ((Offset) obj2).m2750unboximpl());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: invoke-Uv8p0NA, reason: not valid java name */
    public final Object m4640invokeUv8p0NA(SaverScope saverScope, long j8) {
        if (Offset.m2737equalsimpl0(j8, Offset.Companion.m2755getUnspecifiedF1C5BW0())) {
            return Boolean.FALSE;
        }
        return AbstractC1378t.g(SaversKt.save(Float.valueOf(Offset.m2740getXimpl(j8))), SaversKt.save(Float.valueOf(Offset.m2741getYimpl(j8))));
    }
}
