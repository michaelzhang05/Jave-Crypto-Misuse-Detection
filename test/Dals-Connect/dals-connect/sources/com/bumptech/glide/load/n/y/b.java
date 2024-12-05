package com.bumptech.glide.load.n.y;

import android.net.Uri;
import cm.aptoide.pt.dataprovider.BuildConfig;
import com.bumptech.glide.load.i;
import com.bumptech.glide.load.n.g;
import com.bumptech.glide.load.n.n;
import com.bumptech.glide.load.n.o;
import com.bumptech.glide.load.n.r;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: HttpUriLoader.java */
/* loaded from: classes.dex */
public class b implements n<Uri, InputStream> {
    private static final Set<String> a = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", BuildConfig.APTOIDE_WEB_SERVICES_SCHEME)));

    /* renamed from: b, reason: collision with root package name */
    private final n<g, InputStream> f8754b;

    /* compiled from: HttpUriLoader.java */
    /* loaded from: classes.dex */
    public static class a implements o<Uri, InputStream> {
        @Override // com.bumptech.glide.load.n.o
        public n<Uri, InputStream> b(r rVar) {
            return new b(rVar.d(g.class, InputStream.class));
        }
    }

    public b(n<g, InputStream> nVar) {
        this.f8754b = nVar;
    }

    @Override // com.bumptech.glide.load.n.n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a<InputStream> b(Uri uri, int i2, int i3, i iVar) {
        return this.f8754b.b(new g(uri.toString()), i2, i3, iVar);
    }

    @Override // com.bumptech.glide.load.n.n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(Uri uri) {
        return a.contains(uri.getScheme());
    }
}
