package com.facebook.internal.b0.e;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Queue;

/* compiled from: MonitorLoggingQueue.java */
/* loaded from: classes.dex */
public class c implements com.facebook.internal.b0.b {
    private static c a;

    /* renamed from: b, reason: collision with root package name */
    private static final Integer f9143b = 100;

    /* renamed from: c, reason: collision with root package name */
    private Queue<com.facebook.internal.b0.a> f9144c = new LinkedList();

    private c() {
    }

    public static synchronized c c() {
        c cVar;
        synchronized (c.class) {
            if (a == null) {
                a = new c();
            }
            cVar = a;
        }
        return cVar;
    }

    private boolean d() {
        return this.f9144c.size() >= f9143b.intValue();
    }

    @Override // com.facebook.internal.b0.b
    public boolean a(Collection<? extends com.facebook.internal.b0.a> collection) {
        if (collection != null) {
            this.f9144c.addAll(collection);
        }
        return d();
    }

    @Override // com.facebook.internal.b0.b
    public com.facebook.internal.b0.a b() {
        return this.f9144c.poll();
    }

    @Override // com.facebook.internal.b0.b
    public boolean isEmpty() {
        return this.f9144c.isEmpty();
    }
}
