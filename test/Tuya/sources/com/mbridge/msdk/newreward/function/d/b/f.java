package com.mbridge.msdk.newreward.function.d.b;

import com.mbridge.msdk.e.a.a.i;
import com.mbridge.msdk.e.a.a.l;
import com.mbridge.msdk.e.a.p;
import com.mbridge.msdk.e.a.q;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private static volatile f f21095a;

    /* renamed from: b, reason: collision with root package name */
    private q f21096b;

    private f() {
    }

    public static f a() {
        if (f21095a == null) {
            synchronized (f.class) {
                try {
                    if (f21095a == null) {
                        f21095a = new f();
                    }
                } finally {
                }
            }
        }
        return f21095a;
    }

    public final q b() {
        if (this.f21096b == null) {
            q a8 = l.a(new com.mbridge.msdk.e.a.a.b(new com.mbridge.msdk.e.a.a.g()), new com.mbridge.msdk.e.a.h(new ThreadPoolExecutor(5, 5, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: com.mbridge.msdk.newreward.function.d.b.f.1
                @Override // java.util.concurrent.ThreadFactory
                public final Thread newThread(Runnable runnable) {
                    Thread thread = new Thread(runnable);
                    thread.setName("campaign_response_thread");
                    return thread;
                }
            }, new ThreadPoolExecutor.DiscardPolicy())), 5, new i());
            this.f21096b = a8;
            a8.a();
        }
        return this.f21096b;
    }

    public final void a(p<JSONObject> pVar) {
        b().a(pVar);
    }
}