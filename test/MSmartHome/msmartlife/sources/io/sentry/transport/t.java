package io.sentry.transport;

import io.sentry.h4;
import io.sentry.n1;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: NoOpEnvelopeCache.java */
/* loaded from: classes2.dex */
public final class t implements io.sentry.cache.r {

    /* renamed from: f, reason: collision with root package name */
    private static final t f19273f = new t();

    public static t a() {
        return f19273f;
    }

    @Override // io.sentry.cache.r
    public void d(h4 h4Var) {
    }

    @Override // java.lang.Iterable
    public Iterator<h4> iterator() {
        return new ArrayList(0).iterator();
    }

    @Override // io.sentry.cache.r
    public void q(h4 h4Var, n1 n1Var) {
    }
}
