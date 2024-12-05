package z;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class a extends c {
    public a f(int i6, ByteBuffer byteBuffer) {
        g(i6, byteBuffer);
        return this;
    }

    public void g(int i6, ByteBuffer byteBuffer) {
        c(i6, byteBuffer);
    }

    public int h(int i6) {
        int b6 = b(16);
        if (b6 != 0) {
            return this.f9900b.getInt(d(b6) + (i6 * 4));
        }
        return 0;
    }

    public int i() {
        int b6 = b(16);
        if (b6 != 0) {
            return e(b6);
        }
        return 0;
    }

    public boolean j() {
        int b6 = b(6);
        return (b6 == 0 || this.f9900b.get(b6 + this.f9899a) == 0) ? false : true;
    }

    public short k() {
        int b6 = b(14);
        if (b6 != 0) {
            return this.f9900b.getShort(b6 + this.f9899a);
        }
        return (short) 0;
    }

    public int l() {
        int b6 = b(4);
        if (b6 != 0) {
            return this.f9900b.getInt(b6 + this.f9899a);
        }
        return 0;
    }

    public short m() {
        int b6 = b(8);
        if (b6 != 0) {
            return this.f9900b.getShort(b6 + this.f9899a);
        }
        return (short) 0;
    }

    public short n() {
        int b6 = b(12);
        if (b6 != 0) {
            return this.f9900b.getShort(b6 + this.f9899a);
        }
        return (short) 0;
    }
}
