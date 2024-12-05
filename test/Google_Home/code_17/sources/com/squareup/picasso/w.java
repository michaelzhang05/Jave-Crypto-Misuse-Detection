package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import com.squareup.picasso.s;
import com.squareup.picasso.v;
import java.util.concurrent.atomic.AtomicInteger;
import l2.InterfaceC3309b;
import l2.InterfaceC3312e;

/* loaded from: classes4.dex */
public class w {

    /* renamed from: m, reason: collision with root package name */
    private static final AtomicInteger f24456m = new AtomicInteger();

    /* renamed from: a, reason: collision with root package name */
    private final s f24457a;

    /* renamed from: b, reason: collision with root package name */
    private final v.b f24458b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f24459c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f24460d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f24461e = true;

    /* renamed from: f, reason: collision with root package name */
    private int f24462f;

    /* renamed from: g, reason: collision with root package name */
    private int f24463g;

    /* renamed from: h, reason: collision with root package name */
    private int f24464h;

    /* renamed from: i, reason: collision with root package name */
    private int f24465i;

    /* renamed from: j, reason: collision with root package name */
    private Drawable f24466j;

    /* renamed from: k, reason: collision with root package name */
    private Drawable f24467k;

    /* renamed from: l, reason: collision with root package name */
    private Object f24468l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public w(s sVar, Uri uri, int i8) {
        if (!sVar.f24385n) {
            this.f24457a = sVar;
            this.f24458b = new v.b(uri, i8, sVar.f24382k);
            return;
        }
        throw new IllegalStateException("Picasso instance already shut down. Cannot submit new requests.");
    }

    private v c(long j8) {
        int andIncrement = f24456m.getAndIncrement();
        v a8 = this.f24458b.a();
        a8.f24419a = andIncrement;
        a8.f24420b = j8;
        boolean z8 = this.f24457a.f24384m;
        if (z8) {
            C.u("Main", "created", a8.g(), a8.toString());
        }
        v p8 = this.f24457a.p(a8);
        if (p8 != a8) {
            p8.f24419a = andIncrement;
            p8.f24420b = j8;
            if (z8) {
                C.u("Main", "changed", p8.d(), "into " + p8);
            }
        }
        return p8;
    }

    private Drawable h() {
        int i8 = this.f24462f;
        if (i8 != 0) {
            return this.f24457a.f24375d.getDrawable(i8);
        }
        return this.f24466j;
    }

    public w a() {
        this.f24458b.b(17);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public w b() {
        this.f24468l = null;
        return this;
    }

    public void d() {
        e(null);
    }

    public void e(InterfaceC3309b interfaceC3309b) {
        long nanoTime = System.nanoTime();
        if (!this.f24460d) {
            if (this.f24458b.c()) {
                if (!this.f24458b.d()) {
                    this.f24458b.f(s.f.LOW);
                }
                v c8 = c(nanoTime);
                String h8 = C.h(c8, new StringBuilder());
                if (o.a(this.f24464h) && this.f24457a.m(h8) != null) {
                    if (this.f24457a.f24384m) {
                        C.u("Main", "completed", c8.g(), "from " + s.e.MEMORY);
                    }
                    if (interfaceC3309b != null) {
                        interfaceC3309b.b();
                        return;
                    }
                    return;
                }
                this.f24457a.o(new h(this.f24457a, c8, this.f24464h, this.f24465i, this.f24468l, h8, interfaceC3309b));
                return;
            }
            return;
        }
        throw new IllegalStateException("Fit cannot be used with fetch.");
    }

    public w f() {
        this.f24460d = true;
        return this;
    }

    public Bitmap g() {
        long nanoTime = System.nanoTime();
        C.d();
        if (!this.f24460d) {
            if (!this.f24458b.c()) {
                return null;
            }
            v c8 = c(nanoTime);
            j jVar = new j(this.f24457a, c8, this.f24464h, this.f24465i, this.f24468l, C.h(c8, new StringBuilder()));
            s sVar = this.f24457a;
            return RunnableC2599c.g(sVar, sVar.f24376e, sVar.f24377f, sVar.f24378g, jVar).t();
        }
        throw new IllegalStateException("Fit cannot be used with get.");
    }

    public void i(ImageView imageView) {
        j(imageView, null);
    }

    public void j(ImageView imageView, InterfaceC3309b interfaceC3309b) {
        Bitmap m8;
        long nanoTime = System.nanoTime();
        C.c();
        if (imageView != null) {
            if (!this.f24458b.c()) {
                this.f24457a.b(imageView);
                if (this.f24461e) {
                    t.d(imageView, h());
                    return;
                }
                return;
            }
            if (this.f24460d) {
                if (!this.f24458b.e()) {
                    int width = imageView.getWidth();
                    int height = imageView.getHeight();
                    if (width != 0 && height != 0) {
                        this.f24458b.g(width, height);
                    } else {
                        if (this.f24461e) {
                            t.d(imageView, h());
                        }
                        this.f24457a.e(imageView, new f(this, imageView, interfaceC3309b));
                        return;
                    }
                } else {
                    throw new IllegalStateException("Fit cannot be used with resize.");
                }
            }
            v c8 = c(nanoTime);
            String g8 = C.g(c8);
            if (o.a(this.f24464h) && (m8 = this.f24457a.m(g8)) != null) {
                this.f24457a.b(imageView);
                s sVar = this.f24457a;
                Context context = sVar.f24375d;
                s.e eVar = s.e.MEMORY;
                t.c(imageView, context, m8, eVar, this.f24459c, sVar.f24383l);
                if (this.f24457a.f24384m) {
                    C.u("Main", "completed", c8.g(), "from " + eVar);
                }
                if (interfaceC3309b != null) {
                    interfaceC3309b.b();
                    return;
                }
                return;
            }
            if (this.f24461e) {
                t.d(imageView, h());
            }
            this.f24457a.g(new k(this.f24457a, imageView, c8, this.f24464h, this.f24465i, this.f24463g, this.f24467k, g8, this.f24468l, interfaceC3309b, this.f24459c));
            return;
        }
        throw new IllegalArgumentException("Target must not be null.");
    }

    public void k(A a8) {
        Bitmap m8;
        long nanoTime = System.nanoTime();
        C.c();
        if (a8 != null) {
            if (!this.f24460d) {
                Drawable drawable = null;
                if (!this.f24458b.c()) {
                    this.f24457a.c(a8);
                    if (this.f24461e) {
                        drawable = h();
                    }
                    a8.b(drawable);
                    return;
                }
                v c8 = c(nanoTime);
                String g8 = C.g(c8);
                if (o.a(this.f24464h) && (m8 = this.f24457a.m(g8)) != null) {
                    this.f24457a.c(a8);
                    a8.c(m8, s.e.MEMORY);
                    return;
                } else {
                    if (this.f24461e) {
                        drawable = h();
                    }
                    a8.b(drawable);
                    this.f24457a.g(new B(this.f24457a, a8, c8, this.f24464h, this.f24465i, this.f24467k, g8, this.f24468l, this.f24463g));
                    return;
                }
            }
            throw new IllegalStateException("Fit cannot be used with a Target.");
        }
        throw new IllegalArgumentException("Target must not be null.");
    }

    public w l(int i8) {
        if (this.f24461e) {
            if (i8 != 0) {
                if (this.f24466j == null) {
                    this.f24462f = i8;
                    return this;
                }
                throw new IllegalStateException("Placeholder image already set.");
            }
            throw new IllegalArgumentException("Placeholder image resource invalid.");
        }
        throw new IllegalStateException("Already explicitly declared as no placeholder.");
    }

    public w m(int i8, int i9) {
        this.f24458b.g(i8, i9);
        return this;
    }

    public w n(InterfaceC3312e interfaceC3312e) {
        this.f24458b.h(interfaceC3312e);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public w o() {
        this.f24460d = false;
        return this;
    }
}
