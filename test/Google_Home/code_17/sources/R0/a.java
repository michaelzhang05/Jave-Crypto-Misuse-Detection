package R0;

/* loaded from: classes3.dex */
public class a implements d {

    /* renamed from: a, reason: collision with root package name */
    private final int f9578a;

    /* renamed from: b, reason: collision with root package name */
    private final d[] f9579b;

    /* renamed from: c, reason: collision with root package name */
    private final b f9580c;

    public a(int i8, d... dVarArr) {
        this.f9578a = i8;
        this.f9579b = dVarArr;
        this.f9580c = new b(i8);
    }

    @Override // R0.d
    public StackTraceElement[] a(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= this.f9578a) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (d dVar : this.f9579b) {
            if (stackTraceElementArr2.length <= this.f9578a) {
                break;
            }
            stackTraceElementArr2 = dVar.a(stackTraceElementArr);
        }
        if (stackTraceElementArr2.length > this.f9578a) {
            return this.f9580c.a(stackTraceElementArr2);
        }
        return stackTraceElementArr2;
    }
}
