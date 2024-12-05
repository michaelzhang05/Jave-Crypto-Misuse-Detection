package c.f.b.k.m;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: WidgetGroup.java */
/* loaded from: classes.dex */
public class o {
    static int a;

    /* renamed from: c, reason: collision with root package name */
    int f2593c;

    /* renamed from: e, reason: collision with root package name */
    int f2595e;

    /* renamed from: b, reason: collision with root package name */
    ArrayList<c.f.b.k.e> f2592b = new ArrayList<>();

    /* renamed from: d, reason: collision with root package name */
    boolean f2594d = false;

    /* renamed from: f, reason: collision with root package name */
    ArrayList<a> f2596f = null;

    /* renamed from: g, reason: collision with root package name */
    private int f2597g = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WidgetGroup.java */
    /* loaded from: classes.dex */
    public class a {
        WeakReference<c.f.b.k.e> a;

        /* renamed from: b, reason: collision with root package name */
        int f2598b;

        /* renamed from: c, reason: collision with root package name */
        int f2599c;

        /* renamed from: d, reason: collision with root package name */
        int f2600d;

        /* renamed from: e, reason: collision with root package name */
        int f2601e;

        /* renamed from: f, reason: collision with root package name */
        int f2602f;

        /* renamed from: g, reason: collision with root package name */
        int f2603g;

        public a(c.f.b.k.e eVar, c.f.b.d dVar, int i2) {
            this.a = new WeakReference<>(eVar);
            this.f2598b = dVar.x(eVar.I);
            this.f2599c = dVar.x(eVar.J);
            this.f2600d = dVar.x(eVar.K);
            this.f2601e = dVar.x(eVar.L);
            this.f2602f = dVar.x(eVar.M);
            this.f2603g = i2;
        }
    }

    public o(int i2) {
        this.f2593c = -1;
        this.f2595e = 0;
        int i3 = a;
        a = i3 + 1;
        this.f2593c = i3;
        this.f2595e = i2;
    }

    private String e() {
        int i2 = this.f2595e;
        return i2 == 0 ? "Horizontal" : i2 == 1 ? "Vertical" : i2 == 2 ? "Both" : "Unknown";
    }

    private int j(c.f.b.d dVar, ArrayList<c.f.b.k.e> arrayList, int i2) {
        int x;
        int x2;
        c.f.b.k.f fVar = (c.f.b.k.f) arrayList.get(0).I();
        dVar.D();
        fVar.g(dVar, false);
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            arrayList.get(i3).g(dVar, false);
        }
        if (i2 == 0 && fVar.O0 > 0) {
            c.f.b.k.b.b(fVar, dVar, arrayList, 0);
        }
        if (i2 == 1 && fVar.P0 > 0) {
            c.f.b.k.b.b(fVar, dVar, arrayList, 1);
        }
        try {
            dVar.z();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        this.f2596f = new ArrayList<>();
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            this.f2596f.add(new a(arrayList.get(i4), dVar, i2));
        }
        if (i2 == 0) {
            x = dVar.x(fVar.I);
            x2 = dVar.x(fVar.K);
            dVar.D();
        } else {
            x = dVar.x(fVar.J);
            x2 = dVar.x(fVar.L);
            dVar.D();
        }
        return x2 - x;
    }

    public boolean a(c.f.b.k.e eVar) {
        if (this.f2592b.contains(eVar)) {
            return false;
        }
        this.f2592b.add(eVar);
        return true;
    }

    public void b(ArrayList<o> arrayList) {
        int size = this.f2592b.size();
        if (this.f2597g != -1 && size > 0) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                o oVar = arrayList.get(i2);
                if (this.f2597g == oVar.f2593c) {
                    g(this.f2595e, oVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public int c() {
        return this.f2593c;
    }

    public int d() {
        return this.f2595e;
    }

    public int f(c.f.b.d dVar, int i2) {
        if (this.f2592b.size() == 0) {
            return 0;
        }
        return j(dVar, this.f2592b, i2);
    }

    public void g(int i2, o oVar) {
        Iterator<c.f.b.k.e> it = this.f2592b.iterator();
        while (it.hasNext()) {
            c.f.b.k.e next = it.next();
            oVar.a(next);
            if (i2 == 0) {
                next.B0 = oVar.c();
            } else {
                next.C0 = oVar.c();
            }
        }
        this.f2597g = oVar.f2593c;
    }

    public void h(boolean z) {
        this.f2594d = z;
    }

    public void i(int i2) {
        this.f2595e = i2;
    }

    public String toString() {
        String str = e() + " [" + this.f2593c + "] <";
        Iterator<c.f.b.k.e> it = this.f2592b.iterator();
        while (it.hasNext()) {
            str = str + " " + it.next().r();
        }
        return str + " >";
    }
}
