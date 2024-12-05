package com.bumptech.glide.load.n;

import android.content.res.AssetManager;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.n.n;
import java.io.InputStream;

/* compiled from: AssetUriLoader.java */
/* loaded from: classes.dex */
public class a<Data> implements n<Uri, Data> {
    private static final int a = 22;

    /* renamed from: b, reason: collision with root package name */
    private final AssetManager f8700b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC0115a<Data> f8701c;

    /* compiled from: AssetUriLoader.java */
    /* renamed from: com.bumptech.glide.load.n.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0115a<Data> {
        com.bumptech.glide.load.m.d<Data> a(AssetManager assetManager, String str);
    }

    /* compiled from: AssetUriLoader.java */
    /* loaded from: classes.dex */
    public static class b implements o<Uri, ParcelFileDescriptor>, InterfaceC0115a<ParcelFileDescriptor> {
        private final AssetManager a;

        public b(AssetManager assetManager) {
            this.a = assetManager;
        }

        @Override // com.bumptech.glide.load.n.a.InterfaceC0115a
        public com.bumptech.glide.load.m.d<ParcelFileDescriptor> a(AssetManager assetManager, String str) {
            return new com.bumptech.glide.load.m.h(assetManager, str);
        }

        @Override // com.bumptech.glide.load.n.o
        public n<Uri, ParcelFileDescriptor> b(r rVar) {
            return new a(this.a, this);
        }
    }

    /* compiled from: AssetUriLoader.java */
    /* loaded from: classes.dex */
    public static class c implements o<Uri, InputStream>, InterfaceC0115a<InputStream> {
        private final AssetManager a;

        public c(AssetManager assetManager) {
            this.a = assetManager;
        }

        @Override // com.bumptech.glide.load.n.a.InterfaceC0115a
        public com.bumptech.glide.load.m.d<InputStream> a(AssetManager assetManager, String str) {
            return new com.bumptech.glide.load.m.m(assetManager, str);
        }

        @Override // com.bumptech.glide.load.n.o
        public n<Uri, InputStream> b(r rVar) {
            return new a(this.a, this);
        }
    }

    public a(AssetManager assetManager, InterfaceC0115a<Data> interfaceC0115a) {
        this.f8700b = assetManager;
        this.f8701c = interfaceC0115a;
    }

    @Override // com.bumptech.glide.load.n.n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a<Data> b(Uri uri, int i2, int i3, com.bumptech.glide.load.i iVar) {
        return new n.a<>(new com.bumptech.glide.q.c(uri), this.f8701c.a(this.f8700b, uri.toString().substring(a)));
    }

    @Override // com.bumptech.glide.load.n.n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(Uri uri) {
        return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
    }
}
