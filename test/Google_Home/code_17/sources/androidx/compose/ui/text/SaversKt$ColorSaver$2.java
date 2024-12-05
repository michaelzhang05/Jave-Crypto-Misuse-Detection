package androidx.compose.ui.text;

import O5.C;
import androidx.compose.ui.graphics.Color;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class SaversKt$ColorSaver$2 extends AbstractC3256z implements Function1 {
    public static final SaversKt$ColorSaver$2 INSTANCE = new SaversKt$ColorSaver$2();

    SaversKt$ColorSaver$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    /* renamed from: invoke-ijrfgN4, reason: not valid java name and merged with bridge method [inline-methods] */
    public final Color invoke(Object obj) {
        AbstractC3255y.g(obj, "null cannot be cast to non-null type kotlin.ULong");
        return Color.m2966boximpl(Color.m2972constructorimpl(((C) obj).g()));
    }
}
