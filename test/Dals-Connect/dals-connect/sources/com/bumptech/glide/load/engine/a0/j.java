package com.bumptech.glide.load.engine.a0;

import com.bumptech.glide.r.k;
import com.bumptech.glide.r.l.a;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: SafeKeyGenerator.java */
/* loaded from: classes.dex */
public class j {
    private final com.bumptech.glide.r.g<com.bumptech.glide.load.f, String> a = new com.bumptech.glide.r.g<>(1000);

    /* renamed from: b, reason: collision with root package name */
    private final c.h.j.g<b> f8483b = com.bumptech.glide.r.l.a.d(10, new a());

    /* compiled from: SafeKeyGenerator.java */
    /* loaded from: classes.dex */
    class a implements a.d<b> {
        a() {
        }

        @Override // com.bumptech.glide.r.l.a.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b a() {
            try {
                return new b(MessageDigest.getInstance("SHA-256"));
            } catch (NoSuchAlgorithmException e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SafeKeyGenerator.java */
    /* loaded from: classes.dex */
    public static final class b implements a.f {

        /* renamed from: f, reason: collision with root package name */
        final MessageDigest f8484f;

        /* renamed from: g, reason: collision with root package name */
        private final com.bumptech.glide.r.l.c f8485g = com.bumptech.glide.r.l.c.a();

        b(MessageDigest messageDigest) {
            this.f8484f = messageDigest;
        }

        @Override // com.bumptech.glide.r.l.a.f
        public com.bumptech.glide.r.l.c n() {
            return this.f8485g;
        }
    }

    private String a(com.bumptech.glide.load.f fVar) {
        b bVar = (b) com.bumptech.glide.r.j.d(this.f8483b.b());
        try {
            fVar.updateDiskCacheKey(bVar.f8484f);
            return k.u(bVar.f8484f.digest());
        } finally {
            this.f8483b.a(bVar);
        }
    }

    public String b(com.bumptech.glide.load.f fVar) {
        String g2;
        synchronized (this.a) {
            g2 = this.a.g(fVar);
        }
        if (g2 == null) {
            g2 = a(fVar);
        }
        synchronized (this.a) {
            this.a.k(fVar, g2);
        }
        return g2;
    }
}
