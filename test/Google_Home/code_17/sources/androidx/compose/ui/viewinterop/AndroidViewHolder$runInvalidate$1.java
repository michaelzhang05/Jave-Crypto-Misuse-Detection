package androidx.compose.ui.viewinterop;

import O5.I;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3256z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AndroidViewHolder$runInvalidate$1 extends AbstractC3256z implements Function0 {
    final /* synthetic */ AndroidViewHolder this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidViewHolder$runInvalidate$1(AndroidViewHolder androidViewHolder) {
        super(0);
        this.this$0 = androidViewHolder;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m5428invoke();
        return I.f8278a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m5428invoke() {
        this.this$0.getLayoutNode().invalidateLayer$ui_release();
    }
}
