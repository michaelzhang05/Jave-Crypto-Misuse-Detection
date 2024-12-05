package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.mediation.NativeAppInstallAdMapper;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@zzard
/* loaded from: classes2.dex */
public final class zzanq extends zzanb {

    /* renamed from: f, reason: collision with root package name */
    private final NativeAppInstallAdMapper f12837f;

    public zzanq(NativeAppInstallAdMapper nativeAppInstallAdMapper) {
        this.f12837f = nativeAppInstallAdMapper;
    }

    @Override // com.google.android.gms.internal.ads.zzana
    public final void A(IObjectWrapper iObjectWrapper) {
        this.f12837f.handleClick((View) ObjectWrapper.R(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzana
    public final zzaea a() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzana
    public final String b() {
        return this.f12837f.getHeadline();
    }

    @Override // com.google.android.gms.internal.ads.zzana
    public final String c() {
        return this.f12837f.getCallToAction();
    }

    @Override // com.google.android.gms.internal.ads.zzana
    public final String d() {
        return this.f12837f.getBody();
    }

    @Override // com.google.android.gms.internal.ads.zzana
    public final IObjectWrapper e() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzana
    public final void e0(IObjectWrapper iObjectWrapper) {
        this.f12837f.trackView((View) ObjectWrapper.R(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzana
    public final List f() {
        List<NativeAd.Image> images = this.f12837f.getImages();
        if (images == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (NativeAd.Image image : images) {
            arrayList.add(new zzadw(image.getDrawable(), image.getUri(), image.getScale(), image.getWidth(), image.getHeight()));
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzana
    public final Bundle getExtras() {
        return this.f12837f.getExtras();
    }

    @Override // com.google.android.gms.internal.ads.zzana
    public final String getStore() {
        return this.f12837f.getStore();
    }

    @Override // com.google.android.gms.internal.ads.zzana
    public final zzaar getVideoController() {
        if (this.f12837f.getVideoController() != null) {
            return this.f12837f.getVideoController().zzdh();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzana
    public final zzaei h() {
        NativeAd.Image icon = this.f12837f.getIcon();
        if (icon != null) {
            return new zzadw(icon.getDrawable(), icon.getUri(), icon.getScale(), icon.getWidth(), icon.getHeight());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzana
    public final String i() {
        return this.f12837f.getPrice();
    }

    @Override // com.google.android.gms.internal.ads.zzana
    public final double l() {
        return this.f12837f.getStarRating();
    }

    @Override // com.google.android.gms.internal.ads.zzana
    public final void o(IObjectWrapper iObjectWrapper) {
        this.f12837f.untrackView((View) ObjectWrapper.R(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzana
    public final boolean q() {
        return this.f12837f.getOverrideImpressionRecording();
    }

    @Override // com.google.android.gms.internal.ads.zzana
    public final void r(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        this.f12837f.trackViews((View) ObjectWrapper.R(iObjectWrapper), (HashMap) ObjectWrapper.R(iObjectWrapper2), (HashMap) ObjectWrapper.R(iObjectWrapper3));
    }

    @Override // com.google.android.gms.internal.ads.zzana
    public final void recordImpression() {
        this.f12837f.recordImpression();
    }

    @Override // com.google.android.gms.internal.ads.zzana
    public final IObjectWrapper v() {
        View zzacd = this.f12837f.zzacd();
        if (zzacd == null) {
            return null;
        }
        return ObjectWrapper.i0(zzacd);
    }

    @Override // com.google.android.gms.internal.ads.zzana
    public final IObjectWrapper x() {
        View adChoicesContent = this.f12837f.getAdChoicesContent();
        if (adChoicesContent == null) {
            return null;
        }
        return ObjectWrapper.i0(adChoicesContent);
    }

    @Override // com.google.android.gms.internal.ads.zzana
    public final boolean z() {
        return this.f12837f.getOverrideClickHandling();
    }
}
