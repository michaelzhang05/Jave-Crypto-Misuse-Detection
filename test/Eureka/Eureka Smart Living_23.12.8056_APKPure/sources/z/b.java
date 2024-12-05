package z;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public final class b extends c {
    public static b h(ByteBuffer byteBuffer) {
        return i(byteBuffer, new b());
    }

    public static b i(ByteBuffer byteBuffer, b bVar) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return bVar.f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public b f(int i6, ByteBuffer byteBuffer) {
        g(i6, byteBuffer);
        return this;
    }

    public void g(int i6, ByteBuffer byteBuffer) {
        c(i6, byteBuffer);
    }

    public a j(a aVar, int i6) {
        int b6 = b(6);
        if (b6 != 0) {
            return aVar.f(a(d(b6) + (i6 * 4)), this.f9900b);
        }
        return null;
    }

    public int k() {
        int b6 = b(6);
        if (b6 != 0) {
            return e(b6);
        }
        return 0;
    }

    public int l() {
        int b6 = b(4);
        if (b6 != 0) {
            return this.f9900b.getInt(b6 + this.f9899a);
        }
        return 0;
    }
}
