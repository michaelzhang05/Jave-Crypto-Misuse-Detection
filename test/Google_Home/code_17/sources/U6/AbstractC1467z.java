package U6;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.io.IOException;

/* renamed from: U6.z, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1467z extends AbstractC1460s implements InterfaceC1444d, y0 {

    /* renamed from: a, reason: collision with root package name */
    final int f10493a;

    /* renamed from: b, reason: collision with root package name */
    final boolean f10494b;

    /* renamed from: c, reason: collision with root package name */
    final InterfaceC1444d f10495c;

    public AbstractC1467z(boolean z8, int i8, InterfaceC1444d interfaceC1444d) {
        if (interfaceC1444d != null) {
            this.f10493a = i8;
            this.f10494b = z8;
            this.f10495c = interfaceC1444d;
            return;
        }
        throw new NullPointerException("'obj' cannot be null");
    }

    public static AbstractC1467z u(Object obj) {
        if (obj != null && !(obj instanceof AbstractC1467z)) {
            if (obj instanceof byte[]) {
                try {
                    return u(AbstractC1460s.p((byte[]) obj));
                } catch (IOException e8) {
                    throw new IllegalArgumentException("failed to construct tagged object from byte[]: " + e8.getMessage());
                }
            }
            throw new IllegalArgumentException("unknown object in getInstance: " + obj.getClass().getName());
        }
        return (AbstractC1467z) obj;
    }

    @Override // U6.y0
    public AbstractC1460s e() {
        return d();
    }

    @Override // U6.AbstractC1460s, U6.AbstractC1455m
    public int hashCode() {
        int i8;
        int i9 = this.f10493a;
        if (this.f10494b) {
            i8 = 15;
        } else {
            i8 = PsExtractor.VIDEO_STREAM_MASK;
        }
        return (i9 ^ i8) ^ this.f10495c.d().hashCode();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // U6.AbstractC1460s
    public boolean l(AbstractC1460s abstractC1460s) {
        if (!(abstractC1460s instanceof AbstractC1467z)) {
            return false;
        }
        AbstractC1467z abstractC1467z = (AbstractC1467z) abstractC1460s;
        if (this.f10493a != abstractC1467z.f10493a || this.f10494b != abstractC1467z.f10494b) {
            return false;
        }
        AbstractC1460s d8 = this.f10495c.d();
        AbstractC1460s d9 = abstractC1467z.f10495c.d();
        if (d8 != d9 && !d8.l(d9)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // U6.AbstractC1460s
    public AbstractC1460s r() {
        return new h0(this.f10494b, this.f10493a, this.f10495c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // U6.AbstractC1460s
    public AbstractC1460s t() {
        return new w0(this.f10494b, this.f10493a, this.f10495c);
    }

    public String toString() {
        return "[" + this.f10493a + "]" + this.f10495c;
    }

    public AbstractC1460s v() {
        return this.f10495c.d();
    }

    public int y() {
        return this.f10493a;
    }

    public boolean z() {
        return this.f10494b;
    }
}
