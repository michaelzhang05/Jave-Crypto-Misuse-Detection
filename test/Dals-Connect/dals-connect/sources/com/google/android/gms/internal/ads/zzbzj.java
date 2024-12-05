package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.formats.NativeAppInstallAd;
import com.google.android.gms.ads.formats.NativeContentAd;
import com.google.android.gms.ads.formats.UnifiedNativeAdAssetNames;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzbzj extends zzaen implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, zzcab {

    /* renamed from: f, reason: collision with root package name */
    public static final String[] f13738f = {NativeAppInstallAd.ASSET_MEDIA_VIDEO, NativeContentAd.ASSET_MEDIA_VIDEO, UnifiedNativeAdAssetNames.ASSET_MEDIA_VIDEO};

    /* renamed from: g, reason: collision with root package name */
    private final String f13739g;

    /* renamed from: i, reason: collision with root package name */
    private FrameLayout f13741i;

    /* renamed from: j, reason: collision with root package name */
    private FrameLayout f13742j;

    /* renamed from: k, reason: collision with root package name */
    private zzbbl f13743k;
    private View l;
    private zzbyn m;
    private zzua n;

    /* renamed from: h, reason: collision with root package name */
    private Map<String, WeakReference<View>> f13740h = new HashMap();
    private boolean o = false;

    public zzbzj(FrameLayout frameLayout, FrameLayout frameLayout2) {
        String str;
        this.f13741i = frameLayout;
        this.f13742j = frameLayout2;
        String canonicalName = frameLayout.getClass().getCanonicalName();
        if ("com.google.android.gms.ads.formats.NativeContentAdView".equals(canonicalName)) {
            str = NativeContentAd.ASSET_ATTRIBUTION_ICON_IMAGE;
        } else if ("com.google.android.gms.ads.formats.NativeAppInstallAdView".equals(canonicalName)) {
            str = NativeAppInstallAd.ASSET_ATTRIBUTION_ICON_IMAGE;
        } else {
            "com.google.android.gms.ads.formats.UnifiedNativeAdView".equals(canonicalName);
            str = "3012";
        }
        this.f13739g = str;
        zzk.zzmd();
        zzbbz.a(frameLayout, this);
        zzk.zzmd();
        zzbbz.b(frameLayout, this);
        this.f13743k = zzbbm.f13156c;
        this.n = new zzua(this.f13741i.getContext(), this.f13741i);
        frameLayout.setOnTouchListener(this);
        frameLayout.setOnClickListener(this);
    }

    private final synchronized void I7() {
        this.f13743k.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.yf

            /* renamed from: f, reason: collision with root package name */
            private final zzbzj f12464f;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f12464f = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f12464f.J7();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcab
    public final zzua C3() {
        return this.n;
    }

    @Override // com.google.android.gms.internal.ads.zzaem
    public final synchronized void D0(IObjectWrapper iObjectWrapper, int i2) {
    }

    @Override // com.google.android.gms.internal.ads.zzcab
    public final synchronized Map<String, WeakReference<View>> E4() {
        return this.f13740h;
    }

    @Override // com.google.android.gms.internal.ads.zzaem
    public final synchronized void H(IObjectWrapper iObjectWrapper) {
        if (this.o) {
            return;
        }
        Object R = ObjectWrapper.R(iObjectWrapper);
        if (!(R instanceof zzbyn)) {
            zzbad.i("Not an instance of native engine. This is most likely a transient error");
            return;
        }
        zzbyn zzbynVar = this.m;
        if (zzbynVar != null) {
            zzbynVar.v(this);
        }
        I7();
        zzbyn zzbynVar2 = (zzbyn) R;
        this.m = zzbynVar2;
        zzbynVar2.o(this);
        this.m.E(this.f13741i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void J7() {
        if (this.l == null) {
            View view = new View(this.f13741i.getContext());
            this.l = view;
            view.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
        }
        if (this.f13741i != this.l.getParent()) {
            this.f13741i.addView(this.l);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcab
    public final synchronized String O5() {
        return this.f13739g;
    }

    @Override // com.google.android.gms.internal.ads.zzcab
    public final /* synthetic */ View R() {
        return this.f13741i;
    }

    @Override // com.google.android.gms.internal.ads.zzcab
    public final synchronized Map<String, WeakReference<View>> U3() {
        return this.f13740h;
    }

    @Override // com.google.android.gms.internal.ads.zzaem
    public final synchronized void a0(IObjectWrapper iObjectWrapper) {
        this.m.i((View) ObjectWrapper.R(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzcab
    public final synchronized Map<String, WeakReference<View>> a5() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzaem
    public final synchronized void destroy() {
        if (this.o) {
            return;
        }
        zzbyn zzbynVar = this.m;
        if (zzbynVar != null) {
            zzbynVar.v(this);
            this.m = null;
        }
        this.f13740h.clear();
        this.f13741i.removeAllViews();
        this.f13742j.removeAllViews();
        this.f13740h = null;
        this.f13741i = null;
        this.f13742j = null;
        this.l = null;
        this.n = null;
        this.o = true;
    }

    @Override // com.google.android.gms.internal.ads.zzcab
    public final synchronized View g5(String str) {
        if (this.o) {
            return null;
        }
        WeakReference<View> weakReference = this.f13740h.get(str);
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    @Override // com.google.android.gms.internal.ads.zzcab
    public final FrameLayout i0() {
        return this.f13742j;
    }

    @Override // com.google.android.gms.internal.ads.zzaem
    public final synchronized IObjectWrapper n4(String str) {
        return ObjectWrapper.i0(g5(str));
    }

    @Override // com.google.android.gms.internal.ads.zzaem
    public final synchronized void o5(String str, IObjectWrapper iObjectWrapper) {
        u(str, (View) ObjectWrapper.R(iObjectWrapper), true);
    }

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(View view) {
        zzbyn zzbynVar = this.m;
        if (zzbynVar != null) {
            zzbynVar.g();
            this.m.k(view, this.f13741i, E4(), U3(), false);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
        zzbyn zzbynVar = this.m;
        if (zzbynVar != null) {
            zzbynVar.u(this.f13741i, E4(), U3(), zzbyn.D(this.f13741i));
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
        zzbyn zzbynVar = this.m;
        if (zzbynVar != null) {
            zzbynVar.u(this.f13741i, E4(), U3(), zzbyn.D(this.f13741i));
        }
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        zzbyn zzbynVar = this.m;
        if (zzbynVar != null) {
            zzbynVar.j(view, motionEvent, this.f13741i);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcab
    public final synchronized void u(String str, View view, boolean z) {
        if (this.o) {
            return;
        }
        if (view == null) {
            this.f13740h.remove(str);
            return;
        }
        this.f13740h.put(str, new WeakReference<>(view));
        if (!NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW.equals(str) && !UnifiedNativeAdAssetNames.ASSET_ADCHOICES_CONTAINER_VIEW.equals(str)) {
            view.setOnTouchListener(this);
            view.setClickable(true);
            view.setOnClickListener(this);
        }
    }
}
