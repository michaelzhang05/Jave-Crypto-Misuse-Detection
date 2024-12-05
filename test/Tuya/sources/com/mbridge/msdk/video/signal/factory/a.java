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
    protected com.mbridge.msdk.video.signal.b f22932a;

    /* renamed from: b, reason: collision with root package name */
    protected d f22933b;

    /* renamed from: c, reason: collision with root package name */
    protected j f22934c;

    /* renamed from: d, reason: collision with root package name */
    protected g f22935d;

    /* renamed from: e, reason: collision with root package name */
    protected f f22936e;

    /* renamed from: f, reason: collision with root package name */
    protected i f22937f;

    /* renamed from: g, reason: collision with root package name */
    protected c f22938g;

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public com.mbridge.msdk.video.signal.b getActivityProxy() {
        if (this.f22932a == null) {
            this.f22932a = new com.mbridge.msdk.video.signal.a.b();
        }
        return this.f22932a;
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public i getIJSRewardVideoV1() {
        if (this.f22937f == null) {
            this.f22937f = new com.mbridge.msdk.video.signal.a.g();
        }
        return this.f22937f;
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public c getJSBTModule() {
        if (this.f22938g == null) {
            this.f22938g = new com.mbridge.msdk.video.signal.a.c();
        }
        return this.f22938g;
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public d getJSCommon() {
        if (this.f22933b == null) {
            this.f22933b = new com.mbridge.msdk.video.signal.a.d();
        }
        return this.f22933b;
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public f getJSContainerModule() {
        if (this.f22936e == null) {
            this.f22936e = new e();
        }
        return this.f22936e;
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public g getJSNotifyProxy() {
        if (this.f22935d == null) {
            this.f22935d = new com.mbridge.msdk.video.signal.a.f();
        }
        return this.f22935d;
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public j getJSVideoModule() {
        if (this.f22934c == null) {
            this.f22934c = new h();
        }
        return this.f22934c;
    }
}
