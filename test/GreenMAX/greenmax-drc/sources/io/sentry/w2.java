package io.sentry;

import org.jetbrains.annotations.ApiStatus;

/* compiled from: MemoryCollectionData.java */
@ApiStatus.Internal
/* loaded from: classes2.dex */
public final class w2 {
    final long a;

    /* renamed from: b, reason: collision with root package name */
    final long f19334b;

    /* renamed from: c, reason: collision with root package name */
    final long f19335c;

    public w2(long j2, long j3, long j4) {
        this.a = j2;
        this.f19334b = j3;
        this.f19335c = j4;
    }

    public long a() {
        return this.a;
    }

    public long b() {
        return this.f19334b;
    }

    public long c() {
        return this.f19335c;
    }

    public w2(long j2, long j3) {
        this(j2, j3, -1L);
    }
}
