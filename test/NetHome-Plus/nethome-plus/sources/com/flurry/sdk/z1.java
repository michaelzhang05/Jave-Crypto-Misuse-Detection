package com.flurry.sdk;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes2.dex */
public final class z1 implements ThreadFactory {

    /* renamed from: f, reason: collision with root package name */
    private final ThreadGroup f10270f;

    /* renamed from: g, reason: collision with root package name */
    private final int f10271g = 1;

    public z1(String str) {
        this.f10270f = new ThreadGroup(str);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(this.f10270f, runnable);
        thread.setName(this.f10270f.getName() + ":" + thread.getId());
        thread.setPriority(this.f10271g);
        return thread;
    }
}
