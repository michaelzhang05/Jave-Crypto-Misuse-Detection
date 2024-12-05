package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.LruCache;
import i2.InterfaceC2773a;

/* loaded from: classes4.dex */
public final class l implements InterfaceC2773a {

    /* renamed from: a, reason: collision with root package name */
    final LruCache f23280a;

    /* loaded from: classes4.dex */
    class a extends LruCache {
        a(int i8) {
            super(i8);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.util.LruCache
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int sizeOf(String str, b bVar) {
            return bVar.f23283b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        final Bitmap f23282a;

        /* renamed from: b, reason: collision with root package name */
        final int f23283b;

        b(Bitmap bitmap, int i8) {
            this.f23282a = bitmap;
            this.f23283b = i8;
        }
    }

    public l(Context context) {
        this(C.b(context));
    }

    @Override // i2.InterfaceC2773a
    public void a(String str, Bitmap bitmap) {
        if (str != null && bitmap != null) {
            int j8 = C.j(bitmap);
            if (j8 > b()) {
                this.f23280a.remove(str);
                return;
            } else {
                this.f23280a.put(str, new b(bitmap, j8));
                return;
            }
        }
        throw new NullPointerException("key == null || bitmap == null");
    }

    @Override // i2.InterfaceC2773a
    public int b() {
        return this.f23280a.maxSize();
    }

    @Override // i2.InterfaceC2773a
    public Bitmap get(String str) {
        b bVar = (b) this.f23280a.get(str);
        if (bVar != null) {
            return bVar.f23282a;
        }
        return null;
    }

    @Override // i2.InterfaceC2773a
    public int size() {
        return this.f23280a.size();
    }

    public l(int i8) {
        this.f23280a = new a(i8);
    }
}
