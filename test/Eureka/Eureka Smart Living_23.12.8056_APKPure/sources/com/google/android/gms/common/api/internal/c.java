package com.google.android.gms.common.api.internal;

import t1.a;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    private final s1.c[] f4583a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f4584b;

    /* renamed from: c, reason: collision with root package name */
    private final int f4585c;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private u1.i f4586a;

        /* renamed from: c, reason: collision with root package name */
        private s1.c[] f4588c;

        /* renamed from: b, reason: collision with root package name */
        private boolean f4587b = true;

        /* renamed from: d, reason: collision with root package name */
        private int f4589d = 0;

        /* synthetic */ a(u1.w wVar) {
        }

        public c a() {
            v1.n.b(this.f4586a != null, "execute parameter required");
            return new r(this, this.f4588c, this.f4587b, this.f4589d);
        }

        public a b(u1.i iVar) {
            this.f4586a = iVar;
            return this;
        }

        public a c(boolean z5) {
            this.f4587b = z5;
            return this;
        }

        public a d(s1.c... cVarArr) {
            this.f4588c = cVarArr;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public c(s1.c[] cVarArr, boolean z5, int i6) {
        this.f4583a = cVarArr;
        boolean z6 = false;
        if (cVarArr != null && z5) {
            z6 = true;
        }
        this.f4584b = z6;
        this.f4585c = i6;
    }

    public static a a() {
        return new a(null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void b(a.b bVar, l2.j jVar);

    public boolean c() {
        return this.f4584b;
    }

    public final int d() {
        return this.f4585c;
    }

    public final s1.c[] e() {
        return this.f4583a;
    }
}
