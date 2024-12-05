package com.mbridge.msdk.video.signal.factory;

import com.mbridge.msdk.video.signal.a.e;
import com.mbridge.msdk.video.signal.a.h;
import com.mbridge.msdk.video.signal.c;
import com.mbridge.msdk.video.signal.d;
import com.mbridge.msdk.video.signal.f;
import com.mbridge.msdk.video.signal.g;
import com.mbridge.msdk.video.signal.i;
import com.mbridge.msdk.video.signal.j;

/* loaded from: classes4.dex */
public class a implements IJSFactory {

    /* renamed from: a, reason: collision with root package name */
    protected com.mbridge.msdk.video.signal.b f23987a;

    /* renamed from: b, reason: collision with root package name */
    protected d f23988b;

    /* renamed from: c, reason: collision with root package name */
    protected j f23989c;

    /* renamed from: d, reason: collision with root package name */
    protected g f23990d;

    /* renamed from: e, reason: collision with root package name */
    protected f f23991e;

    /* renamed from: f, reason: collision with root package name */
    protected i f23992f;

    /* renamed from: g, reason: collision with root package name */
    protected c f23993g;

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public com.mbridge.msdk.video.signal.b getActivityProxy() {
        if (this.f23987a == null) {
            this.f23987a = new com.mbridge.msdk.video.signal.a.b();
        }
        return this.f23987a;
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public i getIJSRewardVideoV1() {
        if (this.f23992f == null) {
            this.f23992f = new com.mbridge.msdk.video.signal.a.g();
        }
        return this.f23992f;
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public c getJSBTModule() {
        if (this.f23993g == null) {
            this.f23993g = new com.mbridge.msdk.video.signal.a.c();
        }
        return this.f23993g;
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public d getJSCommon() {
        if (this.f23988b == null) {
            this.f23988b = new com.mbridge.msdk.video.signal.a.d();
        }
        return this.f23988b;
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public f getJSContainerModule() {
        if (this.f23991e == null) {
            this.f23991e = new e();
        }
        return this.f23991e;
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public g getJSNotifyProxy() {
        if (this.f23990d == null) {
            this.f23990d = new com.mbridge.msdk.video.signal.a.f();
        }
        return this.f23990d;
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public j getJSVideoModule() {
        if (this.f23989c == null) {
            this.f23989c = new h();
        }
        return this.f23989c;
    }
}
