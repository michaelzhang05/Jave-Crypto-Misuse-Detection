package com.mbridge.msdk.foundation.same.c;

import com.mbridge.msdk.foundation.tools.af;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private static AtomicBoolean f19543a;

    /* renamed from: b, reason: collision with root package name */
    private static AtomicBoolean f19544b;

    /* renamed from: c, reason: collision with root package name */
    private static ThreadPoolExecutor f19545c;

    public static ThreadPoolExecutor a() {
        if (f19545c == null) {
            int availableProcessors = (Runtime.getRuntime().availableProcessors() * 2) + 1;
            f19545c = new ThreadPoolExecutor(availableProcessors, availableProcessors, 5L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactory() { // from class: com.mbridge.msdk.foundation.same.c.g.1
                @Override // java.util.concurrent.ThreadFactory
                public final Thread newThread(Runnable runnable) {
                    Thread thread = new Thread(runnable);
                    thread.setName("mb-image-loader-thread");
                    return thread;
                }
            }, new ThreadPoolExecutor.DiscardPolicy());
        }
        f19545c.allowCoreThreadTimeOut(true);
        return f19545c;
    }

    public static boolean b() {
        if (f19543a == null) {
            f19543a = new AtomicBoolean(af.a().a("u_i_l_l_n", true));
        }
        AtomicBoolean atomicBoolean = f19543a;
        if (atomicBoolean != null && atomicBoolean.get()) {
            return true;
        }
        return false;
    }

    public static boolean c() {
        if (f19544b == null) {
            f19544b = new AtomicBoolean(af.a().a("u_i_l_l_b_d", false));
        }
        AtomicBoolean atomicBoolean = f19544b;
        if (atomicBoolean == null || !atomicBoolean.get()) {
            return false;
        }
        return true;
    }
}
