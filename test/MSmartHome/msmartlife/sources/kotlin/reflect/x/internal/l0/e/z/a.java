package kotlin.reflect.x.internal.l0.e.z;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.b0;
import kotlin.collections.m;
import kotlin.collections.n;
import kotlin.collections.t;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;

/* compiled from: BinaryVersion.kt */
/* loaded from: classes2.dex */
public abstract class a {
    public static final C0328a a = new C0328a(null);

    /* renamed from: b, reason: collision with root package name */
    private final int[] f20686b;

    /* renamed from: c, reason: collision with root package name */
    private final int f20687c;

    /* renamed from: d, reason: collision with root package name */
    private final int f20688d;

    /* renamed from: e, reason: collision with root package name */
    private final int f20689e;

    /* renamed from: f, reason: collision with root package name */
    private final List<Integer> f20690f;

    /* compiled from: BinaryVersion.kt */
    /* renamed from: kotlin.f0.x.e.l0.e.z.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0328a {
        private C0328a() {
        }

        public /* synthetic */ C0328a(g gVar) {
            this();
        }
    }

    public a(int... iArr) {
        Integer A;
        Integer A2;
        Integer A3;
        List<Integer> i2;
        List<Integer> b2;
        l.f(iArr, "numbers");
        this.f20686b = iArr;
        A = n.A(iArr, 0);
        this.f20687c = A != null ? A.intValue() : -1;
        A2 = n.A(iArr, 1);
        this.f20688d = A2 != null ? A2.intValue() : -1;
        A3 = n.A(iArr, 2);
        this.f20689e = A3 != null ? A3.intValue() : -1;
        if (iArr.length > 3) {
            if (iArr.length <= 1024) {
                b2 = m.b(iArr);
                i2 = b0.y0(b2.subList(3, iArr.length));
            } else {
                throw new IllegalArgumentException("BinaryVersion with length more than 1024 are not supported. Provided length " + iArr.length + '.');
            }
        } else {
            i2 = t.i();
        }
        this.f20690f = i2;
    }

    public final int a() {
        return this.f20687c;
    }

    public final int b() {
        return this.f20688d;
    }

    public final boolean c(int i2, int i3, int i4) {
        int i5 = this.f20687c;
        if (i5 > i2) {
            return true;
        }
        if (i5 < i2) {
            return false;
        }
        int i6 = this.f20688d;
        if (i6 > i3) {
            return true;
        }
        return i6 >= i3 && this.f20689e >= i4;
    }

    public final boolean d(a aVar) {
        l.f(aVar, "version");
        return c(aVar.f20687c, aVar.f20688d, aVar.f20689e);
    }

    public final boolean e(int i2, int i3, int i4) {
        int i5 = this.f20687c;
        if (i5 < i2) {
            return true;
        }
        if (i5 > i2) {
            return false;
        }
        int i6 = this.f20688d;
        if (i6 < i3) {
            return true;
        }
        return i6 <= i3 && this.f20689e <= i4;
    }

    public boolean equals(Object obj) {
        if (obj != null && l.a(getClass(), obj.getClass())) {
            a aVar = (a) obj;
            if (this.f20687c == aVar.f20687c && this.f20688d == aVar.f20688d && this.f20689e == aVar.f20689e && l.a(this.f20690f, aVar.f20690f)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean f(a aVar) {
        l.f(aVar, "ourVersion");
        int i2 = this.f20687c;
        if (i2 == 0) {
            if (aVar.f20687c == 0 && this.f20688d == aVar.f20688d) {
                return true;
            }
        } else if (i2 == aVar.f20687c && this.f20688d <= aVar.f20688d) {
            return true;
        }
        return false;
    }

    public final int[] g() {
        return this.f20686b;
    }

    public int hashCode() {
        int i2 = this.f20687c;
        int i3 = i2 + (i2 * 31) + this.f20688d;
        int i4 = i3 + (i3 * 31) + this.f20689e;
        return i4 + (i4 * 31) + this.f20690f.hashCode();
    }

    public String toString() {
        String b0;
        int[] g2 = g();
        ArrayList arrayList = new ArrayList();
        int length = g2.length;
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = g2[i2];
            if (!(i3 != -1)) {
                break;
            }
            arrayList.add(Integer.valueOf(i3));
        }
        if (arrayList.isEmpty()) {
            return "unknown";
        }
        b0 = b0.b0(arrayList, ".", null, null, 0, null, null, 62, null);
        return b0;
    }
}
