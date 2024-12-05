package s4;

import L5.I;
import android.graphics.Bitmap;
import android.util.LruCache;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: s4.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3751c {

    /* renamed from: a, reason: collision with root package name */
    private final int f37877a;

    /* renamed from: b, reason: collision with root package name */
    private final a f37878b;

    /* renamed from: s4.c$a */
    /* loaded from: classes4.dex */
    public static final class a extends LruCache {
        a(int i8) {
            super(i8);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.util.LruCache
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int sizeOf(String key, Bitmap bitmap) {
            AbstractC3159y.i(key, "key");
            AbstractC3159y.i(bitmap, "bitmap");
            return bitmap.getByteCount() / 1024;
        }
    }

    public C3751c(int i8) {
        this.f37877a = i8;
        this.f37878b = new a(i8);
    }

    private final String c(String str) {
        return String.valueOf(str.hashCode());
    }

    public final Bitmap a(String key) {
        Bitmap bitmap;
        AbstractC3159y.i(key, "key");
        synchronized (this) {
            bitmap = (Bitmap) this.f37878b.get(c(key));
        }
        return bitmap;
    }

    public final void b(String key, Bitmap bitmap) {
        AbstractC3159y.i(key, "key");
        AbstractC3159y.i(bitmap, "bitmap");
        synchronized (this) {
            try {
                if (this.f37878b.get(c(key)) == null) {
                    this.f37878b.put(c(key), bitmap);
                }
                I i8 = I.f6487a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public /* synthetic */ C3751c(int i8, int i9, AbstractC3151p abstractC3151p) {
        this((i9 & 1) != 0 ? ((int) (Runtime.getRuntime().maxMemory() / 1024)) / 8 : i8);
    }
}
