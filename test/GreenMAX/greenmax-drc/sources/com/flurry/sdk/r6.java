package com.flurry.sdk;

import android.os.SystemClock;
import okhttp3.HttpUrl;
import org.json.JSONException;

/* loaded from: classes2.dex */
public abstract class r6 implements u6 {

    /* renamed from: c, reason: collision with root package name */
    private t6 f10146c;
    private long a = System.currentTimeMillis();

    /* renamed from: b, reason: collision with root package name */
    private long f10145b = SystemClock.elapsedRealtime();

    /* renamed from: d, reason: collision with root package name */
    private boolean f10147d = true;

    public r6(t6 t6Var) {
        this.f10146c = t6Var;
    }

    @Override // com.flurry.sdk.u6
    public final long b() {
        return this.f10145b;
    }

    @Override // com.flurry.sdk.u6
    public final long c() {
        return this.a;
    }

    @Override // com.flurry.sdk.u6
    public final String d() {
        try {
            return this.f10146c.a().toString();
        } catch (JSONException e2) {
            e2.printStackTrace();
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
    }

    @Override // com.flurry.sdk.u6
    public final byte e() {
        return (byte) ((!this.f10147d ? 1 : 0) | 128);
    }

    @Override // com.flurry.sdk.u6
    public final t6 f() {
        return this.f10146c;
    }

    @Override // com.flurry.sdk.u6
    public final boolean g() {
        return this.f10147d;
    }
}
