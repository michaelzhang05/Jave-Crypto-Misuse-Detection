package com.google.firebase.installations;

import y0.l;

/* loaded from: classes3.dex */
public class d extends l {

    /* renamed from: a, reason: collision with root package name */
    private final a f17281a;

    /* loaded from: classes3.dex */
    public enum a {
        BAD_CONFIG,
        UNAVAILABLE,
        TOO_MANY_REQUESTS
    }

    public d(a aVar) {
        this.f17281a = aVar;
    }

    public d(String str, a aVar) {
        super(str);
        this.f17281a = aVar;
    }
}
