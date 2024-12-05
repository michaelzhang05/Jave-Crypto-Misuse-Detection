package com.google.android.gms.measurement.internal;

import Q.AbstractC1400p;
import android.content.Context;
import android.os.Bundle;

/* renamed from: com.google.android.gms.measurement.internal.z3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2486z3 {

    /* renamed from: a, reason: collision with root package name */
    final Context f17979a;

    /* renamed from: b, reason: collision with root package name */
    String f17980b;

    /* renamed from: c, reason: collision with root package name */
    String f17981c;

    /* renamed from: d, reason: collision with root package name */
    String f17982d;

    /* renamed from: e, reason: collision with root package name */
    Boolean f17983e;

    /* renamed from: f, reason: collision with root package name */
    long f17984f;

    /* renamed from: g, reason: collision with root package name */
    com.google.android.gms.internal.measurement.Z0 f17985g;

    /* renamed from: h, reason: collision with root package name */
    boolean f17986h;

    /* renamed from: i, reason: collision with root package name */
    Long f17987i;

    /* renamed from: j, reason: collision with root package name */
    String f17988j;

    public C2486z3(Context context, com.google.android.gms.internal.measurement.Z0 z02, Long l8) {
        this.f17986h = true;
        AbstractC1400p.l(context);
        Context applicationContext = context.getApplicationContext();
        AbstractC1400p.l(applicationContext);
        this.f17979a = applicationContext;
        this.f17987i = l8;
        if (z02 != null) {
            this.f17985g = z02;
            this.f17980b = z02.f16522f;
            this.f17981c = z02.f16521e;
            this.f17982d = z02.f16520d;
            this.f17986h = z02.f16519c;
            this.f17984f = z02.f16518b;
            this.f17988j = z02.f16524h;
            Bundle bundle = z02.f16523g;
            if (bundle != null) {
                this.f17983e = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
