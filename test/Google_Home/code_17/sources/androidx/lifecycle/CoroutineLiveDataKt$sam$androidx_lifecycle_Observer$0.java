package androidx.lifecycle;

import O5.InterfaceC1351g;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.InterfaceC3249s;

/* loaded from: classes3.dex */
final class CoroutineLiveDataKt$sam$androidx_lifecycle_Observer$0 implements Observer, InterfaceC3249s {
    private final /* synthetic */ Function1 function;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CoroutineLiveDataKt$sam$androidx_lifecycle_Observer$0(Function1 function) {
        AbstractC3255y.i(function, "function");
        this.function = function;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof Observer) && (obj instanceof InterfaceC3249s)) {
            return AbstractC3255y.d(getFunctionDelegate(), ((InterfaceC3249s) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.InterfaceC3249s
    public final InterfaceC1351g getFunctionDelegate() {
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
