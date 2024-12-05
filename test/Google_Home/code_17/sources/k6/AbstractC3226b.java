package k6;

/* renamed from: k6.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3226b {

    /* renamed from: a, reason: collision with root package name */
    private static final boolean f34136a = false;

    /* renamed from: b, reason: collision with root package name */
    private static final ThreadLocal[] f34137b;

    static {
        ThreadLocal[] threadLocalArr = new ThreadLocal[4];
        for (int i8 = 0; i8 < 4; i8++) {
            threadLocalArr[i8] = new ThreadLocal();
        }
        f34137b = threadLocalArr;
    }

    public static final boolean a() {
        return f34136a;
    }
}
