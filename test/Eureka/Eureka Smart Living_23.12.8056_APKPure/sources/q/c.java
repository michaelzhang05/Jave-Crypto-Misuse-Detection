package q;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class c extends m {

    /* renamed from: k, reason: collision with root package name */
    ArrayList f8907k;

    /* renamed from: l, reason: collision with root package name */
    private int f8908l;

    public c(p.e eVar, int i6) {
        super(eVar);
        this.f8907k = new ArrayList();
        this.f8958f = i6;
        q();
    }

    private void q() {
        p.e eVar;
        p.e eVar2 = this.f8954b;
        do {
            eVar = eVar2;
            eVar2 = eVar2.H(this.f8958f);
        } while (eVar2 != null);
        this.f8954b = eVar;
        this.f8907k.add(eVar.J(this.f8958f));
        p.e F = eVar.F(this.f8958f);
        while (F != null) {
            this.f8907k.add(F.J(this.f8958f));
            F = F.F(this.f8958f);
        }
        Iterator it = this.f8907k.iterator();
        while (it.hasNext()) {
            m mVar = (m) it.next();
            int i6 = this.f8958f;
            if (i6 == 0) {
                mVar.f8954b.f8645c = this;
            } else if (i6 == 1) {
                mVar.f8954b.f8647d = this;
            }
        }
        if ((this.f8958f == 0 && ((p.f) this.f8954b.G()).a1()) && this.f8907k.size() > 1) {
            ArrayList arrayList = this.f8907k;
            this.f8954b = ((m) arrayList.get(arrayList.size() - 1)).f8954b;
        }
        this.f8908l = this.f8958f == 0 ? this.f8954b.x() : this.f8954b.L();
    }

    private p.e r() {
        for (int i6 = 0; i6 < this.f8907k.size(); i6++) {
            m mVar = (m) this.f8907k.get(i6);
            if (mVar.f8954b.O() != 8) {
                return mVar.f8954b;
            }
        }
        return null;
    }

    private p.e s() {
        for (int size = this.f8907k.size() - 1; size >= 0; size--) {
            m mVar = (m) this.f8907k.get(size);
            if (mVar.f8954b.O() != 8) {
                return mVar.f8954b;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x01a0, code lost:
    
        if (r1 != r7) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01cb, code lost:
    
        r9.f8957e.d(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01c8, code lost:
    
        r13 = r13 + 1;
        r7 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x01c6, code lost:
    
        if (r1 != r7) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x03eb, code lost:
    
        r7 = r7 - r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00eb  */
    @Override // q.m, q.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(q.d r26) {
        /*
            Method dump skipped, instructions count: 1034
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q.c.a(q.d):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006d, code lost:
    
        if (r1 != null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a5, code lost:
    
        b(r5.f8961i, r1, -r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a3, code lost:
    
        if (r1 != null) goto L30;
     */
    @Override // q.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d() {
        /*
            r5 = this;
            java.util.ArrayList r0 = r5.f8907k
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            q.m r1 = (q.m) r1
            r1.d()
            goto L6
        L16:
            java.util.ArrayList r0 = r5.f8907k
            int r0 = r0.size()
            r1 = 1
            if (r0 >= r1) goto L20
            return
        L20:
            java.util.ArrayList r2 = r5.f8907k
            r3 = 0
            java.lang.Object r2 = r2.get(r3)
            q.m r2 = (q.m) r2
            p.e r2 = r2.f8954b
            java.util.ArrayList r4 = r5.f8907k
            int r0 = r0 - r1
            java.lang.Object r0 = r4.get(r0)
            q.m r0 = (q.m) r0
            p.e r0 = r0.f8954b
            int r4 = r5.f8958f
            if (r4 != 0) goto L70
            p.d r1 = r2.B
            p.d r0 = r0.D
            q.f r2 = r5.i(r1, r3)
            int r1 = r1.c()
            p.e r4 = r5.r()
            if (r4 == 0) goto L52
            p.d r1 = r4.B
            int r1 = r1.c()
        L52:
            if (r2 == 0) goto L59
            q.f r4 = r5.f8960h
            r5.b(r4, r2, r1)
        L59:
            q.f r1 = r5.i(r0, r3)
            int r0 = r0.c()
            p.e r2 = r5.s()
            if (r2 == 0) goto L6d
            p.d r0 = r2.D
            int r0 = r0.c()
        L6d:
            if (r1 == 0) goto Lab
            goto La5
        L70:
            p.d r2 = r2.C
            p.d r0 = r0.E
            q.f r3 = r5.i(r2, r1)
            int r2 = r2.c()
            p.e r4 = r5.r()
            if (r4 == 0) goto L88
            p.d r2 = r4.C
            int r2 = r2.c()
        L88:
            if (r3 == 0) goto L8f
            q.f r4 = r5.f8960h
            r5.b(r4, r3, r2)
        L8f:
            q.f r1 = r5.i(r0, r1)
            int r0 = r0.c()
            p.e r2 = r5.s()
            if (r2 == 0) goto La3
            p.d r0 = r2.E
            int r0 = r0.c()
        La3:
            if (r1 == 0) goto Lab
        La5:
            q.f r2 = r5.f8961i
            int r0 = -r0
            r5.b(r2, r1, r0)
        Lab:
            q.f r0 = r5.f8960h
            r0.f8918a = r5
            q.f r0 = r5.f8961i
            r0.f8918a = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q.c.d():void");
    }

    @Override // q.m
    public void e() {
        for (int i6 = 0; i6 < this.f8907k.size(); i6++) {
            ((m) this.f8907k.get(i6)).e();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // q.m
    public void f() {
        this.f8955c = null;
        Iterator it = this.f8907k.iterator();
        while (it.hasNext()) {
            ((m) it.next()).f();
        }
    }

    @Override // q.m
    public long j() {
        int size = this.f8907k.size();
        long j6 = 0;
        for (int i6 = 0; i6 < size; i6++) {
            j6 = j6 + r4.f8960h.f8923f + ((m) this.f8907k.get(i6)).j() + r4.f8961i.f8923f;
        }
        return j6;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // q.m
    public boolean m() {
        int size = this.f8907k.size();
        for (int i6 = 0; i6 < size; i6++) {
            if (!((m) this.f8907k.get(i6)).m()) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ChainRun ");
        sb.append(this.f8958f == 0 ? "horizontal : " : "vertical : ");
        String sb2 = sb.toString();
        Iterator it = this.f8907k.iterator();
        while (it.hasNext()) {
            String str = sb2 + "<";
            sb2 = (str + ((m) it.next())) + "> ";
        }
        return sb2;
    }
}
