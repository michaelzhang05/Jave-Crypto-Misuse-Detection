package com.google.firebase.analytics.connector.internal;

import java.util.HashSet;
import java.util.Set;
import l0.C3162a;
import z0.InterfaceC4011a;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    final Set f17191a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4011a.b f17192b;

    /* renamed from: c, reason: collision with root package name */
    private final C3162a f17193c;

    /* renamed from: d, reason: collision with root package name */
    private final c f17194d;

    public d(C3162a c3162a, InterfaceC4011a.b bVar) {
        this.f17192b = bVar;
        this.f17193c = c3162a;
        c cVar = new c(this);
        this.f17194d = cVar;
        c3162a.b(cVar);
        this.f17191a = new HashSet();
    }
}
