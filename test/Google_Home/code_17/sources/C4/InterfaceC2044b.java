package c4;

import android.graphics.Bitmap;
import android.util.LruCache;
import androidx.work.Data;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: c4.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC2044b {

    /* renamed from: c4.b$a */
    /* loaded from: classes4.dex */
    public static final class a implements InterfaceC2044b {

        /* renamed from: a, reason: collision with root package name */
        public static final a f15725a = new a();

        /* renamed from: b, reason: collision with root package name */
        private static final int f15726b;

        /* renamed from: c, reason: collision with root package name */
        private static final LruCache f15727c;

        /* renamed from: c4.b$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0370a extends LruCache {
            C0370a(int i8) {
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

        static {
            int min = Math.min((int) ((Runtime.getRuntime().maxMemory() / 1024) / 8), Data.MAX_DATA_BYTES);
            f15726b = min;
            f15727c = new C0370a(min);
        }

        private a() {
        }

        @Override // c4.InterfaceC2044b
        public void a(String key, Bitmap bitmap) {
            AbstractC3255y.i(key, "key");
            AbstractC3255y.i(bitmap, "bitmap");
            f15727c.put(key, bitmap);
        }

        @Override // c4.InterfaceC2044b
        public void clear() {
            f15727c.evictAll();
        }

        @Override // c4.InterfaceC2044b
        public Bitmap get(String key) {
            AbstractC3255y.i(key, "key");
            return (Bitmap) f15727c.get(key);
        }
    }

    void a(String str, Bitmap bitmap);

    void clear();

    Bitmap get(String str);
}
