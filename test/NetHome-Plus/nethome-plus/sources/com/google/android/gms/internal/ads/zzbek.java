package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.Build;
import android.view.Surface;
import android.view.TextureView;
import com.google.android.gms.ads.internal.zzk;
import java.nio.ByteBuffer;
import java.util.Arrays;
import okhttp3.HttpUrl;

@zzard
@TargetApi(16)
/* loaded from: classes2.dex */
public final class zzbek extends zzbco implements TextureView.SurfaceTextureListener, zzbfi {
    private float A;

    /* renamed from: h, reason: collision with root package name */
    private final zzbdf f13228h;

    /* renamed from: i, reason: collision with root package name */
    private final zzbdg f13229i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f13230j;

    /* renamed from: k, reason: collision with root package name */
    private final zzbde f13231k;
    private zzbcn l;
    private Surface m;
    private zzbfa n;
    private String o;
    private String[] p;
    private boolean q;
    private int r;
    private zzbdd s;
    private final boolean t;
    private boolean u;
    private boolean v;
    private int w;
    private int x;
    private int y;
    private int z;

    public zzbek(Context context, zzbdg zzbdgVar, zzbdf zzbdfVar, boolean z, boolean z2, zzbde zzbdeVar) {
        super(context);
        this.r = 1;
        this.f13230j = z2;
        this.f13228h = zzbdfVar;
        this.f13229i = zzbdgVar;
        this.t = z;
        this.f13231k = zzbdeVar;
        setSurfaceTextureListener(this);
        zzbdgVar.b(this);
    }

    private final boolean A() {
        return z() && this.r != 1;
    }

    private final void B() {
        if (this.u) {
            return;
        }
        this.u = true;
        zzaxi.a.post(new Runnable(this) { // from class: com.google.android.gms.internal.ads.c9

            /* renamed from: f, reason: collision with root package name */
            private final zzbek f11230f;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f11230f = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f11230f.N();
            }
        });
        a();
        this.f13229i.d();
        if (this.v) {
            d();
        }
    }

    private final zzbfa C() {
        return new zzbfa(this.f13228h.getContext(), this.f13231k);
    }

    private final String D() {
        return zzk.zzlg().g0(this.f13228h.getContext(), this.f13228h.b().f13150f);
    }

    private final void E() {
        String str;
        if (this.n != null || (str = this.o) == null || this.m == null) {
            return;
        }
        if (str.startsWith("cache:")) {
            zzbft V = this.f13228h.V(this.o);
            if (V instanceof zzbgp) {
                this.n = ((zzbgp) V).B();
            } else if (V instanceof zzbgo) {
                zzbgo zzbgoVar = (zzbgo) V;
                String D = D();
                ByteBuffer B = zzbgoVar.B();
                boolean E = zzbgoVar.E();
                String C = zzbgoVar.C();
                if (C == null) {
                    zzbad.i("Stream cache URL is null.");
                    return;
                } else {
                    zzbfa C2 = C();
                    this.n = C2;
                    C2.z(new Uri[]{Uri.parse(C)}, D, B, E);
                }
            } else {
                String valueOf = String.valueOf(this.o);
                zzbad.i(valueOf.length() != 0 ? "Stream cache miss: ".concat(valueOf) : new String("Stream cache miss: "));
                return;
            }
        } else {
            this.n = C();
            String D2 = D();
            Uri[] uriArr = new Uri[this.p.length];
            int i2 = 0;
            while (true) {
                String[] strArr = this.p;
                if (i2 >= strArr.length) {
                    break;
                }
                uriArr[i2] = Uri.parse(strArr[i2]);
                i2++;
            }
            this.n.y(uriArr, D2);
        }
        this.n.x(this);
        q(this.m, false);
        int t = this.n.I().t();
        this.r = t;
        if (t == 3) {
            B();
        }
    }

    private final void F() {
        x(this.w, this.x);
    }

    private final void G() {
        zzbfa zzbfaVar = this.n;
        if (zzbfaVar != null) {
            zzbfaVar.A(true);
        }
    }

    private final void H() {
        zzbfa zzbfaVar = this.n;
        if (zzbfaVar != null) {
            zzbfaVar.A(false);
        }
    }

    private final void p(float f2, boolean z) {
        zzbfa zzbfaVar = this.n;
        if (zzbfaVar != null) {
            zzbfaVar.B(f2, z);
        } else {
            zzbad.i("Trying to set volume before player is initalized.");
        }
    }

    private final void q(Surface surface, boolean z) {
        zzbfa zzbfaVar = this.n;
        if (zzbfaVar != null) {
            zzbfaVar.w(surface, z);
        } else {
            zzbad.i("Trying to set surface before player is initalized.");
        }
    }

    private final void x(int i2, int i3) {
        float f2 = i3 > 0 ? i2 / i3 : 1.0f;
        if (this.A != f2) {
            this.A = f2;
            requestLayout();
        }
    }

    private final boolean z() {
        return (this.n == null || this.q) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void I() {
        zzbcn zzbcnVar = this.l;
        if (zzbcnVar != null) {
            zzbcnVar.g();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void J() {
        zzbcn zzbcnVar = this.l;
        if (zzbcnVar != null) {
            zzbcnVar.k();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void K() {
        zzbcn zzbcnVar = this.l;
        if (zzbcnVar != null) {
            zzbcnVar.m();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void L() {
        zzbcn zzbcnVar = this.l;
        if (zzbcnVar != null) {
            zzbcnVar.j();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void M() {
        zzbcn zzbcnVar = this.l;
        if (zzbcnVar != null) {
            zzbcnVar.i();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void N() {
        zzbcn zzbcnVar = this.l;
        if (zzbcnVar != null) {
            zzbcnVar.a();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbco, com.google.android.gms.internal.ads.g8
    public final void a() {
        p(this.f13170g.a(), false);
    }

    @Override // com.google.android.gms.internal.ads.zzbfi
    public final void b(final boolean z, final long j2) {
        if (this.f13228h != null) {
            zzbbm.a.execute(new Runnable(this, z, j2) { // from class: com.google.android.gms.internal.ads.l9

                /* renamed from: f, reason: collision with root package name */
                private final zzbek f11752f;

                /* renamed from: g, reason: collision with root package name */
                private final boolean f11753g;

                /* renamed from: h, reason: collision with root package name */
                private final long f11754h;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.f11752f = this;
                    this.f11753g = z;
                    this.f11754h = j2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f11752f.s(this.f11753g, this.f11754h);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbco
    public final void c() {
        if (A()) {
            if (this.f13231k.a) {
                H();
            }
            this.n.I().b(false);
            this.f13229i.f();
            this.f13170g.e();
            zzaxi.a.post(new Runnable(this) { // from class: com.google.android.gms.internal.ads.g9

                /* renamed from: f, reason: collision with root package name */
                private final zzbek f11471f;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.f11471f = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f11471f.K();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbco
    public final void d() {
        if (A()) {
            if (this.f13231k.a) {
                G();
            }
            this.n.I().b(true);
            this.f13229i.e();
            this.f13170g.d();
            this.f13169f.b();
            zzaxi.a.post(new Runnable(this) { // from class: com.google.android.gms.internal.ads.f9

                /* renamed from: f, reason: collision with root package name */
                private final zzbek f11405f;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.f11405f = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f11405f.L();
                }
            });
            return;
        }
        this.v = true;
    }

    @Override // com.google.android.gms.internal.ads.zzbco
    public final void e(int i2) {
        if (A()) {
            this.n.I().c(i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbco
    public final void f() {
        if (z()) {
            this.n.I().stop();
            if (this.n != null) {
                q(null, true);
                zzbfa zzbfaVar = this.n;
                if (zzbfaVar != null) {
                    zzbfaVar.x(null);
                    this.n.t();
                    this.n = null;
                }
                this.r = 1;
                this.q = false;
                this.u = false;
                this.v = false;
            }
        }
        this.f13229i.f();
        this.f13170g.e();
        this.f13229i.a();
    }

    @Override // com.google.android.gms.internal.ads.zzbco
    public final void g(float f2, float f3) {
        zzbdd zzbddVar = this.s;
        if (zzbddVar != null) {
            zzbddVar.e(f2, f3);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbco
    public final int getCurrentPosition() {
        if (A()) {
            return (int) this.n.I().e();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzbco
    public final int getDuration() {
        if (A()) {
            return (int) this.n.I().g();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzbco
    public final int getVideoHeight() {
        return this.x;
    }

    @Override // com.google.android.gms.internal.ads.zzbco
    public final int getVideoWidth() {
        return this.w;
    }

    @Override // com.google.android.gms.internal.ads.zzbco
    public final void h(zzbcn zzbcnVar) {
        this.l = zzbcnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbco
    public final void i(String str, String[] strArr) {
        if (str != null) {
            if (strArr == null) {
                setVideoPath(str);
            }
            this.o = str;
            this.p = (String[]) Arrays.copyOf(strArr, strArr.length);
            E();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbco
    public final void j(int i2) {
        zzbfa zzbfaVar = this.n;
        if (zzbfaVar != null) {
            zzbfaVar.J().j(i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbco
    public final void k(int i2) {
        zzbfa zzbfaVar = this.n;
        if (zzbfaVar != null) {
            zzbfaVar.J().k(i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbco
    public final void l(int i2) {
        zzbfa zzbfaVar = this.n;
        if (zzbfaVar != null) {
            zzbfaVar.J().h(i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbco
    public final void m(int i2) {
        zzbfa zzbfaVar = this.n;
        if (zzbfaVar != null) {
            zzbfaVar.J().i(i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbco
    public final void n(int i2) {
        zzbfa zzbfaVar = this.n;
        if (zzbfaVar != null) {
            zzbfaVar.C(i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbco
    public final String o() {
        String str = this.t ? " spherical" : HttpUrl.FRAGMENT_ENCODE_SET;
        return str.length() != 0 ? "ExoPlayer/3".concat(str) : new String("ExoPlayer/3");
    }

    @Override // android.view.View
    protected final void onMeasure(int i2, int i3) {
        int i4;
        super.onMeasure(i2, i3);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f2 = this.A;
        if (f2 != 0.0f && this.s == null) {
            float f3 = measuredWidth;
            float f4 = f3 / measuredHeight;
            if (f2 > f4) {
                measuredHeight = (int) (f3 / f2);
            }
            if (f2 < f4) {
                measuredWidth = (int) (measuredHeight * f2);
            }
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
        zzbdd zzbddVar = this.s;
        if (zzbddVar != null) {
            zzbddVar.i(measuredWidth, measuredHeight);
        }
        if (Build.VERSION.SDK_INT == 16) {
            int i5 = this.y;
            if (((i5 > 0 && i5 != measuredWidth) || ((i4 = this.z) > 0 && i4 != measuredHeight)) && this.f13230j && z()) {
                zzkv I = this.n.I();
                if (I.e() > 0 && !I.f()) {
                    p(0.0f, true);
                    I.b(true);
                    long e2 = I.e();
                    long a = zzk.zzln().a();
                    while (z() && I.e() == e2 && zzk.zzln().a() - a <= 250) {
                    }
                    I.b(false);
                    a();
                }
            }
            this.y = measuredWidth;
            this.z = measuredHeight;
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
        if (this.t) {
            zzbdd zzbddVar = new zzbdd(getContext());
            this.s = zzbddVar;
            zzbddVar.b(surfaceTexture, i2, i3);
            this.s.start();
            SurfaceTexture k2 = this.s.k();
            if (k2 != null) {
                surfaceTexture = k2;
            } else {
                this.s.j();
                this.s = null;
            }
        }
        Surface surface = new Surface(surfaceTexture);
        this.m = surface;
        if (this.n == null) {
            E();
        } else {
            q(surface, true);
            if (!this.f13231k.a) {
                G();
            }
        }
        if (this.w != 0 && this.x != 0) {
            F();
        } else {
            x(i2, i3);
        }
        zzaxi.a.post(new Runnable(this) { // from class: com.google.android.gms.internal.ads.h9

            /* renamed from: f, reason: collision with root package name */
            private final zzbek f11521f;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f11521f = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f11521f.J();
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        c();
        zzbdd zzbddVar = this.s;
        if (zzbddVar != null) {
            zzbddVar.j();
            this.s = null;
        }
        if (this.n != null) {
            H();
            Surface surface = this.m;
            if (surface != null) {
                surface.release();
            }
            this.m = null;
            q(null, true);
        }
        zzaxi.a.post(new Runnable(this) { // from class: com.google.android.gms.internal.ads.j9

            /* renamed from: f, reason: collision with root package name */
            private final zzbek f11640f;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f11640f = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f11640f.I();
            }
        });
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, final int i2, final int i3) {
        zzbdd zzbddVar = this.s;
        if (zzbddVar != null) {
            zzbddVar.i(i2, i3);
        }
        zzaxi.a.post(new Runnable(this, i2, i3) { // from class: com.google.android.gms.internal.ads.i9

            /* renamed from: f, reason: collision with root package name */
            private final zzbek f11584f;

            /* renamed from: g, reason: collision with root package name */
            private final int f11585g;

            /* renamed from: h, reason: collision with root package name */
            private final int f11586h;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f11584f = this;
                this.f11585g = i2;
                this.f11586h = i3;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f11584f.y(this.f11585g, this.f11586h);
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.f13229i.c(this);
        this.f13169f.a(surfaceTexture, this.l);
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(final int i2) {
        StringBuilder sb = new StringBuilder(57);
        sb.append("AdExoPlayerView3 window visibility changed to ");
        sb.append(i2);
        zzawz.m(sb.toString());
        zzaxi.a.post(new Runnable(this, i2) { // from class: com.google.android.gms.internal.ads.k9

            /* renamed from: f, reason: collision with root package name */
            private final zzbek f11697f;

            /* renamed from: g, reason: collision with root package name */
            private final int f11698g;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f11697f = this;
                this.f11698g = i2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f11697f.r(this.f11698g);
            }
        });
        super.onWindowVisibilityChanged(i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void r(int i2) {
        zzbcn zzbcnVar = this.l;
        if (zzbcnVar != null) {
            zzbcnVar.onWindowVisibilityChanged(i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void s(boolean z, long j2) {
        this.f13228h.R(z, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzbco
    public final void setVideoPath(String str) {
        if (str != null) {
            this.o = str;
            this.p = new String[]{str};
            E();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfi
    public final void t(int i2, int i3) {
        this.w = i2;
        this.x = i3;
        F();
    }

    @Override // com.google.android.gms.internal.ads.zzbfi
    public final void u(int i2) {
        if (this.r != i2) {
            this.r = i2;
            if (i2 == 3) {
                B();
                return;
            }
            if (i2 != 4) {
                return;
            }
            if (this.f13231k.a) {
                H();
            }
            this.f13229i.f();
            this.f13170g.e();
            zzaxi.a.post(new Runnable(this) { // from class: com.google.android.gms.internal.ads.d9

                /* renamed from: f, reason: collision with root package name */
                private final zzbek f11297f;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.f11297f = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f11297f.M();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfi
    public final void v(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(canonicalName).length() + String.valueOf(message).length());
        sb.append(str);
        sb.append("/");
        sb.append(canonicalName);
        sb.append(":");
        sb.append(message);
        final String sb2 = sb.toString();
        String valueOf = String.valueOf(sb2);
        zzbad.i(valueOf.length() != 0 ? "ExoPlayerAdapter error: ".concat(valueOf) : new String("ExoPlayerAdapter error: "));
        this.q = true;
        if (this.f13231k.a) {
            H();
        }
        zzaxi.a.post(new Runnable(this, sb2) { // from class: com.google.android.gms.internal.ads.e9

            /* renamed from: f, reason: collision with root package name */
            private final zzbek f11343f;

            /* renamed from: g, reason: collision with root package name */
            private final String f11344g;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f11343f = this;
                this.f11344g = sb2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f11343f.w(this.f11344g);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void w(String str) {
        zzbcn zzbcnVar = this.l;
        if (zzbcnVar != null) {
            zzbcnVar.h("ExoPlayerAdapter error", str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void y(int i2, int i3) {
        zzbcn zzbcnVar = this.l;
        if (zzbcnVar != null) {
            zzbcnVar.l(i2, i3);
        }
    }
}
