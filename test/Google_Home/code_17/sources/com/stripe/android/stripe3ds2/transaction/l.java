package com.stripe.android.stripe3ds2.transaction;

import android.app.Application;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.stripe.android.stripe3ds2.transaction.q;
import java.util.List;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    private final Application f27931a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f27932b;

    /* renamed from: c, reason: collision with root package name */
    private final a4.q f27933c;

    /* renamed from: d, reason: collision with root package name */
    private final W3.m f27934d;

    /* renamed from: e, reason: collision with root package name */
    private final List f27935e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f27936f;

    /* renamed from: g, reason: collision with root package name */
    private final S5.g f27937g;

    public l(Application application, boolean z8, a4.q sdkTransactionId, W3.m uiCustomization, List rootCerts, boolean z9, S5.g workContext) {
        AbstractC3255y.i(application, "application");
        AbstractC3255y.i(sdkTransactionId, "sdkTransactionId");
        AbstractC3255y.i(uiCustomization, "uiCustomization");
        AbstractC3255y.i(rootCerts, "rootCerts");
        AbstractC3255y.i(workContext, "workContext");
        this.f27931a = application;
        this.f27932b = z8;
        this.f27933c = sdkTransactionId;
        this.f27934d = uiCustomization;
        this.f27935e = rootCerts;
        this.f27936f = z9;
        this.f27937g = workContext;
    }

    public final a4.n a() {
        o a8 = o.f27947a.a(this.f27936f);
        X3.a aVar = new X3.a(this.f27931a, new X3.e(this.f27933c), this.f27937g, a8, null, null, null, 0, PsExtractor.VIDEO_STREAM_MASK, null);
        return new j(this.f27933c, new a4.p(), new a4.h(this.f27932b, this.f27935e, aVar), new Y3.c(this.f27932b), new a4.f(aVar), new i(aVar, this.f27937g), new q.b(this.f27937g), this.f27934d, aVar, a8);
    }
}
