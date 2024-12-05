package com.google.android.gms.common.api.internal;

import O.C1260d;
import P.a;
import R.AbstractC1319p;
import r0.C3679j;

/* renamed from: com.google.android.gms.common.api.internal.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1940d {

    /* renamed from: a, reason: collision with root package name */
    private final C1260d[] f15147a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f15148b;

    /* renamed from: c, reason: collision with root package name */
    private final int f15149c;

    /* renamed from: com.google.android.gms.common.api.internal.d$a */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private Q.i f15150a;

        /* renamed from: c, reason: collision with root package name */
        private C1260d[] f15152c;

        /* renamed from: b, reason: collision with root package name */
        private boolean f15151b = true;

        /* renamed from: d, reason: collision with root package name */
        private int f15153d = 0;

        /* synthetic */ a(Q.z zVar) {
        }

        public AbstractC1940d a() {
            boolean z8;
            if (this.f15150a != null) {
                z8 = true;
            } else {
                z8 = false;
            }
            AbstractC1319p.b(z8, "execute parameter required");
            return new t(this, this.f15152c, this.f15151b, this.f15153d);
        }

        public a b(Q.i iVar) {
            this.f15150a = iVar;
            return this;
        }

        public a c(boolean z8) {
            this.f15151b = z8;
            return this;
        }

        public a d(C1260d... c1260dArr) {
            this.f15152c = c1260dArr;
            return this;
        }

        public a e(int i8) {
            this.f15153d = i8;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC1940d(C1260d[] c1260dArr, boolean z8, int i8) {
        this.f15147a = c1260dArr;
        boolean z9 = false;
        if (c1260dArr != null && z8) {
            z9 = true;
        }
        this.f15148b = z9;
        this.f15149c = i8;
    }

    public static a a() {
        return new a(null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void b(a.b bVar, C3679j c3679j);

    public boolean c() {
        return this.f15148b;
    }

    public final int d() {
        return this.f15149c;
    }

    public final C1260d[] e() {
        return this.f15147a;
    }
}
