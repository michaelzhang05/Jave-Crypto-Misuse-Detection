package com.bumptech.glide.q;

import com.bumptech.glide.load.f;
import com.bumptech.glide.r.j;
import java.security.MessageDigest;

/* compiled from: ObjectKey.java */
/* loaded from: classes.dex */
public final class c implements f {

    /* renamed from: b, reason: collision with root package name */
    private final Object f8945b;

    public c(Object obj) {
        this.f8945b = j.d(obj);
    }

    @Override // com.bumptech.glide.load.f
    public boolean equals(Object obj) {
        if (obj instanceof c) {
            return this.f8945b.equals(((c) obj).f8945b);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.f
    public int hashCode() {
        return this.f8945b.hashCode();
    }

    public String toString() {
        return "ObjectKey{object=" + this.f8945b + '}';
    }

    @Override // com.bumptech.glide.load.f
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        messageDigest.update(this.f8945b.toString().getBytes(f.a));
    }
}
