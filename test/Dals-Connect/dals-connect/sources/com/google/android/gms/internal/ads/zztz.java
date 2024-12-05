package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;
import java.util.WeakHashMap;

@zzard
/* loaded from: classes2.dex */
public final class zztz {
    private final Object a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final WeakHashMap<Object, Object> f15604b = new WeakHashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private final ArrayList<Object> f15605c = new ArrayList<>();

    /* renamed from: d, reason: collision with root package name */
    private final Context f15606d;

    /* renamed from: e, reason: collision with root package name */
    private final zzbai f15607e;

    /* renamed from: f, reason: collision with root package name */
    private final zzakh f15608f;

    public zztz(Context context, zzbai zzbaiVar) {
        this.f15606d = context.getApplicationContext();
        this.f15607e = zzbaiVar;
        this.f15608f = new zzakh(context.getApplicationContext(), zzbaiVar, (String) zzyt.e().c(zzacu.f12624d));
    }
}
