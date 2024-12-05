package androidx.compose.ui.text;

import O5.C;
import a6.InterfaceC1668n;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.graphics.Color;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class SaversKt$ColorSaver$1 extends AbstractC3256z implements InterfaceC1668n {
    public static final SaversKt$ColorSaver$1 INSTANCE = new SaversKt$ColorSaver$1();

    SaversKt$ColorSaver$1() {
        super(2);
    }

    @Override // a6.InterfaceC1668n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m4638invoke4WTKRHQ((SaverScope) obj, ((Color) obj2).m2986unboximpl());
    }

    /* renamed from: invoke-4WTKRHQ, reason: not valid java name */
    public final Object m4638invoke4WTKRHQ(SaverScope saverScope, long j8) {
        return C.a(j8);
    }
}
