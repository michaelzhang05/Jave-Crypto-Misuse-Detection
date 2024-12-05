package com.google.firebase.concurrent;

import B0.C1062c;
import B0.F;
import B0.InterfaceC1064e;
import B0.x;
import android.annotation.SuppressLint;
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

@SuppressLint({"ThreadPoolCreation"})
/* loaded from: classes3.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {

    /* renamed from: a, reason: collision with root package name */
    static final x f17199a = new x(new Z0.b() { // from class: C0.c
        @Override // Z0.b
        public final Object get() {
            ScheduledExecutorService p8;
            p8 = ExecutorsRegistrar.p();
            return p8;
        }
    });

    /* renamed from: b, reason: collision with root package name */
    static final x f17200b = new x(new Z0.b() { // from class: C0.d
        @Override // Z0.b
        public final Object get() {
            ScheduledExecutorService q8;
            q8 = ExecutorsRegistrar.q();
            return q8;
        }
    });

    /* renamed from: c, reason: collision with root package name */
    static final x f17201c = new x(new Z0.b() { // from class: C0.e
        @Override // Z0.b
        public final Object get() {
            ScheduledExecutorService r8;
            r8 = ExecutorsRegistrar.r();
            return r8;
        }
    });

    /* renamed from: d, reason: collision with root package name */
    static final x f17202d = new x(new Z0.b() { // from class: C0.f
        @Override // Z0.b
        public final Object get() {
            ScheduledExecutorService s8;
            s8 = ExecutorsRegistrar.s();
            return s8;
        }
    });

    private static StrictMode.ThreadPolicy i() {
        StrictMode.ThreadPolicy.Builder detectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 23) {
            detectNetwork.detectResourceMismatches();
            if (i8 >= 26) {
                detectNetwork.detectUnbufferedIo();
            }
        }
        return detectNetwork.penaltyLog().build();
    }

    private static ThreadFactory j(String str, int i8) {
        return new b(str, i8, null);
    }

    private static ThreadFactory k(String str, int i8, StrictMode.ThreadPolicy threadPolicy) {
        return new b(str, i8, threadPolicy);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService l(InterfaceC1064e interfaceC1064e) {
        return (ScheduledExecutorService) f17199a.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService m(InterfaceC1064e interfaceC1064e) {
        return (ScheduledExecutorService) f17201c.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService n(InterfaceC1064e interfaceC1064e) {
        return (ScheduledExecutorService) f17200b.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Executor o(InterfaceC1064e interfaceC1064e) {
        return C0.m.INSTANCE;
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
        return new o(executorService, (ScheduledExecutorService) f17202d.get());
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List getComponents() {
        return Arrays.asList(C1062c.d(F.a(A0.a.class, ScheduledExecutorService.class), F.a(A0.a.class, ExecutorService.class), F.a(A0.a.class, Executor.class)).f(new B0.h() { // from class: C0.g
            @Override // B0.h
            public final Object a(InterfaceC1064e interfaceC1064e) {
                ScheduledExecutorService l8;
                l8 = ExecutorsRegistrar.l(interfaceC1064e);
                return l8;
            }
        }).d(), C1062c.d(F.a(A0.b.class, ScheduledExecutorService.class), F.a(A0.b.class, ExecutorService.class), F.a(A0.b.class, Executor.class)).f(new B0.h() { // from class: C0.h
            @Override // B0.h
            public final Object a(InterfaceC1064e interfaceC1064e) {
                ScheduledExecutorService m8;
                m8 = ExecutorsRegistrar.m(interfaceC1064e);
                return m8;
            }
        }).d(), C1062c.d(F.a(A0.c.class, ScheduledExecutorService.class), F.a(A0.c.class, ExecutorService.class), F.a(A0.c.class, Executor.class)).f(new B0.h() { // from class: C0.i
            @Override // B0.h
            public final Object a(InterfaceC1064e interfaceC1064e) {
                ScheduledExecutorService n8;
                n8 = ExecutorsRegistrar.n(interfaceC1064e);
                return n8;
            }
        }).d(), C1062c.c(F.a(A0.d.class, Executor.class)).f(new B0.h() { // from class: C0.j
            @Override // B0.h
            public final Object a(InterfaceC1064e interfaceC1064e) {
                Executor o8;
                o8 = ExecutorsRegistrar.o(interfaceC1064e);
                return o8;
            }
        }).d());
    }
}
