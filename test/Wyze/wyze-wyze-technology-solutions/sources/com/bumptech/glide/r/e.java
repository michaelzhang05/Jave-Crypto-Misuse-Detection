package com.bumptech.glide.r;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* compiled from: Executors.java */
/* loaded from: classes.dex */
public final class e {
    private static final Executor a = new a();

    /* renamed from: b, reason: collision with root package name */
    private static final Executor f8955b = new b();

    /* compiled from: Executors.java */
    /* loaded from: classes.dex */
    class a implements Executor {

        /* renamed from: f, reason: collision with root package name */
        private final Handler f8956f = new Handler(Looper.getMainLooper());

        a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f8956f.post(runnable);
        }
    }

    /* compiled from: Executors.java */
    /* loaded from: classes.dex */
    class b implements Executor {
        b() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            runnable.run();
        }
    }

    public static Executor a() {
        return f8955b;
    }

    public static Executor b() {
        return a;
    }
}
