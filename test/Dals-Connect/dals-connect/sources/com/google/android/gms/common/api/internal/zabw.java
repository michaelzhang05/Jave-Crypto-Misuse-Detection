package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Api;

/* loaded from: classes2.dex */
public final class zabw {
    public final RegisterListenerMethod<Api.AnyClient, ?> a;

    /* renamed from: b, reason: collision with root package name */
    public final UnregisterListenerMethod<Api.AnyClient, ?> f10705b;

    public zabw(RegisterListenerMethod<Api.AnyClient, ?> registerListenerMethod, UnregisterListenerMethod<Api.AnyClient, ?> unregisterListenerMethod) {
        this.a = registerListenerMethod;
        this.f10705b = unregisterListenerMethod;
    }
}
