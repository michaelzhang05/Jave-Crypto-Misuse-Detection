package androidx.compose.ui.text;

import M5.AbstractC1246t;
import X5.n;
import androidx.compose.runtime.saveable.SaverScope;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class SaversKt$TextRangeSaver$1 extends AbstractC3160z implements n {
    public static final SaversKt$TextRangeSaver$1 INSTANCE = new SaversKt$TextRangeSaver$1();

    SaversKt$TextRangeSaver$1() {
        super(2);
    }

    @Override // X5.n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m4637invokeFDrldGo((SaverScope) obj, ((TextRange) obj2).m4696unboximpl());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: invoke-FDrldGo, reason: not valid java name */
    public final Object m4637invokeFDrldGo(SaverScope saverScope, long j8) {
        return AbstractC1246t.g(SaversKt.save(Integer.valueOf(TextRange.m4692getStartimpl(j8))), SaversKt.save(Integer.valueOf(TextRange.m4687getEndimpl(j8))));
    }
}
