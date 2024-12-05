package com.flurry.sdk;

import java.lang.Thread;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class q7 {
    private static q7 a;

    /* renamed from: c, reason: collision with root package name */
    final Map<Thread.UncaughtExceptionHandler, Void> f10140c = new WeakHashMap();

    /* renamed from: b, reason: collision with root package name */
    final Thread.UncaughtExceptionHandler f10139b = Thread.getDefaultUncaughtExceptionHandler();

    /* loaded from: classes2.dex */
    final class a implements Thread.UncaughtExceptionHandler {
        private a() {
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public final void uncaughtException(Thread thread, Throwable th) {
            Iterator<Thread.UncaughtExceptionHandler> it = q7.this.b().iterator();
            while (it.hasNext()) {
                try {
                    it.next().uncaughtException(thread, th);
                } catch (Throwable unused) {
                }
            }
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = q7.this.f10139b;
            if (uncaughtExceptionHandler != null) {
                try {
                    uncaughtExceptionHandler.uncaughtException(thread, th);
                } catch (Throwable unused2) {
                }
            }
        }

        /* synthetic */ a(q7 q7Var, byte b2) {
            this();
        }
    }

    private q7() {
        Thread.setDefaultUncaughtExceptionHandler(new a(this, (byte) 0));
    }

    public static synchronized q7 a() {
        q7 q7Var;
        synchronized (q7.class) {
            if (a == null) {
                a = new q7();
            }
            q7Var = a;
        }
        return q7Var;
    }

    final Set<Thread.UncaughtExceptionHandler> b() {
        Set<Thread.UncaughtExceptionHandler> keySet;
        synchronized (this.f10140c) {
            keySet = this.f10140c.keySet();
        }
        return keySet;
    }
}
