package j$.util.stream;

/* renamed from: j$.util.stream.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC3057d {

    /* renamed from: a, reason: collision with root package name */
    protected final int f33692a;

    /* renamed from: b, reason: collision with root package name */
    protected int f33693b;

    /* renamed from: c, reason: collision with root package name */
    protected int f33694c;

    /* renamed from: d, reason: collision with root package name */
    protected long[] f33695d;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC3057d() {
        this.f33692a = 4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC3057d(int i8) {
        if (i8 >= 0) {
            this.f33692a = Math.max(4, 32 - Integer.numberOfLeadingZeros(i8 - 1));
        } else {
            throw new IllegalArgumentException("Illegal Capacity: " + i8);
        }
    }

    public abstract void clear();

    public final long count() {
        int i8 = this.f33694c;
        return i8 == 0 ? this.f33693b : this.f33695d[i8] + this.f33693b;
    }
}
