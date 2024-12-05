package androidx.emoji2.text;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
abstract class l {

    /* loaded from: classes.dex */
    private static class a implements c {

        /* renamed from: a, reason: collision with root package name */
        private final ByteBuffer f2566a;

        a(ByteBuffer byteBuffer) {
            this.f2566a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // androidx.emoji2.text.l.c
        public long a() {
            return l.c(this.f2566a.getInt());
        }

        @Override // androidx.emoji2.text.l.c
        public void b(int i6) {
            ByteBuffer byteBuffer = this.f2566a;
            byteBuffer.position(byteBuffer.position() + i6);
        }

        @Override // androidx.emoji2.text.l.c
        public int c() {
            return this.f2566a.getInt();
        }

        @Override // androidx.emoji2.text.l.c
        public long getPosition() {
            return this.f2566a.position();
        }

        @Override // androidx.emoji2.text.l.c
        public int readUnsignedShort() {
            return l.d(this.f2566a.getShort());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final long f2567a;

        /* renamed from: b, reason: collision with root package name */
        private final long f2568b;

        b(long j6, long j7) {
            this.f2567a = j6;
            this.f2568b = j7;
        }

        long a() {
            return this.f2567a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public interface c {
        long a();

        void b(int i6);

        int c();

        long getPosition();

        int readUnsignedShort();
    }

    private static b a(c cVar) {
        long j6;
        cVar.b(4);
        int readUnsignedShort = cVar.readUnsignedShort();
        if (readUnsignedShort > 100) {
            throw new IOException("Cannot read metadata.");
        }
        cVar.b(6);
        int i6 = 0;
        while (true) {
            if (i6 >= readUnsignedShort) {
                j6 = -1;
                break;
            }
            int c6 = cVar.c();
            cVar.b(4);
            j6 = cVar.a();
            cVar.b(4);
            if (1835365473 == c6) {
                break;
            }
            i6++;
        }
        if (j6 != -1) {
            cVar.b((int) (j6 - cVar.getPosition()));
            cVar.b(12);
            long a6 = cVar.a();
            for (int i7 = 0; i7 < a6; i7++) {
                int c7 = cVar.c();
                long a7 = cVar.a();
                long a8 = cVar.a();
                if (1164798569 == c7 || 1701669481 == c7) {
                    return new b(a7 + j6, a8);
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static z.b b(ByteBuffer byteBuffer) {
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.position((int) a(new a(duplicate)).a());
        return z.b.h(duplicate);
    }

    static long c(int i6) {
        return i6 & 4294967295L;
    }

    static int d(short s5) {
        return s5 & 65535;
    }
}
