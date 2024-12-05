package com.google.android.gms.internal.measurement;

import R.AbstractC1319p;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.w0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2124w0 extends M0 {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ String f15943e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f15944f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ Context f15945g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ Bundle f15946h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ X0 f15947i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2124w0(X0 x02, String str, String str2, Context context, Bundle bundle) {
        super(x02, true);
        this.f15947i = x02;
        this.f15943e = str;
        this.f15944f = str2;
        this.f15945g = context;
        this.f15946h = bundle;
    }

    @Override // com.google.android.gms.internal.measurement.M0
    public final void a() {
        boolean l8;
        String str;
        String str2;
        String str3;
        InterfaceC2005h0 interfaceC2005h0;
        boolean z8;
        InterfaceC2005h0 interfaceC2005h02;
        String str4;
        String str5;
        try {
            l8 = this.f15947i.l(this.f15943e, this.f15944f);
            if (l8) {
                String str6 = this.f15944f;
                String str7 = this.f15943e;
                str5 = this.f15947i.f15602a;
                str3 = str6;
                str2 = str7;
                str = str5;
            } else {
                str = null;
                str2 = null;
                str3 = null;
            }
            AbstractC1319p.l(this.f15945g);
            X0 x02 = this.f15947i;
            x02.f15610i = x02.q(this.f15945g, true);
            interfaceC2005h0 = this.f15947i.f15610i;
            if (interfaceC2005h0 == null) {
                str4 = this.f15947i.f15602a;
                Log.w(str4, "Failed to connect to measurement client.");
                return;
            }
            int a8 = DynamiteModule.a(this.f15945g, ModuleDescriptor.MODULE_ID);
            int c8 = DynamiteModule.c(this.f15945g, ModuleDescriptor.MODULE_ID);
            int max = Math.max(a8, c8);
            if (c8 < a8) {
                z8 = true;
            } else {
                z8 = false;
            }
            C2077q0 c2077q0 = new C2077q0(79000L, max, z8, str, str2, str3, this.f15946h, m0.k.a(this.f15945g));
            interfaceC2005h02 = this.f15947i.f15610i;
            ((InterfaceC2005h0) AbstractC1319p.l(interfaceC2005h02)).initialize(Z.b.m0(this.f15945g), c2077q0, this.f15390a);
        } catch (Exception e8) {
            this.f15947i.i(e8, true, false);
        }
    }
}
