package com.mbridge.msdk.foundation.same.net;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.af;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes4.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    private static final String f19750a = "j";

    /* renamed from: b, reason: collision with root package name */
    private final Context f19751b;

    /* renamed from: d, reason: collision with root package name */
    private final c f19753d;

    /* renamed from: f, reason: collision with root package name */
    private ExecutorService f19755f;

    /* renamed from: g, reason: collision with root package name */
    private com.mbridge.msdk.foundation.same.net.stack.b f19756g;

    /* renamed from: c, reason: collision with root package name */
    private final Set<i> f19752c = new HashSet();

    /* renamed from: e, reason: collision with root package name */
    private final AtomicInteger f19754e = new AtomicInteger();

    public j(Context context) {
        a();
        this.f19751b = context.getApplicationContext();
        this.f19753d = new d(new Handler(Looper.getMainLooper()));
    }

    private void a() {
        af a8 = af.a();
        if (a8.a("c_v_r_q_t", true)) {
            try {
                this.f19755f = new ThreadPoolExecutor(a8.a("v_r_q_c_s", 10), a8.a("v_r_q_m_s", 25), a8.a("v_r_q_c_t", 15), TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadPoolExecutor.DiscardPolicy());
                return;
            } catch (Exception unused) {
                this.f19755f = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), new ThreadPoolExecutor.DiscardPolicy());
                return;
            }
        }
        this.f19755f = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), new ThreadPoolExecutor.DiscardPolicy());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(i iVar) {
        synchronized (this) {
            this.f19752c.remove(iVar);
        }
    }

    public j(Context context, com.mbridge.msdk.foundation.same.net.stack.b bVar) {
        this.f19756g = bVar;
        a();
        this.f19751b = context.getApplicationContext();
        this.f19753d = new d(new Handler(Looper.getMainLooper()));
    }

    public final void a(final i iVar) {
        iVar.a(this);
        synchronized (this) {
            this.f19752c.add(iVar);
        }
        iVar.b(this.f19754e.incrementAndGet());
        ad.c(f19750a, "add-to-queue request=" + iVar.s());
        this.f19755f.execute(new Runnable() { // from class: com.mbridge.msdk.foundation.same.net.j.1
            @Override // java.lang.Runnable
            public final void run() {
                if (j.this.f19756g == null) {
                    new h(j.this.f19753d).a(iVar);
                } else {
                    new h(j.this.f19753d, j.this.f19756g).a(iVar);
                }
            }
        });
    }
}
