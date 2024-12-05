package j$.util.stream;

/* renamed from: j$.util.stream.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC2907d {

    /* renamed from: a, reason: collision with root package name */
    protected final int f32498a;

    /* renamed from: b, reason: collision with root package name */
    protected int f32499b;

    /* renamed from: c, reason: collision with root package name */
    protected int f32500c;

    /* renamed from: d, reason: collision with root package name */
    protected long[] f32501d;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC2907d() {
        this.f32498a = 4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC2907d(int i8) {
        if (i8 >= 0) {
            this.f32498a = Math.max(4, 32 - Integer.numberOfLeadingZeros(i8 - 1));
        } else {
            throw new IllegalArgumentException("Illegal Capacity: " + i8);
        }
    }

    public abstract void clear();

    public final long count() {
        int i8 = this.f32500c;
        return i8 == 0 ? this.f32499b : this.f32501d[i8] + this.f32499b;
    }
}
