package androidx.compose.ui.node;

import L5.I;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawCacheModifier;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class BackwardsCompatNode$updateDrawCache$1 extends AbstractC3160z implements Function0 {
    final /* synthetic */ Modifier.Element $element;
    final /* synthetic */ BackwardsCompatNode this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackwardsCompatNode$updateDrawCache$1(Modifier.Element element, BackwardsCompatNode backwardsCompatNode) {
        super(0);
        this.$element = element;
        this.this$0 = backwardsCompatNode;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m4210invoke();
        return I.f6487a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m4210invoke() {
        ((DrawCacheModifier) this.$element).onBuildCache(this.this$0);
    }
}
