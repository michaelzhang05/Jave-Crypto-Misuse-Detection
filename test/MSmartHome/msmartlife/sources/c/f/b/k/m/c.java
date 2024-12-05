package c.f.b.k.m;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: ChainRun.java */
/* loaded from: classes.dex */
public class c extends p {

    /* renamed from: k, reason: collision with root package name */
    ArrayList<p> f2558k;
    private int l;

    public c(c.f.b.k.e eVar, int i2) {
        super(eVar);
        this.f2558k = new ArrayList<>();
        this.f2609f = i2;
        q();
    }

    private void q() {
        c.f.b.k.e eVar;
        c.f.b.k.e eVar2 = this.f2605b;
        c.f.b.k.e J = eVar2.J(this.f2609f);
        while (true) {
            c.f.b.k.e eVar3 = J;
            eVar = eVar2;
            eVar2 = eVar3;
            if (eVar2 == null) {
                break;
            } else {
                J = eVar2.J(this.f2609f);
            }
        }
        this.f2605b = eVar;
        this.f2558k.add(eVar.L(this.f2609f));
        c.f.b.k.e H = eVar.H(this.f2609f);
        while (H != null) {
            this.f2558k.add(H.L(this.f2609f));
            H = H.H(this.f2609f);
        }
        Iterator<p> it = this.f2558k.iterator();
        while (it.hasNext()) {
            p next = it.next();
            int i2 = this.f2609f;
            if (i2 == 0) {
                next.f2605b.f2532d = this;
            } else if (i2 == 1) {
                next.f2605b.f2533e = this;
            }
        }
        if ((this.f2609f == 0 && ((c.f.b.k.f) this.f2605b.I()).x1()) && this.f2558k.size() > 1) {
            ArrayList<p> arrayList = this.f2558k;
            this.f2605b = arrayList.get(arrayList.size() - 1).f2605b;
        }
        this.l = this.f2609f == 0 ? this.f2605b.x() : this.f2605b.N();
    }

    private c.f.b.k.e r() {
        for (int i2 = 0; i2 < this.f2558k.size(); i2++) {
            p pVar = this.f2558k.get(i2);
            if (pVar.f2605b.Q() != 8) {
                return pVar.f2605b;
            }
        }
        return null;
    }

    private c.f.b.k.e s() {
        for (int size = this.f2558k.size() - 1; size >= 0; size--) {
            p pVar = this.f2558k.get(size);
            if (pVar.f2605b.Q() != 8) {
                return pVar.f2605b;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x01a6, code lost:
    
        if (r1 != r7) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01d1, code lost:
    
        r9.f2608e.d(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01ce, code lost:
    
        r13 = r13 + 1;
        r7 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x01cc, code lost:
    
        if (r1 != r7) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x041a, code lost:
    
        r7 = r7 - r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00eb  */
    @Override // c.f.b.k.m.p, c.f.b.k.m.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(c.f.b.k.m.d r26) {
        /*
            Method dump skipped, instructions count: 1090
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.b.k.m.c.a(c.f.b.k.m.d):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // c.f.b.k.m.p
    public void d() {
        Iterator<p> it = this.f2558k.iterator();
        while (it.hasNext()) {
            it.next().d();
        }
        int size = this.f2558k.size();
        if (size < 1) {
            return;
        }
        c.f.b.k.e eVar = this.f2558k.get(0).f2605b;
        c.f.b.k.e eVar2 = this.f2558k.get(size - 1).f2605b;
        if (this.f2609f == 0) {
            c.f.b.k.d dVar = eVar.I;
            c.f.b.k.d dVar2 = eVar2.K;
            f i2 = i(dVar, 0);
            int e2 = dVar.e();
            c.f.b.k.e r = r();
            if (r != null) {
                e2 = r.I.e();
            }
            if (i2 != null) {
                b(this.f2611h, i2, e2);
            }
            f i3 = i(dVar2, 0);
            int e3 = dVar2.e();
            c.f.b.k.e s = s();
            if (s != null) {
                e3 = s.K.e();
            }
            if (i3 != null) {
                b(this.f2612i, i3, -e3);
            }
        } else {
            c.f.b.k.d dVar3 = eVar.J;
            c.f.b.k.d dVar4 = eVar2.L;
            f i4 = i(dVar3, 1);
            int e4 = dVar3.e();
            c.f.b.k.e r2 = r();
            if (r2 != null) {
                e4 = r2.J.e();
            }
            if (i4 != null) {
                b(this.f2611h, i4, e4);
            }
            f i5 = i(dVar4, 1);
            int e5 = dVar4.e();
            c.f.b.k.e s2 = s();
            if (s2 != null) {
                e5 = s2.L.e();
            }
            if (i5 != null) {
                b(this.f2612i, i5, -e5);
            }
        }
        this.f2611h.a = this;
        this.f2612i.a = this;
    }

    @Override // c.f.b.k.m.p
    public void e() {
        for (int i2 = 0; i2 < this.f2558k.size(); i2++) {
            this.f2558k.get(i2).e();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // c.f.b.k.m.p
    public void f() {
        this.f2606c = null;
        Iterator<p> it = this.f2558k.iterator();
        while (it.hasNext()) {
            it.next().f();
        }
    }

    @Override // c.f.b.k.m.p
    public long j() {
        int size = this.f2558k.size();
        long j2 = 0;
        for (int i2 = 0; i2 < size; i2++) {
            j2 = j2 + r4.f2611h.f2571f + this.f2558k.get(i2).j() + r4.f2612i.f2571f;
        }
        return j2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // c.f.b.k.m.p
    public boolean m() {
        int size = this.f2558k.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (!this.f2558k.get(i2).m()) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ChainRun ");
        sb.append(this.f2609f == 0 ? "horizontal : " : "vertical : ");
        String sb2 = sb.toString();
        Iterator<p> it = this.f2558k.iterator();
        while (it.hasNext()) {
            String str = sb2 + "<";
            sb2 = (str + it.next()) + "> ";
        }
        return sb2;
    }
}
