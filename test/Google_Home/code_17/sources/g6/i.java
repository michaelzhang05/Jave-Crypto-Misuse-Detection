package g6;

import kotlin.jvm.internal.AbstractC3247p;

/* loaded from: classes5.dex */
public final class i extends C2887g implements InterfaceC2886f {

    /* renamed from: e, reason: collision with root package name */
    public static final a f32079e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    private static final i f32080f = new i(1, 0);

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public final i a() {
            return i.f32080f;
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    public i(int i8, int i9) {
        super(i8, i9, 1);
    }

    @Override // g6.C2887g
    public boolean equals(Object obj) {
        if (obj instanceof i) {
            if (!isEmpty() || !((i) obj).isEmpty()) {
                i iVar = (i) obj;
                if (e() != iVar.e() || f() != iVar.f()) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // g6.C2887g
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (e() * 31) + f();
    }

    @Override // g6.C2887g, g6.InterfaceC2886f
    public boolean isEmpty() {
        if (e() > f()) {
            return true;
        }
        return false;
    }

    public boolean m(int i8) {
        if (e() <= i8 && i8 <= f()) {
            return true;
        }
        return false;
    }

    @Override // g6.InterfaceC2886f
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public Integer getEndInclusive() {
        return Integer.valueOf(f());
    }

    @Override // g6.InterfaceC2886f
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public Integer getStart() {
        return Integer.valueOf(e());
    }

    @Override // g6.C2887g
    public String toString() {
        return e() + ".." + f();
    }
}
