package kotlinx.coroutines.internal;

import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.h0;

/* compiled from: Scopes.kt */
/* loaded from: classes2.dex */
public final class d implements h0 {

    /* renamed from: f, reason: collision with root package name */
    private final CoroutineContext f22210f;

    public d(CoroutineContext coroutineContext) {
        this.f22210f = coroutineContext;
    }

    @Override // kotlinx.coroutines.h0
    public CoroutineContext c() {
        return this.f22210f;
    }

    public String toString() {
        return "CoroutineScope(coroutineContext=" + c() + ')';
    }
}
