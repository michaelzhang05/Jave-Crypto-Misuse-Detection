package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zzra {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    private final zzlh[] f15462b;

    /* renamed from: c, reason: collision with root package name */
    private int f15463c;

    public zzra(zzlh... zzlhVarArr) {
        zzsk.e(zzlhVarArr.length > 0);
        this.f15462b = zzlhVarArr;
        this.a = zzlhVarArr.length;
    }

    public final zzlh a(int i2) {
        return this.f15462b[i2];
    }

    public final int b(zzlh zzlhVar) {
        int i2 = 0;
        while (true) {
            zzlh[] zzlhVarArr = this.f15462b;
            if (i2 >= zzlhVarArr.length) {
                return -1;
            }
            if (zzlhVar == zzlhVarArr[i2]) {
                return i2;
            }
            i2++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzra.class == obj.getClass()) {
            zzra zzraVar = (zzra) obj;
            if (this.a == zzraVar.a && Arrays.equals(this.f15462b, zzraVar.f15462b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f15463c == 0) {
            this.f15463c = Arrays.hashCode(this.f15462b) + 527;
        }
        return this.f15463c;
    }
}
