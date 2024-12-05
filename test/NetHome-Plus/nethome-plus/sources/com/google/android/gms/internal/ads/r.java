package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes2.dex */
public final class r<T> implements Callable<T> {

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ zzacj f12080f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ zzacr f12081g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r(zzacr zzacrVar, zzacj zzacjVar) {
        this.f12081g = zzacrVar;
        this.f12080f = zzacjVar;
    }

    @Override // java.util.concurrent.Callable
    public final T call() {
        SharedPreferences sharedPreferences;
        zzacj zzacjVar = this.f12080f;
        sharedPreferences = this.f12081g.f12620j;
        return (T) zzacjVar.h(sharedPreferences);
    }
}
