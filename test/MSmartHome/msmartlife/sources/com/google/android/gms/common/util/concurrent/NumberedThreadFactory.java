package com.google.android.gms.common.util.concurrent;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

@KeepForSdk
/* loaded from: classes2.dex */
public class NumberedThreadFactory implements ThreadFactory {

    /* renamed from: f, reason: collision with root package name */
    private final String f11008f;

    /* renamed from: g, reason: collision with root package name */
    private final int f11009g;

    /* renamed from: h, reason: collision with root package name */
    private final AtomicInteger f11010h;

    /* renamed from: i, reason: collision with root package name */
    private final ThreadFactory f11011i;

    @KeepForSdk
    public NumberedThreadFactory(String str) {
        this(str, 0);
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread newThread = this.f11011i.newThread(new a(runnable, 0));
        String str = this.f11008f;
        int andIncrement = this.f11010h.getAndIncrement();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 13);
        sb.append(str);
        sb.append("[");
        sb.append(andIncrement);
        sb.append("]");
        newThread.setName(sb.toString());
        return newThread;
    }

    private NumberedThreadFactory(String str, int i2) {
        this.f11010h = new AtomicInteger();
        this.f11011i = Executors.defaultThreadFactory();
        this.f11008f = (String) Preconditions.k(str, "Name must not be null");
        this.f11009g = 0;
    }
}
