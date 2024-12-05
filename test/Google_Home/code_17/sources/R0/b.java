package R0;

/* loaded from: classes3.dex */
public class b implements d {

    /* renamed from: a, reason: collision with root package name */
    private final int f9581a;

    public b(int i8) {
        this.f9581a = i8;
    }

    @Override // R0.d
    public StackTraceElement[] a(StackTraceElement[] stackTraceElementArr) {
        int length = stackTraceElementArr.length;
        int i8 = this.f9581a;
        if (length <= i8) {
            return stackTraceElementArr;
        }
        int i9 = i8 / 2;
        int i10 = i8 - i9;
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[i8];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, i10);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - i9, stackTraceElementArr2, i10, i9);
        return stackTraceElementArr2;
    }
}
