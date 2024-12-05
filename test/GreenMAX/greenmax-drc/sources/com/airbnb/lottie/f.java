package com.airbnb.lottie;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.View;
import com.airbnb.lottie.u.s;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: LottieDrawable.java */
/* loaded from: classes.dex */
public class f extends Drawable implements Drawable.Callback, Animatable {

    /* renamed from: f, reason: collision with root package name */
    private static final String f7919f = f.class.getSimpleName();

    /* renamed from: g, reason: collision with root package name */
    private final Matrix f7920g = new Matrix();

    /* renamed from: h, reason: collision with root package name */
    private com.airbnb.lottie.d f7921h;

    /* renamed from: i, reason: collision with root package name */
    private final com.airbnb.lottie.v.c f7922i;

    /* renamed from: j, reason: collision with root package name */
    private float f7923j;

    /* renamed from: k, reason: collision with root package name */
    private final Set<?> f7924k;
    private final ArrayList<j> l;
    private com.airbnb.lottie.r.b m;
    private String n;
    private com.airbnb.lottie.b o;
    private com.airbnb.lottie.r.a p;
    com.airbnb.lottie.a q;
    p r;
    private boolean s;
    private com.airbnb.lottie.s.k.b t;
    private int u;
    private boolean v;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LottieDrawable.java */
    /* loaded from: classes.dex */
    public class a implements j {
        final /* synthetic */ int a;

        a(int i2) {
            this.a = i2;
        }

        @Override // com.airbnb.lottie.f.j
        public void a(com.airbnb.lottie.d dVar) {
            f.this.H(this.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LottieDrawable.java */
    /* loaded from: classes.dex */
    public class b implements j {
        final /* synthetic */ float a;

        b(float f2) {
            this.a = f2;
        }

        @Override // com.airbnb.lottie.f.j
        public void a(com.airbnb.lottie.d dVar) {
            f.this.P(this.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LottieDrawable.java */
    /* loaded from: classes.dex */
    public class c implements j {
        final /* synthetic */ com.airbnb.lottie.s.e a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f7927b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.airbnb.lottie.w.c f7928c;

        c(com.airbnb.lottie.s.e eVar, Object obj, com.airbnb.lottie.w.c cVar) {
            this.a = eVar;
            this.f7927b = obj;
            this.f7928c = cVar;
        }

        @Override // com.airbnb.lottie.f.j
        public void a(com.airbnb.lottie.d dVar) {
            f.this.c(this.a, this.f7927b, this.f7928c);
        }
    }

    /* compiled from: LottieDrawable.java */
    /* loaded from: classes.dex */
    class d implements ValueAnimator.AnimatorUpdateListener {
        d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (f.this.t != null) {
                f.this.t.A(f.this.f7922i.j());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LottieDrawable.java */
    /* loaded from: classes.dex */
    public class e implements j {
        e() {
        }

        @Override // com.airbnb.lottie.f.j
        public void a(com.airbnb.lottie.d dVar) {
            f.this.C();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LottieDrawable.java */
    /* renamed from: com.airbnb.lottie.f$f, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0099f implements j {
        final /* synthetic */ int a;

        C0099f(int i2) {
            this.a = i2;
        }

        @Override // com.airbnb.lottie.f.j
        public void a(com.airbnb.lottie.d dVar) {
            f.this.M(this.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LottieDrawable.java */
    /* loaded from: classes.dex */
    public class g implements j {
        final /* synthetic */ float a;

        g(float f2) {
            this.a = f2;
        }

        @Override // com.airbnb.lottie.f.j
        public void a(com.airbnb.lottie.d dVar) {
            f.this.N(this.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LottieDrawable.java */
    /* loaded from: classes.dex */
    public class h implements j {
        final /* synthetic */ int a;

        h(int i2) {
            this.a = i2;
        }

        @Override // com.airbnb.lottie.f.j
        public void a(com.airbnb.lottie.d dVar) {
            f.this.K(this.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LottieDrawable.java */
    /* loaded from: classes.dex */
    public class i implements j {
        final /* synthetic */ float a;

        i(float f2) {
            this.a = f2;
        }

        @Override // com.airbnb.lottie.f.j
        public void a(com.airbnb.lottie.d dVar) {
            f.this.L(this.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: LottieDrawable.java */
    /* loaded from: classes.dex */
    public interface j {
        void a(com.airbnb.lottie.d dVar);
    }

    public f() {
        com.airbnb.lottie.v.c cVar = new com.airbnb.lottie.v.c();
        this.f7922i = cVar;
        this.f7923j = 1.0f;
        this.f7924k = new HashSet();
        this.l = new ArrayList<>();
        this.u = 255;
        cVar.addUpdateListener(new d());
    }

    private void V() {
        if (this.f7921h == null) {
            return;
        }
        float x = x();
        setBounds(0, 0, (int) (this.f7921h.b().width() * x), (int) (this.f7921h.b().height() * x));
    }

    private void d() {
        this.t = new com.airbnb.lottie.s.k.b(this, s.b(this.f7921h), this.f7921h.j(), this.f7921h);
    }

    private Context k() {
        Drawable.Callback callback = getCallback();
        if (callback != null && (callback instanceof View)) {
            return ((View) callback).getContext();
        }
        return null;
    }

    private com.airbnb.lottie.r.a l() {
        if (getCallback() == null) {
            return null;
        }
        if (this.p == null) {
            this.p = new com.airbnb.lottie.r.a(getCallback(), this.q);
        }
        return this.p;
    }

    private com.airbnb.lottie.r.b o() {
        if (getCallback() == null) {
            return null;
        }
        com.airbnb.lottie.r.b bVar = this.m;
        if (bVar != null && !bVar.b(k())) {
            this.m.d();
            this.m = null;
        }
        if (this.m == null) {
            this.m = new com.airbnb.lottie.r.b(getCallback(), this.n, this.o, this.f7921h.i());
        }
        return this.m;
    }

    private float r(Canvas canvas) {
        return Math.min(canvas.getWidth() / this.f7921h.b().width(), canvas.getHeight() / this.f7921h.b().height());
    }

    public Typeface A(String str, String str2) {
        com.airbnb.lottie.r.a l = l();
        if (l != null) {
            return l.b(str, str2);
        }
        return null;
    }

    public boolean B() {
        return this.f7922i.isRunning();
    }

    public void C() {
        if (this.t == null) {
            this.l.add(new e());
        } else {
            this.f7922i.q();
        }
    }

    public void D() {
        com.airbnb.lottie.r.b bVar = this.m;
        if (bVar != null) {
            bVar.d();
        }
    }

    public List<com.airbnb.lottie.s.e> E(com.airbnb.lottie.s.e eVar) {
        if (this.t == null) {
            Log.w("LOTTIE", "Cannot resolve KeyPath. Composition is not set yet.");
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        this.t.d(eVar, 0, arrayList, new com.airbnb.lottie.s.e(new String[0]));
        return arrayList;
    }

    public boolean F(com.airbnb.lottie.d dVar) {
        if (this.f7921h == dVar) {
            return false;
        }
        f();
        this.f7921h = dVar;
        d();
        this.f7922i.v(dVar);
        P(this.f7922i.getAnimatedFraction());
        S(this.f7923j);
        V();
        Iterator it = new ArrayList(this.l).iterator();
        while (it.hasNext()) {
            ((j) it.next()).a(dVar);
            it.remove();
        }
        this.l.clear();
        dVar.p(this.v);
        return true;
    }

    public void G(com.airbnb.lottie.a aVar) {
        com.airbnb.lottie.r.a aVar2 = this.p;
        if (aVar2 != null) {
            aVar2.c(aVar);
        }
    }

    public void H(int i2) {
        if (this.f7921h == null) {
            this.l.add(new a(i2));
        } else {
            this.f7922i.x(i2);
        }
    }

    public void I(com.airbnb.lottie.b bVar) {
        this.o = bVar;
        com.airbnb.lottie.r.b bVar2 = this.m;
        if (bVar2 != null) {
            bVar2.e(bVar);
        }
    }

    public void J(String str) {
        this.n = str;
    }

    public void K(int i2) {
        if (this.f7921h == null) {
            this.l.add(new h(i2));
        } else {
            this.f7922i.y(i2);
        }
    }

    public void L(float f2) {
        com.airbnb.lottie.d dVar = this.f7921h;
        if (dVar == null) {
            this.l.add(new i(f2));
        } else {
            K((int) com.airbnb.lottie.v.e.j(dVar.m(), this.f7921h.f(), f2));
        }
    }

    public void M(int i2) {
        if (this.f7921h == null) {
            this.l.add(new C0099f(i2));
        } else {
            this.f7922i.B(i2);
        }
    }

    public void N(float f2) {
        com.airbnb.lottie.d dVar = this.f7921h;
        if (dVar == null) {
            this.l.add(new g(f2));
        } else {
            M((int) com.airbnb.lottie.v.e.j(dVar.m(), this.f7921h.f(), f2));
        }
    }

    public void O(boolean z) {
        this.v = z;
        com.airbnb.lottie.d dVar = this.f7921h;
        if (dVar != null) {
            dVar.p(z);
        }
    }

    public void P(float f2) {
        com.airbnb.lottie.d dVar = this.f7921h;
        if (dVar == null) {
            this.l.add(new b(f2));
        } else {
            H((int) com.airbnb.lottie.v.e.j(dVar.m(), this.f7921h.f(), f2));
        }
    }

    public void Q(int i2) {
        this.f7922i.setRepeatCount(i2);
    }

    public void R(int i2) {
        this.f7922i.setRepeatMode(i2);
    }

    public void S(float f2) {
        this.f7923j = f2;
        V();
    }

    public void T(float f2) {
        this.f7922i.C(f2);
    }

    public void U(p pVar) {
    }

    public boolean W() {
        return this.r == null && this.f7921h.c().n() > 0;
    }

    public <T> void c(com.airbnb.lottie.s.e eVar, T t, com.airbnb.lottie.w.c<T> cVar) {
        if (this.t == null) {
            this.l.add(new c(eVar, t, cVar));
            return;
        }
        boolean z = true;
        if (eVar.d() != null) {
            eVar.d().h(t, cVar);
        } else {
            List<com.airbnb.lottie.s.e> E = E(eVar);
            for (int i2 = 0; i2 < E.size(); i2++) {
                E.get(i2).d().h(t, cVar);
            }
            z = true ^ E.isEmpty();
        }
        if (z) {
            invalidateSelf();
            if (t == com.airbnb.lottie.j.w) {
                P(u());
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        float f2;
        com.airbnb.lottie.c.a("Drawable#draw");
        if (this.t == null) {
            return;
        }
        float f3 = this.f7923j;
        float r = r(canvas);
        if (f3 > r) {
            f2 = this.f7923j / r;
        } else {
            r = f3;
            f2 = 1.0f;
        }
        if (f2 > 1.0f) {
            canvas.save();
            float width = this.f7921h.b().width() / 2.0f;
            float height = this.f7921h.b().height() / 2.0f;
            float f4 = width * r;
            float f5 = height * r;
            canvas.translate((x() * width) - f4, (x() * height) - f5);
            canvas.scale(f2, f2, f4, f5);
        }
        this.f7920g.reset();
        this.f7920g.preScale(r, r);
        this.t.g(canvas, this.f7920g, this.u);
        com.airbnb.lottie.c.c("Drawable#draw");
        if (f2 > 1.0f) {
            canvas.restore();
        }
    }

    public void e() {
        this.l.clear();
        this.f7922i.cancel();
    }

    public void f() {
        D();
        if (this.f7922i.isRunning()) {
            this.f7922i.cancel();
        }
        this.f7921h = null;
        this.t = null;
        this.m = null;
        this.f7922i.h();
        invalidateSelf();
    }

    public void g(boolean z) {
        if (this.s == z) {
            return;
        }
        if (Build.VERSION.SDK_INT < 19) {
            Log.w(f7919f, "Merge paths are not supported pre-Kit Kat.");
            return;
        }
        this.s = z;
        if (this.f7921h != null) {
            d();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.u;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        if (this.f7921h == null) {
            return -1;
        }
        return (int) (r0.b().height() * x());
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        if (this.f7921h == null) {
            return -1;
        }
        return (int) (r0.b().width() * x());
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public boolean h() {
        return this.s;
    }

    public void i() {
        this.l.clear();
        this.f7922i.i();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return B();
    }

    public com.airbnb.lottie.d j() {
        return this.f7921h;
    }

    public int m() {
        return (int) this.f7922i.k();
    }

    public Bitmap n(String str) {
        com.airbnb.lottie.r.b o = o();
        if (o != null) {
            return o.a(str);
        }
        return null;
    }

    public String p() {
        return this.n;
    }

    public float q() {
        return this.f7922i.m();
    }

    public float s() {
        return this.f7922i.n();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        this.u = i2;
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Log.w("LOTTIE", "Use addColorFilter instead.");
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        C();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        i();
    }

    public m t() {
        com.airbnb.lottie.d dVar = this.f7921h;
        if (dVar != null) {
            return dVar.k();
        }
        return null;
    }

    public float u() {
        return this.f7922i.j();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }

    public int v() {
        return this.f7922i.getRepeatCount();
    }

    public int w() {
        return this.f7922i.getRepeatMode();
    }

    public float x() {
        return this.f7923j;
    }

    public float y() {
        return this.f7922i.o();
    }

    public p z() {
        return this.r;
    }
}
