package androidx.compose.ui.focus;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class FocusPropertiesImpl$enter$1 extends AbstractC3160z implements Function1 {
    public static final FocusPropertiesImpl$enter$1 INSTANCE = new FocusPropertiesImpl$enter$1();

    FocusPropertiesImpl$enter$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return m2675invoke3ESFkO8(((FocusDirection) obj).m2655unboximpl());
    }

    /* renamed from: invoke-3ESFkO8, reason: not valid java name */
    public final FocusRequester m2675invoke3ESFkO8(int i8) {
        return FocusRequester.Companion.getDefault();
    }
}
