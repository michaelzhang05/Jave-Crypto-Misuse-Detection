package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@zzard
/* loaded from: classes2.dex */
public final class zzaoi extends zzanh {

    /* renamed from: f, reason: collision with root package name */
    private final UnifiedNativeAdMapper f12851f;

    public zzaoi(UnifiedNativeAdMapper unifiedNativeAdMapper) {
        this.f12851f = unifiedNativeAdMapper;
    }

    @Override // com.google.android.gms.internal.ads.zzang
    public final void A(IObjectWrapper iObjectWrapper) {
        this.f12851f.handleClick((View) ObjectWrapper.R(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzang
    public final float W3() {
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.zzang
    public final zzaea a() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzang
    public final String b() {
        return this.f12851f.getHeadline();
    }

    @Override // com.google.android.gms.internal.ads.zzang
    public final String c() {
        return this.f12851f.getCallToAction();
    }

    @Override // com.google.android.gms.internal.ads.zzang
    public final String d() {
        return this.f12851f.getBody();
    }

    @Override // com.google.android.gms.internal.ads.zzang
    public final IObjectWrapper e() {
        Object zzkv = this.f12851f.zzkv();
        if (zzkv == null) {
            return null;
        }
        return ObjectWrapper.i0(zzkv);
    }

    @Override // com.google.android.gms.internal.ads.zzang
    public final List f() {
        List<NativeAd.Image> images = this.f12851f.getImages();
        ArrayList arrayList = new ArrayList();
        if (images != null) {
            for (NativeAd.Image image : images) {
                arrayList.add(new zzadw(image.getDrawable(), image.getUri(), image.getScale(), image.getWidth(), image.getHeight()));
            }
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzang
    public final Bundle getExtras() {
        return this.f12851f.getExtras();
    }

    @Override // com.google.android.gms.internal.ads.zzang
    public final String getStore() {
        return this.f12851f.getStore();
    }

    @Override // com.google.android.gms.internal.ads.zzang
    public final zzaar getVideoController() {
        if (this.f12851f.getVideoController() != null) {
            return this.f12851f.getVideoController().zzdh();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzang
    public final zzaei h() {
        NativeAd.Image icon = this.f12851f.getIcon();
        if (icon != null) {
            return new zzadw(icon.getDrawable(), icon.getUri(), icon.getScale(), icon.getWidth(), icon.getHeight());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzang
    public final String i() {
        return this.f12851f.getPrice();
    }

    @Override // com.google.android.gms.internal.ads.zzang
    public final double l() {
        if (this.f12851f.getStarRating() != null) {
            return this.f12851f.getStarRating().doubleValue();
        }
        return -1.0d;
    }

    @Override // com.google.android.gms.internal.ads.zzang
    public final String m() {
        return this.f12851f.getAdvertiser();
    }

    @Override // com.google.android.gms.internal.ads.zzang
    public final void o(IObjectWrapper iObjectWrapper) {
        this.f12851f.untrackView((View) ObjectWrapper.R(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzang
    public final boolean q() {
        return this.f12851f.getOverrideImpressionRecording();
    }

    @Override // com.google.android.gms.internal.ads.zzang
    public final void r(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        this.f12851f.trackViews((View) ObjectWrapper.R(iObjectWrapper), (HashMap) ObjectWrapper.R(iObjectWrapper2), (HashMap) ObjectWrapper.R(iObjectWrapper3));
    }

    @Override // com.google.android.gms.internal.ads.zzang
    public final void recordImpression() {
        this.f12851f.recordImpression();
    }

    @Override // com.google.android.gms.internal.ads.zzang
    public final IObjectWrapper v() {
        View zzacd = this.f12851f.zzacd();
        if (zzacd == null) {
            return null;
        }
        return ObjectWrapper.i0(zzacd);
    }

    @Override // com.google.android.gms.internal.ads.zzang
    public final IObjectWrapper x() {
        View adChoicesContent = this.f12851f.getAdChoicesContent();
        if (adChoicesContent == null) {
            return null;
        }
        return ObjectWrapper.i0(adChoicesContent);
    }

    @Override // com.google.android.gms.internal.ads.zzang
    public final boolean z() {
        return this.f12851f.getOverrideClickHandling();
    }
}
