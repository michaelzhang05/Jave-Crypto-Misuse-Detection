package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzar {
    private final int a;

    /* renamed from: b, reason: collision with root package name */
    private final List<zzl> f12908b;

    /* renamed from: c, reason: collision with root package name */
    private final int f12909c;

    /* renamed from: d, reason: collision with root package name */
    private final InputStream f12910d;

    public zzar(int i2, List<zzl> list) {
        this(i2, list, -1, null);
    }

    public final InputStream a() {
        return this.f12910d;
    }

    public final int b() {
        return this.f12909c;
    }

    public final int c() {
        return this.a;
    }

    public final List<zzl> d() {
        return Collections.unmodifiableList(this.f12908b);
    }

    public zzar(int i2, List<zzl> list, int i3, InputStream inputStream) {
        this.a = i2;
        this.f12908b = list;
        this.f12909c = i3;
        this.f12910d = inputStream;
    }
}
