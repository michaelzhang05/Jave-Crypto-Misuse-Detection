package com.bumptech.glide.load.m.o;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;
import com.bumptech.glide.load.m.d;
import com.bumptech.glide.load.m.g;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: ThumbFetcher.java */
/* loaded from: classes.dex */
public class c implements com.bumptech.glide.load.m.d<InputStream> {

    /* renamed from: f, reason: collision with root package name */
    private final Uri f8690f;

    /* renamed from: g, reason: collision with root package name */
    private final e f8691g;

    /* renamed from: h, reason: collision with root package name */
    private InputStream f8692h;

    /* compiled from: ThumbFetcher.java */
    /* loaded from: classes.dex */
    static class a implements d {
        private static final String[] a = {"_data"};

        /* renamed from: b, reason: collision with root package name */
        private final ContentResolver f8693b;

        a(ContentResolver contentResolver) {
            this.f8693b = contentResolver;
        }

        @Override // com.bumptech.glide.load.m.o.d
        public Cursor a(Uri uri) {
            return this.f8693b.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, a, "kind = 1 AND image_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    /* compiled from: ThumbFetcher.java */
    /* loaded from: classes.dex */
    static class b implements d {
        private static final String[] a = {"_data"};

        /* renamed from: b, reason: collision with root package name */
        private final ContentResolver f8694b;

        b(ContentResolver contentResolver) {
            this.f8694b = contentResolver;
        }

        @Override // com.bumptech.glide.load.m.o.d
        public Cursor a(Uri uri) {
            return this.f8694b.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, a, "kind = 1 AND video_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    c(Uri uri, e eVar) {
        this.f8690f = uri;
        this.f8691g = eVar;
    }

    private static c c(Context context, Uri uri, d dVar) {
        return new c(uri, new e(com.bumptech.glide.c.c(context).j().g(), dVar, com.bumptech.glide.c.c(context).e(), context.getContentResolver()));
    }

    public static c f(Context context, Uri uri) {
        return c(context, uri, new a(context.getContentResolver()));
    }

    public static c g(Context context, Uri uri) {
        return c(context, uri, new b(context.getContentResolver()));
    }

    private InputStream h() throws FileNotFoundException {
        InputStream d2 = this.f8691g.d(this.f8690f);
        int a2 = d2 != null ? this.f8691g.a(this.f8690f) : -1;
        return a2 != -1 ? new g(d2, a2) : d2;
    }

    @Override // com.bumptech.glide.load.m.d
    public Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.m.d
    public void b() {
        InputStream inputStream = this.f8692h;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // com.bumptech.glide.load.m.d
    public void cancel() {
    }

    @Override // com.bumptech.glide.load.m.d
    public com.bumptech.glide.load.a d() {
        return com.bumptech.glide.load.a.LOCAL;
    }

    @Override // com.bumptech.glide.load.m.d
    public void e(com.bumptech.glide.g gVar, d.a<? super InputStream> aVar) {
        try {
            InputStream h2 = h();
            this.f8692h = h2;
            aVar.g(h2);
        } catch (FileNotFoundException e2) {
            if (Log.isLoggable("MediaStoreThumbFetcher", 3)) {
                Log.d("MediaStoreThumbFetcher", "Failed to find thumbnail file", e2);
            }
            aVar.c(e2);
        }
    }
}
