package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class j {

    /* renamed from: c, reason: collision with root package name */
    private float f5116c;

    /* renamed from: f, reason: collision with root package name */
    private z2.d f5119f;

    /* renamed from: a, reason: collision with root package name */
    private final TextPaint f5114a = new TextPaint(1);

    /* renamed from: b, reason: collision with root package name */
    private final z2.f f5115b = new a();

    /* renamed from: d, reason: collision with root package name */
    private boolean f5117d = true;

    /* renamed from: e, reason: collision with root package name */
    private WeakReference f5118e = new WeakReference(null);

    /* loaded from: classes.dex */
    class a extends z2.f {
        a() {
        }

        @Override // z2.f
        public void a(int i6) {
            j.this.f5117d = true;
            b bVar = (b) j.this.f5118e.get();
            if (bVar != null) {
                bVar.a();
            }
        }

        @Override // z2.f
        public void b(Typeface typeface, boolean z5) {
            if (z5) {
                return;
            }
            j.this.f5117d = true;
            b bVar = (b) j.this.f5118e.get();
            if (bVar != null) {
                bVar.a();
            }
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a();

        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public j(b bVar) {
        g(bVar);
    }

    private float c(CharSequence charSequence) {
        if (charSequence == null) {
            return 0.0f;
        }
        return this.f5114a.measureText(charSequence, 0, charSequence.length());
    }

    public z2.d d() {
        return this.f5119f;
    }

    public TextPaint e() {
        return this.f5114a;
    }

    public float f(String str) {
        if (!this.f5117d) {
            return this.f5116c;
        }
        float c6 = c(str);
        this.f5116c = c6;
        this.f5117d = false;
        return c6;
    }

    public void g(b bVar) {
        this.f5118e = new WeakReference(bVar);
    }

    public void h(z2.d dVar, Context context) {
        if (this.f5119f != dVar) {
            this.f5119f = dVar;
            if (dVar != null) {
                dVar.o(context, this.f5114a, this.f5115b);
                b bVar = (b) this.f5118e.get();
                if (bVar != null) {
                    this.f5114a.drawableState = bVar.getState();
                }
                dVar.n(context, this.f5114a, this.f5115b);
                this.f5117d = true;
            }
            b bVar2 = (b) this.f5118e.get();
            if (bVar2 != null) {
                bVar2.a();
                bVar2.onStateChange(bVar2.getState());
            }
        }
    }

    public void i(boolean z5) {
        this.f5117d = z5;
    }

    public void j(Context context) {
        this.f5119f.n(context, this.f5114a, this.f5115b);
    }
}
