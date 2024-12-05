package m0;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import m0.l;

/* loaded from: classes.dex */
public class p extends l {
    int L;
    private ArrayList J = new ArrayList();
    private boolean K = true;
    boolean M = false;
    private int N = 0;

    /* loaded from: classes.dex */
    class a extends m {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ l f7531a;

        a(l lVar) {
            this.f7531a = lVar;
        }

        @Override // m0.l.f
        public void d(l lVar) {
            this.f7531a.U();
            lVar.Q(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b extends m {

        /* renamed from: a, reason: collision with root package name */
        p f7533a;

        b(p pVar) {
            this.f7533a = pVar;
        }

        @Override // m0.m, m0.l.f
        public void a(l lVar) {
            p pVar = this.f7533a;
            if (pVar.M) {
                return;
            }
            pVar.b0();
            this.f7533a.M = true;
        }

        @Override // m0.l.f
        public void d(l lVar) {
            p pVar = this.f7533a;
            int i6 = pVar.L - 1;
            pVar.L = i6;
            if (i6 == 0) {
                pVar.M = false;
                pVar.q();
            }
            lVar.Q(this);
        }
    }

    private void g0(l lVar) {
        this.J.add(lVar);
        lVar.f7488r = this;
    }

    private void p0() {
        b bVar = new b(this);
        Iterator it = this.J.iterator();
        while (it.hasNext()) {
            ((l) it.next()).a(bVar);
        }
        this.L = this.J.size();
    }

    @Override // m0.l
    public void O(View view) {
        super.O(view);
        int size = this.J.size();
        for (int i6 = 0; i6 < size; i6++) {
            ((l) this.J.get(i6)).O(view);
        }
    }

    @Override // m0.l
    public void S(View view) {
        super.S(view);
        int size = this.J.size();
        for (int i6 = 0; i6 < size; i6++) {
            ((l) this.J.get(i6)).S(view);
        }
    }

    @Override // m0.l
    protected void U() {
        if (this.J.isEmpty()) {
            b0();
            q();
            return;
        }
        p0();
        if (this.K) {
            Iterator it = this.J.iterator();
            while (it.hasNext()) {
                ((l) it.next()).U();
            }
            return;
        }
        for (int i6 = 1; i6 < this.J.size(); i6++) {
            ((l) this.J.get(i6 - 1)).a(new a((l) this.J.get(i6)));
        }
        l lVar = (l) this.J.get(0);
        if (lVar != null) {
            lVar.U();
        }
    }

    @Override // m0.l
    public void W(l.e eVar) {
        super.W(eVar);
        this.N |= 8;
        int size = this.J.size();
        for (int i6 = 0; i6 < size; i6++) {
            ((l) this.J.get(i6)).W(eVar);
        }
    }

    @Override // m0.l
    public void Y(g gVar) {
        super.Y(gVar);
        this.N |= 4;
        if (this.J != null) {
            for (int i6 = 0; i6 < this.J.size(); i6++) {
                ((l) this.J.get(i6)).Y(gVar);
            }
        }
    }

    @Override // m0.l
    public void Z(o oVar) {
        super.Z(oVar);
        this.N |= 2;
        int size = this.J.size();
        for (int i6 = 0; i6 < size; i6++) {
            ((l) this.J.get(i6)).Z(oVar);
        }
    }

    @Override // m0.l
    String c0(String str) {
        String c02 = super.c0(str);
        for (int i6 = 0; i6 < this.J.size(); i6++) {
            StringBuilder sb = new StringBuilder();
            sb.append(c02);
            sb.append("\n");
            sb.append(((l) this.J.get(i6)).c0(str + "  "));
            c02 = sb.toString();
        }
        return c02;
    }

    @Override // m0.l
    /* renamed from: d0, reason: merged with bridge method [inline-methods] */
    public p a(l.f fVar) {
        return (p) super.a(fVar);
    }

    @Override // m0.l
    /* renamed from: e0, reason: merged with bridge method [inline-methods] */
    public p b(View view) {
        for (int i6 = 0; i6 < this.J.size(); i6++) {
            ((l) this.J.get(i6)).b(view);
        }
        return (p) super.b(view);
    }

    public p f0(l lVar) {
        g0(lVar);
        long j6 = this.f7473c;
        if (j6 >= 0) {
            lVar.V(j6);
        }
        if ((this.N & 1) != 0) {
            lVar.X(t());
        }
        if ((this.N & 2) != 0) {
            x();
            lVar.Z(null);
        }
        if ((this.N & 4) != 0) {
            lVar.Y(w());
        }
        if ((this.N & 8) != 0) {
            lVar.W(s());
        }
        return this;
    }

    @Override // m0.l
    public void h(s sVar) {
        if (H(sVar.f7538b)) {
            Iterator it = this.J.iterator();
            while (it.hasNext()) {
                l lVar = (l) it.next();
                if (lVar.H(sVar.f7538b)) {
                    lVar.h(sVar);
                    sVar.f7539c.add(lVar);
                }
            }
        }
    }

    public l h0(int i6) {
        if (i6 < 0 || i6 >= this.J.size()) {
            return null;
        }
        return (l) this.J.get(i6);
    }

    public int i0() {
        return this.J.size();
    }

    @Override // m0.l
    void j(s sVar) {
        super.j(sVar);
        int size = this.J.size();
        for (int i6 = 0; i6 < size; i6++) {
            ((l) this.J.get(i6)).j(sVar);
        }
    }

    @Override // m0.l
    /* renamed from: j0, reason: merged with bridge method [inline-methods] */
    public p Q(l.f fVar) {
        return (p) super.Q(fVar);
    }

    @Override // m0.l
    public void k(s sVar) {
        if (H(sVar.f7538b)) {
            Iterator it = this.J.iterator();
            while (it.hasNext()) {
                l lVar = (l) it.next();
                if (lVar.H(sVar.f7538b)) {
                    lVar.k(sVar);
                    sVar.f7539c.add(lVar);
                }
            }
        }
    }

    @Override // m0.l
    /* renamed from: k0, reason: merged with bridge method [inline-methods] */
    public p R(View view) {
        for (int i6 = 0; i6 < this.J.size(); i6++) {
            ((l) this.J.get(i6)).R(view);
        }
        return (p) super.R(view);
    }

    @Override // m0.l
    /* renamed from: l0, reason: merged with bridge method [inline-methods] */
    public p V(long j6) {
        ArrayList arrayList;
        super.V(j6);
        if (this.f7473c >= 0 && (arrayList = this.J) != null) {
            int size = arrayList.size();
            for (int i6 = 0; i6 < size; i6++) {
                ((l) this.J.get(i6)).V(j6);
            }
        }
        return this;
    }

    @Override // m0.l
    /* renamed from: m0, reason: merged with bridge method [inline-methods] */
    public p X(TimeInterpolator timeInterpolator) {
        this.N |= 1;
        ArrayList arrayList = this.J;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i6 = 0; i6 < size; i6++) {
                ((l) this.J.get(i6)).X(timeInterpolator);
            }
        }
        return (p) super.X(timeInterpolator);
    }

    @Override // m0.l
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public l clone() {
        p pVar = (p) super.clone();
        pVar.J = new ArrayList();
        int size = this.J.size();
        for (int i6 = 0; i6 < size; i6++) {
            pVar.g0(((l) this.J.get(i6)).clone());
        }
        return pVar;
    }

    public p n0(int i6) {
        if (i6 == 0) {
            this.K = true;
        } else {
            if (i6 != 1) {
                throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i6);
            }
            this.K = false;
        }
        return this;
    }

    @Override // m0.l
    /* renamed from: o0, reason: merged with bridge method [inline-methods] */
    public p a0(long j6) {
        return (p) super.a0(j6);
    }

    @Override // m0.l
    protected void p(ViewGroup viewGroup, t tVar, t tVar2, ArrayList arrayList, ArrayList arrayList2) {
        long z5 = z();
        int size = this.J.size();
        for (int i6 = 0; i6 < size; i6++) {
            l lVar = (l) this.J.get(i6);
            if (z5 > 0 && (this.K || i6 == 0)) {
                long z6 = lVar.z();
                if (z6 > 0) {
                    lVar.a0(z6 + z5);
                } else {
                    lVar.a0(z5);
                }
            }
            lVar.p(viewGroup, tVar, tVar2, arrayList, arrayList2);
        }
    }
}
