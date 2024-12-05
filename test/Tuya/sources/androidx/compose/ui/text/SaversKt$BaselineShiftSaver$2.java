package androidx.compose.ui.text;

import androidx.compose.ui.text.style.BaselineShift;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class SaversKt$BaselineShiftSaver$2 extends AbstractC3160z implements Function1 {
    public static final SaversKt$BaselineShiftSaver$2 INSTANCE = new SaversKt$BaselineShiftSaver$2();

    SaversKt$BaselineShiftSaver$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    /* renamed from: invoke-jTk7eUs, reason: not valid java name and merged with bridge method [inline-methods] */
    public final BaselineShift invoke(Object obj) {
        AbstractC3159y.g(obj, "null cannot be cast to non-null type kotlin.Float");
        return BaselineShift.m4966boximpl(BaselineShift.m4967constructorimpl(((Float) obj).floatValue()));
    }
}
