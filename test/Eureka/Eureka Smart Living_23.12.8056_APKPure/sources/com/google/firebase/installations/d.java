package com.google.firebase.installations;

import w3.k;

/* loaded from: classes.dex */
public class d extends k {

    /* renamed from: a, reason: collision with root package name */
    private final a f5794a;

    /* loaded from: classes.dex */
    public enum a {
        BAD_CONFIG,
        UNAVAILABLE,
        TOO_MANY_REQUESTS
    }

    public d(a aVar) {
        this.f5794a = aVar;
    }

    public d(String str, a aVar) {
        super(str);
        this.f5794a = aVar;
    }
}
