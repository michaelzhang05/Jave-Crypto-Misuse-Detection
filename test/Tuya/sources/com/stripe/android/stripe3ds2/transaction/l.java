package com.stripe.android.stripe3ds2.transaction;

import android.app.Application;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.stripe.android.stripe3ds2.transaction.q;
import java.util.List;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    private final Application f26876a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f26877b;

    /* renamed from: c, reason: collision with root package name */
    private final X3.q f26878c;

    /* renamed from: d, reason: collision with root package name */
    private final T3.m f26879d;

    /* renamed from: e, reason: collision with root package name */
    private final List f26880e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f26881f;

    /* renamed from: g, reason: collision with root package name */
    private final P5.g f26882g;

    public l(Application application, boolean z8, X3.q sdkTransactionId, T3.m uiCustomization, List rootCerts, boolean z9, P5.g workContext) {
        AbstractC3159y.i(application, "application");
        AbstractC3159y.i(sdkTransactionId, "sdkTransactionId");
        AbstractC3159y.i(uiCustomization, "uiCustomization");
        AbstractC3159y.i(rootCerts, "rootCerts");
        AbstractC3159y.i(workContext, "workContext");
        this.f26876a = application;
        this.f26877b = z8;
        this.f26878c = sdkTransactionId;
        this.f26879d = uiCustomization;
        this.f26880e = rootCerts;
        this.f26881f = z9;
        this.f26882g = workContext;
    }

    public final X3.n a() {
        o a8 = o.f26892a.a(this.f26881f);
        U3.a aVar = new U3.a(this.f26876a, new U3.e(this.f26878c), this.f26882g, a8, null, null, null, 0, PsExtractor.VIDEO_STREAM_MASK, null);
        return new j(this.f26878c, new X3.p(), new X3.h(this.f26877b, this.f26880e, aVar), new V3.c(this.f26877b), new X3.f(aVar), new i(aVar, this.f26882g), new q.b(this.f26882g), this.f26879d, aVar, a8);
    }
}
