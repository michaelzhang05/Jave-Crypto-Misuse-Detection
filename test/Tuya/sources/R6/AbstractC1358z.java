package R6;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.io.IOException;

/* renamed from: R6.z, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1358z extends AbstractC1351s implements InterfaceC1335d, y0 {

    /* renamed from: a, reason: collision with root package name */
    final int f8867a;

    /* renamed from: b, reason: collision with root package name */
    final boolean f8868b;

    /* renamed from: c, reason: collision with root package name */
    final InterfaceC1335d f8869c;

    public AbstractC1358z(boolean z8, int i8, InterfaceC1335d interfaceC1335d) {
        if (interfaceC1335d != null) {
            this.f8867a = i8;
            this.f8868b = z8;
            this.f8869c = interfaceC1335d;
            return;
        }
        throw new NullPointerException("'obj' cannot be null");
    }

    public static AbstractC1358z w(Object obj) {
        if (obj != null && !(obj instanceof AbstractC1358z)) {
            if (obj instanceof byte[]) {
                try {
                    return w(AbstractC1351s.s((byte[]) obj));
                } catch (IOException e8) {
                    throw new IllegalArgumentException("failed to construct tagged object from byte[]: " + e8.getMessage());
                }
            }
            throw new IllegalArgumentException("unknown object in getInstance: " + obj.getClass().getName());
        }
        return (AbstractC1358z) obj;
    }

    @Override // R6.y0
    public AbstractC1351s g() {
        return d();
    }

    @Override // R6.AbstractC1351s, R6.AbstractC1346m
    public int hashCode() {
        int i8;
        int i9 = this.f8867a;
        if (this.f8868b) {
            i8 = 15;
        } else {
            i8 = PsExtractor.VIDEO_STREAM_MASK;
        }
        return (i9 ^ i8) ^ this.f8869c.d().hashCode();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // R6.AbstractC1351s
    public boolean m(AbstractC1351s abstractC1351s) {
        if (!(abstractC1351s instanceof AbstractC1358z)) {
            return false;
        }
        AbstractC1358z abstractC1358z = (AbstractC1358z) abstractC1351s;
        if (this.f8867a != abstractC1358z.f8867a || this.f8868b != abstractC1358z.f8868b) {
            return false;
        }
        AbstractC1351s d8 = this.f8869c.d();
        AbstractC1351s d9 = abstractC1358z.f8869c.d();
        if (d8 != d9 && !d8.m(d9)) {
            return false;
        }
        return true;
    }

    public String toString() {
        return "[" + this.f8867a + "]" + this.f8869c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // R6.AbstractC1351s
    public AbstractC1351s u() {
        return new h0(this.f8868b, this.f8867a, this.f8869c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // R6.AbstractC1351s
    public AbstractC1351s v() {
        return new w0(this.f8868b, this.f8867a, this.f8869c);
    }

    public AbstractC1351s x() {
        return this.f8869c.d();
    }

    public int y() {
        return this.f8867a;
    }

    public boolean z() {
        return this.f8868b;
    }
}
