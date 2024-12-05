package I6;

import S6.InterfaceC1418f;

/* loaded from: classes5.dex */
public abstract class y {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public final class a extends y {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f4579a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ byte[] f4580b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f4581c;

        a(t tVar, int i8, byte[] bArr, int i9) {
            this.f4579a = i8;
            this.f4580b = bArr;
            this.f4581c = i9;
        }

        @Override // I6.y
        public long a() {
            return this.f4579a;
        }

        @Override // I6.y
        public t b() {
            return null;
        }

        @Override // I6.y
        public void e(InterfaceC1418f interfaceC1418f) {
            interfaceC1418f.write(this.f4580b, this.f4581c, this.f4579a);
        }
    }

    public static y c(t tVar, byte[] bArr) {
        return d(tVar, bArr, 0, bArr.length);
    }

    public static y d(t tVar, byte[] bArr, int i8, int i9) {
        if (bArr != null) {
            J6.c.c(bArr.length, i8, i9);
            return new a(tVar, i9, bArr, i8);
        }
        throw new NullPointerException("content == null");
    }

    public abstract long a();

    public abstract t b();

    public abstract void e(InterfaceC1418f interfaceC1418f);
}
