package l2;

/* loaded from: classes.dex */
public final class b extends IllegalStateException {
    private b(String str, Throwable th) {
        super(str, th);
    }

    public static IllegalStateException a(i iVar) {
        if (!iVar.l()) {
            return new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
        Exception h6 = iVar.h();
        return new b("Complete with: ".concat(h6 != null ? "failure" : iVar.m() ? "result ".concat(String.valueOf(iVar.i())) : iVar.k() ? "cancellation" : "unknown issue"), h6);
    }
}
