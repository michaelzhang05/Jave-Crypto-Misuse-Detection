package d6;

import kotlin.jvm.internal.AbstractC3151p;

/* loaded from: classes5.dex */
public final class l extends j implements InterfaceC2562f {

    /* renamed from: e, reason: collision with root package name */
    public static final a f30209e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    private static final l f30210f = new l(1, 0);

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
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
                if (g() != lVar.g() || h() != lVar.h()) {
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
        return (int) ((31 * (g() ^ (g() >>> 32))) + (h() ^ (h() >>> 32)));
    }

    @Override // d6.InterfaceC2562f
    public boolean isEmpty() {
        if (g() > h()) {
            return true;
        }
        return false;
    }

    public boolean l(long j8) {
        if (g() <= j8 && j8 <= h()) {
            return true;
        }
        return false;
    }

    @Override // d6.InterfaceC2562f
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public Long getEndInclusive() {
        return Long.valueOf(h());
    }

    @Override // d6.InterfaceC2562f
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public Long getStart() {
        return Long.valueOf(g());
    }

    public String toString() {
        return g() + ".." + h();
    }
}
