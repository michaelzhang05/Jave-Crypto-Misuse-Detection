package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.view.Surface;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

@zzard
/* loaded from: classes2.dex */
public final class zzbfa implements zzkw, zzqi, zzsj<zzrv>, zztn {

    /* renamed from: f, reason: collision with root package name */
    @VisibleForTesting
    private static int f13244f;

    /* renamed from: g, reason: collision with root package name */
    @VisibleForTesting
    private static int f13245g;

    /* renamed from: h, reason: collision with root package name */
    private final Context f13246h;

    /* renamed from: i, reason: collision with root package name */
    private final zzbez f13247i;

    /* renamed from: j, reason: collision with root package name */
    private final zzlo f13248j;

    /* renamed from: k, reason: collision with root package name */
    private final zzlo f13249k;
    private final zzrj l;
    private final zzbde m;
    private zzkv n;
    private ByteBuffer o;
    private boolean p;
    private zzbfi q;
    private int r;
    private Set<WeakReference<m9>> s = new HashSet();

    public zzbfa(Context context, zzbde zzbdeVar) {
        this.f13246h = context;
        this.m = zzbdeVar;
        zzbez zzbezVar = new zzbez();
        this.f13247i = zzbezVar;
        zzpg zzpgVar = zzpg.a;
        zzth zzthVar = new zzth(context, zzpgVar, 0L, zzaxi.a, this, -1);
        this.f13248j = zzthVar;
        zzms zzmsVar = new zzms(zzpgVar);
        this.f13249k = zzmsVar;
        zzrg zzrgVar = new zzrg();
        this.l = zzrgVar;
        if (zzawz.n()) {
            String valueOf = String.valueOf(this);
            StringBuilder sb = new StringBuilder(valueOf.length() + 28);
            sb.append("ExoPlayerAdapter initialize ");
            sb.append(valueOf);
            zzawz.m(sb.toString());
        }
        f13244f++;
        zzkv a = zzkz.a(new zzlo[]{zzmsVar, zzthVar}, zzrgVar, zzbezVar);
        this.n = a;
        a.m(this);
    }

    public static int G() {
        return f13244f;
    }

    public static int H() {
        return f13245g;
    }

    @VisibleForTesting
    private final zzql u(Uri uri, final String str) {
        final zzrw zzrwVar;
        if (this.p && this.o.limit() > 0) {
            final byte[] bArr = new byte[this.o.limit()];
            this.o.get(bArr);
            zzrwVar = new zzrw(bArr) { // from class: com.google.android.gms.internal.ads.o9
                private final byte[] a;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.a = bArr;
                }

                @Override // com.google.android.gms.internal.ads.zzrw
                public final zzrv a() {
                    return new zzru(this.a);
                }
            };
        } else {
            if (this.m.f13195i > 0) {
                zzrwVar = new zzrw(this, str) { // from class: com.google.android.gms.internal.ads.p9
                    private final zzbfa a;

                    /* renamed from: b, reason: collision with root package name */
                    private final String f11983b;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.a = this;
                        this.f11983b = str;
                    }

                    @Override // com.google.android.gms.internal.ads.zzrw
                    public final zzrv a() {
                        return this.a.E(this.f11983b);
                    }
                };
            } else {
                zzrwVar = new zzrw(this, str) { // from class: com.google.android.gms.internal.ads.q9
                    private final zzbfa a;

                    /* renamed from: b, reason: collision with root package name */
                    private final String f12053b;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.a = this;
                        this.f12053b = str;
                    }

                    @Override // com.google.android.gms.internal.ads.zzrw
                    public final zzrv a() {
                        return this.a.D(this.f12053b);
                    }
                };
            }
            if (this.m.f13196j) {
                zzrwVar = new zzrw(this, zzrwVar) { // from class: com.google.android.gms.internal.ads.r9
                    private final zzbfa a;

                    /* renamed from: b, reason: collision with root package name */
                    private final zzrw f12102b;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.a = this;
                        this.f12102b = zzrwVar;
                    }

                    @Override // com.google.android.gms.internal.ads.zzrw
                    public final zzrv a() {
                        return this.a.v(this.f12102b);
                    }
                };
            }
            if (this.o.limit() > 0) {
                final byte[] bArr2 = new byte[this.o.limit()];
                this.o.get(bArr2);
                zzrwVar = new zzrw(zzrwVar, bArr2) { // from class: com.google.android.gms.internal.ads.s9
                    private final zzrw a;

                    /* renamed from: b, reason: collision with root package name */
                    private final byte[] f12160b;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.a = zzrwVar;
                        this.f12160b = bArr2;
                    }

                    @Override // com.google.android.gms.internal.ads.zzrw
                    public final zzrv a() {
                        zzrw zzrwVar2 = this.a;
                        byte[] bArr3 = this.f12160b;
                        return new v9(new zzru(bArr3), bArr3.length, zzrwVar2.a());
                    }
                };
            }
        }
        return new zzqh(uri, zzrwVar, t9.a, -1, zzaxi.a, this, null, this.m.f13193g);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void A(boolean z) {
        for (int i2 = 0; i2 < this.n.h(); i2++) {
            this.l.f(i2, !z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void B(float f2, boolean z) {
        zzky zzkyVar = new zzky(this.f13249k, 2, Float.valueOf(f2));
        if (z) {
            this.n.k(zzkyVar);
        } else {
            this.n.i(zzkyVar);
        }
    }

    public final void C(int i2) {
        Iterator<WeakReference<m9>> it = this.s.iterator();
        while (it.hasNext()) {
            m9 m9Var = it.next().get();
            if (m9Var != null) {
                m9Var.b(i2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzrv D(String str) {
        zzbde zzbdeVar = this.m;
        return new zzsa(str, null, zzbdeVar.f13196j ? null : this, zzbdeVar.f13190d, zzbdeVar.f13192f, true, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzrv E(String str) {
        zzbde zzbdeVar = this.m;
        m9 m9Var = new m9(str, zzbdeVar.f13196j ? null : this, zzbdeVar.f13190d, zzbdeVar.f13192f, zzbdeVar.f13195i);
        this.s.add(new WeakReference<>(m9Var));
        return m9Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void F(boolean z, long j2) {
        zzbfi zzbfiVar = this.q;
        if (zzbfiVar != null) {
            zzbfiVar.b(z, j2);
        }
    }

    public final zzkv I() {
        return this.n;
    }

    public final zzbez J() {
        return this.f13247i;
    }

    @Override // com.google.android.gms.internal.ads.zztn
    public final void a(int i2, long j2) {
    }

    @Override // com.google.android.gms.internal.ads.zzkw
    public final void b(boolean z, int i2) {
        zzbfi zzbfiVar = this.q;
        if (zzbfiVar != null) {
            zzbfiVar.u(i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzkw
    public final void c() {
    }

    @Override // com.google.android.gms.internal.ads.zzsj
    public final /* bridge */ /* synthetic */ void d(zzrv zzrvVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzkw
    public final void e(zzrb zzrbVar, zzro zzroVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzqi
    public final void f(IOException iOException) {
        zzbfi zzbfiVar = this.q;
        if (zzbfiVar != null) {
            zzbfiVar.v("onLoadError", iOException);
        }
    }

    public final void finalize() throws Throwable {
        f13244f--;
        if (zzawz.n()) {
            String valueOf = String.valueOf(this);
            StringBuilder sb = new StringBuilder(valueOf.length() + 26);
            sb.append("ExoPlayerAdapter finalize ");
            sb.append(valueOf);
            zzawz.m(sb.toString());
        }
    }

    @Override // com.google.android.gms.internal.ads.zztn
    public final void g(String str, long j2, long j3) {
    }

    @Override // com.google.android.gms.internal.ads.zzkw
    public final void h(zzln zzlnVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzkw
    public final void i(zzlr zzlrVar, Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zztn
    public final void j(Surface surface) {
    }

    @Override // com.google.android.gms.internal.ads.zzkw
    public final void k(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzkw
    public final void l(zzku zzkuVar) {
        zzbfi zzbfiVar = this.q;
        if (zzbfiVar != null) {
            zzbfiVar.v("onPlayerError", zzkuVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zztn
    public final void m(int i2, int i3, int i4, float f2) {
        zzbfi zzbfiVar = this.q;
        if (zzbfiVar != null) {
            zzbfiVar.t(i2, i3);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsj
    public final /* synthetic */ void n(zzrv zzrvVar, zzry zzryVar) {
        this.r = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzsj
    public final /* synthetic */ void o(zzrv zzrvVar, int i2) {
        this.r += i2;
    }

    @Override // com.google.android.gms.internal.ads.zztn
    public final void p(zznc zzncVar) {
    }

    @Override // com.google.android.gms.internal.ads.zztn
    public final void q(zzlh zzlhVar) {
    }

    @Override // com.google.android.gms.internal.ads.zztn
    public final void r(zznc zzncVar) {
    }

    public final long s() {
        return this.r;
    }

    public final void t() {
        zzkv zzkvVar = this.n;
        if (zzkvVar != null) {
            zzkvVar.l(this);
            this.n.a();
            this.n = null;
            f13245g--;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzrv v(zzrw zzrwVar) {
        return new zzbex(this.f13246h, zzrwVar.a(), this, new zzbey(this) { // from class: com.google.android.gms.internal.ads.u9
            private final zzbfa a;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.a = this;
            }

            @Override // com.google.android.gms.internal.ads.zzbey
            public final void b(boolean z, long j2) {
                this.a.F(z, j2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void w(Surface surface, boolean z) {
        zzky zzkyVar = new zzky(this.f13248j, 1, surface);
        if (z) {
            this.n.k(zzkyVar);
        } else {
            this.n.i(zzkyVar);
        }
    }

    public final void x(zzbfi zzbfiVar) {
        this.q = zzbfiVar;
    }

    public final void y(Uri[] uriArr, String str) {
        z(uriArr, str, ByteBuffer.allocate(0), false);
    }

    public final void z(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z) {
        zzql zzqoVar;
        this.o = byteBuffer;
        this.p = z;
        if (uriArr.length == 1) {
            zzqoVar = u(uriArr[0], str);
        } else {
            zzql[] zzqlVarArr = new zzql[uriArr.length];
            for (int i2 = 0; i2 < uriArr.length; i2++) {
                zzqlVarArr[i2] = u(uriArr[i2], str);
            }
            zzqoVar = new zzqo(zzqlVarArr);
        }
        this.n.j(zzqoVar);
        f13245g++;
    }
}
