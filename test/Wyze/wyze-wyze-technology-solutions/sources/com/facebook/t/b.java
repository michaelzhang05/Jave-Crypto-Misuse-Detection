package com.facebook.t;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AnalyticsUserIDStore.java */
/* loaded from: classes.dex */
public class b {
    private static final String a = "b";

    /* renamed from: c, reason: collision with root package name */
    private static String f9432c;

    /* renamed from: b, reason: collision with root package name */
    private static ReentrantReadWriteLock f9431b = new ReentrantReadWriteLock();

    /* renamed from: d, reason: collision with root package name */
    private static volatile boolean f9433d = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AnalyticsUserIDStore.java */
    /* loaded from: classes.dex */
    public static class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.facebook.internal.a0.f.a.c(this)) {
                return;
            }
            try {
                b.f();
            } catch (Throwable th) {
                com.facebook.internal.a0.f.a.b(th, this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AnalyticsUserIDStore.java */
    /* renamed from: com.facebook.t.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class RunnableC0139b implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f9434f;

        RunnableC0139b(String str) {
            this.f9434f = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.facebook.internal.a0.f.a.c(this)) {
                return;
            }
            try {
                b.f9431b.writeLock().lock();
                try {
                    String unused = b.f9432c = this.f9434f;
                    SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(com.facebook.f.e()).edit();
                    edit.putString("com.facebook.appevents.AnalyticsUserIDStore.userID", b.f9432c);
                    edit.apply();
                } finally {
                    b.f9431b.writeLock().unlock();
                }
            } catch (Throwable th) {
                com.facebook.internal.a0.f.a.b(th, this);
            }
        }
    }

    public static String e() {
        if (!f9433d) {
            Log.w(a, "initStore should have been called before calling setUserID");
            f();
        }
        f9431b.readLock().lock();
        try {
            return f9432c;
        } finally {
            f9431b.readLock().unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void f() {
        if (f9433d) {
            return;
        }
        f9431b.writeLock().lock();
        try {
            if (f9433d) {
                return;
            }
            f9432c = PreferenceManager.getDefaultSharedPreferences(com.facebook.f.e()).getString("com.facebook.appevents.AnalyticsUserIDStore.userID", null);
            f9433d = true;
        } finally {
            f9431b.writeLock().unlock();
        }
    }

    public static void g() {
        if (f9433d) {
            return;
        }
        m.b().execute(new a());
    }

    public static void h(String str) {
        com.facebook.t.u.b.b();
        if (!f9433d) {
            Log.w(a, "initStore should have been called before calling setUserID");
            f();
        }
        m.b().execute(new RunnableC0139b(str));
    }
}
