package com.google.firebase.messaging;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class W {

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f17382a;

    /* renamed from: b, reason: collision with root package name */
    private final String f17383b;

    /* renamed from: c, reason: collision with root package name */
    private final String f17384c;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f17386e;

    /* renamed from: d, reason: collision with root package name */
    final ArrayDeque f17385d = new ArrayDeque();

    /* renamed from: f, reason: collision with root package name */
    private boolean f17387f = false;

    private W(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        this.f17382a = sharedPreferences;
        this.f17383b = str;
        this.f17384c = str2;
        this.f17386e = executor;
    }

    private boolean b(boolean z8) {
        if (z8 && !this.f17387f) {
            i();
        }
        return z8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static W c(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        W w8 = new W(sharedPreferences, str, str2, executor);
        w8.d();
        return w8;
    }

    private void d() {
        synchronized (this.f17385d) {
            try {
                this.f17385d.clear();
                String string = this.f17382a.getString(this.f17383b, "");
                if (!TextUtils.isEmpty(string) && string.contains(this.f17384c)) {
                    String[] split = string.split(this.f17384c, -1);
                    if (split.length == 0) {
                        Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                    }
                    for (String str : split) {
                        if (!TextUtils.isEmpty(str)) {
                            this.f17385d.add(str);
                        }
                    }
                }
            } finally {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        synchronized (this.f17385d) {
            this.f17382a.edit().putString(this.f17383b, g()).commit();
        }
    }

    private void i() {
        this.f17386e.execute(new Runnable() { // from class: com.google.firebase.messaging.V
            @Override // java.lang.Runnable
            public final void run() {
                W.this.h();
            }
        });
    }

    public String e() {
        String str;
        synchronized (this.f17385d) {
            str = (String) this.f17385d.peek();
        }
        return str;
    }

    public boolean f(Object obj) {
        boolean b8;
        synchronized (this.f17385d) {
            b8 = b(this.f17385d.remove(obj));
        }
        return b8;
    }

    public String g() {
        StringBuilder sb = new StringBuilder();
        Iterator it = this.f17385d.iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            sb.append(this.f17384c);
        }
        return sb.toString();
    }
}
