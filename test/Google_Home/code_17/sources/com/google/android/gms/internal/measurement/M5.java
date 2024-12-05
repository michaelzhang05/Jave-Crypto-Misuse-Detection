package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
final class M5 implements Y5 {

    /* renamed from: a, reason: collision with root package name */
    private final I5 f16225a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC2234r6 f16226b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f16227c;

    /* renamed from: d, reason: collision with root package name */
    private final Q4 f16228d;

    private M5(AbstractC2234r6 abstractC2234r6, Q4 q42, I5 i52) {
        this.f16226b = abstractC2234r6;
        this.f16227c = q42.d(i52);
        this.f16228d = q42;
        this.f16225a = i52;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static M5 i(AbstractC2234r6 abstractC2234r6, Q4 q42, I5 i52) {
        return new M5(abstractC2234r6, q42, i52);
    }

    @Override // com.google.android.gms.internal.measurement.Y5
    public final int a(Object obj) {
        AbstractC2234r6 abstractC2234r6 = this.f16226b;
        int e8 = abstractC2234r6.e(abstractC2234r6.k(obj));
        if (this.f16227c) {
            return e8 + this.f16228d.b(obj).a();
        }
        return e8;
    }

    @Override // com.google.android.gms.internal.measurement.Y5
    public final boolean b(Object obj) {
        return this.f16228d.b(obj).n();
    }

    @Override // com.google.android.gms.internal.measurement.Y5
    public final void c(Object obj) {
        this.f16226b.l(obj);
        this.f16228d.f(obj);
    }

    @Override // com.google.android.gms.internal.measurement.Y5
    public final int d(Object obj) {
        int hashCode = this.f16226b.k(obj).hashCode();
        if (this.f16227c) {
            return (hashCode * 53) + this.f16228d.b(obj).hashCode();
        }
        return hashCode;
    }

    @Override // com.google.android.gms.internal.measurement.Y5
    public final void e(Object obj, Object obj2) {
        AbstractC2072a6.n(this.f16226b, obj, obj2);
        if (this.f16227c) {
            AbstractC2072a6.l(this.f16228d, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.Y5
    public final void f(Object obj, byte[] bArr, int i8, int i9, C2197n4 c2197n4) {
        AbstractC2091c5 abstractC2091c5 = (AbstractC2091c5) obj;
        if (abstractC2091c5.zzb == C2226q6.k()) {
            abstractC2091c5.zzb = C2226q6.l();
        }
        android.support.v4.media.a.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.Y5
    public final void g(Object obj, N6 n62) {
        Iterator l8 = this.f16228d.b(obj).l();
        if (!l8.hasNext()) {
            AbstractC2234r6 abstractC2234r6 = this.f16226b;
            abstractC2234r6.d(abstractC2234r6.k(obj), n62);
        } else {
            android.support.v4.media.a.a(((Map.Entry) l8.next()).getKey());
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.measurement.Y5
    public final boolean h(Object obj, Object obj2) {
        if (!this.f16226b.k(obj).equals(this.f16226b.k(obj2))) {
            return false;
        }
        if (this.f16227c) {
            return this.f16228d.b(obj).equals(this.f16228d.b(obj2));
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.Y5
    public final Object w() {
        I5 i52 = this.f16225a;
        if (i52 instanceof AbstractC2091c5) {
            return ((AbstractC2091c5) i52).z();
        }
        return i52.c().u();
    }
}
