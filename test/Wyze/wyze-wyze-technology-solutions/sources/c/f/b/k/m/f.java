package c.f.b.k.m;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: DependencyNode.java */
/* loaded from: classes.dex */
public class f implements d {

    /* renamed from: d, reason: collision with root package name */
    p f2569d;

    /* renamed from: f, reason: collision with root package name */
    int f2571f;

    /* renamed from: g, reason: collision with root package name */
    public int f2572g;
    public d a = null;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2567b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2568c = false;

    /* renamed from: e, reason: collision with root package name */
    a f2570e = a.UNKNOWN;

    /* renamed from: h, reason: collision with root package name */
    int f2573h = 1;

    /* renamed from: i, reason: collision with root package name */
    g f2574i = null;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2575j = false;

    /* renamed from: k, reason: collision with root package name */
    List<d> f2576k = new ArrayList();
    List<f> l = new ArrayList();

    /* compiled from: DependencyNode.java */
    /* loaded from: classes.dex */
    enum a {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public f(p pVar) {
        this.f2569d = pVar;
    }

    @Override // c.f.b.k.m.d
    public void a(d dVar) {
        Iterator<f> it = this.l.iterator();
        while (it.hasNext()) {
            if (!it.next().f2575j) {
                return;
            }
        }
        this.f2568c = true;
        d dVar2 = this.a;
        if (dVar2 != null) {
            dVar2.a(this);
        }
        if (this.f2567b) {
            this.f2569d.a(this);
            return;
        }
        f fVar = null;
        int i2 = 0;
        for (f fVar2 : this.l) {
            if (!(fVar2 instanceof g)) {
                i2++;
                fVar = fVar2;
            }
        }
        if (fVar != null && i2 == 1 && fVar.f2575j) {
            g gVar = this.f2574i;
            if (gVar != null) {
                if (!gVar.f2575j) {
                    return;
                } else {
                    this.f2571f = this.f2573h * gVar.f2572g;
                }
            }
            d(fVar.f2572g + this.f2571f);
        }
        d dVar3 = this.a;
        if (dVar3 != null) {
            dVar3.a(this);
        }
    }

    public void b(d dVar) {
        this.f2576k.add(dVar);
        if (this.f2575j) {
            dVar.a(dVar);
        }
    }

    public void c() {
        this.l.clear();
        this.f2576k.clear();
        this.f2575j = false;
        this.f2572g = 0;
        this.f2568c = false;
        this.f2567b = false;
    }

    public void d(int i2) {
        if (this.f2575j) {
            return;
        }
        this.f2575j = true;
        this.f2572g = i2;
        for (d dVar : this.f2576k) {
            dVar.a(dVar);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f2569d.f2605b.r());
        sb.append(":");
        sb.append(this.f2570e);
        sb.append("(");
        sb.append(this.f2575j ? Integer.valueOf(this.f2572g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.l.size());
        sb.append(":d=");
        sb.append(this.f2576k.size());
        sb.append(">");
        return sb.toString();
    }
}
