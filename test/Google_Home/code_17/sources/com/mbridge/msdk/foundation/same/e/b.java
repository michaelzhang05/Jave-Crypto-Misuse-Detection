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
    ThreadPoolExecutor f20610a;

    /* renamed from: b, reason: collision with root package name */
    HashMap<Long, a> f20611b;

    /* renamed from: c, reason: collision with root package name */
    WeakReference<Context> f20612c;

    public b(Context context, int i8) {
        if (af.a().a("c_t_l_t_p", true)) {
            this.f20610a = c.a();
        } else {
            if (i8 == 0) {
                this.f20610a = new ThreadPoolExecutor(1, 5, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadPoolExecutor.DiscardPolicy());
            } else {
                this.f20610a = new ThreadPoolExecutor(i8, (i8 * 2) + 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadPoolExecutor.DiscardPolicy());
            }
            this.f20610a.allowCoreThreadTimeOut(true);
        }
        this.f20611b = new HashMap<>();
        this.f20612c = new WeakReference<>(context);
    }

    private synchronized void b(final a aVar, final a.InterfaceC0397a interfaceC0397a) {
        this.f20611b.put(Long.valueOf(aVar.getId()), aVar);
        aVar.setOnStateChangeListener(new a.InterfaceC0397a() { // from class: com.mbridge.msdk.foundation.same.e.b.1
            @Override // com.mbridge.msdk.foundation.same.e.a.InterfaceC0397a
            public final void a(a.b bVar) {
                if (bVar == a.b.CANCEL) {
                    b.this.f20611b.remove(Long.valueOf(aVar.getId()));
                } else if (bVar == a.b.FINISH) {
                    b.this.f20611b.remove(Long.valueOf(aVar.getId()));
                } else if (bVar == a.b.RUNNING && b.this.f20612c.get() == null) {
                    b.this.a();
                }
                a.InterfaceC0397a interfaceC0397a2 = interfaceC0397a;
                if (interfaceC0397a2 != null) {
                    interfaceC0397a2.a(bVar);
                }
            }
        });
    }

    public final void a(a aVar) {
        b(aVar, null);
        this.f20610a.execute(aVar);
    }

    public final synchronized void a() {
        try {
            Iterator<Map.Entry<Long, a>> it = this.f20611b.entrySet().iterator();
            while (it.hasNext()) {
                it.next().getValue().cancel();
            }
            this.f20611b.clear();
        } catch (Exception unused) {
        } catch (Throwable th) {
            throw th;
        }
    }

    public b(Context context) {
        if (af.a().a("c_t_l_t_p", true)) {
            this.f20610a = c.a();
        } else {
            if (af.a().a("c_t_p_t_l", true)) {
                int availableProcessors = (Runtime.getRuntime().availableProcessors() * 2) + 1;
                this.f20610a = new ThreadPoolExecutor(availableProcessors, availableProcessors, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadPoolExecutor.DiscardPolicy());
            } else {
                this.f20610a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadPoolExecutor.DiscardPolicy());
            }
            this.f20610a.allowCoreThreadTimeOut(true);
        }
        this.f20611b = new HashMap<>();
        this.f20612c = new WeakReference<>(context);
    }

    public final void a(a aVar, a.InterfaceC0397a interfaceC0397a) {
        b(aVar, interfaceC0397a);
        this.f20610a.execute(aVar);
    }
}
