package com.google.android.gms.ads.formats;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzaem;
import com.google.android.gms.internal.ads.zzbad;
import com.google.android.gms.internal.ads.zzyt;

@Deprecated
/* loaded from: classes2.dex */
public class NativeAdView extends FrameLayout {
    private final FrameLayout zzbqi;
    private final zzaem zzbqj;

    public NativeAdView(Context context) {
        super(context);
        this.zzbqi = zzd(context);
        this.zzbqj = zzks();
    }

    private final FrameLayout zzd(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(frameLayout);
        return frameLayout;
    }

    private final zzaem zzks() {
        Preconditions.k(this.zzbqi, "createDelegate must be called after mOverlayFrame has been created");
        if (isInEditMode()) {
            return null;
        }
        return zzyt.b().a(this.zzbqi.getContext(), this, this.zzbqi);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i2, layoutParams);
        super.bringChildToFront(this.zzbqi);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void bringChildToFront(View view) {
        super.bringChildToFront(view);
        FrameLayout frameLayout = this.zzbqi;
        if (frameLayout != view) {
            super.bringChildToFront(frameLayout);
        }
    }

    public void destroy() {
        try {
            this.zzbqj.destroy();
        } catch (RemoteException e2) {
            zzbad.c("Unable to destroy native ad view", e2);
        }
    }

    public AdChoicesView getAdChoicesView() {
        View zzbj = zzbj(NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW);
        if (zzbj instanceof AdChoicesView) {
            return (AdChoicesView) zzbj;
        }
        return null;
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i2) {
        super.onVisibilityChanged(view, i2);
        zzaem zzaemVar = this.zzbqj;
        if (zzaemVar != null) {
            try {
                zzaemVar.D0(ObjectWrapper.i0(view), i2);
            } catch (RemoteException e2) {
                zzbad.c("Unable to call onVisibilityChanged on delegate", e2);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void removeAllViews() {
        super.removeAllViews();
        super.addView(this.zzbqi);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.zzbqi == view) {
            return;
        }
        super.removeView(view);
    }

    public void setAdChoicesView(AdChoicesView adChoicesView) {
        zza(NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW, adChoicesView);
    }

    public void setNativeAd(NativeAd nativeAd) {
        try {
            this.zzbqj.H((IObjectWrapper) nativeAd.zzkq());
        } catch (RemoteException e2) {
            zzbad.c("Unable to call setNativeAd on delegate", e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zza(String str, View view) {
        try {
            this.zzbqj.o5(str, ObjectWrapper.i0(view));
        } catch (RemoteException e2) {
            zzbad.c("Unable to call setAssetView on delegate", e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final View zzbj(String str) {
        try {
            IObjectWrapper n4 = this.zzbqj.n4(str);
            if (n4 != null) {
                return (View) ObjectWrapper.R(n4);
            }
            return null;
        } catch (RemoteException e2) {
            zzbad.c("Unable to call getAssetView on delegate", e2);
            return null;
        }
    }

    public NativeAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.zzbqi = zzd(context);
        this.zzbqj = zzks();
    }

    public NativeAdView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.zzbqi = zzd(context);
        this.zzbqj = zzks();
    }

    @TargetApi(21)
    public NativeAdView(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.zzbqi = zzd(context);
        this.zzbqj = zzks();
    }
}
