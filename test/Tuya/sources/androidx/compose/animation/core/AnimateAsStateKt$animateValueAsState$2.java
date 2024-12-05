package androidx.compose.animation.core;

import L5.I;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class AnimateAsStateKt$animateValueAsState$2 extends AbstractC3160z implements Function0 {
    final /* synthetic */ k6.d $channel;
    final /* synthetic */ T $targetValue;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimateAsStateKt$animateValueAsState$2(k6.d dVar, T t8) {
        super(0);
        this.$channel = dVar;
        this.$targetValue = t8;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m209invoke();
        return I.f6487a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m209invoke() {
        this.$channel.y(this.$targetValue);
    }
}
