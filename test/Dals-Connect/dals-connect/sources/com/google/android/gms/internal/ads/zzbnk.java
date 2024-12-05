package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Set;

/* loaded from: classes2.dex */
public class zzbnk {
    private final zzbpb a;

    /* renamed from: b, reason: collision with root package name */
    private final View f13414b;

    /* renamed from: c, reason: collision with root package name */
    private final zzcxn f13415c;

    /* renamed from: d, reason: collision with root package name */
    private final zzbgz f13416d;

    public zzbnk(View view, zzbgz zzbgzVar, zzbpb zzbpbVar, zzcxn zzcxnVar) {
        this.f13414b = view;
        this.f13416d = zzbgzVar;
        this.a = zzbpbVar;
        this.f13415c = zzcxnVar;
    }

    public zzbso a(Set<zzbuz<zzbsr>> set) {
        return new zzbso(set);
    }

    public final View b() {
        return this.f13414b;
    }

    public final zzbgz c() {
        return this.f13416d;
    }

    public final zzbpb d() {
        return this.a;
    }

    public final zzcxn e() {
        return this.f13415c;
    }
}
