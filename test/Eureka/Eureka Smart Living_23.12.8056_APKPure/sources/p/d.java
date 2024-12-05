package p;

import java.util.HashSet;
import java.util.Iterator;
import o.i;
import t3.b0;

/* loaded from: classes.dex */
public class d {

    /* renamed from: b, reason: collision with root package name */
    public final e f8623b;

    /* renamed from: c, reason: collision with root package name */
    public final b f8624c;

    /* renamed from: d, reason: collision with root package name */
    public d f8625d;

    /* renamed from: g, reason: collision with root package name */
    o.i f8628g;

    /* renamed from: a, reason: collision with root package name */
    private HashSet f8622a = null;

    /* renamed from: e, reason: collision with root package name */
    public int f8626e = 0;

    /* renamed from: f, reason: collision with root package name */
    int f8627f = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f8629a;

        static {
            int[] iArr = new int[b.values().length];
            f8629a = iArr;
            try {
                iArr[b.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8629a[b.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8629a[b.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8629a[b.TOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f8629a[b.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f8629a[b.BASELINE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f8629a[b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f8629a[b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f8629a[b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public d(e eVar, b bVar) {
        this.f8623b = eVar;
        this.f8624c = bVar;
    }

    public boolean a(d dVar, int i6) {
        return b(dVar, i6, -1, false);
    }

    public boolean b(d dVar, int i6, int i7, boolean z5) {
        if (dVar == null) {
            l();
            return true;
        }
        if (!z5 && !k(dVar)) {
            return false;
        }
        this.f8625d = dVar;
        if (dVar.f8622a == null) {
            dVar.f8622a = new HashSet();
        }
        this.f8625d.f8622a.add(this);
        if (i6 > 0) {
            this.f8626e = i6;
        } else {
            this.f8626e = 0;
        }
        this.f8627f = i7;
        return true;
    }

    public int c() {
        d dVar;
        if (this.f8623b.O() == 8) {
            return 0;
        }
        return (this.f8627f <= -1 || (dVar = this.f8625d) == null || dVar.f8623b.O() != 8) ? this.f8626e : this.f8627f;
    }

    public final d d() {
        switch (a.f8629a[this.f8624c.ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
            case 2:
                return this.f8623b.D;
            case 3:
                return this.f8623b.B;
            case 4:
                return this.f8623b.E;
            case b0.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                return this.f8623b.C;
            default:
                throw new AssertionError(this.f8624c.name());
        }
    }

    public e e() {
        return this.f8623b;
    }

    public o.i f() {
        return this.f8628g;
    }

    public d g() {
        return this.f8625d;
    }

    public b h() {
        return this.f8624c;
    }

    public boolean i() {
        HashSet hashSet = this.f8622a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((d) it.next()).d().j()) {
                return true;
            }
        }
        return false;
    }

    public boolean j() {
        return this.f8625d != null;
    }

    public boolean k(d dVar) {
        if (dVar == null) {
            return false;
        }
        b h6 = dVar.h();
        b bVar = this.f8624c;
        if (h6 == bVar) {
            return bVar != b.BASELINE || (dVar.e().S() && e().S());
        }
        switch (a.f8629a[bVar.ordinal()]) {
            case 1:
                return (h6 == b.BASELINE || h6 == b.CENTER_X || h6 == b.CENTER_Y) ? false : true;
            case 2:
            case 3:
                boolean z5 = h6 == b.LEFT || h6 == b.RIGHT;
                if (dVar.e() instanceof h) {
                    return z5 || h6 == b.CENTER_X;
                }
                return z5;
            case 4:
            case b0.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                boolean z6 = h6 == b.TOP || h6 == b.BOTTOM;
                if (dVar.e() instanceof h) {
                    return z6 || h6 == b.CENTER_Y;
                }
                return z6;
            case 6:
            case 7:
            case 8:
            case 9:
                return false;
            default:
                throw new AssertionError(this.f8624c.name());
        }
    }

    public void l() {
        HashSet hashSet;
        d dVar = this.f8625d;
        if (dVar != null && (hashSet = dVar.f8622a) != null) {
            hashSet.remove(this);
        }
        this.f8625d = null;
        this.f8626e = 0;
        this.f8627f = -1;
    }

    public void m(o.c cVar) {
        o.i iVar = this.f8628g;
        if (iVar == null) {
            this.f8628g = new o.i(i.a.UNRESTRICTED, null);
        } else {
            iVar.d();
        }
    }

    public void n(int i6) {
        if (j()) {
            this.f8627f = i6;
        }
    }

    public String toString() {
        return this.f8623b.r() + ":" + this.f8624c.toString();
    }
}
