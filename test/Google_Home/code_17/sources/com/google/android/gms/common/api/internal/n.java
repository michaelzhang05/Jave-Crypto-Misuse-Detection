package com.google.android.gms.common.api.internal;

import N.C1331b;
import N.C1333d;
import N.C1336g;
import O.a;
import O.f;
import P.C1357b;
import Q.AbstractC1398n;
import Q.AbstractC1400p;
import Q.G;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.collection.ArrayMap;
import androidx.work.PeriodicWorkRequest;
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
import q0.C3826j;

/* loaded from: classes3.dex */
public final class n implements f.a, f.b {

    /* renamed from: b */
    private final a.f f15970b;

    /* renamed from: k */
    private final C1357b f15971k;

    /* renamed from: l */
    private final g f15972l;

    /* renamed from: o */
    private final int f15975o;

    /* renamed from: p */
    private final P.y f15976p;

    /* renamed from: q */
    private boolean f15977q;

    /* renamed from: u */
    final /* synthetic */ C2063c f15981u;

    /* renamed from: a */
    private final Queue f15969a = new LinkedList();

    /* renamed from: m */
    private final Set f15973m = new HashSet();

    /* renamed from: n */
    private final Map f15974n = new HashMap();

    /* renamed from: r */
    private final List f15978r = new ArrayList();

    /* renamed from: s */
    private C1331b f15979s = null;

    /* renamed from: t */
    private int f15980t = 0;

    public n(C2063c c2063c, O.e eVar) {
        Handler handler;
        Context context;
        Handler handler2;
        this.f15981u = c2063c;
        handler = c2063c.f15946n;
        a.f o8 = eVar.o(handler.getLooper(), this);
        this.f15970b = o8;
        this.f15971k = eVar.i();
        this.f15972l = new g();
        this.f15975o = eVar.n();
        if (o8.o()) {
            context = c2063c.f15937e;
            handler2 = c2063c.f15946n;
            this.f15976p = eVar.p(context, handler2);
            return;
        }
        this.f15976p = null;
    }

    public static /* bridge */ /* synthetic */ void B(n nVar, o oVar) {
        if (nVar.f15978r.contains(oVar) && !nVar.f15977q) {
            if (!nVar.f15970b.h()) {
                nVar.E();
            } else {
                nVar.g();
            }
        }
    }

    public static /* bridge */ /* synthetic */ void C(n nVar, o oVar) {
        Handler handler;
        Handler handler2;
        C1333d c1333d;
        C1333d[] g8;
        if (nVar.f15978r.remove(oVar)) {
            handler = nVar.f15981u.f15946n;
            handler.removeMessages(15, oVar);
            handler2 = nVar.f15981u.f15946n;
            handler2.removeMessages(16, oVar);
            c1333d = oVar.f15983b;
            ArrayList arrayList = new ArrayList(nVar.f15969a.size());
            for (y yVar : nVar.f15969a) {
                if ((yVar instanceof P.t) && (g8 = ((P.t) yVar).g(nVar)) != null && V.b.b(g8, c1333d)) {
                    arrayList.add(yVar);
                }
            }
            int size = arrayList.size();
            for (int i8 = 0; i8 < size; i8++) {
                y yVar2 = (y) arrayList.get(i8);
                nVar.f15969a.remove(yVar2);
                yVar2.b(new O.k(c1333d));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final C1333d c(C1333d[] c1333dArr) {
        if (c1333dArr != null && c1333dArr.length != 0) {
            C1333d[] l8 = this.f15970b.l();
            if (l8 == null) {
                l8 = new C1333d[0];
            }
            ArrayMap arrayMap = new ArrayMap(l8.length);
            for (C1333d c1333d : l8) {
                arrayMap.put(c1333d.p(), Long.valueOf(c1333d.u()));
            }
            for (C1333d c1333d2 : c1333dArr) {
                Long l9 = (Long) arrayMap.get(c1333d2.p());
                if (l9 == null || l9.longValue() < c1333d2.u()) {
                    return c1333d2;
                }
            }
        }
        return null;
    }

    private final void d(C1331b c1331b) {
        Iterator it = this.f15973m.iterator();
        if (it.hasNext()) {
            android.support.v4.media.a.a(it.next());
            if (AbstractC1398n.a(c1331b, C1331b.f7452e)) {
                this.f15970b.g();
            }
            throw null;
        }
        this.f15973m.clear();
    }

    public final void e(Status status) {
        Handler handler;
        handler = this.f15981u.f15946n;
        AbstractC1400p.d(handler);
        f(status, null, false);
    }

    private final void f(Status status, Exception exc, boolean z8) {
        Handler handler;
        boolean z9;
        handler = this.f15981u.f15946n;
        AbstractC1400p.d(handler);
        boolean z10 = true;
        if (status != null) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (exc != null) {
            z10 = false;
        }
        if (z9 != z10) {
            Iterator it = this.f15969a.iterator();
            while (it.hasNext()) {
                y yVar = (y) it.next();
                if (!z8 || yVar.f16007a == 2) {
                    if (status != null) {
                        yVar.a(status);
                    } else {
                        yVar.b(exc);
                    }
                    it.remove();
                }
            }
            return;
        }
        throw new IllegalArgumentException("Status XOR exception should be null");
    }

    private final void g() {
        ArrayList arrayList = new ArrayList(this.f15969a);
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            y yVar = (y) arrayList.get(i8);
            if (this.f15970b.h()) {
                if (p(yVar)) {
                    this.f15969a.remove(yVar);
                }
            } else {
                return;
            }
        }
    }

    public final void j() {
        D();
        d(C1331b.f7452e);
        o();
        Iterator it = this.f15974n.values().iterator();
        if (!it.hasNext()) {
            g();
            m();
        } else {
            android.support.v4.media.a.a(it.next());
            throw null;
        }
    }

    public final void l(int i8) {
        Handler handler;
        Handler handler2;
        Handler handler3;
        Handler handler4;
        G g8;
        D();
        this.f15977q = true;
        this.f15972l.e(i8, this.f15970b.n());
        C1357b c1357b = this.f15971k;
        C2063c c2063c = this.f15981u;
        handler = c2063c.f15946n;
        handler2 = c2063c.f15946n;
        handler.sendMessageDelayed(Message.obtain(handler2, 9, c1357b), 5000L);
        C1357b c1357b2 = this.f15971k;
        C2063c c2063c2 = this.f15981u;
        handler3 = c2063c2.f15946n;
        handler4 = c2063c2.f15946n;
        handler3.sendMessageDelayed(Message.obtain(handler4, 11, c1357b2), 120000L);
        g8 = this.f15981u.f15939g;
        g8.c();
        Iterator it = this.f15974n.values().iterator();
        if (!it.hasNext()) {
            return;
        }
        android.support.v4.media.a.a(it.next());
        throw null;
    }

    private final void m() {
        Handler handler;
        Handler handler2;
        Handler handler3;
        long j8;
        C1357b c1357b = this.f15971k;
        handler = this.f15981u.f15946n;
        handler.removeMessages(12, c1357b);
        C1357b c1357b2 = this.f15971k;
        C2063c c2063c = this.f15981u;
        handler2 = c2063c.f15946n;
        handler3 = c2063c.f15946n;
        Message obtainMessage = handler3.obtainMessage(12, c1357b2);
        j8 = this.f15981u.f15933a;
        handler2.sendMessageDelayed(obtainMessage, j8);
    }

    private final void n(y yVar) {
        yVar.d(this.f15972l, a());
        try {
            yVar.c(this);
        } catch (DeadObjectException unused) {
            h(1);
            this.f15970b.d("DeadObjectException thrown while running ApiCallRunner.");
        }
    }

    private final void o() {
        Handler handler;
        Handler handler2;
        if (this.f15977q) {
            C2063c c2063c = this.f15981u;
            C1357b c1357b = this.f15971k;
            handler = c2063c.f15946n;
            handler.removeMessages(11, c1357b);
            C2063c c2063c2 = this.f15981u;
            C1357b c1357b2 = this.f15971k;
            handler2 = c2063c2.f15946n;
            handler2.removeMessages(9, c1357b2);
            this.f15977q = false;
        }
    }

    private final boolean p(y yVar) {
        boolean z8;
        Handler handler;
        Handler handler2;
        Handler handler3;
        Handler handler4;
        Handler handler5;
        Handler handler6;
        Handler handler7;
        if (!(yVar instanceof P.t)) {
            n(yVar);
            return true;
        }
        P.t tVar = (P.t) yVar;
        C1333d c8 = c(tVar.g(this));
        if (c8 == null) {
            n(yVar);
            return true;
        }
        Log.w("GoogleApiManager", this.f15970b.getClass().getName() + " could not execute call because it requires feature (" + c8.p() + ", " + c8.u() + ").");
        z8 = this.f15981u.f15947o;
        if (z8 && tVar.f(this)) {
            o oVar = new o(this.f15971k, c8, null);
            int indexOf = this.f15978r.indexOf(oVar);
            if (indexOf >= 0) {
                o oVar2 = (o) this.f15978r.get(indexOf);
                handler5 = this.f15981u.f15946n;
                handler5.removeMessages(15, oVar2);
                C2063c c2063c = this.f15981u;
                handler6 = c2063c.f15946n;
                handler7 = c2063c.f15946n;
                handler6.sendMessageDelayed(Message.obtain(handler7, 15, oVar2), 5000L);
                return false;
            }
            this.f15978r.add(oVar);
            C2063c c2063c2 = this.f15981u;
            handler = c2063c2.f15946n;
            handler2 = c2063c2.f15946n;
            handler.sendMessageDelayed(Message.obtain(handler2, 15, oVar), 5000L);
            C2063c c2063c3 = this.f15981u;
            handler3 = c2063c3.f15946n;
            handler4 = c2063c3.f15946n;
            handler3.sendMessageDelayed(Message.obtain(handler4, 16, oVar), 120000L);
            C1331b c1331b = new C1331b(2, null);
            if (!q(c1331b)) {
                this.f15981u.f(c1331b, this.f15975o);
                return false;
            }
            return false;
        }
        tVar.b(new O.k(c8));
        return true;
    }

    private final boolean q(C1331b c1331b) {
        Object obj;
        h hVar;
        Set set;
        h hVar2;
        obj = C2063c.f15931r;
        synchronized (obj) {
            try {
                C2063c c2063c = this.f15981u;
                hVar = c2063c.f15943k;
                if (hVar != null) {
                    set = c2063c.f15944l;
                    if (set.contains(this.f15971k)) {
                        hVar2 = this.f15981u.f15943k;
                        hVar2.s(c1331b, this.f15975o);
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final boolean r(boolean z8) {
        Handler handler;
        handler = this.f15981u.f15946n;
        AbstractC1400p.d(handler);
        if (this.f15970b.h() && this.f15974n.isEmpty()) {
            if (this.f15972l.g()) {
                if (z8) {
                    m();
                    return false;
                }
                return false;
            }
            this.f15970b.d("Timing out service connection.");
            return true;
        }
        return false;
    }

    public static /* bridge */ /* synthetic */ C1357b w(n nVar) {
        return nVar.f15971k;
    }

    public static /* bridge */ /* synthetic */ void y(n nVar, Status status) {
        nVar.e(status);
    }

    public final void D() {
        Handler handler;
        handler = this.f15981u.f15946n;
        AbstractC1400p.d(handler);
        this.f15979s = null;
    }

    public final void E() {
        Handler handler;
        G g8;
        Context context;
        handler = this.f15981u.f15946n;
        AbstractC1400p.d(handler);
        if (!this.f15970b.h() && !this.f15970b.f()) {
            try {
                C2063c c2063c = this.f15981u;
                g8 = c2063c.f15939g;
                context = c2063c.f15937e;
                int b8 = g8.b(context, this.f15970b);
                if (b8 != 0) {
                    C1331b c1331b = new C1331b(b8, null);
                    Log.w("GoogleApiManager", "The service for " + this.f15970b.getClass().getName() + " is not available: " + c1331b.toString());
                    H(c1331b, null);
                    return;
                }
                C2063c c2063c2 = this.f15981u;
                a.f fVar = this.f15970b;
                q qVar = new q(c2063c2, fVar, this.f15971k);
                if (fVar.o()) {
                    ((P.y) AbstractC1400p.l(this.f15976p)).v0(qVar);
                }
                try {
                    this.f15970b.j(qVar);
                } catch (SecurityException e8) {
                    H(new C1331b(10), e8);
                }
            } catch (IllegalStateException e9) {
                H(new C1331b(10), e9);
            }
        }
    }

    public final void F(y yVar) {
        Handler handler;
        handler = this.f15981u.f15946n;
        AbstractC1400p.d(handler);
        if (this.f15970b.h()) {
            if (p(yVar)) {
                m();
                return;
            } else {
                this.f15969a.add(yVar);
                return;
            }
        }
        this.f15969a.add(yVar);
        C1331b c1331b = this.f15979s;
        if (c1331b != null && c1331b.y()) {
            H(this.f15979s, null);
        } else {
            E();
        }
    }

    public final void G() {
        this.f15980t++;
    }

    public final void H(C1331b c1331b, Exception exc) {
        Handler handler;
        G g8;
        boolean z8;
        Status g9;
        Status g10;
        Status g11;
        Handler handler2;
        Handler handler3;
        Handler handler4;
        Status status;
        Handler handler5;
        Handler handler6;
        handler = this.f15981u.f15946n;
        AbstractC1400p.d(handler);
        P.y yVar = this.f15976p;
        if (yVar != null) {
            yVar.w0();
        }
        D();
        g8 = this.f15981u.f15939g;
        g8.c();
        d(c1331b);
        if ((this.f15970b instanceof S.e) && c1331b.p() != 24) {
            this.f15981u.f15934b = true;
            C2063c c2063c = this.f15981u;
            handler5 = c2063c.f15946n;
            handler6 = c2063c.f15946n;
            handler5.sendMessageDelayed(handler6.obtainMessage(19), PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS);
        }
        if (c1331b.p() == 4) {
            status = C2063c.f15930q;
            e(status);
            return;
        }
        if (this.f15969a.isEmpty()) {
            this.f15979s = c1331b;
            return;
        }
        if (exc != null) {
            handler4 = this.f15981u.f15946n;
            AbstractC1400p.d(handler4);
            f(null, exc, false);
            return;
        }
        z8 = this.f15981u.f15947o;
        if (z8) {
            g10 = C2063c.g(this.f15971k, c1331b);
            f(g10, null, true);
            if (!this.f15969a.isEmpty() && !q(c1331b) && !this.f15981u.f(c1331b, this.f15975o)) {
                if (c1331b.p() == 18) {
                    this.f15977q = true;
                }
                if (!this.f15977q) {
                    g11 = C2063c.g(this.f15971k, c1331b);
                    e(g11);
                    return;
                }
                C2063c c2063c2 = this.f15981u;
                C1357b c1357b = this.f15971k;
                handler2 = c2063c2.f15946n;
                handler3 = c2063c2.f15946n;
                handler2.sendMessageDelayed(Message.obtain(handler3, 9, c1357b), 5000L);
                return;
            }
            return;
        }
        g9 = C2063c.g(this.f15971k, c1331b);
        e(g9);
    }

    public final void I(C1331b c1331b) {
        Handler handler;
        handler = this.f15981u.f15946n;
        AbstractC1400p.d(handler);
        a.f fVar = this.f15970b;
        fVar.d("onSignInFailed for " + fVar.getClass().getName() + " with " + String.valueOf(c1331b));
        H(c1331b, null);
    }

    public final void J() {
        Handler handler;
        handler = this.f15981u.f15946n;
        AbstractC1400p.d(handler);
        if (this.f15977q) {
            E();
        }
    }

    public final void K() {
        Handler handler;
        handler = this.f15981u.f15946n;
        AbstractC1400p.d(handler);
        e(C2063c.f15929p);
        this.f15972l.f();
        for (P.f fVar : (P.f[]) this.f15974n.keySet().toArray(new P.f[0])) {
            F(new x(null, new C3826j()));
        }
        d(new C1331b(4));
        if (this.f15970b.h()) {
            this.f15970b.e(new m(this));
        }
    }

    public final void L() {
        Handler handler;
        C1336g c1336g;
        Context context;
        Status status;
        handler = this.f15981u.f15946n;
        AbstractC1400p.d(handler);
        if (this.f15977q) {
            o();
            C2063c c2063c = this.f15981u;
            c1336g = c2063c.f15938f;
            context = c2063c.f15937e;
            if (c1336g.g(context) == 18) {
                status = new Status(21, "Connection timed out waiting for Google Play services update to complete.");
            } else {
                status = new Status(22, "API failed to connect while resuming due to an unknown error.");
            }
            e(status);
            this.f15970b.d("Timing out connection while resuming.");
        }
    }

    public final boolean a() {
        return this.f15970b.o();
    }

    public final boolean b() {
        return r(true);
    }

    @Override // P.InterfaceC1358c
    public final void h(int i8) {
        Handler handler;
        Handler handler2;
        C2063c c2063c = this.f15981u;
        Looper myLooper = Looper.myLooper();
        handler = c2063c.f15946n;
        if (myLooper != handler.getLooper()) {
            handler2 = this.f15981u.f15946n;
            handler2.post(new k(this, i8));
        } else {
            l(i8);
        }
    }

    @Override // P.h
    public final void i(C1331b c1331b) {
        H(c1331b, null);
    }

    @Override // P.InterfaceC1358c
    public final void k(Bundle bundle) {
        Handler handler;
        Handler handler2;
        C2063c c2063c = this.f15981u;
        Looper myLooper = Looper.myLooper();
        handler = c2063c.f15946n;
        if (myLooper != handler.getLooper()) {
            handler2 = this.f15981u.f15946n;
            handler2.post(new j(this));
        } else {
            j();
        }
    }

    public final int s() {
        return this.f15975o;
    }

    public final int t() {
        return this.f15980t;
    }

    public final a.f v() {
        return this.f15970b;
    }

    public final Map x() {
        return this.f15974n;
    }
}
