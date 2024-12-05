package androidx.compose.foundation;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class IndicationKt$LocalIndication$1 extends AbstractC3160z implements Function0 {
    public static final IndicationKt$LocalIndication$1 INSTANCE = new IndicationKt$LocalIndication$1();

    IndicationKt$LocalIndication$1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Indication invoke() {
        return DefaultDebugIndication.INSTANCE;
    }
}
