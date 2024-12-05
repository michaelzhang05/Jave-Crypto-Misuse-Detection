package F6;

import P6.C1279e;
import P6.InterfaceC1281g;
import java.io.Closeable;

/* loaded from: classes5.dex */
public abstract class A implements Closeable {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public final class a extends A {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f2685a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC1281g f2686b;

        a(t tVar, long j8, InterfaceC1281g interfaceC1281g) {
            this.f2685a = j8;
            this.f2686b = interfaceC1281g;
        }

        @Override // F6.A
        public long a() {
            return this.f2685a;
        }

        @Override // F6.A
        public InterfaceC1281g f() {
            return this.f2686b;
        }
    }

    public static A b(t tVar, long j8, InterfaceC1281g interfaceC1281g) {
        if (interfaceC1281g != null) {
            return new a(tVar, j8, interfaceC1281g);
        }
        throw new NullPointerException("source == null");
    }

    public static A e(t tVar, byte[] bArr) {
        return b(tVar, bArr.length, new C1279e().write(bArr));
    }

    public abstract long a();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        G6.c.d(f());
    }

    public abstract InterfaceC1281g f();
}
