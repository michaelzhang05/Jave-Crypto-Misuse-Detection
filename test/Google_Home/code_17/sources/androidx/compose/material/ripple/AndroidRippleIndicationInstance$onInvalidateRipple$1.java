package androidx.compose.material.ripple;

import O5.I;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3256z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AndroidRippleIndicationInstance$onInvalidateRipple$1 extends AbstractC3256z implements Function0 {
    final /* synthetic */ AndroidRippleIndicationInstance this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidRippleIndicationInstance$onInvalidateRipple$1(AndroidRippleIndicationInstance androidRippleIndicationInstance) {
        super(0);
        this.this$0 = androidRippleIndicationInstance;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m1440invoke();
        return I.f8278a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m1440invoke() {
        boolean invalidateTick;
        AndroidRippleIndicationInstance androidRippleIndicationInstance = this.this$0;
        invalidateTick = androidRippleIndicationInstance.getInvalidateTick();
        androidRippleIndicationInstance.setInvalidateTick(!invalidateTick);
    }
}
