package androidx.lifecycle;

import L5.InterfaceC1223g;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.InterfaceC3153s;

/* loaded from: classes3.dex */
final class CoroutineLiveDataKt$sam$androidx_lifecycle_Observer$0 implements Observer, InterfaceC3153s {
    private final /* synthetic */ Function1 function;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CoroutineLiveDataKt$sam$androidx_lifecycle_Observer$0(Function1 function) {
        AbstractC3159y.i(function, "function");
        this.function = function;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof Observer) && (obj instanceof InterfaceC3153s)) {
            return AbstractC3159y.d(getFunctionDelegate(), ((InterfaceC3153s) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.InterfaceC3153s
    public final InterfaceC1223g getFunctionDelegate() {
        return this.function;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // androidx.lifecycle.Observer
    public final /* synthetic */ void onChanged(Object obj) {
        this.function.invoke(obj);
    }
}
