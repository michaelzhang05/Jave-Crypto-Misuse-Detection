package com.google.firebase.messaging;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f5993a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5994b;

    /* renamed from: c, reason: collision with root package name */
    private final String f5995c;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f5997e;

    /* renamed from: d, reason: collision with root package name */
    final ArrayDeque f5996d = new ArrayDeque();

    /* renamed from: f, reason: collision with root package name */
    private boolean f5998f = false;

    private v0(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        this.f5993a = sharedPreferences;
        this.f5994b = str;
        this.f5995c = str2;
        this.f5997e = executor;
    }

    private boolean b(boolean z5) {
        if (z5 && !this.f5998f) {
            i();
        }
        return z5;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static v0 c(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        v0 v0Var = new v0(sharedPreferences, str, str2, executor);
        v0Var.d();
        return v0Var;
    }

    private void d() {
        synchronized (this.f5996d) {
            this.f5996d.clear();
            String string = this.f5993a.getString(this.f5994b, "");
            if (!TextUtils.isEmpty(string) && string.contains(this.f5995c)) {
                String[] split = string.split(this.f5995c, -1);
                if (split.length == 0) {
                    Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                }
                for (String str : split) {
                    if (!TextUtils.isEmpty(str)) {
                        this.f5996d.add(str);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        synchronized (this.f5996d) {
            this.f5993a.edit().putString(this.f5994b, g()).commit();
        }
    }

    private void i() {
        this.f5997e.execute(new Runnable() { // from class: com.google.firebase.messaging.u0
            @Override // java.lang.Runnable
            public final void run() {
                v0.this.h();
            }
        });
    }

    public String e() {
        String str;
        synchronized (this.f5996d) {
            str = (String) this.f5996d.peek();
        }
        return str;
    }

    public boolean f(Object obj) {
        boolean b6;
        synchronized (this.f5996d) {
            b6 = b(this.f5996d.remove(obj));
        }
        return b6;
    }

    public String g() {
        StringBuilder sb = new StringBuilder();
        Iterator it = this.f5996d.iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            sb.append(this.f5995c);
        }
        return sb.toString();
    }
}
