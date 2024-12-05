package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.squareup.picasso.s;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: com.squareup.picasso.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
abstract class AbstractC2597a {

    /* renamed from: a, reason: collision with root package name */
    final s f24261a;

    /* renamed from: b, reason: collision with root package name */
    final v f24262b;

    /* renamed from: c, reason: collision with root package name */
    final WeakReference f24263c;

    /* renamed from: d, reason: collision with root package name */
    final boolean f24264d;

    /* renamed from: e, reason: collision with root package name */
    final int f24265e;

    /* renamed from: f, reason: collision with root package name */
    final int f24266f;

    /* renamed from: g, reason: collision with root package name */
    final int f24267g;

    /* renamed from: h, reason: collision with root package name */
    final Drawable f24268h;

    /* renamed from: i, reason: collision with root package name */
    final String f24269i;

    /* renamed from: j, reason: collision with root package name */
    final Object f24270j;

    /* renamed from: k, reason: collision with root package name */
    boolean f24271k;

    /* renamed from: l, reason: collision with root package name */
    boolean f24272l;

    /* renamed from: com.squareup.picasso.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static class C0436a extends WeakReference {

        /* renamed from: a, reason: collision with root package name */
        final AbstractC2597a f24273a;

        C0436a(AbstractC2597a abstractC2597a, Object obj, ReferenceQueue referenceQueue) {
            super(obj, referenceQueue);
            this.f24273a = abstractC2597a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC2597a(s sVar, Object obj, v vVar, int i8, int i9, int i10, Drawable drawable, String str, Object obj2, boolean z8) {
        C0436a c0436a;
        this.f24261a = sVar;
        this.f24262b = vVar;
        if (obj == null) {
            c0436a = null;
        } else {
            c0436a = new C0436a(this, obj, sVar.f24381j);
        }
        this.f24263c = c0436a;
        this.f24265e = i8;
        this.f24266f = i9;
        this.f24264d = z8;
        this.f24267g = i10;
        this.f24268h = drawable;
        this.f24269i = str;
        this.f24270j = obj2 == null ? this : obj2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        this.f24272l = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void b(Bitmap bitmap, s.e eVar);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void c(Exception exc);

    /* JADX INFO: Access modifiers changed from: package-private */
    public String d() {
        return this.f24269i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int e() {
        return this.f24265e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int f() {
        return this.f24266f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public s g() {
        return this.f24261a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public s.f h() {
        return this.f24262b.f24438t;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public v i() {
        return this.f24262b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Object j() {
        return this.f24270j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Object k() {
        WeakReference weakReference = this.f24263c;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean l() {
        return this.f24272l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean m() {
        return this.f24271k;
    }
}
