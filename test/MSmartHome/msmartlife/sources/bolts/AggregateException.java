package bolts;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.List;

/* loaded from: classes.dex */
public class AggregateException extends Exception {

    /* renamed from: f, reason: collision with root package name */
    private List<Throwable> f2168f;

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        super.printStackTrace(printStream);
        int i2 = -1;
        for (Throwable th : this.f2168f) {
            printStream.append("\n");
            printStream.append("  Inner throwable #");
            i2++;
            printStream.append((CharSequence) Integer.toString(i2));
            printStream.append(": ");
            th.printStackTrace(printStream);
            printStream.append("\n");
        }
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        super.printStackTrace(printWriter);
        int i2 = -1;
        for (Throwable th : this.f2168f) {
            printWriter.append("\n");
            printWriter.append("  Inner throwable #");
            i2++;
            printWriter.append((CharSequence) Integer.toString(i2));
            printWriter.append(": ");
            th.printStackTrace(printWriter);
            printWriter.append("\n");
        }
    }
}
