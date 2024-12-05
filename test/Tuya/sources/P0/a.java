package P0;

/* loaded from: classes3.dex */
public class a implements d {

    /* renamed from: a, reason: collision with root package name */
    private final int f7854a;

    /* renamed from: b, reason: collision with root package name */
    private final d[] f7855b;

    /* renamed from: c, reason: collision with root package name */
    private final b f7856c;

    public a(int i8, d... dVarArr) {
        this.f7854a = i8;
        this.f7855b = dVarArr;
        this.f7856c = new b(i8);
    }

    @Override // P0.d
    public StackTraceElement[] a(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= this.f7854a) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (d dVar : this.f7855b) {
            if (stackTraceElementArr2.length <= this.f7854a) {
                break;
            }
            stackTraceElementArr2 = dVar.a(stackTraceElementArr);
        }
        if (stackTraceElementArr2.length > this.f7854a) {
            return this.f7856c.a(stackTraceElementArr2);
        }
        return stackTraceElementArr2;
    }
}
