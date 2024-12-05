package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.v3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2119v3 extends AbstractC2135x3 {

    /* renamed from: d, reason: collision with root package name */
    final transient int f15934d;

    /* renamed from: e, reason: collision with root package name */
    final transient int f15935e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ AbstractC2135x3 f15936f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2119v3(AbstractC2135x3 abstractC2135x3, int i8, int i9) {
        this.f15936f = abstractC2135x3;
        this.f15934d = i8;
        this.f15935e = i9;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2095s3
    final int d() {
        return this.f15936f.g() + this.f15934d + this.f15935e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC2095s3
    public final int g() {
        return this.f15936f.g() + this.f15934d;
    }

    @Override // java.util.List
    public final Object get(int i8) {
        AbstractC1990f3.a(i8, this.f15935e, "index");
        return this.f15936f.get(i8 + this.f15934d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC2095s3
    public final Object[] h() {
        return this.f15936f.h();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2135x3
    /* renamed from: l */
    public final AbstractC2135x3 subList(int i8, int i9) {
        AbstractC1990f3.c(i8, i9, this.f15935e);
        AbstractC2135x3 abstractC2135x3 = this.f15936f;
        int i10 = this.f15934d;
        return abstractC2135x3.subList(i8 + i10, i9 + i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f15935e;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2135x3, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i8, int i9) {
        return subList(i8, i9);
    }
}
