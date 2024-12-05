package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
final class x1<T> implements e2<T> {
    private final zzvv a;

    /* renamed from: b, reason: collision with root package name */
    private final v2<?, ?> f16050b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f16051c;

    /* renamed from: d, reason: collision with root package name */
    private final v0<?> f16052d;

    private x1(v2<?, ?> v2Var, v0<?> v0Var, zzvv zzvvVar) {
        this.f16050b = v2Var;
        this.f16051c = v0Var.c(zzvvVar);
        this.f16052d = v0Var;
        this.a = zzvvVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> x1<T> h(v2<?, ?> v2Var, v0<?> v0Var, zzvv zzvvVar) {
        return new x1<>(v2Var, v0Var, zzvvVar);
    }

    @Override // com.google.android.gms.internal.measurement.e2
    public final void a(T t, T t2) {
        g2.f(this.f16050b, t, t2);
        if (this.f16051c) {
            g2.d(this.f16052d, t, t2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.e2
    public final boolean b(T t, T t2) {
        if (!this.f16050b.c(t).equals(this.f16050b.c(t2))) {
            return false;
        }
        if (this.f16051c) {
            return this.f16052d.d(t).equals(this.f16052d.d(t2));
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.e2
    public final int c(T t) {
        int hashCode = this.f16050b.c(t).hashCode();
        return this.f16051c ? (hashCode * 53) + this.f16052d.d(t).hashCode() : hashCode;
    }

    @Override // com.google.android.gms.internal.measurement.e2
    public final int d(T t) {
        v2<?, ?> v2Var = this.f16050b;
        int d2 = v2Var.d(v2Var.c(t)) + 0;
        return this.f16051c ? d2 + this.f16052d.d(t).s() : d2;
    }

    @Override // com.google.android.gms.internal.measurement.e2
    public final void e(T t, l3 l3Var) throws IOException {
        Iterator<Map.Entry<?, Object>> e2 = this.f16052d.d(t).e();
        while (e2.hasNext()) {
            Map.Entry<?, Object> next = e2.next();
            zzuh zzuhVar = (zzuh) next.getKey();
            if (zzuhVar.z() == zzxx.MESSAGE && !zzuhVar.v() && !zzuhVar.s()) {
                if (next instanceof f1) {
                    l3Var.c(zzuhVar.g(), ((f1) next).a().c());
                } else {
                    l3Var.c(zzuhVar.g(), next.getValue());
                }
            } else {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
        }
        v2<?, ?> v2Var = this.f16050b;
        v2Var.e(v2Var.c(t), l3Var);
    }

    @Override // com.google.android.gms.internal.measurement.e2
    public final boolean f(T t) {
        return this.f16052d.d(t).d();
    }

    @Override // com.google.android.gms.internal.measurement.e2
    public final void g(T t) {
        this.f16050b.h(t);
        this.f16052d.f(t);
    }
}
