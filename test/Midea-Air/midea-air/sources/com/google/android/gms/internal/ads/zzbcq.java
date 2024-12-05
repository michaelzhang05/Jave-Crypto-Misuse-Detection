package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

@zzard
/* loaded from: classes2.dex */
public final class zzbcq extends FrameLayout implements zzbcn {

    /* renamed from: f, reason: collision with root package name */
    private final zzbdf f13171f;

    /* renamed from: g, reason: collision with root package name */
    private final FrameLayout f13172g;

    /* renamed from: h, reason: collision with root package name */
    private final zzadi f13173h;

    /* renamed from: i, reason: collision with root package name */
    private final f8 f13174i;

    /* renamed from: j, reason: collision with root package name */
    private final long f13175j;

    /* renamed from: k, reason: collision with root package name */
    private zzbco f13176k;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;
    private long p;
    private long q;
    private String r;
    private String[] s;
    private Bitmap t;
    private ImageView u;
    private boolean v;

    public zzbcq(Context context, zzbdf zzbdfVar, int i2, boolean z, zzadi zzadiVar, zzbde zzbdeVar) {
        super(context);
        this.f13171f = zzbdfVar;
        this.f13173h = zzadiVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f13172g = frameLayout;
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        Preconditions.j(zzbdfVar.c());
        zzbco a = zzbdfVar.c().zzbqs.a(context, zzbdfVar, i2, z, zzadiVar, zzbdeVar);
        this.f13176k = a;
        if (a != null) {
            frameLayout.addView(a, new FrameLayout.LayoutParams(-1, -1, 17));
            if (((Boolean) zzyt.e().c(zzacu.K)).booleanValue()) {
                F();
            }
        }
        this.u = new ImageView(context);
        this.f13175j = ((Long) zzyt.e().c(zzacu.O)).longValue();
        boolean booleanValue = ((Boolean) zzyt.e().c(zzacu.M)).booleanValue();
        this.o = booleanValue;
        if (zzadiVar != null) {
            zzadiVar.d("spinner_used", booleanValue ? "1" : "0");
        }
        this.f13174i = new f8(this);
        zzbco zzbcoVar = this.f13176k;
        if (zzbcoVar != null) {
            zzbcoVar.h(this);
        }
        if (this.f13176k == null) {
            h("AdVideoUnderlay Error", "Allocating player failed.");
        }
    }

    private final boolean H() {
        return this.u.getParent() != null;
    }

    private final void I() {
        if (this.f13171f.a() == null || !this.m || this.n) {
            return;
        }
        this.f13171f.a().getWindow().clearFlags(128);
        this.m = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void o(zzbcq zzbcqVar, String str, String[] strArr) {
        zzbcqVar.x(str, strArr);
    }

    public static void p(zzbdf zzbdfVar, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "decoderProps");
        hashMap.put("error", str);
        zzbdfVar.y("onVideoEvent", hashMap);
    }

    public static void q(zzbdf zzbdfVar, Map<String, List<Map<String, Object>>> map) {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "decoderProps");
        hashMap.put("mimeTypes", map);
        zzbdfVar.y("onVideoEvent", hashMap);
    }

    public static void s(zzbdf zzbdfVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "no_video_view");
        zzbdfVar.y("onVideoEvent", hashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x(String str, String... strArr) {
        HashMap hashMap = new HashMap();
        hashMap.put("event", str);
        String str2 = null;
        for (String str3 : strArr) {
            if (str2 == null) {
                str2 = str3;
            } else {
                hashMap.put(str2, str3);
                str2 = null;
            }
        }
        this.f13171f.y("onVideoEvent", hashMap);
    }

    public final void A(int i2) {
        this.f13176k.n(i2);
    }

    @TargetApi(14)
    public final void B(MotionEvent motionEvent) {
        zzbco zzbcoVar = this.f13176k;
        if (zzbcoVar == null) {
            return;
        }
        zzbcoVar.dispatchTouchEvent(motionEvent);
    }

    public final void C() {
        if (this.f13176k == null) {
            return;
        }
        if (!TextUtils.isEmpty(this.r)) {
            this.f13176k.i(this.r, this.s);
        } else {
            x("no_src", new String[0]);
        }
    }

    public final void D() {
        zzbco zzbcoVar = this.f13176k;
        if (zzbcoVar == null) {
            return;
        }
        zzbcoVar.f13170g.b(true);
        zzbcoVar.a();
    }

    public final void E() {
        zzbco zzbcoVar = this.f13176k;
        if (zzbcoVar == null) {
            return;
        }
        zzbcoVar.f13170g.b(false);
        zzbcoVar.a();
    }

    @TargetApi(14)
    public final void F() {
        zzbco zzbcoVar = this.f13176k;
        if (zzbcoVar == null) {
            return;
        }
        TextView textView = new TextView(zzbcoVar.getContext());
        String valueOf = String.valueOf(this.f13176k.o());
        textView.setText(valueOf.length() != 0 ? "AdMob - ".concat(valueOf) : new String("AdMob - "));
        textView.setTextColor(-65536);
        textView.setBackgroundColor(-256);
        this.f13172g.addView(textView, new FrameLayout.LayoutParams(-2, -2, 17));
        this.f13172g.bringChildToFront(textView);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void G() {
        zzbco zzbcoVar = this.f13176k;
        if (zzbcoVar == null) {
            return;
        }
        long currentPosition = zzbcoVar.getCurrentPosition();
        if (this.p == currentPosition || currentPosition <= 0) {
            return;
        }
        x("timeupdate", "time", String.valueOf(((float) currentPosition) / 1000.0f));
        this.p = currentPosition;
    }

    @Override // com.google.android.gms.internal.ads.zzbcn
    public final void a() {
        if (this.f13176k != null && this.q == 0) {
            x("canplaythrough", "duration", String.valueOf(r0.getDuration() / 1000.0f), "videoWidth", String.valueOf(this.f13176k.getVideoWidth()), "videoHeight", String.valueOf(this.f13176k.getVideoHeight()));
        }
    }

    public final void b() {
        this.f13174i.a();
        zzbco zzbcoVar = this.f13176k;
        if (zzbcoVar != null) {
            zzbcoVar.f();
        }
        I();
    }

    public final void c() {
        zzbco zzbcoVar = this.f13176k;
        if (zzbcoVar == null) {
            return;
        }
        zzbcoVar.c();
    }

    public final void d() {
        zzbco zzbcoVar = this.f13176k;
        if (zzbcoVar == null) {
            return;
        }
        zzbcoVar.d();
    }

    public final void e(int i2) {
        zzbco zzbcoVar = this.f13176k;
        if (zzbcoVar == null) {
            return;
        }
        zzbcoVar.e(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzbcn
    public final void f() {
        if (this.l && H()) {
            this.f13172g.removeView(this.u);
        }
        if (this.t != null) {
            long b2 = zzk.zzln().b();
            if (this.f13176k.getBitmap(this.t) != null) {
                this.v = true;
            }
            long b3 = zzk.zzln().b() - b2;
            if (zzawz.n()) {
                StringBuilder sb = new StringBuilder(46);
                sb.append("Spinner frame grab took ");
                sb.append(b3);
                sb.append("ms");
                zzawz.m(sb.toString());
            }
            if (b3 > this.f13175j) {
                zzbad.i("Spinner frame grab crossed jank threshold! Suspending spinner.");
                this.o = false;
                this.t = null;
                zzadi zzadiVar = this.f13173h;
                if (zzadiVar != null) {
                    zzadiVar.d("spinner_jank", Long.toString(b3));
                }
            }
        }
    }

    public final void finalize() throws Throwable {
        try {
            this.f13174i.a();
            zzbco zzbcoVar = this.f13176k;
            if (zzbcoVar != null) {
                Executor executor = zzbbm.a;
                zzbcoVar.getClass();
                executor.execute(w7.a(zzbcoVar));
            }
        } finally {
            super.finalize();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbcn
    public final void g() {
        if (this.v && this.t != null && !H()) {
            this.u.setImageBitmap(this.t);
            this.u.invalidate();
            this.f13172g.addView(this.u, new FrameLayout.LayoutParams(-1, -1));
            this.f13172g.bringChildToFront(this.u);
        }
        this.f13174i.a();
        this.q = this.p;
        zzaxi.a.post(new z7(this));
    }

    @Override // com.google.android.gms.internal.ads.zzbcn
    public final void h(String str, String str2) {
        x("error", "what", str, "extra", str2);
    }

    @Override // com.google.android.gms.internal.ads.zzbcn
    public final void i() {
        x("ended", new String[0]);
        I();
    }

    @Override // com.google.android.gms.internal.ads.zzbcn
    public final void j() {
        if (this.f13171f.a() != null && !this.m) {
            boolean z = (this.f13171f.a().getWindow().getAttributes().flags & 128) != 0;
            this.n = z;
            if (!z) {
                this.f13171f.a().getWindow().addFlags(128);
                this.m = true;
            }
        }
        this.l = true;
    }

    @Override // com.google.android.gms.internal.ads.zzbcn
    public final void k() {
        this.f13174i.b();
        zzaxi.a.post(new y7(this));
    }

    @Override // com.google.android.gms.internal.ads.zzbcn
    public final void l(int i2, int i3) {
        if (this.o) {
            zzacj<Integer> zzacjVar = zzacu.N;
            int max = Math.max(i2 / ((Integer) zzyt.e().c(zzacjVar)).intValue(), 1);
            int max2 = Math.max(i3 / ((Integer) zzyt.e().c(zzacjVar)).intValue(), 1);
            Bitmap bitmap = this.t;
            if (bitmap != null && bitmap.getWidth() == max && this.t.getHeight() == max2) {
                return;
            }
            this.t = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
            this.v = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbcn
    public final void m() {
        x("pause", new String[0]);
        I();
        this.l = false;
    }

    public final void n(float f2, float f3) {
        zzbco zzbcoVar = this.f13176k;
        if (zzbcoVar != null) {
            zzbcoVar.g(f2, f3);
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(final boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            this.f13174i.b();
        } else {
            this.f13174i.a();
            this.q = this.p;
        }
        zzaxi.a.post(new Runnable(this, z) { // from class: com.google.android.gms.internal.ads.x7

            /* renamed from: f, reason: collision with root package name */
            private final zzbcq f12377f;

            /* renamed from: g, reason: collision with root package name */
            private final boolean f12378g;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f12377f = this;
                this.f12378g = z;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f12377f.r(this.f12378g);
            }
        });
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.zzbcn
    public final void onWindowVisibilityChanged(int i2) {
        boolean z;
        super.onWindowVisibilityChanged(i2);
        if (i2 == 0) {
            this.f13174i.b();
            z = true;
        } else {
            this.f13174i.a();
            this.q = this.p;
            z = false;
        }
        zzaxi.a.post(new a8(this, z));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void r(boolean z) {
        x("windowFocusChanged", "hasWindowFocus", String.valueOf(z));
    }

    public final void setVolume(float f2) {
        zzbco zzbcoVar = this.f13176k;
        if (zzbcoVar == null) {
            return;
        }
        zzbcoVar.f13170g.c(f2);
        zzbcoVar.a();
    }

    public final void t(String str, String[] strArr) {
        this.r = str;
        this.s = strArr;
    }

    public final void u(int i2) {
        this.f13176k.j(i2);
    }

    public final void v(int i2) {
        this.f13176k.k(i2);
    }

    public final void w(int i2, int i3, int i4, int i5) {
        if (i4 == 0 || i5 == 0) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i4, i5);
        layoutParams.setMargins(i2, i3, 0, 0);
        this.f13172g.setLayoutParams(layoutParams);
        requestLayout();
    }

    public final void y(int i2) {
        this.f13176k.l(i2);
    }

    public final void z(int i2) {
        this.f13176k.m(i2);
    }
}
