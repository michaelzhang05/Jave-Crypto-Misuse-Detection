package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.formats.AdChoicesView;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.formats.UnifiedNativeAdAssetNames;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzbzl {
    private final Context a;

    /* renamed from: b, reason: collision with root package name */
    private final zzaxb f13744b;

    /* renamed from: c, reason: collision with root package name */
    private final zzcxv f13745c;

    /* renamed from: d, reason: collision with root package name */
    private final zzbyx f13746d;

    /* renamed from: e, reason: collision with root package name */
    private final zzbyt f13747e;

    /* renamed from: f, reason: collision with root package name */
    private final zzbzt f13748f;

    /* renamed from: g, reason: collision with root package name */
    private final Executor f13749g;

    /* renamed from: h, reason: collision with root package name */
    private final Executor f13750h;

    /* renamed from: i, reason: collision with root package name */
    private final zzady f13751i;

    public zzbzl(Context context, zzaxb zzaxbVar, zzcxv zzcxvVar, zzbyx zzbyxVar, zzbyt zzbytVar, zzbzt zzbztVar, Executor executor, Executor executor2) {
        this.a = context;
        this.f13744b = zzaxbVar;
        this.f13745c = zzcxvVar;
        this.f13751i = zzcxvVar.f14578i;
        this.f13746d = zzbyxVar;
        this.f13747e = zzbytVar;
        this.f13748f = zzbztVar;
        this.f13749g = executor;
        this.f13750h = executor2;
    }

    private static void a(RelativeLayout.LayoutParams layoutParams, int i2) {
        if (i2 == 0) {
            layoutParams.addRule(10);
            layoutParams.addRule(9);
        } else if (i2 == 2) {
            layoutParams.addRule(12);
            layoutParams.addRule(11);
        } else if (i2 != 3) {
            layoutParams.addRule(10);
            layoutParams.addRule(11);
        } else {
            layoutParams.addRule(12);
            layoutParams.addRule(9);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean d(zzcab zzcabVar, String[] strArr) {
        Map<String, WeakReference<View>> U3 = zzcabVar.U3();
        if (U3 == null) {
            return false;
        }
        for (String str : strArr) {
            if (U3.get(str) != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean b(ViewGroup viewGroup) {
        FrameLayout.LayoutParams layoutParams;
        View z = this.f13747e.z();
        if (z == null) {
            return false;
        }
        viewGroup.removeAllViews();
        if (z.getParent() instanceof ViewGroup) {
            ((ViewGroup) z.getParent()).removeView(z);
        }
        if (((Boolean) zzyt.e().c(zzacu.R2)).booleanValue()) {
            layoutParams = new FrameLayout.LayoutParams(-1, -1, 17);
        } else {
            layoutParams = new FrameLayout.LayoutParams(-2, -2, 17);
        }
        viewGroup.addView(z, layoutParams);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void e(ViewGroup viewGroup) {
        boolean z = viewGroup != null;
        if (this.f13747e.z() != null) {
            if (2 != this.f13747e.w() && 1 != this.f13747e.w()) {
                if (6 == this.f13747e.w()) {
                    this.f13744b.H(this.f13745c.f14575f, "2", z);
                    this.f13744b.H(this.f13745c.f14575f, "1", z);
                    return;
                }
                return;
            }
            this.f13744b.H(this.f13745c.f14575f, String.valueOf(this.f13747e.w()), z);
        }
    }

    public final void f(final zzcab zzcabVar) {
        this.f13749g.execute(new Runnable(this, zzcabVar) { // from class: com.google.android.gms.internal.ads.zf

            /* renamed from: f, reason: collision with root package name */
            private final zzbzl f12524f;

            /* renamed from: g, reason: collision with root package name */
            private final zzcab f12525g;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f12524f = this;
                this.f12525g = zzcabVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f12524f.h(this.f12525g);
            }
        });
    }

    public final void g(zzcab zzcabVar) {
        if (zzcabVar == null || this.f13748f == null || zzcabVar.i0() == null) {
            return;
        }
        try {
            zzcabVar.i0().addView(this.f13748f.c());
        } catch (zzbhj e2) {
            zzawz.l("web view can not be obtained", e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void h(zzcab zzcabVar) {
        ViewGroup viewGroup;
        View view;
        final ViewGroup viewGroup2;
        Drawable drawable;
        if (this.f13746d.c() || this.f13746d.b()) {
            String[] strArr = {NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW, UnifiedNativeAdAssetNames.ASSET_ADCHOICES_CONTAINER_VIEW};
            for (int i2 = 0; i2 < 2; i2++) {
                View g5 = zzcabVar.g5(strArr[i2]);
                if (g5 != null && (g5 instanceof ViewGroup)) {
                    viewGroup = (ViewGroup) g5;
                    break;
                }
            }
        }
        viewGroup = null;
        boolean z = viewGroup != null;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        if (this.f13747e.x() != null) {
            view = this.f13747e.x();
            zzady zzadyVar = this.f13751i;
            if (zzadyVar != null && !z) {
                a(layoutParams, zzadyVar.f12673j);
                view.setLayoutParams(layoutParams);
            }
        } else if (this.f13747e.V() instanceof zzadt) {
            zzadt zzadtVar = (zzadt) this.f13747e.V();
            if (!z) {
                a(layoutParams, zzadtVar.N7());
            }
            View zzaduVar = new zzadu(this.a, zzadtVar, layoutParams);
            zzaduVar.setContentDescription((CharSequence) zzyt.e().c(zzacu.O2));
            view = zzaduVar;
        } else {
            view = null;
        }
        if (view != null) {
            if (view.getParent() instanceof ViewGroup) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            if (z) {
                viewGroup.removeAllViews();
                viewGroup.addView(view);
            } else {
                AdChoicesView adChoicesView = new AdChoicesView(zzcabVar.R().getContext());
                adChoicesView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                adChoicesView.addView(view);
                FrameLayout i0 = zzcabVar.i0();
                if (i0 != null) {
                    i0.addView(adChoicesView);
                }
            }
            zzcabVar.u(zzcabVar.O5(), view, true);
        }
        if (!((Boolean) zzyt.e().c(zzacu.X4)).booleanValue()) {
            g(zzcabVar);
        }
        String[] strArr2 = zzbzj.f13738f;
        int length = strArr2.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                viewGroup2 = null;
                break;
            }
            View g52 = zzcabVar.g5(strArr2[i3]);
            if (g52 instanceof ViewGroup) {
                viewGroup2 = (ViewGroup) g52;
                break;
            }
            i3++;
        }
        this.f13750h.execute(new Runnable(this, viewGroup2) { // from class: com.google.android.gms.internal.ads.ag

            /* renamed from: f, reason: collision with root package name */
            private final zzbzl f11087f;

            /* renamed from: g, reason: collision with root package name */
            private final ViewGroup f11088g;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f11087f = this;
                this.f11088g = viewGroup2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f11087f.e(this.f11088g);
            }
        });
        if (viewGroup2 != null) {
            if (b(viewGroup2)) {
                if (this.f13747e.A() != null) {
                    this.f13747e.A().x0(new bg(this, zzcabVar, viewGroup2));
                    return;
                }
                return;
            }
            viewGroup2.removeAllViews();
            View R = zzcabVar.R();
            Context context = R != null ? R.getContext() : null;
            if (context == null || this.f13747e.h() == null || this.f13747e.h().isEmpty()) {
                return;
            }
            zzadw zzadwVar = this.f13747e.h().get(0);
            zzaei H7 = zzadwVar instanceof IBinder ? zzaej.H7(zzadwVar) : null;
            if (H7 != null) {
                try {
                    IObjectWrapper y4 = H7.y4();
                    if (y4 == null || (drawable = (Drawable) ObjectWrapper.R(y4)) == null) {
                        return;
                    }
                    ImageView imageView = new ImageView(context);
                    imageView.setImageDrawable(drawable);
                    imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                    viewGroup2.addView(imageView);
                } catch (RemoteException unused) {
                    zzbad.i("Could not get drawable from image");
                }
            }
        }
    }
}
