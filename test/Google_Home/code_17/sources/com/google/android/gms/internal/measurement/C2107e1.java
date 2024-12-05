package com.google.android.gms.internal.measurement;

import Q.AbstractC1400p;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.measurement.C2077b1;
import l0.C3278m;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.e1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2107e1 extends C2077b1.a {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ String f16612e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ String f16613f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ Context f16614g;

    /* renamed from: h, reason: collision with root package name */
    private final /* synthetic */ Bundle f16615h;

    /* renamed from: i, reason: collision with root package name */
    private final /* synthetic */ C2077b1 f16616i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2107e1(C2077b1 c2077b1, String str, String str2, Context context, Bundle bundle) {
        super(c2077b1);
        this.f16612e = str;
        this.f16613f = str2;
        this.f16614g = context;
        this.f16615h = bundle;
        this.f16616i = c2077b1;
    }

    @Override // com.google.android.gms.internal.measurement.C2077b1.a
    public final void a() {
        boolean D8;
        String str;
        String str2;
        String str3;
        Q0 q02;
        boolean z8;
        Q0 q03;
        String str4;
        String str5;
        try {
            D8 = this.f16616i.D(this.f16612e, this.f16613f);
            if (D8) {
                String str6 = this.f16613f;
                String str7 = this.f16612e;
                str5 = this.f16616i.f16554a;
                str3 = str6;
                str2 = str7;
                str = str5;
            } else {
                str = null;
                str2 = null;
                str3 = null;
            }
            AbstractC1400p.l(this.f16614g);
            C2077b1 c2077b1 = this.f16616i;
            c2077b1.f16562i = c2077b1.c(this.f16614g, true);
            q02 = this.f16616i.f16562i;
            if (q02 == null) {
                str4 = this.f16616i.f16554a;
                Log.w(str4, "Failed to connect to measurement client.");
                return;
            }
            int a8 = DynamiteModule.a(this.f16614g, ModuleDescriptor.MODULE_ID);
            int c8 = DynamiteModule.c(this.f16614g, ModuleDescriptor.MODULE_ID);
            int max = Math.max(a8, c8);
            if (c8 < a8) {
                z8 = true;
            } else {
                z8 = false;
            }
            Z0 z02 = new Z0(102001L, max, z8, str, str2, str3, this.f16615h, C3278m.a(this.f16614g));
            q03 = this.f16616i.f16562i;
            ((Q0) AbstractC1400p.l(q03)).initialize(Y.b.s0(this.f16614g), z02, this.f16563a);
        } catch (Exception e8) {
            this.f16616i.p(e8, true, false);
        }
    }
}
