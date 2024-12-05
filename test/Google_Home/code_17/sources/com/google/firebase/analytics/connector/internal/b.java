package com.google.firebase.analytics.connector.internal;

import B0.a;
import java.util.HashSet;
import java.util.Set;
import k0.C3210a;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    Set f18219a;

    /* renamed from: b, reason: collision with root package name */
    private a.b f18220b;

    /* renamed from: c, reason: collision with root package name */
    private C3210a f18221c;

    /* renamed from: d, reason: collision with root package name */
    private e f18222d;

    public b(C3210a c3210a, a.b bVar) {
        this.f18220b = bVar;
        this.f18221c = c3210a;
        e eVar = new e(this);
        this.f18222d = eVar;
        this.f18221c.b(eVar);
        this.f18219a = new HashSet();
    }
}
