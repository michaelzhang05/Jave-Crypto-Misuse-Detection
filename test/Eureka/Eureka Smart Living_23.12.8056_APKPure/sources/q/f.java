package q;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class f implements d {

    /* renamed from: d, reason: collision with root package name */
    m f8921d;

    /* renamed from: f, reason: collision with root package name */
    int f8923f;

    /* renamed from: g, reason: collision with root package name */
    public int f8924g;

    /* renamed from: a, reason: collision with root package name */
    public d f8918a = null;

    /* renamed from: b, reason: collision with root package name */
    public boolean f8919b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f8920c = false;

    /* renamed from: e, reason: collision with root package name */
    a f8922e = a.UNKNOWN;

    /* renamed from: h, reason: collision with root package name */
    int f8925h = 1;

    /* renamed from: i, reason: collision with root package name */
    g f8926i = null;

    /* renamed from: j, reason: collision with root package name */
    public boolean f8927j = false;

    /* renamed from: k, reason: collision with root package name */
    List f8928k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    List f8929l = new ArrayList();

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

    public f(m mVar) {
        this.f8921d = mVar;
    }

    @Override // q.d
    public void a(d dVar) {
        Iterator it = this.f8929l.iterator();
        while (it.hasNext()) {
            if (!((f) it.next()).f8927j) {
                return;
            }
        }
        this.f8920c = true;
        d dVar2 = this.f8918a;
        if (dVar2 != null) {
            dVar2.a(this);
        }
        if (this.f8919b) {
            this.f8921d.a(this);
            return;
        }
        f fVar = null;
        int i6 = 0;
        for (f fVar2 : this.f8929l) {
            if (!(fVar2 instanceof g)) {
                i6++;
                fVar = fVar2;
            }
        }
        if (fVar != null && i6 == 1 && fVar.f8927j) {
            g gVar = this.f8926i;
            if (gVar != null) {
                if (!gVar.f8927j) {
                    return;
                } else {
                    this.f8923f = this.f8925h * gVar.f8924g;
                }
            }
            d(fVar.f8924g + this.f8923f);
        }
        d dVar3 = this.f8918a;
        if (dVar3 != null) {
            dVar3.a(this);
        }
    }

    public void b(d dVar) {
        this.f8928k.add(dVar);
        if (this.f8927j) {
            dVar.a(dVar);
        }
    }

    public void c() {
        this.f8929l.clear();
        this.f8928k.clear();
        this.f8927j = false;
        this.f8924g = 0;
        this.f8920c = false;
        this.f8919b = false;
    }

    public void d(int i6) {
        if (this.f8927j) {
            return;
        }
        this.f8927j = true;
        this.f8924g = i6;
        for (d dVar : this.f8928k) {
            dVar.a(dVar);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f8921d.f8954b.r());
        sb.append(":");
        sb.append(this.f8922e);
        sb.append("(");
        sb.append(this.f8927j ? Integer.valueOf(this.f8924g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f8929l.size());
        sb.append(":d=");
        sb.append(this.f8928k.size());
        sb.append(">");
        return sb.toString();
    }
}
