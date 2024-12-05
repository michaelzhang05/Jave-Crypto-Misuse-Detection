package I6;

import S6.C1417e;
import S6.InterfaceC1419g;
import java.io.Closeable;

/* loaded from: classes5.dex */
public abstract class A implements Closeable {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public final class a extends A {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f4225a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC1419g f4226b;

        a(t tVar, long j8, InterfaceC1419g interfaceC1419g) {
            this.f4225a = j8;
            this.f4226b = interfaceC1419g;
        }

        @Override // I6.A
        public long a() {
            return this.f4225a;
        }

        @Override // I6.A
        public InterfaceC1419g g() {
            return this.f4226b;
        }
    }

    public static A b(t tVar, long j8, InterfaceC1419g interfaceC1419g) {
        if (interfaceC1419g != null) {
            return new a(tVar, j8, interfaceC1419g);
        }
        throw new NullPointerException("source == null");
    }

    public static A f(t tVar, byte[] bArr) {
        return b(tVar, bArr.length, new C1417e().write(bArr));
    }

    public abstract long a();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        J6.c.d(g());
    }

    public abstract InterfaceC1419g g();
}
