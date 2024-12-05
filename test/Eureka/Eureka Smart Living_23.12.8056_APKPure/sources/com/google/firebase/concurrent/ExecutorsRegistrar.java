package com.google.firebase.concurrent;

import android.os.Build;
import android.os.StrictMode;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import z3.e0;
import z3.x;

/* loaded from: classes.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {

    /* renamed from: a, reason: collision with root package name */
    static final x f5716a = new x(new k4.b() { // from class: a4.c
        @Override // k4.b
        public final Object get() {
            ScheduledExecutorService p6;
            p6 = ExecutorsRegistrar.p();
            return p6;
        }
    });

    /* renamed from: b, reason: collision with root package name */
    static final x f5717b = new x(new k4.b() { // from class: a4.d
        @Override // k4.b
        public final Object get() {
            ScheduledExecutorService q6;
            q6 = ExecutorsRegistrar.q();
            return q6;
        }
    });

    /* renamed from: c, reason: collision with root package name */
    static final x f5718c = new x(new k4.b() { // from class: a4.e
        @Override // k4.b
        public final Object get() {
            ScheduledExecutorService r5;
            r5 = ExecutorsRegistrar.r();
            return r5;
        }
    });

    /* renamed from: d, reason: collision with root package name */
    private static final x f5719d = new x(new k4.b() { // from class: a4.f
        @Override // k4.b
        public final Object get() {
            ScheduledExecutorService s5;
            s5 = ExecutorsRegistrar.s();
            return s5;
        }
    });

    private static StrictMode.ThreadPolicy i() {
        StrictMode.ThreadPolicy.Builder detectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 23) {
            detectNetwork.detectResourceMismatches();
            if (i6 >= 26) {
                detectNetwork.detectUnbufferedIo();
            }
        }
        return detectNetwork.penaltyLog().build();
    }

    private static ThreadFactory j(String str, int i6) {
        return new b(str, i6, null);
    }

    private static ThreadFactory k(String str, int i6, StrictMode.ThreadPolicy threadPolicy) {
        return new b(str, i6, threadPolicy);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService l(z3.e eVar) {
        return (ScheduledExecutorService) f5716a.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService m(z3.e eVar) {
        return (ScheduledExecutorService) f5718c.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService n(z3.e eVar) {
        return (ScheduledExecutorService) f5717b.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Executor o(z3.e eVar) {
        return a4.m.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService p() {
        return u(Executors.newFixedThreadPool(4, k("Firebase Background", 10, i())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService q() {
        return u(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), k("Firebase Lite", 0, t())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService r() {
        return u(Executors.newCachedThreadPool(j("Firebase Blocking", 11)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService s() {
        return Executors.newSingleThreadScheduledExecutor(j("Firebase Scheduler", 0));
    }

    private static StrictMode.ThreadPolicy t() {
        return new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build();
    }

    private static ScheduledExecutorService u(ExecutorService executorService) {
        return new o(executorService, (ScheduledExecutorService) f5719d.get());
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List getComponents() {
        return Arrays.asList(z3.c.f(e0.a(y3.a.class, ScheduledExecutorService.class), e0.a(y3.a.class, ExecutorService.class), e0.a(y3.a.class, Executor.class)).e(new z3.h() { // from class: a4.g
            @Override // z3.h
            public final Object a(z3.e eVar) {
                ScheduledExecutorService l6;
                l6 = ExecutorsRegistrar.l(eVar);
                return l6;
            }
        }).d(), z3.c.f(e0.a(y3.b.class, ScheduledExecutorService.class), e0.a(y3.b.class, ExecutorService.class), e0.a(y3.b.class, Executor.class)).e(new z3.h() { // from class: a4.h
            @Override // z3.h
            public final Object a(z3.e eVar) {
                ScheduledExecutorService m6;
                m6 = ExecutorsRegistrar.m(eVar);
                return m6;
            }
        }).d(), z3.c.f(e0.a(y3.c.class, ScheduledExecutorService.class), e0.a(y3.c.class, ExecutorService.class), e0.a(y3.c.class, Executor.class)).e(new z3.h() { // from class: a4.i
            @Override // z3.h
            public final Object a(z3.e eVar) {
                ScheduledExecutorService n6;
                n6 = ExecutorsRegistrar.n(eVar);
                return n6;
            }
        }).d(), z3.c.e(e0.a(y3.d.class, Executor.class)).e(new z3.h() { // from class: a4.j
            @Override // z3.h
            public final Object a(z3.e eVar) {
                Executor o6;
                o6 = ExecutorsRegistrar.o(eVar);
                return o6;
            }
        }).d());
    }
}
