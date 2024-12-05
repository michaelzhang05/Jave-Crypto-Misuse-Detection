package androidx.compose.ui.text;

import P5.AbstractC1378t;
import a6.InterfaceC1668n;
import androidx.compose.runtime.saveable.SaverScope;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class SaversKt$TextRangeSaver$1 extends AbstractC3256z implements InterfaceC1668n {
    public static final SaversKt$TextRangeSaver$1 INSTANCE = new SaversKt$TextRangeSaver$1();

    SaversKt$TextRangeSaver$1() {
        super(2);
    }

    @Override // a6.InterfaceC1668n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m4642invokeFDrldGo((SaverScope) obj, ((TextRange) obj2).m4701unboximpl());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: invoke-FDrldGo, reason: not valid java name */
    public final Object m4642invokeFDrldGo(SaverScope saverScope, long j8) {
        return AbstractC1378t.g(SaversKt.save(Integer.valueOf(TextRange.m4697getStartimpl(j8))), SaversKt.save(Integer.valueOf(TextRange.m4692getEndimpl(j8))));
    }
}
