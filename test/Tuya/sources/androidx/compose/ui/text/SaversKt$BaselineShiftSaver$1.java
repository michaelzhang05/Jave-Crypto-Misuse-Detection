package androidx.compose.ui.text;

import X5.n;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.text.style.BaselineShift;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class SaversKt$BaselineShiftSaver$1 extends AbstractC3160z implements n {
    public static final SaversKt$BaselineShiftSaver$1 INSTANCE = new SaversKt$BaselineShiftSaver$1();

    SaversKt$BaselineShiftSaver$1() {
        super(2);
    }

    @Override // X5.n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m4631invoke8a2Sb4w((SaverScope) obj, ((BaselineShift) obj2).m4972unboximpl());
    }

    /* renamed from: invoke-8a2Sb4w, reason: not valid java name */
    public final Object m4631invoke8a2Sb4w(SaverScope saverScope, float f8) {
        return Float.valueOf(f8);
    }
}
