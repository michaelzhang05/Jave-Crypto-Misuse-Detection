package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.formats.NativeContentAd;
import com.google.android.gms.ads.formats.UnifiedNativeAdAssetNames;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

@zzard
/* loaded from: classes2.dex */
public final class zzbzi extends zzaes implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, zzcab {

    /* renamed from: f, reason: collision with root package name */
    private final WeakReference<View> f13732f;

    /* renamed from: g, reason: collision with root package name */
    private final Map<String, WeakReference<View>> f13733g = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    private final Map<String, WeakReference<View>> f13734h = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    private final Map<String, WeakReference<View>> f13735i = new HashMap();

    /* renamed from: j, reason: collision with root package name */
    private zzbyn f13736j;

    /* renamed from: k, reason: collision with root package name */
    private zzua f13737k;

    public zzbzi(View view, HashMap<String, View> hashMap, HashMap<String, View> hashMap2) {
        view.setOnTouchListener(this);
        view.setOnClickListener(this);
        zzk.zzmd();
        zzbbz.a(view, this);
        zzk.zzmd();
        zzbbz.b(view, this);
        this.f13732f = new WeakReference<>(view);
        for (Map.Entry<String, View> entry : hashMap.entrySet()) {
            String key = entry.getKey();
            View value = entry.getValue();
            if (value != null) {
                this.f13733g.put(key, new WeakReference<>(value));
                if (!NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW.equals(key) && !UnifiedNativeAdAssetNames.ASSET_ADCHOICES_CONTAINER_VIEW.equals(key)) {
                    value.setOnTouchListener(this);
                    value.setClickable(true);
                    value.setOnClickListener(this);
                }
            }
        }
        this.f13735i.putAll(this.f13733g);
        for (Map.Entry<String, View> entry2 : hashMap2.entrySet()) {
            View value2 = entry2.getValue();
            if (value2 != null) {
                this.f13734h.put(entry2.getKey(), new WeakReference<>(value2));
                value2.setOnTouchListener(this);
                value2.setClickable(false);
            }
        }
        this.f13735i.putAll(this.f13734h);
        this.f13737k = new zzua(view.getContext(), view);
    }

    @Override // com.google.android.gms.internal.ads.zzcab
    public final zzua C3() {
        return this.f13737k;
    }

    @Override // com.google.android.gms.internal.ads.zzcab
    public final synchronized Map<String, WeakReference<View>> E4() {
        return this.f13735i;
    }

    @Override // com.google.android.gms.internal.ads.zzaer
    public final synchronized void H(IObjectWrapper iObjectWrapper) {
        Object R = ObjectWrapper.R(iObjectWrapper);
        if (!(R instanceof zzbyn)) {
            zzbad.i("Not an instance of InternalNativeAd. This is most likely a transient error");
            return;
        }
        zzbyn zzbynVar = this.f13736j;
        if (zzbynVar != null) {
            zzbynVar.v(this);
        }
        if (((zzbyn) R).q()) {
            zzbyn zzbynVar2 = (zzbyn) R;
            this.f13736j = zzbynVar2;
            zzbynVar2.o(this);
            this.f13736j.E(R());
            return;
        }
        zzbad.g("Your account must be enabled to use this feature. Talk to your account manager to request this feature for your account.");
    }

    @Override // com.google.android.gms.internal.ads.zzaer
    public final synchronized void M5() {
        zzbyn zzbynVar = this.f13736j;
        if (zzbynVar != null) {
            zzbynVar.v(this);
            this.f13736j = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcab
    public final synchronized String O5() {
        return NativeContentAd.ASSET_ATTRIBUTION_ICON_IMAGE;
    }

    @Override // com.google.android.gms.internal.ads.zzcab
    public final View R() {
        return this.f13732f.get();
    }

    @Override // com.google.android.gms.internal.ads.zzcab
    public final synchronized Map<String, WeakReference<View>> U3() {
        return this.f13733g;
    }

    @Override // com.google.android.gms.internal.ads.zzaer
    public final synchronized void a0(IObjectWrapper iObjectWrapper) {
        if (this.f13736j != null) {
            Object R = ObjectWrapper.R(iObjectWrapper);
            if (!(R instanceof View)) {
                zzbad.i("Calling NativeAdViewHolderNonagonDelegate.setClickConfirmingView with wrong wrapped object");
            }
            this.f13736j.i((View) R);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcab
    public final synchronized Map<String, WeakReference<View>> a5() {
        return this.f13734h;
    }

    @Override // com.google.android.gms.internal.ads.zzcab
    public final synchronized View g5(String str) {
        WeakReference<View> weakReference = this.f13735i.get(str);
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    @Override // com.google.android.gms.internal.ads.zzcab
    public final FrameLayout i0() {
        return null;
    }

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(View view) {
        zzbyn zzbynVar = this.f13736j;
        if (zzbynVar != null) {
            zzbynVar.k(view, R(), E4(), U3(), true);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
        zzbyn zzbynVar = this.f13736j;
        if (zzbynVar != null) {
            zzbynVar.u(R(), E4(), U3(), zzbyn.D(R()));
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
        zzbyn zzbynVar = this.f13736j;
        if (zzbynVar != null) {
            zzbynVar.u(R(), E4(), U3(), zzbyn.D(R()));
        }
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        zzbyn zzbynVar = this.f13736j;
        if (zzbynVar != null) {
            zzbynVar.j(view, motionEvent, R());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcab
    public final synchronized void u(String str, View view, boolean z) {
        if (view == null) {
            this.f13735i.remove(str);
            this.f13733g.remove(str);
            this.f13734h.remove(str);
            return;
        }
        this.f13735i.put(str, new WeakReference<>(view));
        if (!NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW.equals(str) && !UnifiedNativeAdAssetNames.ASSET_ADCHOICES_CONTAINER_VIEW.equals(str)) {
            this.f13733g.put(str, new WeakReference<>(view));
            view.setClickable(true);
            view.setOnClickListener(this);
            view.setOnTouchListener(this);
        }
    }
}
