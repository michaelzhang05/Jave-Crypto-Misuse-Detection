package com.facebook.internal.a0.f;

import com.facebook.f;
import com.facebook.internal.a0.b;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: CrashShieldHandler.java */
/* loaded from: classes.dex */
public class a {
    private static final Set<Object> a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b, reason: collision with root package name */
    private static boolean f9126b = false;

    public static void a() {
        f9126b = true;
    }

    public static void b(Throwable th, Object obj) {
        if (f9126b) {
            a.add(obj);
            if (f.i()) {
                com.facebook.internal.a0.a.b(th);
                b.C0132b.a(th, b.c.CrashShield).h();
            }
            d(th);
        }
    }

    public static boolean c(Object obj) {
        return a.contains(obj);
    }

    private static void d(Throwable th) {
    }
}
