package com.mbridge.msdk.e.a;

import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;

/* loaded from: classes4.dex */
public final class f implements v {

    /* renamed from: a, reason: collision with root package name */
    private int f18796a;

    /* renamed from: b, reason: collision with root package name */
    private int f18797b;

    /* renamed from: c, reason: collision with root package name */
    private final int f18798c;

    /* renamed from: d, reason: collision with root package name */
    private final float f18799d;

    public f() {
        this(DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_MS, 1, 1.0f);
    }

    @Override // com.mbridge.msdk.e.a.v
    public final int a() {
        return this.f18796a;
    }

    @Override // com.mbridge.msdk.e.a.v
    public final int b() {
        return this.f18797b;
    }

    public f(int i8, int i9, float f8) {
        this.f18796a = i8;
        this.f18798c = i9;
        this.f18799d = f8;
    }

    @Override // com.mbridge.msdk.e.a.v
    public final void a(z zVar) throws z {
        int i8 = this.f18797b + 1;
        this.f18797b = i8;
        int i9 = this.f18796a;
        this.f18796a = i9 + ((int) (i9 * this.f18799d));
        if (i8 > this.f18798c) {
            throw zVar;
        }
    }
}
