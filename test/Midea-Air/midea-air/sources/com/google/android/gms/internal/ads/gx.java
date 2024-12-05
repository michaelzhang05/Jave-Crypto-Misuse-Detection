package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* loaded from: classes2.dex */
final class gx implements Iterator<String> {

    /* renamed from: f, reason: collision with root package name */
    private Iterator<String> f11495f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ zzdqw f11496g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public gx(zzdqw zzdqwVar) {
        zzdot zzdotVar;
        this.f11496g = zzdqwVar;
        zzdotVar = zzdqwVar.f14880f;
        this.f11495f = zzdotVar.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f11495f.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ String next() {
        return this.f11495f.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
