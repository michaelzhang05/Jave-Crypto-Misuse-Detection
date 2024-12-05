package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.mediation.NativeContentAdMapper;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@zzard
/* loaded from: classes2.dex */
public final class zzanr extends zzane {

    /* renamed from: f, reason: collision with root package name */
    private final NativeContentAdMapper f12838f;

    public zzanr(NativeContentAdMapper nativeContentAdMapper) {
        this.f12838f = nativeContentAdMapper;
    }

    @Override // com.google.android.gms.internal.ads.zzand
    public final void A(IObjectWrapper iObjectWrapper) {
        this.f12838f.handleClick((View) ObjectWrapper.R(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzand
    public final zzaea a() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzand
    public final String b() {
        return this.f12838f.getHeadline();
    }

    @Override // com.google.android.gms.internal.ads.zzand
    public final String c() {
        return this.f12838f.getCallToAction();
    }

    @Override // com.google.android.gms.internal.ads.zzand
    public final String d() {
        return this.f12838f.getBody();
    }

    @Override // com.google.android.gms.internal.ads.zzand
    public final IObjectWrapper e() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzand
    public final void e0(IObjectWrapper iObjectWrapper) {
        this.f12838f.trackView((View) ObjectWrapper.R(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzand
    public final List f() {
        List<NativeAd.Image> images = this.f12838f.getImages();
        if (images == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (NativeAd.Image image : images) {
            arrayList.add(new zzadw(image.getDrawable(), image.getUri(), image.getScale(), image.getWidth(), image.getHeight()));
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzand
    public final Bundle getExtras() {
        return this.f12838f.getExtras();
    }

    @Override // com.google.android.gms.internal.ads.zzand
    public final zzaar getVideoController() {
        if (this.f12838f.getVideoController() != null) {
            return this.f12838f.getVideoController().zzdh();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzand
    public final zzaei h0() {
        NativeAd.Image logo = this.f12838f.getLogo();
        if (logo != null) {
            return new zzadw(logo.getDrawable(), logo.getUri(), logo.getScale(), logo.getWidth(), logo.getHeight());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzand
    public final String m() {
        return this.f12838f.getAdvertiser();
    }

    @Override // com.google.android.gms.internal.ads.zzand
    public final void o(IObjectWrapper iObjectWrapper) {
        this.f12838f.untrackView((View) ObjectWrapper.R(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzand
    public final boolean q() {
        return this.f12838f.getOverrideImpressionRecording();
    }

    @Override // com.google.android.gms.internal.ads.zzand
    public final void r(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        this.f12838f.trackViews((View) ObjectWrapper.R(iObjectWrapper), (HashMap) ObjectWrapper.R(iObjectWrapper2), (HashMap) ObjectWrapper.R(iObjectWrapper3));
    }

    @Override // com.google.android.gms.internal.ads.zzand
    public final void recordImpression() {
        this.f12838f.recordImpression();
    }

    @Override // com.google.android.gms.internal.ads.zzand
    public final IObjectWrapper v() {
        View zzacd = this.f12838f.zzacd();
        if (zzacd == null) {
            return null;
        }
        return ObjectWrapper.i0(zzacd);
    }

    @Override // com.google.android.gms.internal.ads.zzand
    public final IObjectWrapper x() {
        View adChoicesContent = this.f12838f.getAdChoicesContent();
        if (adChoicesContent == null) {
            return null;
        }
        return ObjectWrapper.i0(adChoicesContent);
    }

    @Override // com.google.android.gms.internal.ads.zzand
    public final boolean z() {
        return this.f12838f.getOverrideClickHandling();
    }
}
