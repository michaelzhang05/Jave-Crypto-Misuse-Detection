package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.zzk;
import java.util.Map;

@zzard
/* loaded from: classes2.dex */
public final class zzaqa extends zzaqb implements zzaho<zzbgz> {

    /* renamed from: c, reason: collision with root package name */
    private final zzbgz f12888c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f12889d;

    /* renamed from: e, reason: collision with root package name */
    private final WindowManager f12890e;

    /* renamed from: f, reason: collision with root package name */
    private final zzacf f12891f;

    /* renamed from: g, reason: collision with root package name */
    private DisplayMetrics f12892g;

    /* renamed from: h, reason: collision with root package name */
    private float f12893h;

    /* renamed from: i, reason: collision with root package name */
    private int f12894i;

    /* renamed from: j, reason: collision with root package name */
    private int f12895j;

    /* renamed from: k, reason: collision with root package name */
    private int f12896k;
    private int l;
    private int m;
    private int n;
    private int o;

    public zzaqa(zzbgz zzbgzVar, Context context, zzacf zzacfVar) {
        super(zzbgzVar);
        this.f12894i = -1;
        this.f12895j = -1;
        this.l = -1;
        this.m = -1;
        this.n = -1;
        this.o = -1;
        this.f12888c = zzbgzVar;
        this.f12889d = context;
        this.f12891f = zzacfVar;
        this.f12890e = (WindowManager) context.getSystemService("window");
    }

    @Override // com.google.android.gms.internal.ads.zzaho
    public final /* synthetic */ void a(zzbgz zzbgzVar, Map map) {
        this.f12892g = new DisplayMetrics();
        Display defaultDisplay = this.f12890e.getDefaultDisplay();
        defaultDisplay.getMetrics(this.f12892g);
        this.f12893h = this.f12892g.density;
        this.f12896k = defaultDisplay.getRotation();
        zzyt.a();
        DisplayMetrics displayMetrics = this.f12892g;
        this.f12894i = zzazt.k(displayMetrics, displayMetrics.widthPixels);
        zzyt.a();
        DisplayMetrics displayMetrics2 = this.f12892g;
        this.f12895j = zzazt.k(displayMetrics2, displayMetrics2.heightPixels);
        Activity a = this.f12888c.a();
        if (a != null && a.getWindow() != null) {
            zzk.zzlg();
            int[] P = zzaxi.P(a);
            zzyt.a();
            this.l = zzazt.k(this.f12892g, P[0]);
            zzyt.a();
            this.m = zzazt.k(this.f12892g, P[1]);
        } else {
            this.l = this.f12894i;
            this.m = this.f12895j;
        }
        if (this.f12888c.o().e()) {
            this.n = this.f12894i;
            this.o = this.f12895j;
        } else {
            this.f12888c.measure(0, 0);
        }
        c(this.f12894i, this.f12895j, this.l, this.m, this.f12893h, this.f12896k);
        this.f12888c.j("onDeviceFeaturesReceived", new zzapx(new zzapz().i(this.f12891f.b()).h(this.f12891f.c()).j(this.f12891f.e()).b(this.f12891f.d()).c(true)).a());
        int[] iArr = new int[2];
        this.f12888c.getLocationOnScreen(iArr);
        h(zzyt.a().j(this.f12889d, iArr[0]), zzyt.a().j(this.f12889d, iArr[1]));
        if (zzbad.a(2)) {
            zzbad.h("Dispatching Ready Event.");
        }
        f(this.f12888c.b().f13150f);
    }

    public final void h(int i2, int i3) {
        int i4 = this.f12889d instanceof Activity ? zzk.zzlg().W((Activity) this.f12889d)[0] : 0;
        if (this.f12888c.o() == null || !this.f12888c.o().e()) {
            this.n = zzyt.a().j(this.f12889d, this.f12888c.getWidth());
            this.o = zzyt.a().j(this.f12889d, this.f12888c.getHeight());
        }
        d(i2, i3 - i4, this.n, this.o);
        this.f12888c.p().g(i2, i3);
    }
}
