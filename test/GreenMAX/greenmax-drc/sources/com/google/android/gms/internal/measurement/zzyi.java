package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* loaded from: classes2.dex */
public abstract class zzyi {
    protected volatile int a = -1;

    public void a(zzya zzyaVar) throws IOException {
    }

    protected int b() {
        return 0;
    }

    public final int c() {
        int b2 = b();
        this.a = b2;
        return b2;
    }

    @Override // 
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public zzyi clone() throws CloneNotSupportedException {
        return (zzyi) super.clone();
    }

    public final int e() {
        if (this.a < 0) {
            c();
        }
        return this.a;
    }

    public String toString() {
        return zzyj.b(this);
    }
}
