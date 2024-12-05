package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.appcompat.app.f0;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import t1.a;
import t1.e;
import v1.e0;

/* loaded from: classes.dex */
public final class l implements e.a, e.b {

    /* renamed from: b */
    private final a.f f4603b;

    /* renamed from: c */
    private final u1.b f4604c;

    /* renamed from: d */
    private final e f4605d;

    /* renamed from: g */
    private final int f4608g;

    /* renamed from: h */
    private final u1.v f4609h;

    /* renamed from: i */
    private boolean f4610i;

    /* renamed from: m */
    final /* synthetic */ b f4614m;

    /* renamed from: a */
    private final Queue f4602a = new LinkedList();

    /* renamed from: e */
    private final Set f4606e = new HashSet();

    /* renamed from: f */
    private final Map f4607f = new HashMap();

    /* renamed from: j */
    private final List f4611j = new ArrayList();

    /* renamed from: k */
    private s1.a f4612k = null;

    /* renamed from: l */
    private int f4613l = 0;

    public l(b bVar, t1.d dVar) {
        Handler handler;
        Context context;
        Handler handler2;
        this.f4614m = bVar;
        handler = bVar.f4581p;
        a.f g6 = dVar.g(handler.getLooper(), this);
        this.f4603b = g6;
        this.f4604c = dVar.d();
        this.f4605d = new e();
        this.f4608g = dVar.f();
        if (!g6.j()) {
            this.f4609h = null;
            return;
        }
        context = bVar.f4572g;
        handler2 = bVar.f4581p;
        this.f4609h = dVar.h(context, handler2);
    }

    public static /* bridge */ /* synthetic */ void A(l lVar, m mVar) {
        if (lVar.f4611j.contains(mVar) && !lVar.f4610i) {
            if (lVar.f4603b.c()) {
                lVar.i();
            } else {
                lVar.D();
            }
        }
    }

    public static /* bridge */ /* synthetic */ void B(l lVar, m mVar) {
        Handler handler;
        Handler handler2;
        s1.c cVar;
        s1.c[] g6;
        if (lVar.f4611j.remove(mVar)) {
            handler = lVar.f4614m.f4581p;
            handler.removeMessages(15, mVar);
            handler2 = lVar.f4614m.f4581p;
            handler2.removeMessages(16, mVar);
            cVar = mVar.f4616b;
            ArrayList arrayList = new ArrayList(lVar.f4602a.size());
            for (v vVar : lVar.f4602a) {
                if ((vVar instanceof u1.q) && (g6 = ((u1.q) vVar).g(lVar)) != null && z1.b.b(g6, cVar)) {
                    arrayList.add(vVar);
                }
            }
            int size = arrayList.size();
            for (int i6 = 0; i6 < size; i6++) {
                v vVar2 = (v) arrayList.get(i6);
                lVar.f4602a.remove(vVar2);
                vVar2.b(new t1.g(cVar));
            }
        }
    }

    private final s1.c e(s1.c[] cVarArr) {
        if (cVarArr != null && cVarArr.length != 0) {
            s1.c[] b6 = this.f4603b.b();
            if (b6 == null) {
                b6 = new s1.c[0];
            }
            l.a aVar = new l.a(b6.length);
            for (s1.c cVar : b6) {
                aVar.put(cVar.a(), Long.valueOf(cVar.b()));
            }
            for (s1.c cVar2 : cVarArr) {
                Long l6 = (Long) aVar.get(cVar2.a());
                if (l6 == null || l6.longValue() < cVar2.b()) {
                    return cVar2;
                }
            }
        }
        return null;
    }

    private final void f(s1.a aVar) {
        Iterator it = this.f4606e.iterator();
        if (!it.hasNext()) {
            this.f4606e.clear();
            return;
        }
        f0.a(it.next());
        if (v1.m.a(aVar, s1.a.f9206e)) {
            this.f4603b.d();
        }
        throw null;
    }

    public final void g(Status status) {
        Handler handler;
        handler = this.f4614m.f4581p;
        v1.n.c(handler);
        h(status, null, false);
    }

    private final void h(Status status, Exception exc, boolean z5) {
        Handler handler;
        handler = this.f4614m.f4581p;
        v1.n.c(handler);
        if ((status == null) == (exc == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.f4602a.iterator();
        while (it.hasNext()) {
            v vVar = (v) it.next();
            if (!z5 || vVar.f4639a == 2) {
                if (status != null) {
                    vVar.a(status);
                } else {
                    vVar.b(exc);
                }
                it.remove();
            }
        }
    }

    private final void i() {
        ArrayList arrayList = new ArrayList(this.f4602a);
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            v vVar = (v) arrayList.get(i6);
            if (!this.f4603b.c()) {
                return;
            }
            if (o(vVar)) {
                this.f4602a.remove(vVar);
            }
        }
    }

    public final void j() {
        C();
        f(s1.a.f9206e);
        n();
        Iterator it = this.f4607f.values().iterator();
        if (it.hasNext()) {
            f0.a(it.next());
            throw null;
        }
        i();
        l();
    }

    public final void k(int i6) {
        Handler handler;
        Handler handler2;
        long j6;
        Handler handler3;
        Handler handler4;
        long j7;
        e0 e0Var;
        C();
        this.f4610i = true;
        this.f4605d.c(i6, this.f4603b.f());
        b bVar = this.f4614m;
        handler = bVar.f4581p;
        handler2 = bVar.f4581p;
        Message obtain = Message.obtain(handler2, 9, this.f4604c);
        j6 = this.f4614m.f4566a;
        handler.sendMessageDelayed(obtain, j6);
        b bVar2 = this.f4614m;
        handler3 = bVar2.f4581p;
        handler4 = bVar2.f4581p;
        Message obtain2 = Message.obtain(handler4, 11, this.f4604c);
        j7 = this.f4614m.f4567b;
        handler3.sendMessageDelayed(obtain2, j7);
        e0Var = this.f4614m.f4574i;
        e0Var.c();
        Iterator it = this.f4607f.values().iterator();
        if (it.hasNext()) {
            f0.a(it.next());
            throw null;
        }
    }

    private final void l() {
        Handler handler;
        Handler handler2;
        Handler handler3;
        long j6;
        handler = this.f4614m.f4581p;
        handler.removeMessages(12, this.f4604c);
        b bVar = this.f4614m;
        handler2 = bVar.f4581p;
        handler3 = bVar.f4581p;
        Message obtainMessage = handler3.obtainMessage(12, this.f4604c);
        j6 = this.f4614m.f4568c;
        handler2.sendMessageDelayed(obtainMessage, j6);
    }

    private final void m(v vVar) {
        vVar.d(this.f4605d, L());
        try {
            vVar.c(this);
        } catch (DeadObjectException unused) {
            b(1);
            this.f4603b.i("DeadObjectException thrown while running ApiCallRunner.");
        }
    }

    private final void n() {
        Handler handler;
        Handler handler2;
        if (this.f4610i) {
            handler = this.f4614m.f4581p;
            handler.removeMessages(11, this.f4604c);
            handler2 = this.f4614m.f4581p;
            handler2.removeMessages(9, this.f4604c);
            this.f4610i = false;
        }
    }

    private final boolean o(v vVar) {
        boolean z5;
        Handler handler;
        Handler handler2;
        long j6;
        Handler handler3;
        Handler handler4;
        long j7;
        Handler handler5;
        Handler handler6;
        Handler handler7;
        long j8;
        if (!(vVar instanceof u1.q)) {
            m(vVar);
            return true;
        }
        u1.q qVar = (u1.q) vVar;
        s1.c e6 = e(qVar.g(this));
        if (e6 == null) {
            m(vVar);
            return true;
        }
        String name = this.f4603b.getClass().getName();
        String a6 = e6.a();
        long b6 = e6.b();
        StringBuilder sb = new StringBuilder(name.length() + 77 + String.valueOf(a6).length());
        sb.append(name);
        sb.append(" could not execute call because it requires feature (");
        sb.append(a6);
        sb.append(", ");
        sb.append(b6);
        sb.append(").");
        Log.w("GoogleApiManager", sb.toString());
        z5 = this.f4614m.f4582q;
        if (!z5 || !qVar.f(this)) {
            qVar.b(new t1.g(e6));
            return true;
        }
        m mVar = new m(this.f4604c, e6, null);
        int indexOf = this.f4611j.indexOf(mVar);
        if (indexOf >= 0) {
            m mVar2 = (m) this.f4611j.get(indexOf);
            handler5 = this.f4614m.f4581p;
            handler5.removeMessages(15, mVar2);
            b bVar = this.f4614m;
            handler6 = bVar.f4581p;
            handler7 = bVar.f4581p;
            Message obtain = Message.obtain(handler7, 15, mVar2);
            j8 = this.f4614m.f4566a;
            handler6.sendMessageDelayed(obtain, j8);
            return false;
        }
        this.f4611j.add(mVar);
        b bVar2 = this.f4614m;
        handler = bVar2.f4581p;
        handler2 = bVar2.f4581p;
        Message obtain2 = Message.obtain(handler2, 15, mVar);
        j6 = this.f4614m.f4566a;
        handler.sendMessageDelayed(obtain2, j6);
        b bVar3 = this.f4614m;
        handler3 = bVar3.f4581p;
        handler4 = bVar3.f4581p;
        Message obtain3 = Message.obtain(handler4, 16, mVar);
        j7 = this.f4614m.f4567b;
        handler3.sendMessageDelayed(obtain3, j7);
        s1.a aVar = new s1.a(2, null);
        if (p(aVar)) {
            return false;
        }
        this.f4614m.g(aVar, this.f4608g);
        return false;
    }

    private final boolean p(s1.a aVar) {
        Object obj;
        f fVar;
        Set set;
        f fVar2;
        obj = b.f4564t;
        synchronized (obj) {
            b bVar = this.f4614m;
            fVar = bVar.f4578m;
            if (fVar != null) {
                set = bVar.f4579n;
                if (set.contains(this.f4604c)) {
                    fVar2 = this.f4614m.f4578m;
                    fVar2.s(aVar, this.f4608g);
                    return true;
                }
            }
            return false;
        }
    }

    private final boolean q(boolean z5) {
        Handler handler;
        handler = this.f4614m.f4581p;
        v1.n.c(handler);
        if (!this.f4603b.c() || this.f4607f.size() != 0) {
            return false;
        }
        if (!this.f4605d.e()) {
            this.f4603b.i("Timing out service connection.");
            return true;
        }
        if (z5) {
            l();
        }
        return false;
    }

    public static /* bridge */ /* synthetic */ u1.b v(l lVar) {
        return lVar.f4604c;
    }

    public static /* bridge */ /* synthetic */ void x(l lVar, Status status) {
        lVar.g(status);
    }

    public final void C() {
        Handler handler;
        handler = this.f4614m.f4581p;
        v1.n.c(handler);
        this.f4612k = null;
    }

    public final void D() {
        Handler handler;
        s1.a aVar;
        e0 e0Var;
        Context context;
        handler = this.f4614m.f4581p;
        v1.n.c(handler);
        if (this.f4603b.c() || this.f4603b.a()) {
            return;
        }
        try {
            b bVar = this.f4614m;
            e0Var = bVar.f4574i;
            context = bVar.f4572g;
            int b6 = e0Var.b(context, this.f4603b);
            if (b6 != 0) {
                s1.a aVar2 = new s1.a(b6, null);
                String name = this.f4603b.getClass().getName();
                String obj = aVar2.toString();
                StringBuilder sb = new StringBuilder(name.length() + 35 + obj.length());
                sb.append("The service for ");
                sb.append(name);
                sb.append(" is not available: ");
                sb.append(obj);
                Log.w("GoogleApiManager", sb.toString());
                G(aVar2, null);
                return;
            }
            b bVar2 = this.f4614m;
            a.f fVar = this.f4603b;
            o oVar = new o(bVar2, fVar, this.f4604c);
            if (fVar.j()) {
                ((u1.v) v1.n.h(this.f4609h)).C(oVar);
            }
            try {
                this.f4603b.e(oVar);
            } catch (SecurityException e6) {
                e = e6;
                aVar = new s1.a(10);
                G(aVar, e);
            }
        } catch (IllegalStateException e7) {
            e = e7;
            aVar = new s1.a(10);
        }
    }

    public final void E(v vVar) {
        Handler handler;
        handler = this.f4614m.f4581p;
        v1.n.c(handler);
        if (this.f4603b.c()) {
            if (o(vVar)) {
                l();
                return;
            } else {
                this.f4602a.add(vVar);
                return;
            }
        }
        this.f4602a.add(vVar);
        s1.a aVar = this.f4612k;
        if (aVar == null || !aVar.d()) {
            D();
        } else {
            G(this.f4612k, null);
        }
    }

    public final void F() {
        this.f4613l++;
    }

    public final void G(s1.a aVar, Exception exc) {
        Handler handler;
        e0 e0Var;
        boolean z5;
        Status h6;
        Status h7;
        Status h8;
        Handler handler2;
        Handler handler3;
        long j6;
        Handler handler4;
        Status status;
        Handler handler5;
        Handler handler6;
        handler = this.f4614m.f4581p;
        v1.n.c(handler);
        u1.v vVar = this.f4609h;
        if (vVar != null) {
            vVar.D();
        }
        C();
        e0Var = this.f4614m.f4574i;
        e0Var.c();
        f(aVar);
        if ((this.f4603b instanceof x1.e) && aVar.a() != 24) {
            this.f4614m.f4569d = true;
            b bVar = this.f4614m;
            handler5 = bVar.f4581p;
            handler6 = bVar.f4581p;
            handler5.sendMessageDelayed(handler6.obtainMessage(19), 300000L);
        }
        if (aVar.a() == 4) {
            status = b.f4563s;
            g(status);
            return;
        }
        if (this.f4602a.isEmpty()) {
            this.f4612k = aVar;
            return;
        }
        if (exc != null) {
            handler4 = this.f4614m.f4581p;
            v1.n.c(handler4);
            h(null, exc, false);
            return;
        }
        z5 = this.f4614m.f4582q;
        if (!z5) {
            h6 = b.h(this.f4604c, aVar);
            g(h6);
            return;
        }
        h7 = b.h(this.f4604c, aVar);
        h(h7, null, true);
        if (this.f4602a.isEmpty() || p(aVar) || this.f4614m.g(aVar, this.f4608g)) {
            return;
        }
        if (aVar.a() == 18) {
            this.f4610i = true;
        }
        if (!this.f4610i) {
            h8 = b.h(this.f4604c, aVar);
            g(h8);
            return;
        }
        b bVar2 = this.f4614m;
        handler2 = bVar2.f4581p;
        handler3 = bVar2.f4581p;
        Message obtain = Message.obtain(handler3, 9, this.f4604c);
        j6 = this.f4614m.f4566a;
        handler2.sendMessageDelayed(obtain, j6);
    }

    public final void H(s1.a aVar) {
        Handler handler;
        handler = this.f4614m.f4581p;
        v1.n.c(handler);
        a.f fVar = this.f4603b;
        String name = fVar.getClass().getName();
        String valueOf = String.valueOf(aVar);
        StringBuilder sb = new StringBuilder(name.length() + 25 + valueOf.length());
        sb.append("onSignInFailed for ");
        sb.append(name);
        sb.append(" with ");
        sb.append(valueOf);
        fVar.i(sb.toString());
        G(aVar, null);
    }

    public final void I() {
        Handler handler;
        handler = this.f4614m.f4581p;
        v1.n.c(handler);
        if (this.f4610i) {
            D();
        }
    }

    public final void J() {
        Handler handler;
        handler = this.f4614m.f4581p;
        v1.n.c(handler);
        g(b.f4562r);
        this.f4605d.d();
        for (u1.f fVar : (u1.f[]) this.f4607f.keySet().toArray(new u1.f[0])) {
            E(new u(null, new l2.j()));
        }
        f(new s1.a(4));
        if (this.f4603b.c()) {
            this.f4603b.o(new k(this));
        }
    }

    public final void K() {
        Handler handler;
        s1.f fVar;
        Context context;
        handler = this.f4614m.f4581p;
        v1.n.c(handler);
        if (this.f4610i) {
            n();
            b bVar = this.f4614m;
            fVar = bVar.f4573h;
            context = bVar.f4572g;
            g(fVar.e(context) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.") : new Status(22, "API failed to connect while resuming due to an unknown error."));
            this.f4603b.i("Timing out connection while resuming.");
        }
    }

    public final boolean L() {
        return this.f4603b.j();
    }

    @Override // u1.h
    public final void a(s1.a aVar) {
        G(aVar, null);
    }

    @Override // u1.c
    public final void b(int i6) {
        Handler handler;
        Handler handler2;
        Looper myLooper = Looper.myLooper();
        handler = this.f4614m.f4581p;
        if (myLooper == handler.getLooper()) {
            k(i6);
        } else {
            handler2 = this.f4614m.f4581p;
            handler2.post(new i(this, i6));
        }
    }

    @Override // u1.c
    public final void c(Bundle bundle) {
        Handler handler;
        Handler handler2;
        Looper myLooper = Looper.myLooper();
        handler = this.f4614m.f4581p;
        if (myLooper == handler.getLooper()) {
            j();
        } else {
            handler2 = this.f4614m.f4581p;
            handler2.post(new h(this));
        }
    }

    public final boolean d() {
        return q(true);
    }

    public final int r() {
        return this.f4608g;
    }

    public final int s() {
        return this.f4613l;
    }

    public final a.f u() {
        return this.f4603b;
    }

    public final Map w() {
        return this.f4607f;
    }
}
