package androidx.compose.runtime;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3151p;

@Stable
/* loaded from: classes.dex */
public abstract class CompositionLocal<T> {
    public static final int $stable = 0;
    private final LazyValueHolder<T> defaultValueHolder;

    public /* synthetic */ CompositionLocal(Function0 function0, AbstractC3151p abstractC3151p) {
        this(function0);
    }

    public static /* synthetic */ void getCurrent$annotations() {
    }

    @Composable
    @ReadOnlyComposable
    public final T getCurrent(Composer composer, int i8) {
        return (T) composer.consume(this);
    }

    public final LazyValueHolder<T> getDefaultValueHolder$runtime_release() {
        return this.defaultValueHolder;
    }

    public abstract State<T> updatedStateOf$runtime_release(T t8, State<? extends T> state);

    private CompositionLocal(Function0 function0) {
        this.defaultValueHolder = new LazyValueHolder<>(function0);
    }
}
