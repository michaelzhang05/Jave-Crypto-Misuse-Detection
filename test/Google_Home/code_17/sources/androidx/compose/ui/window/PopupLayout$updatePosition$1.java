package androidx.compose.ui.window;

import O5.I;
import androidx.compose.ui.unit.IntRect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3256z;
import kotlin.jvm.internal.S;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class PopupLayout$updatePosition$1 extends AbstractC3256z implements Function0 {
    final /* synthetic */ IntRect $parentBounds;
    final /* synthetic */ long $popupContentSize;
    final /* synthetic */ S $popupPosition;
    final /* synthetic */ long $windowSize;
    final /* synthetic */ PopupLayout this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PopupLayout$updatePosition$1(S s8, PopupLayout popupLayout, IntRect intRect, long j8, long j9) {
        super(0);
        this.$popupPosition = s8;
        this.this$0 = popupLayout;
        this.$parentBounds = intRect;
        this.$windowSize = j8;
        this.$popupContentSize = j9;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m5444invoke();
        return I.f8278a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m5444invoke() {
        this.$popupPosition.f34161a = this.this$0.getPositionProvider().mo1015calculatePositionllwVHH4(this.$parentBounds, this.$windowSize, this.this$0.getParentLayoutDirection(), this.$popupContentSize);
    }
}
