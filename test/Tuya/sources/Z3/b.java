package Z3;

import android.graphics.Bitmap;
import android.util.LruCache;
import androidx.work.Data;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public interface b {

    /* loaded from: classes4.dex */
    public static final class a implements b {

        /* renamed from: a, reason: collision with root package name */
        public static final a f13401a = new a();

        /* renamed from: b, reason: collision with root package name */
        private static final int f13402b;

        /* renamed from: c, reason: collision with root package name */
        private static final LruCache f13403c;

        /* renamed from: Z3.b$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0258a extends LruCache {
            C0258a(int i8) {
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

        static {
            int min = Math.min((int) ((Runtime.getRuntime().maxMemory() / 1024) / 8), Data.MAX_DATA_BYTES);
            f13402b = min;
            f13403c = new C0258a(min);
        }

        private a() {
        }

        @Override // Z3.b
        public void a(String key, Bitmap bitmap) {
            AbstractC3159y.i(key, "key");
            AbstractC3159y.i(bitmap, "bitmap");
            f13403c.put(key, bitmap);
        }

        @Override // Z3.b
        public void clear() {
            f13403c.evictAll();
        }

        @Override // Z3.b
        public Bitmap get(String key) {
            AbstractC3159y.i(key, "key");
            return (Bitmap) f13403c.get(key);
        }
    }

    void a(String str, Bitmap bitmap);

    void clear();

    Bitmap get(String str);
}
