package androidx.lifecycle;

import androidx.lifecycle.f;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* compiled from: LifecycleRegistry.java */
/* loaded from: classes.dex */
public class k extends f {

    /* renamed from: d, reason: collision with root package name */
    private final WeakReference<j> f1264d;

    /* renamed from: b, reason: collision with root package name */
    private c.b.a.b.a<i, b> f1262b = new c.b.a.b.a<>();

    /* renamed from: e, reason: collision with root package name */
    private int f1265e = 0;

    /* renamed from: f, reason: collision with root package name */
    private boolean f1266f = false;

    /* renamed from: g, reason: collision with root package name */
    private boolean f1267g = false;

    /* renamed from: h, reason: collision with root package name */
    private ArrayList<f.b> f1268h = new ArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    private f.b f1263c = f.b.INITIALIZED;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LifecycleRegistry.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f1269b;

        static {
            int[] iArr = new int[f.b.values().length];
            f1269b = iArr;
            try {
                iArr[f.b.INITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1269b[f.b.CREATED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1269b[f.b.STARTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1269b[f.b.RESUMED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1269b[f.b.DESTROYED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[f.a.values().length];
            a = iArr2;
            try {
                iArr2[f.a.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[f.a.ON_STOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[f.a.ON_START.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[f.a.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[f.a.ON_RESUME.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[f.a.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[f.a.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LifecycleRegistry.java */
    /* loaded from: classes.dex */
    public static class b {
        f.b a;

        /* renamed from: b, reason: collision with root package name */
        h f1270b;

        b(i iVar, f.b bVar) {
            this.f1270b = n.f(iVar);
            this.a = bVar;
        }

        void a(j jVar, f.a aVar) {
            f.b h2 = k.h(aVar);
            this.a = k.l(this.a, h2);
            this.f1270b.a(jVar, aVar);
            this.a = h2;
        }
    }

    public k(j jVar) {
        this.f1264d = new WeakReference<>(jVar);
    }

    private void d(j jVar) {
        Iterator<Map.Entry<i, b>> a2 = this.f1262b.a();
        while (a2.hasNext() && !this.f1267g) {
            Map.Entry<i, b> next = a2.next();
            b value = next.getValue();
            while (value.a.compareTo(this.f1263c) > 0 && !this.f1267g && this.f1262b.contains(next.getKey())) {
                f.a f2 = f(value.a);
                o(h(f2));
                value.a(jVar, f2);
                n();
            }
        }
    }

    private f.b e(i iVar) {
        Map.Entry<i, b> J = this.f1262b.J(iVar);
        f.b bVar = null;
        f.b bVar2 = J != null ? J.getValue().a : null;
        if (!this.f1268h.isEmpty()) {
            bVar = this.f1268h.get(r0.size() - 1);
        }
        return l(l(this.f1263c, bVar2), bVar);
    }

    private static f.a f(f.b bVar) {
        int i2 = a.f1269b[bVar.ordinal()];
        if (i2 == 1) {
            throw new IllegalArgumentException();
        }
        if (i2 == 2) {
            return f.a.ON_DESTROY;
        }
        if (i2 == 3) {
            return f.a.ON_STOP;
        }
        if (i2 == 4) {
            return f.a.ON_PAUSE;
        }
        if (i2 != 5) {
            throw new IllegalArgumentException("Unexpected state value " + bVar);
        }
        throw new IllegalArgumentException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void g(j jVar) {
        c.b.a.b.b<i, b>.d o = this.f1262b.o();
        while (o.hasNext() && !this.f1267g) {
            Map.Entry next = o.next();
            b bVar = (b) next.getValue();
            while (bVar.a.compareTo(this.f1263c) < 0 && !this.f1267g && this.f1262b.contains(next.getKey())) {
                o(bVar.a);
                bVar.a(jVar, r(bVar.a));
                n();
            }
        }
    }

    static f.b h(f.a aVar) {
        switch (a.a[aVar.ordinal()]) {
            case 1:
            case 2:
                return f.b.CREATED;
            case 3:
            case 4:
                return f.b.STARTED;
            case 5:
                return f.b.RESUMED;
            case 6:
                return f.b.DESTROYED;
            default:
                throw new IllegalArgumentException("Unexpected event value " + aVar);
        }
    }

    private boolean j() {
        if (this.f1262b.size() == 0) {
            return true;
        }
        f.b bVar = this.f1262b.b().getValue().a;
        f.b bVar2 = this.f1262b.w().getValue().a;
        return bVar == bVar2 && this.f1263c == bVar2;
    }

    static f.b l(f.b bVar, f.b bVar2) {
        return (bVar2 == null || bVar2.compareTo(bVar) >= 0) ? bVar : bVar2;
    }

    private void m(f.b bVar) {
        if (this.f1263c == bVar) {
            return;
        }
        this.f1263c = bVar;
        if (!this.f1266f && this.f1265e == 0) {
            this.f1266f = true;
            q();
            this.f1266f = false;
            return;
        }
        this.f1267g = true;
    }

    private void n() {
        this.f1268h.remove(r0.size() - 1);
    }

    private void o(f.b bVar) {
        this.f1268h.add(bVar);
    }

    private void q() {
        j jVar = this.f1264d.get();
        if (jVar != null) {
            while (!j()) {
                this.f1267g = false;
                if (this.f1263c.compareTo(this.f1262b.b().getValue().a) < 0) {
                    d(jVar);
                }
                Map.Entry<i, b> w = this.f1262b.w();
                if (!this.f1267g && w != null && this.f1263c.compareTo(w.getValue().a) > 0) {
                    g(jVar);
                }
            }
            this.f1267g = false;
            return;
        }
        throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
    }

    private static f.a r(f.b bVar) {
        int i2 = a.f1269b[bVar.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                return f.a.ON_START;
            }
            if (i2 == 3) {
                return f.a.ON_RESUME;
            }
            if (i2 == 4) {
                throw new IllegalArgumentException();
            }
            if (i2 != 5) {
                throw new IllegalArgumentException("Unexpected state value " + bVar);
            }
        }
        return f.a.ON_CREATE;
    }

    @Override // androidx.lifecycle.f
    public void a(i iVar) {
        j jVar;
        f.b bVar = this.f1263c;
        f.b bVar2 = f.b.DESTROYED;
        if (bVar != bVar2) {
            bVar2 = f.b.INITIALIZED;
        }
        b bVar3 = new b(iVar, bVar2);
        if (this.f1262b.z(iVar, bVar3) == null && (jVar = this.f1264d.get()) != null) {
            boolean z = this.f1265e != 0 || this.f1266f;
            f.b e2 = e(iVar);
            this.f1265e++;
            while (bVar3.a.compareTo(e2) < 0 && this.f1262b.contains(iVar)) {
                o(bVar3.a);
                bVar3.a(jVar, r(bVar3.a));
                n();
                e2 = e(iVar);
            }
            if (!z) {
                q();
            }
            this.f1265e--;
        }
    }

    @Override // androidx.lifecycle.f
    public f.b b() {
        return this.f1263c;
    }

    @Override // androidx.lifecycle.f
    public void c(i iVar) {
        this.f1262b.D(iVar);
    }

    public void i(f.a aVar) {
        m(h(aVar));
    }

    @Deprecated
    public void k(f.b bVar) {
        p(bVar);
    }

    public void p(f.b bVar) {
        m(bVar);
    }
}
