package com.bumptech.glide.load.n;

import android.net.Uri;
import cm.aptoide.pt.dataprovider.BuildConfig;
import com.bumptech.glide.load.n.n;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: UrlUriLoader.java */
/* loaded from: classes.dex */
public class x<Data> implements n<Uri, Data> {
    private static final Set<String> a = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", BuildConfig.APTOIDE_WEB_SERVICES_SCHEME)));

    /* renamed from: b, reason: collision with root package name */
    private final n<g, Data> f8752b;

    /* compiled from: UrlUriLoader.java */
    /* loaded from: classes.dex */
    public static class a implements o<Uri, InputStream> {
        @Override // com.bumptech.glide.load.n.o
        public n<Uri, InputStream> b(r rVar) {
            return new x(rVar.d(g.class, InputStream.class));
        }
    }

    public x(n<g, Data> nVar) {
        this.f8752b = nVar;
    }

    @Override // com.bumptech.glide.load.n.n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a<Data> b(Uri uri, int i2, int i3, com.bumptech.glide.load.i iVar) {
        return this.f8752b.b(new g(uri.toString()), i2, i3, iVar);
    }

    @Override // com.bumptech.glide.load.n.n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(Uri uri) {
        return a.contains(uri.getScheme());
    }
}
