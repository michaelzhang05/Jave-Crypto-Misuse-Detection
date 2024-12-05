package z;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    protected int f9899a;

    /* renamed from: b, reason: collision with root package name */
    protected ByteBuffer f9900b;

    /* renamed from: c, reason: collision with root package name */
    private int f9901c;

    /* renamed from: d, reason: collision with root package name */
    private int f9902d;

    /* renamed from: e, reason: collision with root package name */
    d f9903e = d.a();

    /* JADX INFO: Access modifiers changed from: protected */
    public int a(int i6) {
        return i6 + this.f9900b.getInt(i6);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int b(int i6) {
        if (i6 < this.f9902d) {
            return this.f9900b.getShort(this.f9901c + i6);
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void c(int i6, ByteBuffer byteBuffer) {
        short s5;
        this.f9900b = byteBuffer;
        if (byteBuffer != null) {
            this.f9899a = i6;
            int i7 = i6 - byteBuffer.getInt(i6);
            this.f9901c = i7;
            s5 = this.f9900b.getShort(i7);
        } else {
            s5 = 0;
            this.f9899a = 0;
            this.f9901c = 0;
        }
        this.f9902d = s5;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int d(int i6) {
        int i7 = i6 + this.f9899a;
        return i7 + this.f9900b.getInt(i7) + 4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int e(int i6) {
        int i7 = i6 + this.f9899a;
        return this.f9900b.getInt(i7 + this.f9900b.getInt(i7));
    }
}
