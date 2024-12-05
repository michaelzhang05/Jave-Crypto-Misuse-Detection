package io.sentry;

import java.io.IOException;
import java.util.UUID;
import okhttp3.HttpUrl;

/* compiled from: SpanId.java */
/* loaded from: classes2.dex */
public final class h5 implements r2 {

    /* renamed from: f, reason: collision with root package name */
    public static final h5 f18950f = new h5(new UUID(0, 0));

    /* renamed from: g, reason: collision with root package name */
    private final String f18951g;

    /* compiled from: SpanId.java */
    /* loaded from: classes2.dex */
    public static final class a implements l2<h5> {
        @Override // io.sentry.l2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public h5 a(n2 n2Var, w1 w1Var) throws Exception {
            return new h5(n2Var.u0());
        }
    }

    public h5(String str) {
        this.f18951g = (String) io.sentry.util.q.c(str, "value is required");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h5.class != obj.getClass()) {
            return false;
        }
        return this.f18951g.equals(((h5) obj).f18951g);
    }

    public int hashCode() {
        return this.f18951g.hashCode();
    }

    @Override // io.sentry.r2
    public void serialize(h3 h3Var, w1 w1Var) throws IOException {
        h3Var.b(this.f18951g);
    }

    public String toString() {
        return this.f18951g;
    }

    public h5() {
        this(UUID.randomUUID());
    }

    private h5(UUID uuid) {
        this(io.sentry.util.u.d(uuid.toString()).replace("-", HttpUrl.FRAGMENT_ENCODE_SET).substring(0, 16));
    }
}
