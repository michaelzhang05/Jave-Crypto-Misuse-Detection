package l7;

/* renamed from: l7.m, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
abstract class AbstractC3380m {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(byte[] bArr, Y6.e eVar) {
        eVar.b(bArr, 0, bArr.length);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(short s8, Y6.e eVar) {
        eVar.c((byte) (s8 >>> 8));
        eVar.c((byte) s8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(int i8, Y6.e eVar) {
        eVar.c((byte) (i8 >>> 24));
        eVar.c((byte) (i8 >>> 16));
        eVar.c((byte) (i8 >>> 8));
        eVar.c((byte) i8);
    }
}
