package com.google.firebase.concurrent;

import D0.C1053c;
import D0.F;
import D0.InterfaceC1055e;
import D0.x;
import android.annotation.SuppressLint;
import android.os.Build;
import android.os.StrictMode;
import b1.InterfaceC1956b;
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
    static final x f18234a = new x(new InterfaceC1956b() { // from class: E0.c
        @Override // b1.InterfaceC1956b
        public final Object get() {
            ScheduledExecutorService p8;
            p8 = ExecutorsRegistrar.p();
            return p8;
        }
    });

    /* renamed from: b, reason: collision with root package name */
    static final x f18235b = new x(new InterfaceC1956b() { // from class: E0.d
        @Override // b1.InterfaceC1956b
        public final Object get() {
            ScheduledExecutorService q8;
            q8 = ExecutorsRegistrar.q();
            return q8;
        }
    });

    /* renamed from: c, reason: collision with root package name */
    static final x f18236c = new x(new InterfaceC1956b() { // from class: E0.e
        @Override // b1.InterfaceC1956b
        public final Object get() {
            ScheduledExecutorService r8;
            r8 = ExecutorsRegistrar.r();
            return r8;
        }
    });

    /* renamed from: d, reason: collision with root package name */
    static final x f18237d = new x(new InterfaceC1956b() { // from class: E0.f
        @Override // b1.InterfaceC1956b
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
    public static /* synthetic */ ScheduledExecutorService l(InterfaceC1055e interfaceC1055e) {
        return (ScheduledExecutorService) f18234a.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService m(InterfaceC1055e interfaceC1055e) {
        return (ScheduledExecutorService) f18236c.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService n(InterfaceC1055e interfaceC1055e) {
        return (ScheduledExecutorService) f18235b.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Executor o(InterfaceC1055e interfaceC1055e) {
        return E0.m.INSTANCE;
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
        return new o(executorService, (ScheduledExecutorService) f18237d.get());
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List getComponents() {
        return Arrays.asList(C1053c.d(F.a(C0.a.class, ScheduledExecutorService.class), F.a(C0.a.class, ExecutorService.class), F.a(C0.a.class, Executor.class)).f(new D0.h() { // from class: E0.g
            @Override // D0.h
            public final Object a(InterfaceC1055e interfaceC1055e) {
                ScheduledExecutorService l8;
                l8 = ExecutorsRegistrar.l(interfaceC1055e);
                return l8;
            }
        }).d(), C1053c.d(F.a(C0.b.class, ScheduledExecutorService.class), F.a(C0.b.class, ExecutorService.class), F.a(C0.b.class, Executor.class)).f(new D0.h() { // from class: E0.h
            @Override // D0.h
            public final Object a(InterfaceC1055e interfaceC1055e) {
                ScheduledExecutorService m8;
                m8 = ExecutorsRegistrar.m(interfaceC1055e);
                return m8;
            }
        }).d(), C1053c.d(F.a(C0.c.class, ScheduledExecutorService.class), F.a(C0.c.class, ExecutorService.class), F.a(C0.c.class, Executor.class)).f(new D0.h() { // from class: E0.i
            @Override // D0.h
            public final Object a(InterfaceC1055e interfaceC1055e) {
                ScheduledExecutorService n8;
                n8 = ExecutorsRegistrar.n(interfaceC1055e);
                return n8;
            }
        }).d(), C1053c.c(F.a(C0.d.class, Executor.class)).f(new D0.h() { // from class: E0.j
            @Override // D0.h
            public final Object a(InterfaceC1055e interfaceC1055e) {
                Executor o8;
                o8 = ExecutorsRegistrar.o(interfaceC1055e);
                return o8;
            }
        }).d());
    }
}
