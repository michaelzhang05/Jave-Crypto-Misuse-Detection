package g5;

import a5.a0;

/* loaded from: classes.dex */
public class a implements Iterable {

    /* renamed from: d, reason: collision with root package name */
    public static final C0102a f6794d = new C0102a(null);

    /* renamed from: a, reason: collision with root package name */
    private final int f6795a;

    /* renamed from: b, reason: collision with root package name */
    private final int f6796b;

    /* renamed from: c, reason: collision with root package name */
    private final int f6797c;

    /* renamed from: g5.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0102a {
        private C0102a() {
        }

        public /* synthetic */ C0102a(f5.f fVar) {
            this();
        }

        public final a a(int i6, int i7, int i8) {
            return new a(i6, i7, i8);
        }
    }

    public a(int i6, int i7, int i8) {
        if (i8 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i8 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f6795a = i6;
        this.f6796b = c5.a.b(i6, i7, i8);
        this.f6797c = i8;
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            if (!isEmpty() || !((a) obj).isEmpty()) {
                a aVar = (a) obj;
                if (this.f6795a != aVar.f6795a || this.f6796b != aVar.f6796b || this.f6797c != aVar.f6797c) {
                }
            }
            return true;
        }
        return false;
    }

    public final int h() {
        return this.f6795a;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f6795a * 31) + this.f6796b) * 31) + this.f6797c;
    }

    public final int i() {
        return this.f6796b;
    }

    public boolean isEmpty() {
        if (this.f6797c > 0) {
            if (this.f6795a > this.f6796b) {
                return true;
            }
        } else if (this.f6795a < this.f6796b) {
            return true;
        }
        return false;
    }

    public final int j() {
        return this.f6797c;
    }

    @Override // java.lang.Iterable
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public a0 iterator() {
        return new b(this.f6795a, this.f6796b, this.f6797c);
    }

    public String toString() {
        StringBuilder sb;
        int i6;
        if (this.f6797c > 0) {
            sb = new StringBuilder();
            sb.append(this.f6795a);
            sb.append("..");
            sb.append(this.f6796b);
            sb.append(" step ");
            i6 = this.f6797c;
        } else {
            sb = new StringBuilder();
            sb.append(this.f6795a);
            sb.append(" downTo ");
            sb.append(this.f6796b);
            sb.append(" step ");
            i6 = -this.f6797c;
        }
        sb.append(i6);
        return sb.toString();
    }
}
