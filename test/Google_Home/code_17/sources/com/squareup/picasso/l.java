package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.LruCache;
import l2.InterfaceC3308a;

/* loaded from: classes4.dex */
public final class l implements InterfaceC3308a {

    /* renamed from: a, reason: collision with root package name */
    final LruCache f24335a;

    /* loaded from: classes4.dex */
    class a extends LruCache {
        a(int i8) {
            super(i8);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.util.LruCache
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int sizeOf(String str, b bVar) {
            return bVar.f24338b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        final Bitmap f24337a;

        /* renamed from: b, reason: collision with root package name */
        final int f24338b;

        b(Bitmap bitmap, int i8) {
            this.f24337a = bitmap;
            this.f24338b = i8;
        }
    }

    public l(Context context) {
        this(C.b(context));
    }

    @Override // l2.InterfaceC3308a
    public void a(String str, Bitmap bitmap) {
        if (str != null && bitmap != null) {
            int j8 = C.j(bitmap);
            if (j8 > b()) {
                this.f24335a.remove(str);
                return;
            } else {
                this.f24335a.put(str, new b(bitmap, j8));
                return;
            }
        }
        throw new NullPointerException("key == null || bitmap == null");
    }

    @Override // l2.InterfaceC3308a
    public int b() {
        return this.f24335a.maxSize();
    }

    @Override // l2.InterfaceC3308a
    public Bitmap get(String str) {
        b bVar = (b) this.f24335a.get(str);
        if (bVar != null) {
            return bVar.f24337a;
        }
        return null;
    }

    @Override // l2.InterfaceC3308a
    public int size() {
        return this.f24335a.size();
    }

    public l(int i8) {
        this.f24335a = new a(i8);
    }
}
