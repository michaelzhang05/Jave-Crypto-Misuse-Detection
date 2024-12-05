package com.bumptech.glide.load.n;

import java.util.Queue;

/* compiled from: ModelCache.java */
/* loaded from: classes.dex */
public class m<A, B> {
    private final com.bumptech.glide.r.g<b<A>, B> a;

    /* compiled from: ModelCache.java */
    /* loaded from: classes.dex */
    class a extends com.bumptech.glide.r.g<b<A>, B> {
        a(long j2) {
            super(j2);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.bumptech.glide.r.g
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public void j(b<A> bVar, B b2) {
            bVar.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ModelCache.java */
    /* loaded from: classes.dex */
    public static final class b<A> {
        private static final Queue<b<?>> a = com.bumptech.glide.r.k.f(0);

        /* renamed from: b, reason: collision with root package name */
        private int f8729b;

        /* renamed from: c, reason: collision with root package name */
        private int f8730c;

        /* renamed from: d, reason: collision with root package name */
        private A f8731d;

        private b() {
        }

        static <A> b<A> a(A a2, int i2, int i3) {
            b<A> bVar;
            Queue<b<?>> queue = a;
            synchronized (queue) {
                bVar = (b) queue.poll();
            }
            if (bVar == null) {
                bVar = new b<>();
            }
            bVar.b(a2, i2, i3);
            return bVar;
        }

        private void b(A a2, int i2, int i3) {
            this.f8731d = a2;
            this.f8730c = i2;
            this.f8729b = i3;
        }

        public void c() {
            Queue<b<?>> queue = a;
            synchronized (queue) {
                queue.offer(this);
            }
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f8730c == bVar.f8730c && this.f8729b == bVar.f8729b && this.f8731d.equals(bVar.f8731d);
        }

        public int hashCode() {
            return (((this.f8729b * 31) + this.f8730c) * 31) + this.f8731d.hashCode();
        }
    }

    public m(long j2) {
        this.a = new a(j2);
    }

    public B a(A a2, int i2, int i3) {
        b<A> a3 = b.a(a2, i2, i3);
        B g2 = this.a.g(a3);
        a3.c();
        return g2;
    }

    public void b(A a2, int i2, int i3, B b2) {
        this.a.k(b.a(a2, i2, i3), b2);
    }
}
