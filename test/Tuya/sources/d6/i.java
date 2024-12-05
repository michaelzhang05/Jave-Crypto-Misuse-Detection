package d6;

import kotlin.jvm.internal.AbstractC3151p;

/* loaded from: classes5.dex */
public final class i extends C2563g implements InterfaceC2562f {

    /* renamed from: e, reason: collision with root package name */
    public static final a f30199e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    private static final i f30200f = new i(1, 0);

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public final i a() {
            return i.f30200f;
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public i(int i8, int i9) {
        super(i8, i9, 1);
    }

    @Override // d6.C2563g
    public boolean equals(Object obj) {
        if (obj instanceof i) {
            if (!isEmpty() || !((i) obj).isEmpty()) {
                i iVar = (i) obj;
                if (g() != iVar.g() || h() != iVar.h()) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // d6.C2563g
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (g() * 31) + h();
    }

    @Override // d6.C2563g, d6.InterfaceC2562f
    public boolean isEmpty() {
        if (g() > h()) {
            return true;
        }
        return false;
    }

    public boolean p(int i8) {
        if (g() <= i8 && i8 <= h()) {
            return true;
        }
        return false;
    }

    @Override // d6.InterfaceC2562f
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public Integer getEndInclusive() {
        return Integer.valueOf(h());
    }

    @Override // d6.InterfaceC2562f
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public Integer getStart() {
        return Integer.valueOf(g());
    }

    @Override // d6.C2563g
    public String toString() {
        return g() + ".." + h();
    }
}
