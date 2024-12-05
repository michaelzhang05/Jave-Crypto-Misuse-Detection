package androidx.compose.animation.core;

import O5.I;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class AnimateAsStateKt$animateValueAsState$2 extends AbstractC3256z implements Function0 {
    final /* synthetic */ n6.d $channel;
    final /* synthetic */ T $targetValue;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimateAsStateKt$animateValueAsState$2(n6.d dVar, T t8) {
        super(0);
        this.$channel = dVar;
        this.$targetValue = t8;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m214invoke();
        return I.f8278a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m214invoke() {
        this.$channel.w(this.$targetValue);
    }
}
