package v4;

import O5.I;
import android.graphics.Bitmap;
import android.util.LruCache;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: v4.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4104c {

    /* renamed from: a, reason: collision with root package name */
    private final int f40150a;

    /* renamed from: b, reason: collision with root package name */
    private final a f40151b;

    /* renamed from: v4.c$a */
    /* loaded from: classes4.dex */
    public static final class a extends LruCache {
        a(int i8) {
            super(i8);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.util.LruCache
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int sizeOf(String key, Bitmap bitmap) {
            AbstractC3255y.i(key, "key");
            AbstractC3255y.i(bitmap, "bitmap");
            return bitmap.getByteCount() / 1024;
        }
    }

    public C4104c(int i8) {
        this.f40150a = i8;
        this.f40151b = new a(i8);
    }

    private final String c(String str) {
        return String.valueOf(str.hashCode());
    }

    public final Bitmap a(String key) {
        Bitmap bitmap;
        AbstractC3255y.i(key, "key");
        synchronized (this) {
            bitmap = (Bitmap) this.f40151b.get(c(key));
        }
        return bitmap;
    }

    public final void b(String key, Bitmap bitmap) {
        AbstractC3255y.i(key, "key");
        AbstractC3255y.i(bitmap, "bitmap");
        synchronized (this) {
            try {
                if (this.f40151b.get(c(key)) == null) {
                    this.f40151b.put(c(key), bitmap);
                }
                I i8 = I.f8278a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public /* synthetic */ C4104c(int i8, int i9, AbstractC3247p abstractC3247p) {
        this((i9 & 1) != 0 ? ((int) (Runtime.getRuntime().maxMemory() / 1024)) / 8 : i8);
    }
}
