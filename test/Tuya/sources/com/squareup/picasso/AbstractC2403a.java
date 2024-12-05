package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.squareup.picasso.s;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: com.squareup.picasso.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
abstract class AbstractC2403a {

    /* renamed from: a, reason: collision with root package name */
    final s f23206a;

    /* renamed from: b, reason: collision with root package name */
    final v f23207b;

    /* renamed from: c, reason: collision with root package name */
    final WeakReference f23208c;

    /* renamed from: d, reason: collision with root package name */
    final boolean f23209d;

    /* renamed from: e, reason: collision with root package name */
    final int f23210e;

    /* renamed from: f, reason: collision with root package name */
    final int f23211f;

    /* renamed from: g, reason: collision with root package name */
    final int f23212g;

    /* renamed from: h, reason: collision with root package name */
    final Drawable f23213h;

    /* renamed from: i, reason: collision with root package name */
    final String f23214i;

    /* renamed from: j, reason: collision with root package name */
    final Object f23215j;

    /* renamed from: k, reason: collision with root package name */
    boolean f23216k;

    /* renamed from: l, reason: collision with root package name */
    boolean f23217l;

    /* renamed from: com.squareup.picasso.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static class C0440a extends WeakReference {

        /* renamed from: a, reason: collision with root package name */
        final AbstractC2403a f23218a;

        C0440a(AbstractC2403a abstractC2403a, Object obj, ReferenceQueue referenceQueue) {
            super(obj, referenceQueue);
            this.f23218a = abstractC2403a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC2403a(s sVar, Object obj, v vVar, int i8, int i9, int i10, Drawable drawable, String str, Object obj2, boolean z8) {
        C0440a c0440a;
        this.f23206a = sVar;
        this.f23207b = vVar;
        if (obj == null) {
            c0440a = null;
        } else {
            c0440a = new C0440a(this, obj, sVar.f23326j);
        }
        this.f23208c = c0440a;
        this.f23210e = i8;
        this.f23211f = i9;
        this.f23209d = z8;
        this.f23212g = i10;
        this.f23213h = drawable;
        this.f23214i = str;
        this.f23215j = obj2 == null ? this : obj2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        this.f23217l = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void b(Bitmap bitmap, s.e eVar);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void c(Exception exc);

    /* JADX INFO: Access modifiers changed from: package-private */
    public String d() {
        return this.f23214i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int e() {
        return this.f23210e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int f() {
        return this.f23211f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public s g() {
        return this.f23206a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public s.f h() {
        return this.f23207b.f23383t;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public v i() {
        return this.f23207b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Object j() {
        return this.f23215j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Object k() {
        WeakReference weakReference = this.f23208c;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean l() {
        return this.f23217l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean m() {
        return this.f23216k;
    }
}
