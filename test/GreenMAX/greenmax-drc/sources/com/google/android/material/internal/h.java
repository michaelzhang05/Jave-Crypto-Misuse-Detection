package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* compiled from: TextDrawableHelper.java */
/* loaded from: classes2.dex */
public class h {

    /* renamed from: c, reason: collision with root package name */
    private float f16694c;

    /* renamed from: f, reason: collision with root package name */
    private e.e.b.b.w.d f16697f;
    private final TextPaint a = new TextPaint(1);

    /* renamed from: b, reason: collision with root package name */
    private final e.e.b.b.w.f f16693b = new a();

    /* renamed from: d, reason: collision with root package name */
    private boolean f16695d = true;

    /* renamed from: e, reason: collision with root package name */
    private WeakReference<b> f16696e = new WeakReference<>(null);

    /* compiled from: TextDrawableHelper.java */
    /* loaded from: classes2.dex */
    class a extends e.e.b.b.w.f {
        a() {
        }

        @Override // e.e.b.b.w.f
        public void a(int i2) {
            h.this.f16695d = true;
            b bVar = (b) h.this.f16696e.get();
            if (bVar != null) {
                bVar.a();
            }
        }

        @Override // e.e.b.b.w.f
        public void b(Typeface typeface, boolean z) {
            if (z) {
                return;
            }
            h.this.f16695d = true;
            b bVar = (b) h.this.f16696e.get();
            if (bVar != null) {
                bVar.a();
            }
        }
    }

    /* compiled from: TextDrawableHelper.java */
    /* loaded from: classes2.dex */
    public interface b {
        void a();

        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public h(b bVar) {
        g(bVar);
    }

    private float c(CharSequence charSequence) {
        if (charSequence == null) {
            return 0.0f;
        }
        return this.a.measureText(charSequence, 0, charSequence.length());
    }

    public e.e.b.b.w.d d() {
        return this.f16697f;
    }

    public TextPaint e() {
        return this.a;
    }

    public float f(String str) {
        if (!this.f16695d) {
            return this.f16694c;
        }
        float c2 = c(str);
        this.f16694c = c2;
        this.f16695d = false;
        return c2;
    }

    public void g(b bVar) {
        this.f16696e = new WeakReference<>(bVar);
    }

    public void h(e.e.b.b.w.d dVar, Context context) {
        if (this.f16697f != dVar) {
            this.f16697f = dVar;
            if (dVar != null) {
                dVar.j(context, this.a, this.f16693b);
                b bVar = this.f16696e.get();
                if (bVar != null) {
                    this.a.drawableState = bVar.getState();
                }
                dVar.i(context, this.a, this.f16693b);
                this.f16695d = true;
            }
            b bVar2 = this.f16696e.get();
            if (bVar2 != null) {
                bVar2.a();
                bVar2.onStateChange(bVar2.getState());
            }
        }
    }

    public void i(boolean z) {
        this.f16695d = z;
    }

    public void j(Context context) {
        this.f16697f.i(context, this.a, this.f16693b);
    }
}
