package z4;

/* loaded from: classes.dex */
public final class a implements Comparable {

    /* renamed from: e, reason: collision with root package name */
    public static final C0154a f10046e = new C0154a(null);

    /* renamed from: f, reason: collision with root package name */
    public static final a f10047f = b.a();

    /* renamed from: a, reason: collision with root package name */
    private final int f10048a;

    /* renamed from: b, reason: collision with root package name */
    private final int f10049b;

    /* renamed from: c, reason: collision with root package name */
    private final int f10050c;

    /* renamed from: d, reason: collision with root package name */
    private final int f10051d;

    /* renamed from: z4.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0154a {
        private C0154a() {
        }

        public /* synthetic */ C0154a(f5.f fVar) {
            this();
        }
    }

    public a(int i6, int i7, int i8) {
        this.f10048a = i6;
        this.f10049b = i7;
        this.f10050c = i8;
        this.f10051d = b(i6, i7, i8);
    }

    private final int b(int i6, int i7, int i8) {
        boolean z5 = false;
        if (new g5.c(0, 255).l(i6) && new g5.c(0, 255).l(i7) && new g5.c(0, 255).l(i8)) {
            z5 = true;
        }
        if (z5) {
            return (i6 << 16) + (i7 << 8) + i8;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i6 + '.' + i7 + '.' + i8).toString());
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(a aVar) {
        f5.h.e(aVar, "other");
        return this.f10051d - aVar.f10051d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        a aVar = obj instanceof a ? (a) obj : null;
        return aVar != null && this.f10051d == aVar.f10051d;
    }

    public int hashCode() {
        return this.f10051d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f10048a);
        sb.append('.');
        sb.append(this.f10049b);
        sb.append('.');
        sb.append(this.f10050c);
        return sb.toString();
    }
}
