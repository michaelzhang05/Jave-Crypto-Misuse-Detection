package io.sentry.internal.gestures;

import io.sentry.util.q;
import java.lang.ref.WeakReference;

/* compiled from: UiElement.java */
/* loaded from: classes2.dex */
public final class b {
    final WeakReference<Object> a;

    /* renamed from: b, reason: collision with root package name */
    final String f18966b;

    /* renamed from: c, reason: collision with root package name */
    final String f18967c;

    /* renamed from: d, reason: collision with root package name */
    final String f18968d;

    /* renamed from: e, reason: collision with root package name */
    final String f18969e;

    /* compiled from: UiElement.java */
    /* loaded from: classes2.dex */
    public enum a {
        CLICKABLE,
        SCROLLABLE
    }

    public b(Object obj, String str, String str2, String str3, String str4) {
        this.a = new WeakReference<>(obj);
        this.f18966b = str;
        this.f18967c = str2;
        this.f18968d = str3;
        this.f18969e = str4;
    }

    public String a() {
        return this.f18966b;
    }

    public String b() {
        String str = this.f18967c;
        return str != null ? str : (String) q.c(this.f18968d, "UiElement.tag can't be null");
    }

    public String c() {
        return this.f18969e;
    }

    public String d() {
        return this.f18967c;
    }

    public String e() {
        return this.f18968d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return q.a(this.f18966b, bVar.f18966b) && q.a(this.f18967c, bVar.f18967c) && q.a(this.f18968d, bVar.f18968d);
    }

    public Object f() {
        return this.a.get();
    }

    public int hashCode() {
        return q.b(this.a, this.f18967c, this.f18968d);
    }
}
