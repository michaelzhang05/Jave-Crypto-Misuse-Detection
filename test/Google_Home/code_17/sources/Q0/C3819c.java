package q0;

import com.google.android.gms.tasks.Task;

/* renamed from: q0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3819c extends IllegalStateException {
    private C3819c(String str, Throwable th) {
        super(str, th);
    }

    public static IllegalStateException a(Task task) {
        String str;
        if (!task.m()) {
            return new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
        Exception i8 = task.i();
        if (i8 != null) {
            str = "failure";
        } else if (task.n()) {
            str = "result ".concat(String.valueOf(task.j()));
        } else if (task.l()) {
            str = "cancellation";
        } else {
            str = "unknown issue";
        }
        return new C3819c("Complete with: ".concat(str), i8);
    }
}
