package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class o1 implements zzaho<zzalf> {
    private final /* synthetic */ zzala a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ zzajw f11909b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ zzakh f11910c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public o1(zzakh zzakhVar, zzala zzalaVar, zzajw zzajwVar) {
        this.f11910c = zzakhVar;
        this.a = zzalaVar;
        this.f11909b = zzajwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaho
    public final /* synthetic */ void a(zzalf zzalfVar, Map map) {
        Object obj;
        zzayp zzaypVar;
        obj = this.f11910c.a;
        synchronized (obj) {
            if (this.a.a() != -1 && this.a.a() != 1) {
                this.f11910c.f12762h = 0;
                zzaypVar = this.f11910c.f12759e;
                zzaypVar.a(this.f11909b);
                this.a.e(this.f11909b);
                this.f11910c.f12761g = this.a;
                zzawz.m("Successfully loaded JS Engine.");
            }
        }
    }
}
