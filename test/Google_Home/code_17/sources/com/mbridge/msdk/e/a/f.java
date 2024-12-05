package com.mbridge.msdk.e.a;

import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;

/* loaded from: classes4.dex */
public final class f implements v {

    /* renamed from: a, reason: collision with root package name */
    private int f19851a;

    /* renamed from: b, reason: collision with root package name */
    private int f19852b;

    /* renamed from: c, reason: collision with root package name */
    private final int f19853c;

    /* renamed from: d, reason: collision with root package name */
    private final float f19854d;

    public f() {
        this(DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_MS, 1, 1.0f);
    }

    @Override // com.mbridge.msdk.e.a.v
    public final int a() {
        return this.f19851a;
    }

    @Override // com.mbridge.msdk.e.a.v
    public final int b() {
        return this.f19852b;
    }

    public f(int i8, int i9, float f8) {
        this.f19851a = i8;
        this.f19853c = i9;
        this.f19854d = f8;
    }

    @Override // com.mbridge.msdk.e.a.v
    public final void a(z zVar) throws z {
        int i8 = this.f19852b + 1;
        this.f19852b = i8;
        int i9 = this.f19851a;
        this.f19851a = i9 + ((int) (i9 * this.f19854d));
        if (i8 > this.f19853c) {
            throw zVar;
        }
    }
}
