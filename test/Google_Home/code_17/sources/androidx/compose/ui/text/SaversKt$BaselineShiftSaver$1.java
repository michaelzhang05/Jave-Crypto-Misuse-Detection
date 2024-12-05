package androidx.compose.ui.text;

import a6.InterfaceC1668n;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.text.style.BaselineShift;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class SaversKt$BaselineShiftSaver$1 extends AbstractC3256z implements InterfaceC1668n {
    public static final SaversKt$BaselineShiftSaver$1 INSTANCE = new SaversKt$BaselineShiftSaver$1();

    SaversKt$BaselineShiftSaver$1() {
        super(2);
    }

    @Override // a6.InterfaceC1668n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m4636invoke8a2Sb4w((SaverScope) obj, ((BaselineShift) obj2).m4977unboximpl());
    }

    /* renamed from: invoke-8a2Sb4w, reason: not valid java name */
    public final Object m4636invoke8a2Sb4w(SaverScope saverScope, float f8) {
        return Float.valueOf(f8);
    }
}
