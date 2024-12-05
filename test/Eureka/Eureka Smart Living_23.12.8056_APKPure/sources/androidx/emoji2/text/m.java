package androidx.emoji2.text;

import android.graphics.Typeface;
import android.util.SparseArray;
import androidx.core.os.t;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    private final z.b f2569a;

    /* renamed from: b, reason: collision with root package name */
    private final char[] f2570b;

    /* renamed from: c, reason: collision with root package name */
    private final a f2571c = new a(1024);

    /* renamed from: d, reason: collision with root package name */
    private final Typeface f2572d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final SparseArray f2573a;

        /* renamed from: b, reason: collision with root package name */
        private g f2574b;

        private a() {
            this(1);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public a a(int i6) {
            SparseArray sparseArray = this.f2573a;
            if (sparseArray == null) {
                return null;
            }
            return (a) sparseArray.get(i6);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final g b() {
            return this.f2574b;
        }

        void c(g gVar, int i6, int i7) {
            a a6 = a(gVar.b(i6));
            if (a6 == null) {
                a6 = new a();
                this.f2573a.put(gVar.b(i6), a6);
            }
            if (i7 > i6) {
                a6.c(gVar, i6 + 1, i7);
            } else {
                a6.f2574b = gVar;
            }
        }

        a(int i6) {
            this.f2573a = new SparseArray(i6);
        }
    }

    private m(Typeface typeface, z.b bVar) {
        this.f2572d = typeface;
        this.f2569a = bVar;
        this.f2570b = new char[bVar.k() * 2];
        a(bVar);
    }

    private void a(z.b bVar) {
        int k6 = bVar.k();
        for (int i6 = 0; i6 < k6; i6++) {
            g gVar = new g(this, i6);
            Character.toChars(gVar.f(), this.f2570b, i6 * 2);
            h(gVar);
        }
    }

    public static m b(Typeface typeface, ByteBuffer byteBuffer) {
        try {
            t.a("EmojiCompat.MetadataRepo.create");
            return new m(typeface, l.b(byteBuffer));
        } finally {
            t.b();
        }
    }

    public char[] c() {
        return this.f2570b;
    }

    public z.b d() {
        return this.f2569a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int e() {
        return this.f2569a.l();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a f() {
        return this.f2571c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Typeface g() {
        return this.f2572d;
    }

    void h(g gVar) {
        androidx.core.util.h.g(gVar, "emoji metadata cannot be null");
        androidx.core.util.h.a(gVar.c() > 0, "invalid metadata codepoint length");
        this.f2571c.c(gVar, 0, gVar.c() - 1);
    }
}
