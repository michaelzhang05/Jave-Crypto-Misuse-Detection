package com.google.android.gms.common.api.internal;

import N.C1333d;
import O.a;
import Q.AbstractC1400p;
import q0.C3826j;

/* renamed from: com.google.android.gms.common.api.internal.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2064d {

    /* renamed from: a, reason: collision with root package name */
    private final C1333d[] f15948a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f15949b;

    /* renamed from: c, reason: collision with root package name */
    private final int f15950c;

    /* renamed from: com.google.android.gms.common.api.internal.d$a */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private P.i f15951a;

        /* renamed from: c, reason: collision with root package name */
        private C1333d[] f15953c;

        /* renamed from: b, reason: collision with root package name */
        private boolean f15952b = true;

        /* renamed from: d, reason: collision with root package name */
        private int f15954d = 0;

        /* synthetic */ a(P.z zVar) {
        }

        public AbstractC2064d a() {
            boolean z8;
            if (this.f15951a != null) {
                z8 = true;
            } else {
                z8 = false;
            }
            AbstractC1400p.b(z8, "execute parameter required");
            return new t(this, this.f15953c, this.f15952b, this.f15954d);
        }

        public a b(P.i iVar) {
            this.f15951a = iVar;
            return this;
        }

        public a c(boolean z8) {
            this.f15952b = z8;
            return this;
        }

        public a d(C1333d... c1333dArr) {
            this.f15953c = c1333dArr;
            return this;
        }

        public a e(int i8) {
            this.f15954d = i8;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC2064d(C1333d[] c1333dArr, boolean z8, int i8) {
        this.f15948a = c1333dArr;
        boolean z9 = false;
        if (c1333dArr != null && z8) {
            z9 = true;
        }
        this.f15949b = z9;
        this.f15950c = i8;
    }

    public static a a() {
        return new a(null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void b(a.b bVar, C3826j c3826j);

    public boolean c() {
        return this.f15949b;
    }

    public final int d() {
        return this.f15950c;
    }

    public final C1333d[] e() {
        return this.f15948a;
    }
}
