package com.google.android.gms.common.data;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;

@KeepForSdk
/* loaded from: classes2.dex */
public class DataBufferRef {

    @KeepForSdk
    protected final DataHolder a;

    /* renamed from: b, reason: collision with root package name */
    @KeepForSdk
    protected int f10778b;

    /* renamed from: c, reason: collision with root package name */
    private int f10779c;

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(int i2) {
        Preconditions.l(i2 >= 0 && i2 < this.a.getCount());
        this.f10778b = i2;
        this.f10779c = this.a.L(i2);
    }

    public boolean equals(Object obj) {
        if (obj instanceof DataBufferRef) {
            DataBufferRef dataBufferRef = (DataBufferRef) obj;
            if (Objects.a(Integer.valueOf(dataBufferRef.f10778b), Integer.valueOf(this.f10778b)) && Objects.a(Integer.valueOf(dataBufferRef.f10779c), Integer.valueOf(this.f10779c)) && dataBufferRef.a == this.a) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.b(Integer.valueOf(this.f10778b), Integer.valueOf(this.f10779c), this.a);
    }
}
