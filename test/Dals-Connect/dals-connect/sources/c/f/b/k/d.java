package c.f.b.k;

import c.f.b.i;
import c.f.b.k.m.o;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: ConstraintAnchor.java */
/* loaded from: classes.dex */
public class d {

    /* renamed from: b, reason: collision with root package name */
    private int f2516b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f2517c;

    /* renamed from: d, reason: collision with root package name */
    public final e f2518d;

    /* renamed from: e, reason: collision with root package name */
    public final b f2519e;

    /* renamed from: f, reason: collision with root package name */
    public d f2520f;

    /* renamed from: i, reason: collision with root package name */
    c.f.b.i f2523i;
    private HashSet<d> a = null;

    /* renamed from: g, reason: collision with root package name */
    public int f2521g = 0;

    /* renamed from: h, reason: collision with root package name */
    int f2522h = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ConstraintAnchor.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[b.values().length];
            a = iArr;
            try {
                iArr[b.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[b.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[b.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[b.TOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[b.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[b.BASELINE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* compiled from: ConstraintAnchor.java */
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
        this.f2518d = eVar;
        this.f2519e = bVar;
    }

    public boolean a(d dVar, int i2, int i3, boolean z) {
        if (dVar == null) {
            p();
            return true;
        }
        if (!z && !o(dVar)) {
            return false;
        }
        this.f2520f = dVar;
        if (dVar.a == null) {
            dVar.a = new HashSet<>();
        }
        HashSet<d> hashSet = this.f2520f.a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        if (i2 > 0) {
            this.f2521g = i2;
        } else {
            this.f2521g = 0;
        }
        this.f2522h = i3;
        return true;
    }

    public void b(int i2, ArrayList<o> arrayList, o oVar) {
        HashSet<d> hashSet = this.a;
        if (hashSet != null) {
            Iterator<d> it = hashSet.iterator();
            while (it.hasNext()) {
                c.f.b.k.m.i.a(it.next().f2518d, i2, arrayList, oVar);
            }
        }
    }

    public HashSet<d> c() {
        return this.a;
    }

    public int d() {
        if (this.f2517c) {
            return this.f2516b;
        }
        return 0;
    }

    public int e() {
        d dVar;
        if (this.f2518d.Q() == 8) {
            return 0;
        }
        if (this.f2522h > -1 && (dVar = this.f2520f) != null && dVar.f2518d.Q() == 8) {
            return this.f2522h;
        }
        return this.f2521g;
    }

    public final d f() {
        switch (a.a[this.f2519e.ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
            case 2:
                return this.f2518d.K;
            case 3:
                return this.f2518d.I;
            case 4:
                return this.f2518d.L;
            case 5:
                return this.f2518d.J;
            default:
                throw new AssertionError(this.f2519e.name());
        }
    }

    public e g() {
        return this.f2518d;
    }

    public c.f.b.i h() {
        return this.f2523i;
    }

    public d i() {
        return this.f2520f;
    }

    public b j() {
        return this.f2519e;
    }

    public boolean k() {
        HashSet<d> hashSet = this.a;
        if (hashSet == null) {
            return false;
        }
        Iterator<d> it = hashSet.iterator();
        while (it.hasNext()) {
            if (it.next().f().n()) {
                return true;
            }
        }
        return false;
    }

    public boolean l() {
        HashSet<d> hashSet = this.a;
        return hashSet != null && hashSet.size() > 0;
    }

    public boolean m() {
        return this.f2517c;
    }

    public boolean n() {
        return this.f2520f != null;
    }

    public boolean o(d dVar) {
        if (dVar == null) {
            return false;
        }
        b j2 = dVar.j();
        b bVar = this.f2519e;
        if (j2 == bVar) {
            return bVar != b.BASELINE || (dVar.g().U() && g().U());
        }
        switch (a.a[bVar.ordinal()]) {
            case 1:
                return (j2 == b.BASELINE || j2 == b.CENTER_X || j2 == b.CENTER_Y) ? false : true;
            case 2:
            case 3:
                boolean z = j2 == b.LEFT || j2 == b.RIGHT;
                if (dVar.g() instanceof g) {
                    return z || j2 == b.CENTER_X;
                }
                return z;
            case 4:
            case 5:
                boolean z2 = j2 == b.TOP || j2 == b.BOTTOM;
                if (dVar.g() instanceof g) {
                    return z2 || j2 == b.CENTER_Y;
                }
                return z2;
            case 6:
            case 7:
            case 8:
            case 9:
                return false;
            default:
                throw new AssertionError(this.f2519e.name());
        }
    }

    public void p() {
        HashSet<d> hashSet;
        d dVar = this.f2520f;
        if (dVar != null && (hashSet = dVar.a) != null) {
            hashSet.remove(this);
            if (this.f2520f.a.size() == 0) {
                this.f2520f.a = null;
            }
        }
        this.a = null;
        this.f2520f = null;
        this.f2521g = 0;
        this.f2522h = -1;
        this.f2517c = false;
        this.f2516b = 0;
    }

    public void q() {
        this.f2517c = false;
        this.f2516b = 0;
    }

    public void r(c.f.b.c cVar) {
        c.f.b.i iVar = this.f2523i;
        if (iVar == null) {
            this.f2523i = new c.f.b.i(i.a.UNRESTRICTED, null);
        } else {
            iVar.d();
        }
    }

    public void s(int i2) {
        this.f2516b = i2;
        this.f2517c = true;
    }

    public String toString() {
        return this.f2518d.r() + ":" + this.f2519e.toString();
    }
}
