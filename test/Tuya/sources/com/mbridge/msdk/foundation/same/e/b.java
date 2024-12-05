package com.mbridge.msdk.foundation.same.e;

import android.content.Context;
import com.mbridge.msdk.foundation.same.e.a;
import com.mbridge.msdk.foundation.tools.af;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    ThreadPoolExecutor f19555a;

    /* renamed from: b, reason: collision with root package name */
    HashMap<Long, a> f19556b;

    /* renamed from: c, reason: collision with root package name */
    WeakReference<Context> f19557c;

    public b(Context context, int i8) {
        if (af.a().a("c_t_l_t_p", true)) {
            this.f19555a = c.a();
        } else {
            if (i8 == 0) {
                this.f19555a = new ThreadPoolExecutor(1, 5, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadPoolExecutor.DiscardPolicy());
            } else {
                this.f19555a = new ThreadPoolExecutor(i8, (i8 * 2) + 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadPoolExecutor.DiscardPolicy());
            }
            this.f19555a.allowCoreThreadTimeOut(true);
        }
        this.f19556b = new HashMap<>();
        this.f19557c = new WeakReference<>(context);
    }

    private synchronized void b(final a aVar, final a.InterfaceC0401a interfaceC0401a) {
        this.f19556b.put(Long.valueOf(aVar.getId()), aVar);
        aVar.setOnStateChangeListener(new a.InterfaceC0401a() { // from class: com.mbridge.msdk.foundation.same.e.b.1
            @Override // com.mbridge.msdk.foundation.same.e.a.InterfaceC0401a
            public final void a(a.b bVar) {
                if (bVar == a.b.CANCEL) {
                    b.this.f19556b.remove(Long.valueOf(aVar.getId()));
                } else if (bVar == a.b.FINISH) {
                    b.this.f19556b.remove(Long.valueOf(aVar.getId()));
                } else if (bVar == a.b.RUNNING && b.this.f19557c.get() == null) {
                    b.this.a();
                }
                a.InterfaceC0401a interfaceC0401a2 = interfaceC0401a;
                if (interfaceC0401a2 != null) {
                    interfaceC0401a2.a(bVar);
                }
            }
        });
    }

    public final void a(a aVar) {
        b(aVar, null);
        this.f19555a.execute(aVar);
    }

    public final synchronized void a() {
        try {
            Iterator<Map.Entry<Long, a>> it = this.f19556b.entrySet().iterator();
            while (it.hasNext()) {
                it.next().getValue().cancel();
            }
            this.f19556b.clear();
        } catch (Exception unused) {
        } catch (Throwable th) {
            throw th;
        }
    }

    public b(Context context) {
        if (af.a().a("c_t_l_t_p", true)) {
            this.f19555a = c.a();
        } else {
            if (af.a().a("c_t_p_t_l", true)) {
                int availableProcessors = (Runtime.getRuntime().availableProcessors() * 2) + 1;
                this.f19555a = new ThreadPoolExecutor(availableProcessors, availableProcessors, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadPoolExecutor.DiscardPolicy());
            } else {
                this.f19555a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadPoolExecutor.DiscardPolicy());
            }
            this.f19555a.allowCoreThreadTimeOut(true);
        }
        this.f19556b = new HashMap<>();
        this.f19557c = new WeakReference<>(context);
    }

    public final void a(a aVar, a.InterfaceC0401a interfaceC0401a) {
        b(aVar, interfaceC0401a);
        this.f19555a.execute(aVar);
    }
}
