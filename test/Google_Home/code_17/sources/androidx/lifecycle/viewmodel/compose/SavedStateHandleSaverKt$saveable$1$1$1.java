package androidx.lifecycle.viewmodel.compose;

import O5.InterfaceC1351g;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.lifecycle.SavedStateHandle;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.C3252v;
import kotlin.jvm.internal.InterfaceC3249s;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public /* synthetic */ class SavedStateHandleSaverKt$saveable$1$1$1 implements SaverScope, InterfaceC3249s {
    final /* synthetic */ SavedStateHandle.Companion $tmp0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SavedStateHandleSaverKt$saveable$1$1$1(SavedStateHandle.Companion companion) {
        this.$tmp0 = companion;
    }

    @Override // androidx.compose.runtime.saveable.SaverScope
    public final boolean canBeSaved(Object obj) {
        return this.$tmp0.validateValue(obj);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof SaverScope) && (obj instanceof InterfaceC3249s)) {
            return AbstractC3255y.d(getFunctionDelegate(), ((InterfaceC3249s) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.InterfaceC3249s
    public final InterfaceC1351g getFunctionDelegate() {
        return new C3252v(1, this.$tmp0, SavedStateHandle.Companion.class, "validateValue", "validateValue(Ljava/lang/Object;)Z", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
