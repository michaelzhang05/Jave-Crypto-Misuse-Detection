package d6;

import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: d6.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2559c extends AbstractC2557a implements InterfaceC2562f {

    /* renamed from: e, reason: collision with root package name */
    public static final a f30187e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    private static final C2559c f30188f = new C2559c(1, 0);

    /* renamed from: d6.c$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public C2559c(char c8, char c9) {
        super(c8, c9, 1);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C2559c) {
            if (!isEmpty() || !((C2559c) obj).isEmpty()) {
                C2559c c2559c = (C2559c) obj;
                if (g() != c2559c.g() || h() != c2559c.h()) {
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
        return (g() * 31) + h();
    }

    @Override // d6.InterfaceC2562f
    public boolean isEmpty() {
        if (AbstractC3159y.k(g(), h()) > 0) {
            return true;
        }
        return false;
    }

    public boolean l(char c8) {
        if (AbstractC3159y.k(g(), c8) <= 0 && AbstractC3159y.k(c8, h()) <= 0) {
            return true;
        }
        return false;
    }

    @Override // d6.InterfaceC2562f
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public Character getEndInclusive() {
        return Character.valueOf(h());
    }

    @Override // d6.InterfaceC2562f
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public Character getStart() {
        return Character.valueOf(g());
    }

    public String toString() {
        return g() + ".." + h();
    }
}
