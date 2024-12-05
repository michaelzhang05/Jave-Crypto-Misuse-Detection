package s6;

import l6.I;
import q6.AbstractC3879n;

/* renamed from: s6.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4008c extends AbstractC4011f {

    /* renamed from: g, reason: collision with root package name */
    public static final C4008c f39310g = new C4008c();

    private C4008c() {
        super(AbstractC4017l.f39323c, AbstractC4017l.f39324d, AbstractC4017l.f39325e, AbstractC4017l.f39321a);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // l6.I
    public I limitedParallelism(int i8) {
        AbstractC3879n.a(i8);
        if (i8 >= AbstractC4017l.f39323c) {
            return this;
        }
        return super.limitedParallelism(i8);
    }

    @Override // l6.I
    public String toString() {
        return "Dispatchers.Default";
    }
}
