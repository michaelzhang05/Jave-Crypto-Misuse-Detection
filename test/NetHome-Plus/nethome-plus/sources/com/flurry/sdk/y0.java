package com.flurry.sdk;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class y0 extends c1<k1> {

    /* renamed from: e, reason: collision with root package name */
    private static y0 f10262e;

    protected y0() {
        super("HttpRequestManager", TimeUnit.MILLISECONDS, new PriorityBlockingQueue(11, new a1()));
    }

    public static synchronized y0 f() {
        y0 y0Var;
        synchronized (y0.class) {
            if (f10262e == null) {
                f10262e = new y0();
            }
            y0Var = f10262e;
        }
        return y0Var;
    }
}
