package O5;

import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: O5.i, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1353i implements Comparable {

    /* renamed from: e, reason: collision with root package name */
    public static final a f8287e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    public static final C1353i f8288f = C1354j.a();

    /* renamed from: a, reason: collision with root package name */
    private final int f8289a;

    /* renamed from: b, reason: collision with root package name */
    private final int f8290b;

    /* renamed from: c, reason: collision with root package name */
    private final int f8291c;

    /* renamed from: d, reason: collision with root package name */
    private final int f8292d;

    /* renamed from: O5.i$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    public C1353i(int i8, int i9, int i10) {
        this.f8289a = i8;
        this.f8290b = i9;
        this.f8291c = i10;
        this.f8292d = b(i8, i9, i10);
    }

    private final int b(int i8, int i9, int i10) {
        if (new g6.i(0, 255).m(i8) && new g6.i(0, 255).m(i9) && new g6.i(0, 255).m(i10)) {
            return (i8 << 16) + (i9 << 8) + i10;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i8 + '.' + i9 + '.' + i10).toString());
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(C1353i other) {
        AbstractC3255y.i(other, "other");
        return this.f8292d - other.f8292d;
    }

    public boolean equals(Object obj) {
        C1353i c1353i;
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1353i) {
            c1353i = (C1353i) obj;
        } else {
            c1353i = null;
        }
        if (c1353i != null && this.f8292d == c1353i.f8292d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f8292d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f8289a);
        sb.append('.');
        sb.append(this.f8290b);
        sb.append('.');
        sb.append(this.f8291c);
        return sb.toString();
    }
}
