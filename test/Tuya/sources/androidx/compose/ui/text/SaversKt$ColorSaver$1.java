package androidx.compose.ui.text;

import L5.C;
import X5.n;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.graphics.Color;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class SaversKt$ColorSaver$1 extends AbstractC3160z implements n {
    public static final SaversKt$ColorSaver$1 INSTANCE = new SaversKt$ColorSaver$1();

    SaversKt$ColorSaver$1() {
        super(2);
    }

    @Override // X5.n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m4633invoke4WTKRHQ((SaverScope) obj, ((Color) obj2).m2981unboximpl());
    }

    /* renamed from: invoke-4WTKRHQ, reason: not valid java name */
    public final Object m4633invoke4WTKRHQ(SaverScope saverScope, long j8) {
        return C.a(j8);
    }
}
