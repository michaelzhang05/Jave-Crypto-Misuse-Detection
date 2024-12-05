package com.google.firebase.messaging;

import i1.AbstractC2975b;
import i1.EnumC2976c;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.firebase.messaging.o, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
abstract class AbstractC2584o {
    private static Executor a(String str) {
        return new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new W.a(str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Executor b() {
        return a("Firebase-Messaging-File-Io");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ScheduledExecutorService c() {
        return new ScheduledThreadPoolExecutor(1, new W.a("Firebase-Messaging-Init"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ExecutorService d() {
        return AbstractC2975b.a().a(new W.a("Firebase-Messaging-Intent-Handle"), EnumC2976c.HIGH_SPEED);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ExecutorService e() {
        return Executors.newSingleThreadExecutor(new W.a("Firebase-Messaging-Network-Io"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ExecutorService f() {
        return Executors.newSingleThreadExecutor(new W.a("Firebase-Messaging-Task"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ScheduledExecutorService g() {
        return new ScheduledThreadPoolExecutor(1, new W.a("Firebase-Messaging-Topics-Io"));
    }
}
