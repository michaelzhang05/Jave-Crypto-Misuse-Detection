package io.sentry.util;

import org.jetbrains.annotations.ApiStatus;

/* compiled from: Pair.java */
@ApiStatus.Internal
/* loaded from: classes2.dex */
public final class r<A, B> {
    private final A a;

    /* renamed from: b, reason: collision with root package name */
    private final B f19290b;

    public r(A a, B b2) {
        this.a = a;
        this.f19290b = b2;
    }

    public A a() {
        return this.a;
    }

    public B b() {
        return this.f19290b;
    }
}
