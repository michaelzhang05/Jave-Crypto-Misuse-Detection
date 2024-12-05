package androidx.compose.runtime;

import O5.InterfaceC1355k;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.functions.Function0;

@StabilityInferred(parameters = 2)
/* loaded from: classes.dex */
public final class LazyValueHolder<T> implements State<T> {
    public static final int $stable = 0;
    private final InterfaceC1355k current$delegate;

    public LazyValueHolder(Function0 function0) {
        this.current$delegate = O5.l.b(function0);
    }

    private final T getCurrent() {
        return (T) this.current$delegate.getValue();
    }

    @Override // androidx.compose.runtime.State
    public T getValue() {
        return getCurrent();
    }
}
