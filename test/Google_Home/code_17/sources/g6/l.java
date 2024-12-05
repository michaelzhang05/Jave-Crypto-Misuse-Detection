package g6;

import kotlin.jvm.internal.AbstractC3247p;

/* loaded from: classes5.dex */
public final class l extends j implements InterfaceC2886f {

    /* renamed from: e, reason: collision with root package name */
    public static final a f32089e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    private static final l f32090f = new l(1, 0);

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    public l(long j8, long j9) {
        super(j8, j9, 1L);
    }

    public boolean equals(Object obj) {
        if (obj instanceof l) {
            if (!isEmpty() || !((l) obj).isEmpty()) {
                l lVar = (l) obj;
                if (e() != lVar.e() || f() != lVar.f()) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (int) ((31 * (e() ^ (e() >>> 32))) + (f() ^ (f() >>> 32)));
    }

    @Override // g6.InterfaceC2886f
    public boolean isEmpty() {
        if (e() > f()) {
            return true;
        }
        return false;
    }

    public boolean k(long j8) {
        if (e() <= j8 && j8 <= f()) {
            return true;
        }
        return false;
    }

    @Override // g6.InterfaceC2886f
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public Long getEndInclusive() {
        return Long.valueOf(f());
    }

    @Override // g6.InterfaceC2886f
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public Long getStart() {
        return Long.valueOf(e());
    }

    public String toString() {
        return e() + ".." + f();
    }
}
