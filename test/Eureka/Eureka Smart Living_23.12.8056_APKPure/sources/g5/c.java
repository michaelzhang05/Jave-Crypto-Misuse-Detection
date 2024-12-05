package g5;

/* loaded from: classes.dex */
public final class c extends g5.a {

    /* renamed from: e, reason: collision with root package name */
    public static final a f6802e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    private static final c f6803f = new c(1, 0);

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f5.f fVar) {
            this();
        }
    }

    public c(int i6, int i7) {
        super(i6, i7, 1);
    }

    @Override // g5.a
    public boolean equals(Object obj) {
        if (obj instanceof c) {
            if (!isEmpty() || !((c) obj).isEmpty()) {
                c cVar = (c) obj;
                if (h() != cVar.h() || i() != cVar.i()) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // g5.a
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (h() * 31) + i();
    }

    @Override // g5.a
    public boolean isEmpty() {
        return h() > i();
    }

    public boolean l(int i6) {
        return h() <= i6 && i6 <= i();
    }

    @Override // g5.a
    public String toString() {
        return h() + ".." + i();
    }
}
