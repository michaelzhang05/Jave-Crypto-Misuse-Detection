package g6;

import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: g6.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2883c extends AbstractC2881a implements InterfaceC2886f {

    /* renamed from: e, reason: collision with root package name */
    public static final a f32067e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    private static final C2883c f32068f = new C2883c(1, 0);

    /* renamed from: g6.c$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    public C2883c(char c8, char c9) {
        super(c8, c9, 1);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C2883c) {
            if (!isEmpty() || !((C2883c) obj).isEmpty()) {
                C2883c c2883c = (C2883c) obj;
                if (e() != c2883c.e() || f() != c2883c.f()) {
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
        return (e() * 31) + f();
    }

    @Override // g6.InterfaceC2886f
    public boolean isEmpty() {
        if (AbstractC3255y.k(e(), f()) > 0) {
            return true;
        }
        return false;
    }

    public boolean k(char c8) {
        if (AbstractC3255y.k(e(), c8) <= 0 && AbstractC3255y.k(c8, f()) <= 0) {
            return true;
        }
        return false;
    }

    @Override // g6.InterfaceC2886f
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public Character getEndInclusive() {
        return Character.valueOf(f());
    }

    @Override // g6.InterfaceC2886f
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public Character getStart() {
        return Character.valueOf(e());
    }

    public String toString() {
        return e() + ".." + f();
    }
}
