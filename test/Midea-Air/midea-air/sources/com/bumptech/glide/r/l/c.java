package com.bumptech.glide.r.l;

/* compiled from: StateVerifier.java */
/* loaded from: classes.dex */
public abstract class c {

    /* compiled from: StateVerifier.java */
    /* loaded from: classes.dex */
    private static class b extends c {
        private volatile boolean a;

        b() {
            super();
        }

        @Override // com.bumptech.glide.r.l.c
        public void b(boolean z) {
            this.a = z;
        }

        @Override // com.bumptech.glide.r.l.c
        public void c() {
            if (this.a) {
                throw new IllegalStateException("Already released");
            }
        }
    }

    public static c a() {
        return new b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void b(boolean z);

    public abstract void c();

    private c() {
    }
}
