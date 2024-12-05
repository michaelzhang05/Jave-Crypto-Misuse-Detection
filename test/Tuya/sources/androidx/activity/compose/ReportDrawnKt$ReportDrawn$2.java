package androidx.activity.compose;

import L5.I;
import X5.n;
import androidx.compose.runtime.Composer;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ReportDrawnKt$ReportDrawn$2 extends AbstractC3160z implements n {
    final /* synthetic */ int $$changed;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReportDrawnKt$ReportDrawn$2(int i8) {
        super(2);
        this.$$changed = i8;
    }

    @Override // X5.n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f6487a;
    }

    public final void invoke(Composer composer, int i8) {
        ReportDrawnKt.ReportDrawn(composer, this.$$changed | 1);
    }
}
