package c.s;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import c.s.m;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: TransitionSet.java */
/* loaded from: classes.dex */
public class q extends m {
    int R;
    private ArrayList<m> P = new ArrayList<>();
    private boolean Q = true;
    boolean S = false;
    private int T = 0;

    /* compiled from: TransitionSet.java */
    /* loaded from: classes.dex */
    class a extends n {
        final /* synthetic */ m a;

        a(m mVar) {
            this.a = mVar;
        }

        @Override // c.s.m.f
        public void c(m mVar) {
            this.a.b0();
            mVar.W(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TransitionSet.java */
    /* loaded from: classes.dex */
    public static class b extends n {
        q a;

        b(q qVar) {
            this.a = qVar;
        }

        @Override // c.s.n, c.s.m.f
        public void a(m mVar) {
            q qVar = this.a;
            if (qVar.S) {
                return;
            }
            qVar.j0();
            this.a.S = true;
        }

        @Override // c.s.m.f
        public void c(m mVar) {
            q qVar = this.a;
            int i2 = qVar.R - 1;
            qVar.R = i2;
            if (i2 == 0) {
                qVar.S = false;
                qVar.q();
            }
            mVar.W(this);
        }
    }

    private void o0(m mVar) {
        this.P.add(mVar);
        mVar.z = this;
    }

    private void x0() {
        b bVar = new b(this);
        Iterator<m> it = this.P.iterator();
        while (it.hasNext()) {
            it.next().b(bVar);
        }
        this.R = this.P.size();
    }

    @Override // c.s.m
    public void U(View view) {
        super.U(view);
        int size = this.P.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.P.get(i2).U(view);
        }
    }

    @Override // c.s.m
    public void Z(View view) {
        super.Z(view);
        int size = this.P.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.P.get(i2).Z(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // c.s.m
    public void b0() {
        if (this.P.isEmpty()) {
            j0();
            q();
            return;
        }
        x0();
        if (!this.Q) {
            for (int i2 = 1; i2 < this.P.size(); i2++) {
                this.P.get(i2 - 1).b(new a(this.P.get(i2)));
            }
            m mVar = this.P.get(0);
            if (mVar != null) {
                mVar.b0();
                return;
            }
            return;
        }
        Iterator<m> it = this.P.iterator();
        while (it.hasNext()) {
            it.next().b0();
        }
    }

    @Override // c.s.m
    public void d0(m.e eVar) {
        super.d0(eVar);
        this.T |= 8;
        int size = this.P.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.P.get(i2).d0(eVar);
        }
    }

    @Override // c.s.m
    public void f0(g gVar) {
        super.f0(gVar);
        this.T |= 4;
        if (this.P != null) {
            for (int i2 = 0; i2 < this.P.size(); i2++) {
                this.P.get(i2).f0(gVar);
            }
        }
    }

    @Override // c.s.m
    public void g0(p pVar) {
        super.g0(pVar);
        this.T |= 2;
        int size = this.P.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.P.get(i2).g0(pVar);
        }
    }

    @Override // c.s.m
    public void h(s sVar) {
        if (M(sVar.f3030b)) {
            Iterator<m> it = this.P.iterator();
            while (it.hasNext()) {
                m next = it.next();
                if (next.M(sVar.f3030b)) {
                    next.h(sVar);
                    sVar.f3031c.add(next);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // c.s.m
    public void j(s sVar) {
        super.j(sVar);
        int size = this.P.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.P.get(i2).j(sVar);
        }
    }

    @Override // c.s.m
    public void k(s sVar) {
        if (M(sVar.f3030b)) {
            Iterator<m> it = this.P.iterator();
            while (it.hasNext()) {
                m next = it.next();
                if (next.M(sVar.f3030b)) {
                    next.k(sVar);
                    sVar.f3031c.add(next);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // c.s.m
    public String k0(String str) {
        String k0 = super.k0(str);
        for (int i2 = 0; i2 < this.P.size(); i2++) {
            StringBuilder sb = new StringBuilder();
            sb.append(k0);
            sb.append("\n");
            sb.append(this.P.get(i2).k0(str + "  "));
            k0 = sb.toString();
        }
        return k0;
    }

    @Override // c.s.m
    /* renamed from: l0, reason: merged with bridge method [inline-methods] */
    public q b(m.f fVar) {
        return (q) super.b(fVar);
    }

    @Override // c.s.m
    /* renamed from: m0, reason: merged with bridge method [inline-methods] */
    public q c(View view) {
        for (int i2 = 0; i2 < this.P.size(); i2++) {
            this.P.get(i2).c(view);
        }
        return (q) super.c(view);
    }

    @Override // c.s.m
    /* renamed from: n */
    public m clone() {
        q qVar = (q) super.clone();
        qVar.P = new ArrayList<>();
        int size = this.P.size();
        for (int i2 = 0; i2 < size; i2++) {
            qVar.o0(this.P.get(i2).clone());
        }
        return qVar;
    }

    public q n0(m mVar) {
        o0(mVar);
        long j2 = this.f3016k;
        if (j2 >= 0) {
            mVar.c0(j2);
        }
        if ((this.T & 1) != 0) {
            mVar.e0(t());
        }
        if ((this.T & 2) != 0) {
            mVar.g0(y());
        }
        if ((this.T & 4) != 0) {
            mVar.f0(x());
        }
        if ((this.T & 8) != 0) {
            mVar.d0(s());
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // c.s.m
    public void p(ViewGroup viewGroup, t tVar, t tVar2, ArrayList<s> arrayList, ArrayList<s> arrayList2) {
        long B = B();
        int size = this.P.size();
        for (int i2 = 0; i2 < size; i2++) {
            m mVar = this.P.get(i2);
            if (B > 0 && (this.Q || i2 == 0)) {
                long B2 = mVar.B();
                if (B2 > 0) {
                    mVar.h0(B2 + B);
                } else {
                    mVar.h0(B);
                }
            }
            mVar.p(viewGroup, tVar, tVar2, arrayList, arrayList2);
        }
    }

    public m p0(int i2) {
        if (i2 < 0 || i2 >= this.P.size()) {
            return null;
        }
        return this.P.get(i2);
    }

    public int q0() {
        return this.P.size();
    }

    @Override // c.s.m
    /* renamed from: r0, reason: merged with bridge method [inline-methods] */
    public q W(m.f fVar) {
        return (q) super.W(fVar);
    }

    @Override // c.s.m
    /* renamed from: s0, reason: merged with bridge method [inline-methods] */
    public q X(View view) {
        for (int i2 = 0; i2 < this.P.size(); i2++) {
            this.P.get(i2).X(view);
        }
        return (q) super.X(view);
    }

    @Override // c.s.m
    /* renamed from: t0, reason: merged with bridge method [inline-methods] */
    public q c0(long j2) {
        ArrayList<m> arrayList;
        super.c0(j2);
        if (this.f3016k >= 0 && (arrayList = this.P) != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.P.get(i2).c0(j2);
            }
        }
        return this;
    }

    @Override // c.s.m
    /* renamed from: u0, reason: merged with bridge method [inline-methods] */
    public q e0(TimeInterpolator timeInterpolator) {
        this.T |= 1;
        ArrayList<m> arrayList = this.P;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.P.get(i2).e0(timeInterpolator);
            }
        }
        return (q) super.e0(timeInterpolator);
    }

    public q v0(int i2) {
        if (i2 == 0) {
            this.Q = true;
        } else if (i2 == 1) {
            this.Q = false;
        } else {
            throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i2);
        }
        return this;
    }

    @Override // c.s.m
    /* renamed from: w0, reason: merged with bridge method [inline-methods] */
    public q h0(long j2) {
        return (q) super.h0(j2);
    }
}
