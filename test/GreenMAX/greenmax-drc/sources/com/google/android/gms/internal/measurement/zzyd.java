package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzyc;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class zzyd<M extends zzyc<M>, T> {
    private final int a;

    /* renamed from: b, reason: collision with root package name */
    protected final Class<T> f16176b;

    /* renamed from: c, reason: collision with root package name */
    public final int f16177c;

    /* renamed from: d, reason: collision with root package name */
    protected final boolean f16178d;

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(Object obj, zzya zzyaVar) {
        try {
            zzyaVar.g(this.f16177c);
            int i2 = this.a;
            if (i2 == 10) {
                int i3 = this.f16177c >>> 3;
                ((zzyi) obj).a(zzyaVar);
                zzyaVar.e(i3, 4);
            } else {
                if (i2 == 11) {
                    zzyaVar.b((zzyi) obj);
                    return;
                }
                int i4 = this.a;
                StringBuilder sb = new StringBuilder(24);
                sb.append("Unknown type ");
                sb.append(i4);
                throw new IllegalArgumentException(sb.toString());
            }
        } catch (IOException e2) {
            throw new IllegalStateException(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int b(Object obj) {
        int i2 = this.f16177c >>> 3;
        int i3 = this.a;
        if (i3 == 10) {
            return (zzya.c(i2) << 1) + ((zzyi) obj).c();
        }
        if (i3 == 11) {
            return zzya.a(i2, (zzyi) obj);
        }
        int i4 = this.a;
        StringBuilder sb = new StringBuilder(24);
        sb.append("Unknown type ");
        sb.append(i4);
        throw new IllegalArgumentException(sb.toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzyd)) {
            return false;
        }
        zzyd zzydVar = (zzyd) obj;
        return this.a == zzydVar.a && this.f16176b == zzydVar.f16176b && this.f16177c == zzydVar.f16177c && this.f16178d == zzydVar.f16178d;
    }

    public final int hashCode() {
        return ((((((this.a + 1147) * 31) + this.f16176b.hashCode()) * 31) + this.f16177c) * 31) + (this.f16178d ? 1 : 0);
    }
}
