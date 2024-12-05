package g6;

import P5.N;
import b6.InterfaceC1985a;
import kotlin.jvm.internal.AbstractC3247p;

/* renamed from: g6.g, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C2887g implements Iterable, InterfaceC1985a {

    /* renamed from: d, reason: collision with root package name */
    public static final a f32071d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final int f32072a;

    /* renamed from: b, reason: collision with root package name */
    private final int f32073b;

    /* renamed from: c, reason: collision with root package name */
    private final int f32074c;

    /* renamed from: g6.g$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public final C2887g a(int i8, int i9, int i10) {
            return new C2887g(i8, i9, i10);
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    public C2887g(int i8, int i9, int i10) {
        if (i10 != 0) {
            if (i10 != Integer.MIN_VALUE) {
                this.f32072a = i8;
                this.f32073b = V5.c.c(i8, i9, i10);
                this.f32074c = i10;
                return;
            }
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        throw new IllegalArgumentException("Step must be non-zero.");
    }

    public final int e() {
        return this.f32072a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C2887g) {
            if (!isEmpty() || !((C2887g) obj).isEmpty()) {
                C2887g c2887g = (C2887g) obj;
                if (this.f32072a != c2887g.f32072a || this.f32073b != c2887g.f32073b || this.f32074c != c2887g.f32074c) {
                }
            }
            return true;
        }
        return false;
    }

    public final int f() {
        return this.f32073b;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f32072a * 31) + this.f32073b) * 31) + this.f32074c;
    }

    public boolean isEmpty() {
        if (this.f32074c > 0) {
            if (this.f32072a <= this.f32073b) {
                return false;
            }
        } else if (this.f32072a >= this.f32073b) {
            return false;
        }
        return true;
    }

    public final int j() {
        return this.f32074c;
    }

    @Override // java.lang.Iterable
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public N iterator() {
        return new h(this.f32072a, this.f32073b, this.f32074c);
    }

    public String toString() {
        StringBuilder sb;
        int i8;
        if (this.f32074c > 0) {
            sb = new StringBuilder();
            sb.append(this.f32072a);
            sb.append("..");
            sb.append(this.f32073b);
            sb.append(" step ");
            i8 = this.f32074c;
        } else {
            sb = new StringBuilder();
            sb.append(this.f32072a);
            sb.append(" downTo ");
            sb.append(this.f32073b);
            sb.append(" step ");
            i8 = -this.f32074c;
        }
        sb.append(i8);
        return sb.toString();
    }
}
