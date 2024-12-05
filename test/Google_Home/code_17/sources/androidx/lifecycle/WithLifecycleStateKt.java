package androidx.lifecycle;

import O5.s;
import O5.t;
import androidx.lifecycle.Lifecycle;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3253w;
import kotlin.jvm.internal.AbstractC3255y;
import l6.C3347b0;
import l6.C3374p;
import l6.I;
import l6.InterfaceC3372o;
import l6.J0;

/* loaded from: classes3.dex */
public final class WithLifecycleStateKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1, androidx.lifecycle.LifecycleObserver] */
    public static final <R> Object suspendWithStateAtLeastUnchecked(final Lifecycle lifecycle, final Lifecycle.State state, boolean z8, I i8, final Function0 function0, S5.d dVar) {
        final C3374p c3374p = new C3374p(T5.b.c(dVar), 1);
        c3374p.C();
        final ?? r12 = new LifecycleEventObserver() { // from class: androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
                Object b8;
                AbstractC3255y.i(source, "source");
                AbstractC3255y.i(event, "event");
                if (event == Lifecycle.Event.Companion.upTo(Lifecycle.State.this)) {
                    lifecycle.removeObserver(this);
                    InterfaceC3372o interfaceC3372o = c3374p;
                    Function0 function02 = function0;
                    try {
                        s.a aVar = s.f8302b;
                        b8 = s.b(function02.invoke());
                    } catch (Throwable th) {
                        s.a aVar2 = s.f8302b;
                        b8 = s.b(t.a(th));
                    }
                    interfaceC3372o.resumeWith(b8);
                    return;
                }
                if (event == Lifecycle.Event.ON_DESTROY) {
                    lifecycle.removeObserver(this);
                    InterfaceC3372o interfaceC3372o2 = c3374p;
                    s.a aVar3 = s.f8302b;
                    interfaceC3372o2.resumeWith(s.b(t.a(new LifecycleDestroyedException())));
                }
            }
        };
        if (z8) {
            i8.dispatch(S5.h.f9825a, new Runnable() { // from class: androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$lambda$2$$inlined$Runnable$1
                @Override // java.lang.Runnable
                public final void run() {
                    Lifecycle.this.addObserver(r12);
                }
            });
        } else {
            lifecycle.addObserver(r12);
        }
        c3374p.i(new WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$2(i8, lifecycle, r12));
        Object y8 = c3374p.y();
        if (y8 == T5.b.e()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return y8;
    }

    public static final <R> Object withCreated(Lifecycle lifecycle, Function0 function0, S5.d dVar) {
        Lifecycle.State state = Lifecycle.State.CREATED;
        J0 G8 = C3347b0.c().G();
        boolean isDispatchNeeded = G8.isDispatchNeeded(dVar.getContext());
        if (!isDispatchNeeded) {
            if (lifecycle.getCurrentState() != Lifecycle.State.DESTROYED) {
                if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                    return function0.invoke();
                }
            } else {
                throw new LifecycleDestroyedException();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, isDispatchNeeded, G8, new WithLifecycleStateKt$withStateAtLeastUnchecked$2(function0), dVar);
    }

    private static final <R> Object withCreated$$forInline(Lifecycle lifecycle, Function0 function0, S5.d dVar) {
        Lifecycle.State state = Lifecycle.State.DESTROYED;
        C3347b0.c().G();
        AbstractC3253w.c(3);
        throw null;
    }

    public static final <R> Object withResumed(Lifecycle lifecycle, Function0 function0, S5.d dVar) {
        Lifecycle.State state = Lifecycle.State.RESUMED;
        J0 G8 = C3347b0.c().G();
        boolean isDispatchNeeded = G8.isDispatchNeeded(dVar.getContext());
        if (!isDispatchNeeded) {
            if (lifecycle.getCurrentState() != Lifecycle.State.DESTROYED) {
                if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                    return function0.invoke();
                }
            } else {
                throw new LifecycleDestroyedException();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, isDispatchNeeded, G8, new WithLifecycleStateKt$withStateAtLeastUnchecked$2(function0), dVar);
    }

    private static final <R> Object withResumed$$forInline(Lifecycle lifecycle, Function0 function0, S5.d dVar) {
        Lifecycle.State state = Lifecycle.State.DESTROYED;
        C3347b0.c().G();
        AbstractC3253w.c(3);
        throw null;
    }

    public static final <R> Object withStarted(Lifecycle lifecycle, Function0 function0, S5.d dVar) {
        Lifecycle.State state = Lifecycle.State.STARTED;
        J0 G8 = C3347b0.c().G();
        boolean isDispatchNeeded = G8.isDispatchNeeded(dVar.getContext());
        if (!isDispatchNeeded) {
            if (lifecycle.getCurrentState() != Lifecycle.State.DESTROYED) {
                if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                    return function0.invoke();
                }
            } else {
                throw new LifecycleDestroyedException();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, isDispatchNeeded, G8, new WithLifecycleStateKt$withStateAtLeastUnchecked$2(function0), dVar);
    }

    private static final <R> Object withStarted$$forInline(Lifecycle lifecycle, Function0 function0, S5.d dVar) {
        Lifecycle.State state = Lifecycle.State.DESTROYED;
        C3347b0.c().G();
        AbstractC3253w.c(3);
        throw null;
    }

    public static final <R> Object withStateAtLeast(Lifecycle lifecycle, Lifecycle.State state, Function0 function0, S5.d dVar) {
        if (state.compareTo(Lifecycle.State.CREATED) >= 0) {
            J0 G8 = C3347b0.c().G();
            boolean isDispatchNeeded = G8.isDispatchNeeded(dVar.getContext());
            if (!isDispatchNeeded) {
                if (lifecycle.getCurrentState() != Lifecycle.State.DESTROYED) {
                    if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                        return function0.invoke();
                    }
                } else {
                    throw new LifecycleDestroyedException();
                }
            }
            return suspendWithStateAtLeastUnchecked(lifecycle, state, isDispatchNeeded, G8, new WithLifecycleStateKt$withStateAtLeastUnchecked$2(function0), dVar);
        }
        throw new IllegalArgumentException(("target state must be CREATED or greater, found " + state).toString());
    }

    private static final <R> Object withStateAtLeast$$forInline(Lifecycle lifecycle, Lifecycle.State state, Function0 function0, S5.d dVar) {
        if (state.compareTo(Lifecycle.State.CREATED) >= 0) {
            C3347b0.c().G();
            AbstractC3253w.c(3);
            throw null;
        }
        throw new IllegalArgumentException(("target state must be CREATED or greater, found " + state).toString());
    }

    public static final <R> Object withStateAtLeastUnchecked(Lifecycle lifecycle, Lifecycle.State state, Function0 function0, S5.d dVar) {
        J0 G8 = C3347b0.c().G();
        boolean isDispatchNeeded = G8.isDispatchNeeded(dVar.getContext());
        if (!isDispatchNeeded) {
            if (lifecycle.getCurrentState() != Lifecycle.State.DESTROYED) {
                if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                    return function0.invoke();
                }
            } else {
                throw new LifecycleDestroyedException();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, isDispatchNeeded, G8, new WithLifecycleStateKt$withStateAtLeastUnchecked$2(function0), dVar);
    }

    private static final <R> Object withStateAtLeastUnchecked$$forInline(Lifecycle lifecycle, Lifecycle.State state, Function0 function0, S5.d dVar) {
        C3347b0.c().G();
        AbstractC3253w.c(3);
        throw null;
    }

    private static final <R> Object withCreated$$forInline(LifecycleOwner lifecycleOwner, Function0 function0, S5.d dVar) {
        lifecycleOwner.getLifecycle();
        Lifecycle.State state = Lifecycle.State.DESTROYED;
        C3347b0.c().G();
        AbstractC3253w.c(3);
        throw null;
    }

    private static final <R> Object withResumed$$forInline(LifecycleOwner lifecycleOwner, Function0 function0, S5.d dVar) {
        lifecycleOwner.getLifecycle();
        Lifecycle.State state = Lifecycle.State.DESTROYED;
        C3347b0.c().G();
        AbstractC3253w.c(3);
        throw null;
    }

    private static final <R> Object withStarted$$forInline(LifecycleOwner lifecycleOwner, Function0 function0, S5.d dVar) {
        lifecycleOwner.getLifecycle();
        Lifecycle.State state = Lifecycle.State.DESTROYED;
        C3347b0.c().G();
        AbstractC3253w.c(3);
        throw null;
    }

    private static final <R> Object withStateAtLeast$$forInline(LifecycleOwner lifecycleOwner, Lifecycle.State state, Function0 function0, S5.d dVar) {
        lifecycleOwner.getLifecycle();
        if (state.compareTo(Lifecycle.State.CREATED) >= 0) {
            C3347b0.c().G();
            AbstractC3253w.c(3);
            throw null;
        }
        throw new IllegalArgumentException(("target state must be CREATED or greater, found " + state).toString());
    }

    public static final <R> Object withCreated(LifecycleOwner lifecycleOwner, Function0 function0, S5.d dVar) {
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        Lifecycle.State state = Lifecycle.State.CREATED;
        J0 G8 = C3347b0.c().G();
        boolean isDispatchNeeded = G8.isDispatchNeeded(dVar.getContext());
        if (!isDispatchNeeded) {
            if (lifecycle.getCurrentState() != Lifecycle.State.DESTROYED) {
                if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                    return function0.invoke();
                }
            } else {
                throw new LifecycleDestroyedException();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, isDispatchNeeded, G8, new WithLifecycleStateKt$withStateAtLeastUnchecked$2(function0), dVar);
    }

    public static final <R> Object withResumed(LifecycleOwner lifecycleOwner, Function0 function0, S5.d dVar) {
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        Lifecycle.State state = Lifecycle.State.RESUMED;
        J0 G8 = C3347b0.c().G();
        boolean isDispatchNeeded = G8.isDispatchNeeded(dVar.getContext());
        if (!isDispatchNeeded) {
            if (lifecycle.getCurrentState() != Lifecycle.State.DESTROYED) {
                if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                    return function0.invoke();
                }
            } else {
                throw new LifecycleDestroyedException();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, isDispatchNeeded, G8, new WithLifecycleStateKt$withStateAtLeastUnchecked$2(function0), dVar);
    }

    public static final <R> Object withStarted(LifecycleOwner lifecycleOwner, Function0 function0, S5.d dVar) {
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        Lifecycle.State state = Lifecycle.State.STARTED;
        J0 G8 = C3347b0.c().G();
        boolean isDispatchNeeded = G8.isDispatchNeeded(dVar.getContext());
        if (!isDispatchNeeded) {
            if (lifecycle.getCurrentState() != Lifecycle.State.DESTROYED) {
                if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                    return function0.invoke();
                }
            } else {
                throw new LifecycleDestroyedException();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, isDispatchNeeded, G8, new WithLifecycleStateKt$withStateAtLeastUnchecked$2(function0), dVar);
    }

    public static final <R> Object withStateAtLeast(LifecycleOwner lifecycleOwner, Lifecycle.State state, Function0 function0, S5.d dVar) {
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        if (state.compareTo(Lifecycle.State.CREATED) >= 0) {
            J0 G8 = C3347b0.c().G();
            boolean isDispatchNeeded = G8.isDispatchNeeded(dVar.getContext());
            if (!isDispatchNeeded) {
                if (lifecycle.getCurrentState() != Lifecycle.State.DESTROYED) {
                    if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                        return function0.invoke();
                    }
                } else {
                    throw new LifecycleDestroyedException();
                }
            }
            return suspendWithStateAtLeastUnchecked(lifecycle, state, isDispatchNeeded, G8, new WithLifecycleStateKt$withStateAtLeastUnchecked$2(function0), dVar);
        }
        throw new IllegalArgumentException(("target state must be CREATED or greater, found " + state).toString());
    }
}
