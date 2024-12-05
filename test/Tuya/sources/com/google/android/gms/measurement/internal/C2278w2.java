package com.google.android.gms.measurement.internal;

import R.AbstractC1319p;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.C2077q0;

/* renamed from: com.google.android.gms.measurement.internal.w2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2278w2 {

    /* renamed from: a, reason: collision with root package name */
    final Context f16899a;

    /* renamed from: b, reason: collision with root package name */
    String f16900b;

    /* renamed from: c, reason: collision with root package name */
    String f16901c;

    /* renamed from: d, reason: collision with root package name */
    String f16902d;

    /* renamed from: e, reason: collision with root package name */
    Boolean f16903e;

    /* renamed from: f, reason: collision with root package name */
    long f16904f;

    /* renamed from: g, reason: collision with root package name */
    C2077q0 f16905g;

    /* renamed from: h, reason: collision with root package name */
    boolean f16906h;

    /* renamed from: i, reason: collision with root package name */
    final Long f16907i;

    /* renamed from: j, reason: collision with root package name */
    String f16908j;

    public C2278w2(Context context, C2077q0 c2077q0, Long l8) {
        this.f16906h = true;
        AbstractC1319p.l(context);
        Context applicationContext = context.getApplicationContext();
        AbstractC1319p.l(applicationContext);
        this.f16899a = applicationContext;
        this.f16907i = l8;
        if (c2077q0 != null) {
            this.f16905g = c2077q0;
            this.f16900b = c2077q0.f15850f;
            this.f16901c = c2077q0.f15849e;
            this.f16902d = c2077q0.f15848d;
            this.f16906h = c2077q0.f15847c;
            this.f16904f = c2077q0.f15846b;
            this.f16908j = c2077q0.f15852h;
            Bundle bundle = c2077q0.f15851g;
            if (bundle != null) {
                this.f16903e = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
