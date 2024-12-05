package com.google.firebase.messaging;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class Z {

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f18419a;

    /* renamed from: b, reason: collision with root package name */
    private final String f18420b;

    /* renamed from: c, reason: collision with root package name */
    private final String f18421c;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f18423e;

    /* renamed from: d, reason: collision with root package name */
    final ArrayDeque f18422d = new ArrayDeque();

    /* renamed from: f, reason: collision with root package name */
    private boolean f18424f = false;

    private Z(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        this.f18419a = sharedPreferences;
        this.f18420b = str;
        this.f18421c = str2;
        this.f18423e = executor;
    }

    private boolean b(boolean z8) {
        if (z8 && !this.f18424f) {
            i();
        }
        return z8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Z c(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        Z z8 = new Z(sharedPreferences, str, str2, executor);
        z8.d();
        return z8;
    }

    private void d() {
        synchronized (this.f18422d) {
            try {
                this.f18422d.clear();
                String string = this.f18419a.getString(this.f18420b, "");
                if (!TextUtils.isEmpty(string) && string.contains(this.f18421c)) {
                    String[] split = string.split(this.f18421c, -1);
                    if (split.length == 0) {
                        Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                    }
                    for (String str : split) {
                        if (!TextUtils.isEmpty(str)) {
                            this.f18422d.add(str);
                        }
                    }
                }
            } finally {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        synchronized (this.f18422d) {
            this.f18419a.edit().putString(this.f18420b, g()).commit();
        }
    }

    private void i() {
        this.f18423e.execute(new Runnable() { // from class: com.google.firebase.messaging.Y
            @Override // java.lang.Runnable
            public final void run() {
                Z.this.h();
            }
        });
    }

    public String e() {
        String str;
        synchronized (this.f18422d) {
            str = (String) this.f18422d.peek();
        }
        return str;
    }

    public boolean f(Object obj) {
        boolean b8;
        synchronized (this.f18422d) {
            b8 = b(this.f18422d.remove(obj));
        }
        return b8;
    }

    public String g() {
        StringBuilder sb = new StringBuilder();
        Iterator it = this.f18422d.iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            sb.append(this.f18421c);
        }
        return sb.toString();
    }
}
