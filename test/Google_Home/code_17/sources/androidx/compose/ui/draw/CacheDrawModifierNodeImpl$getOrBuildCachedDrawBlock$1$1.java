package androidx.compose.ui.draw;

import O5.I;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class CacheDrawModifierNodeImpl$getOrBuildCachedDrawBlock$1$1 extends AbstractC3256z implements Function0 {
    final /* synthetic */ CacheDrawScope $this_apply;
    final /* synthetic */ CacheDrawModifierNodeImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CacheDrawModifierNodeImpl$getOrBuildCachedDrawBlock$1$1(CacheDrawModifierNodeImpl cacheDrawModifierNodeImpl, CacheDrawScope cacheDrawScope) {
        super(0);
        this.this$0 = cacheDrawModifierNodeImpl;
        this.$this_apply = cacheDrawScope;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m2643invoke();
        return I.f8278a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m2643invoke() {
        this.this$0.getBlock().invoke(this.$this_apply);
    }
}
