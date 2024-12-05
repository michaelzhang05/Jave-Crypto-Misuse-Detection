package e.h.a.g0;

import java.net.ProtocolException;

/* compiled from: ConnectionProfile.java */
/* loaded from: classes2.dex */
public class b {
    final long a;

    /* renamed from: b, reason: collision with root package name */
    final long f17802b;

    /* renamed from: c, reason: collision with root package name */
    final long f17803c;

    /* renamed from: d, reason: collision with root package name */
    final long f17804d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f17805e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f17806f;

    /* compiled from: ConnectionProfile.java */
    /* renamed from: e.h.a.g0.b$b, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0234b {
        public static b a(long j2) {
            return new b(0L, 0L, -1L, j2);
        }

        public static b b(long j2, long j3, long j4, long j5) {
            return new b(j2, j3, j4, j5);
        }

        public static b c(long j2, long j3, long j4) {
            return new b(j2, j3, -1L, j4);
        }

        public static b d() {
            return new b();
        }

        public static b e() {
            return new b(0L, 0L, 0L, 0L, true);
        }
    }

    public void a(e.h.a.e0.b bVar) throws ProtocolException {
        if (this.f17805e) {
            return;
        }
        if (this.f17806f && e.h.a.k0.e.a().f17897h) {
            bVar.h("HEAD");
        }
        bVar.f("Range", this.f17803c == -1 ? e.h.a.k0.f.o("bytes=%d-", Long.valueOf(this.f17802b)) : e.h.a.k0.f.o("bytes=%d-%d", Long.valueOf(this.f17802b), Long.valueOf(this.f17803c)));
    }

    public String toString() {
        return e.h.a.k0.f.o("range[%d, %d) current offset[%d]", Long.valueOf(this.a), Long.valueOf(this.f17803c), Long.valueOf(this.f17802b));
    }

    private b() {
        this.a = 0L;
        this.f17802b = 0L;
        this.f17803c = 0L;
        this.f17804d = 0L;
        this.f17805e = false;
        this.f17806f = true;
    }

    private b(long j2, long j3, long j4, long j5) {
        this(j2, j3, j4, j5, false);
    }

    private b(long j2, long j3, long j4, long j5, boolean z) {
        if ((j2 == 0 && j4 == 0) || !z) {
            this.a = j2;
            this.f17802b = j3;
            this.f17803c = j4;
            this.f17804d = j5;
            this.f17805e = z;
            this.f17806f = false;
            return;
        }
        throw new IllegalArgumentException();
    }
}
