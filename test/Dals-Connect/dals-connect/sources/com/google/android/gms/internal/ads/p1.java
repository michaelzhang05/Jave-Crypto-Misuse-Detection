package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class p1 implements zzaho<zzalf> {
    private final /* synthetic */ zzdh a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ zzajw f11961b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ zzazk f11962c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ zzakh f11963d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public p1(zzakh zzakhVar, zzdh zzdhVar, zzajw zzajwVar, zzazk zzazkVar) {
        this.f11963d = zzakhVar;
        this.a = zzdhVar;
        this.f11961b = zzajwVar;
        this.f11962c = zzazkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaho
    public final /* synthetic */ void a(zzalf zzalfVar, Map map) {
        Object obj;
        int i2;
        obj = this.f11963d.a;
        synchronized (obj) {
            zzbad.h("JS Engine is requesting an update");
            i2 = this.f11963d.f12762h;
            if (i2 == 0) {
                zzbad.h("Starting reload.");
                this.f11963d.f12762h = 2;
                this.f11963d.c(this.a);
            }
            this.f11961b.i("/requestReload", (zzaho) this.f11962c.a());
        }
    }
}
